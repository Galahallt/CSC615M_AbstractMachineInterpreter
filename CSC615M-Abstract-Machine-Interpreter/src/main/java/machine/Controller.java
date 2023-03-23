package machine;

import antlr.AMGrammarBaseListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.InlineCssTextField;
import org.fxmisc.richtext.LineNumberFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    // -------------------- Highlighter Range -------------------- //
    int curChar = 1;
    int prevChar = 0;
    // -------------------- Track current rule -------------------- //
    ObservableList<Rule> highlightRow = FXCollections.observableArrayList();
    String curInput;
    String curState;
    String prevState;
    String initState;
    // -------------------- List -------------------- //
    List<Memory> memoryList = new ArrayList<>();
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

        // ~~~~~~~~~~~~~~~~~ InlineCSSTextField Initialization ~~~~~~~~~~~~~~~~~ //
        tfInput.setStyle("-fx-font-family: courier new; -fx-font-size: 36pt;-fx-border-color: BLACK;");
        tfOutput.setStyle("-fx-font-family: courier new; -fx-font-size: 36pt;-fx-border-color: BLACK;");
        tfInput.setText("#...#");
        tfOutput.setText("...");
    }

    // -------------------- Action Events -------------------- //

    // Machine Definition
    public void handleEditClick() {

        System.out.println("Edit");

        // reset TextFields
        tfInput.setText("#...#");
        tfOutput.setText("...");
        tfInputString.clear();

        // clear contents of list
        memoryList.clear();

        // clear contents of table view
        tblRules.getItems().clear();
        taMemory.clear();

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
        tblRules.setRowFactory(new Callback<TableView<Rule>, TableRow<Rule>>() {
            @Override public TableRow<Rule> call(TableView<Rule> param) {
                return new TableRow<Rule>() {
                    @Override protected void updateItem(Rule rule, boolean empty) {
                        super.updateItem(rule, empty);

                        if (rule == null) {
                            setStyle("");
                        } else if (rule.getState().equals(prevState) && rule.getInput().equals(curInput)) {
                            curState = rule.getNextState();

                            if (prevState.equals("accept")) {
                                setStyle("-fx-background-color: #28A745;");
                            } else {
                                setStyle("-fx-background-color: #FFC107;");
                            }
                        } else {
                            setStyle("");
                        }
                    }
                };
            }
        });

        // initialize initial state
        initState = treeListener.getRulesList().get(0).getState();
        curState = initState;
        prevState = curState;

        // initialize memory
        for (String name : treeListener.getMemoryList()) {
            memoryList.add(new Memory(name, new ArrayList<String>()));
            taMemory.setText(taMemory.getText() + name + ": []\n");
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

    public void handleStepClick() {
        System.out.println("Step");
        if (tfInput.getText().equals("#...#") && !tfInputString.getText().equals(""))
            tfInput.setText("#" + tfInputString.getText() + "#");

        if (!btnPlay.isDisabled() && !btnReset.isDisabled() && !btnEdit.isDisabled()){
            btnPlay.setDisable(true);
            btnReset.setDisable(true);
            btnEdit.setDisable(true);
        }

        // update current character being read
        if (prevChar <= tfInput.getText().length())  {
            curInput = String.valueOf(tfInput.getText().charAt(prevChar));
        }

        prevState = curState;
        List<Rule> items = new ArrayList<>(tblRules.getItems());
        tblRules.getItems().setAll(items);

        updateHighlighter();

        updateTAMemory();
    }

    // -------------------- Observable List -------------------- //

    // Rule Table
    public ObservableList<Rule> getRuleList(List<Rule> ruleList) {
        ObservableList<Rule> rules = FXCollections.observableArrayList(ruleList);
        return rules;
    }

    // -------------------- update -------------------- //
    public void updateTAMemory () {
        taMemory.clear();
        for (Memory memory: memoryList) {
            taMemory.setText(taMemory.getText() + memory.getName() + ": " + memory.getMemory() + "\n");
        }
    }

    public void updateHighlighter() {
        /**
         * CSS Colors
         * accept: #28A745
         * reading: #FFC107
         * reject: #DC3545
         */
        // if nothing has been highlighted yet, do not clear style
        if (prevChar != 0 && curChar != 1)
            tfInput.clearStyle(prevChar - 1, curChar - 1);

        // move highlighter by one
        if (curChar <= tfInputString.getText().length() + 1) {
            // highlight current character
            tfInput.setStyle(prevChar, curChar,"-rtfx-background-color: #FFC107;");
            prevChar+=1;
            curChar+=1;
        }
        // if it reaches the end of input string
        else if (curChar == tfInputString.getText().length() + 2) {
            tfInput.setStyle(prevChar, curChar,"-rtfx-background-color: #28A745;");
            curChar+=1;
        }
        // if step is pressed after the highlighter reaches the end, reset
        else {
            tfInput.clearStyle(prevChar, curChar - 2);
            prevChar = 0;
            curChar = 1;

            // reset initial state and input
            curInput = null;
            curState = initState;

            // make play, reset, and edit buttons clickable again
            if (btnPlay.isDisabled() && btnReset.isDisabled() && btnEdit.isDisabled()){
                btnPlay.setDisable(false);
                btnReset.setDisable(false);
                btnEdit.setDisable(false);


            }
        }
    }
}
