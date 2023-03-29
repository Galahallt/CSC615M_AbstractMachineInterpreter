package machine;

import antlr.AMGrammarBaseListener;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.InlineCssTextField;
import org.fxmisc.richtext.LineNumberFactory;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;

public class Controller implements Initializable  {
    // -------------------- Index for Reading Input -------------------- //
    int curChar = 0;
    // -------------------- Flag -------------------- //
    boolean reject = false;
    boolean accept = false;
    // -------------------- Step Logs Variables -------------------- //
    int step = 0;
    // -------------------- Highlighter Range -------------------- //
    int prevCharHL = 0;
    int curCharHL = 1;
    // -------------------- Track current rule -------------------- //

    // track current character as input/output
    String curInput;
    String curOutput;
    // track the initial, current, and next state of the machine
    String curState;
    String nextState;
    String prevState;
    String initState;
    // track the initial, current, and previous command of the machine
    String prevCommand;
    String curCommand;
    String nextCommand;
    String initCommand;

    // -------------------- List -------------------- //
    List<Memory> memoryList = new ArrayList<>();
    List<Memory> initMemoryList = new ArrayList<>();
    List<StepLogs> stepLogsList = new ArrayList<>();
    // -------------------- Panes -------------------- //
    public VirtualizedScrollPane vspMachineDef;
    // -------------------- Code Area -------------------- //
    public CodeArea caMachineDef;

    // -------------------- InlineCSSTextField -------------------- //
    public InlineCssTextField tfInput;
    public InlineCssTextField tfOutput;

    // -------------------- Text Field -------------------- //
    public TextField tfInputString;
    // -------------------- Text Area -------------------- //
    public TextArea taMemory;

    // -------------------- Table View -------------------- //
    public TableView<Rule> tblRules;
    public TableView<StepLogs> tblStepLogs;
    // -------------------- Rules Table Column -------------------- //
    public TableColumn<Rule, String> stateColumn;
    public TableColumn<Rule, String> inputColumn;
    public TableColumn<Rule, String> outputColumn;
    public TableColumn<Rule, String> nextStateColumn;
    public TableColumn<Rule, String> commandColumn;

    // -------------------- Step Logs Table Column -------------------- //
    public TableColumn<StepLogs, String> slStepColumn;
    public TableColumn<StepLogs, String> slInputColumn;
    public TableColumn<StepLogs, String> slOutputColumn;
    public TableColumn<StepLogs, String> slPrevStateColumn;
    public TableColumn<StepLogs, String> slNextStateColumn;
    public TableColumn<StepLogs, String> slCommandColumn;

    // -------------------- Buttons -------------------- //

    // Machine Definition
    public Button btnEdit;
    public Button btnSave;

    // Controls
    public Button btnPlay;
    public Button btnStep;
    public Button btnReset;

    // -------------------- Initialize Elements On Load -------------------- //
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // ~~~~~~~~~~~~~~~~~ Code Area Initialization ~~~~~~~~~~~~~~~~~ //
        caMachineDef.setParagraphGraphicFactory(LineNumberFactory.get(caMachineDef));
        caMachineDef.setLineHighlighterFill(Color.WHITESMOKE);

        // ~~~~~~~~~~~~~~~~~ Rule Table Initialization ~~~~~~~~~~~~~~~~~ //
        stateColumn.setCellValueFactory(new PropertyValueFactory<>("State"));
        inputColumn.setCellValueFactory(new PropertyValueFactory<>("Input"));
        outputColumn.setCellValueFactory(new PropertyValueFactory<>("Output"));
        nextStateColumn.setCellValueFactory(new PropertyValueFactory<>("NextState"));
        commandColumn.setCellValueFactory(new PropertyValueFactory<>("Command"));

        // ~~~~~~~~~~~~~~~~~ Step Logs Table Initialization ~~~~~~~~~~~~~~~~~ //
        slStepColumn.setCellValueFactory(new PropertyValueFactory<>("Step"));
        slInputColumn.setCellValueFactory(new PropertyValueFactory<>("Input"));
        slOutputColumn.setCellValueFactory(new PropertyValueFactory<>("Output"));
        slPrevStateColumn.setCellValueFactory(new PropertyValueFactory<>("PrevState"));
        slNextStateColumn.setCellValueFactory(new PropertyValueFactory<>("NextState"));
        slCommandColumn.setCellValueFactory(new PropertyValueFactory<>("Command"));

        // ~~~~~~~~~~~~~~~~~ InlineCSSTextField Initialization ~~~~~~~~~~~~~~~~~ //
        tfInput.setStyle("-fx-font-family: courier new; -fx-font-size: 36pt;-fx-border-color: BLACK;");
        tfOutput.setStyle("-fx-font-family: courier new; -fx-font-size: 36pt;-fx-border-color: BLACK;");
        tfInput.setText("#...#");
        tfOutput.setText("...");

        // ~~~~~~~~~~~~~~~~~ EventHandler Initialization ~~~~~~~~~~~~~~~~~ //
        EventHandler<MouseEvent> handler = MouseEvent::consume;

        // block events
        tblRules.addEventFilter(MouseEvent.ANY, handler);
        tblStepLogs.addEventFilter(MouseEvent.ANY, handler);
    }



    // -------------------- Action Events -------------------- //

    // Machine Definition
    public void handleEditClick() {

        System.out.println("Edit");

        // reset TextFields
        tfInput.setText("#...#");
        tfOutput.setText("...");
        tfInputString.clear();

        // initialize index of current character read
        curChar = 0;

        // reset highlighter tracker
        prevCharHL = 0;
        curCharHL = 1;

        // initialize input and output
        curInput = "";
        curOutput = null;

        // initialize state
        curState = "";
        nextState = "";
        prevState = "";

        // clear contents of table view
        tblRules.getItems().clear();

        // clear memory content
        taMemory.clear();
        memoryList.clear();

        // clear init variables
        initMemoryList.clear();
        initState = null;
        initCommand = null;

        // set buttons disable false
        vspMachineDef.setDisable(false);
        btnSave.setDisable(false);

        // set buttons disable true
        btnEdit.setDisable(true);

        // set control buttons disable true
        btnPlay.setDisable(true);
        btnStep.setDisable(true);
        btnReset.setDisable(true);
    }

    public void handleSaveClick() {
        System.out.println(caMachineDef.getText().strip());
        System.out.println("Save");

        // parse content
        Parser parser = new Parser();

        AMGrammarBaseListener treeListener = parser.parseInput(caMachineDef.getText().strip());

        // initialize rules
        tblRules.setItems(getRuleList(treeListener.getRulesList()));

        // set row color while reading input string
        /**
         * CSS Colors
         * accept: #28A745
         * reading: #FFC107
         * reject: #DC3545
         */

        tblRules.setRowFactory(tv -> new TableRow<Rule>() {
            @Override
            public void updateItem(Rule rule, boolean empty) {
                super.updateItem(rule, empty) ;
                if (rule == null) {
                    setStyle("");
                } else if (prevState.equals(rule.getState()) && rule.getInput().equals(curInput)) {
                    tblStepLogs.getItems().add(new StepLogs(step, rule.getInput(), rule.getOutput(),
                            rule.getState(), rule.getNextState(), rule.getCommand()));

                    if (rule.getNextState().equals("accept")) {
                        setStyle("-fx-background-color: #28A745;");
                    } else if (rule.getNextState().equals("reject")) {
                        setStyle("-fx-background-color: #DC3545;");
                    } else {
                        setStyle("-fx-background-color: #FFC107;");
                    }
                } else {
                    setStyle("");
                }
            }
        });

        // initialize initial, current, and previous state
        initState = treeListener.getRulesList().get(0).getState();
        nextState = "";
        curState = initState;
        prevState = initState;

        // initialize initial, current, and previous command
        initCommand = treeListener.getRulesList().get(0).getCommand();
        nextCommand = initCommand;
        curCommand = initCommand;
        prevCommand = initCommand;

        // initialize input and output
        curInput = "";
        curOutput = null;

        // initialize index of current character read
        curChar = 0;

        // initialize highlight tracker
        prevCharHL = 0;
        curCharHL = 1;

        // highlight left-most #
        tfInput.setStyle(prevCharHL, curCharHL,"-rtfx-background-color: #FFC107;");

        if (treeListener.getMemoryList().size() > 0)
        {
            // initialize memory
            for (String name : treeListener.getMemoryList()) {
                if (!name.contains("T")) {
                    initMemoryList.add(new Memory(name, new ArrayList<String>()));
                    taMemory.setText(taMemory.getText() + name + ": []\n");
                }
            }

            memoryList.addAll(initMemoryList);
        }

        System.out.println(curState);

        // set buttons disable true
        vspMachineDef.setDisable(true);
        btnSave.setDisable(true);

        // set control buttons disable false
        btnPlay.setDisable(false);
        btnStep.setDisable(false);
        btnReset.setDisable(false);

        // set buttons disable false
        btnEdit.setDisable(false);
    }

    // Controls
    public void handlePlayClick() {
        System.out.println("Play");

        memoryList.get(0).write("1");

        updateTAMemory();
    }

    public void handleResetClick() {
        System.out.println("Reset");

        memoryList.get(0).queueRead();


        tfInput.deselect();

        updateTAMemory();
    }

    public void handleStepClick() throws ExecutionException, InterruptedException {
        System.out.println("Step");
        if (!accept && !reject) {
            // disable reset, play, and edit buttons
            if (!btnPlay.isDisabled() && !btnReset.isDisabled() && !btnEdit.isDisabled()){
                btnPlay.setDisable(true);
                btnReset.setDisable(true);
                btnEdit.setDisable(true);
            }

            // set the input text to the text in the input string field
            if (tfInput.getText().equals("#...#") && !tfInputString.getText().equals(""))
                tfInput.setText("#" + tfInputString.getText() + "#");

            // increment step number
            step+=1;

            // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Machine Logic ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
            // get the rule for the current state then get the current command
            for (Rule rule: tblRules.getItems()) {
                if (rule.getState().equals(curState)) {
                    curCommand = rule.getCommand();
                }
            }

            if (curCommand.startsWith("SCAN") || curCommand.startsWith("RIGHT") || curCommand.startsWith("LEFT")) {
                // update highlighter trackers
                updateHLTrackers(curCommand);

                // get the input that will be read
                curInput = String.valueOf(tfInput.getText().charAt(curChar));

                // get the rule for the current input and state then get the next state
                for (Rule rule: tblRules.getItems()) {
                    if (rule.getState().equals(curState) && rule.getInput().equals(curInput)) {
                        nextState = rule.getNextState();
                        curOutput = rule.getOutput();
                    }
                }

                if (!Objects.equals(curOutput, null)) {
                    updateTape();
                } else {
                    // debug
                    System.out.println("\nSTransition " + step + "\ncurState: " + curState + "\nnextState: " + nextState
                            + "\ncurInput: " + curInput + "\ncurOutput: " + Objects.equals(curOutput, null) + "\ncurCommand: " + curCommand
                            + "\ncurChar: " + curChar);
                }

            } else if (curCommand.startsWith("WRITE") || curCommand.startsWith("READ")) {
                // get the rule for the current input and state then get the next state
                for (Rule rule: tblRules.getItems()) {
                    if (rule.getState().equals(curState)) {
                        curInput = rule.getInput();
                        nextState = rule.getNextState();
                    }
                }

                String[] parseCommand = curCommand.split("\\(");

                String mName = parseCommand[1].replace(")", "");

                // execute machine function based on current command
                if (curCommand.startsWith("WRITE"))
                    write(mName);
                 else
                    read(mName);

                // update the memory text area
                updateTAMemory();

                System.out.println("\nMTransition " + step + "\ncurState: " + curState + "\nnextStates: " + nextState
                        + "\ncurInput: " + curInput + "\nprevCommand: " + prevCommand
                        +  "\ncurCommand: " + curCommand + "\ncurChar: " + curChar + "\nmName: " + mName);


            }

            // update the state variables of the machine
            updateState();

            // update highlighter GUI
            updateGUIHighlighter();

            // refresh table
            tblRules.refresh();
        } else {
            resetMachine();
            tblRules.refresh();
            step = 0;
        }
    }

    // -------------------- Observable List -------------------- //

    // Rule Table
    public ObservableList<Rule> getRuleList(List<Rule> ruleList) {
        ObservableList<Rule> rules = FXCollections.observableArrayList(ruleList);
        return rules;
    }

    // Step Logs Table
    public ObservableList<StepLogs> getStepLogsList(List<StepLogs> stepLogsList) {
        ObservableList<StepLogs> stepLogs = FXCollections.observableArrayList(stepLogsList);
        return stepLogs;
    }

    // -------------------- Machine Command -------------------- //
    public void updateTape() {
        String input = tfInput.getText();
        String updatedTape = input.substring(0, curChar) + curOutput + input.substring(curChar + 1);
        tfInput.setText(updatedTape);

        System.out.println("\nTTransition " + step + "\ncurStates: " + curState + "\nnextStates: " + nextState
                + "\ncurInput: " + curInput + "\nprevCommand: " + prevCommand +  "\ncurCommand: " + curCommand
                + "\nnextCommand: " + nextCommand + "\ncurChar: " + curChar + "\nupdatedTape: " + updatedTape);

        // reset current output since not all states has output
        curOutput = null;
    }
    public void write(String mName) {
        for (Memory memory : memoryList) {
            if (memory.getName().equals(mName) && curCommand.startsWith("WRITE")) {
                memory.write(curInput);
            }
        }
    }

    public void read(String mName) {
        for (Memory memory : memoryList) {
            if (memory.getName().equals(mName) && curCommand.startsWith("READ")
                    && mName.startsWith("S")) {
                memory.stackRead();
            } else if (memory.getName().equals(mName) && curCommand.startsWith("READ")
                    && mName.startsWith("Q")) {
                memory.queueRead();
            }
        }
    }

    // -------------------- Update GUI -------------------- //
    public void updateState () {
        // save curState to prevState for table highlights
        prevState = curState;
        // update current state to the next state
        curState = nextState;
    }

    public void updateTAMemory () {
        taMemory.clear();
        for (Memory memory: memoryList) {
            taMemory.setText(taMemory.getText() + memory.getName() + ": " + memory.getMemory() + "\n");
        }
    }

    public void updateHLTrackers(String command) {
        tfInput.clearStyle(prevCharHL, curCharHL);

        if ((command.equals("SCAN") || command.contains("RIGHT")) && curCharHL < tfInput.getText().length()) {
            // move highlight tracker to the right
            prevCharHL+=1;
            curCharHL+=1;
            curChar++;
        } else if (command.contains("LEFT") && prevCharHL >= 0) {
            // move highlight tracker to the left
            prevCharHL-=1;
            curCharHL-=1;
            curChar--;
        }
    }

    public void updateGUIHighlighter() {
        /**
         * CSS Colors
         * accept: #28A745
         * reading: #FFC107
         * reject: #DC3545
         */
        // check if the next state is accept, reject, or neither
        if (nextState.equals("accept")) {
            tfInput.setStyle(prevCharHL, curCharHL,"-rtfx-background-color: #28A745;");
            accept = true;
        } else if (nextState.contains("reject") || nextState.equals("")) {
            tfInput.setStyle(prevCharHL, curCharHL,"-rtfx-background-color: #DC3545;");
            reject = true;
        } else {
            // update highlight tracker
            tfInput.setStyle(prevCharHL, curCharHL,"-rtfx-background-color: #FFC107;");
        }
    }

    public void resetMachine() {
        // initialize index of current character read
        curChar = 0;

        // initialize highlight tracker
        prevCharHL = 0;
        curCharHL = 1;

        // highlight left-most #
        tfInput.setStyle(prevCharHL, curCharHL,"-rtfx-background-color: #FFC107;");

        // initialize input and output
        curInput = "";
        curOutput = null;

        // initalize current state and next state
        nextState = "";
        curState = initState;

        // reset memory
        memoryList.clear();
        taMemory.clear();
        memoryList.addAll(initMemoryList);
        updateTAMemory();

        // initialize prev and next command
        nextCommand = initCommand;
        prevCommand = initCommand;
        curCommand = initCommand;

        // clear logs
        tblStepLogs.getItems().clear();

        // reset input
        tfInput.setText("#...#");

        // reset flags
        accept = false;
        reject = false;

        // make play, reset, and edit buttons clickable again
        if (btnPlay.isDisabled() && btnReset.isDisabled() && btnEdit.isDisabled()){
            btnPlay.setDisable(false);
            btnReset.setDisable(false);
            btnEdit.setDisable(false);
        }
    }
}
