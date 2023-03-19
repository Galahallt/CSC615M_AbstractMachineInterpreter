package machine;

import antlr.MainParser;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    // -------------------- Panes -------------------- //
    public VirtualizedScrollPane vspMachineDef;
    // -------------------- Code Area -------------------- //
    public CodeArea caMachineDef;

    // -------------------- Text Field -------------------- //
    public TextField tfInputString;

    // -------------------- Table View -------------------- //
    public TableView<Rule> tblRules;
    public TableView<StepLogs> tblStepLogs;
    public TableView<Memory> tblMemory;


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
        caMachineDef.setParagraphGraphicFactory(LineNumberFactory.get(caMachineDef));
        caMachineDef.setLineHighlighterFill(Color.WHITESMOKE);
    }

    // -------------------- Action Events -------------------- //

    // Machine Definition
    public void handleEditClick() {

        System.out.println("Edit");

        // set buttons disable false
        vspMachineDef.setDisable(false);
        btnSave.setDisable(false);

        // set buttons disable true
        btnEdit.setDisable(true);
    }

    public void handleSaveClick() {
        System.out.println(caMachineDef.getText().strip());
        System.out.println("Save");

        // parse content
        MainParser.parseInput(caMachineDef.getText().strip());

        // set buttons disable true
        vspMachineDef.setDisable(true);
        btnSave.setDisable(true);

        // set buttons disable false
        btnEdit.setDisable(false);
    }

    // Controls
    public void handlePlayClick() {
        System.out.println("Play");
    }

    public void handleResetClick() {
        System.out.println("Reset");
    }

    public void handleStepClick() {
        System.out.println("Step");
    }

    // -------------------- Parse Machine Definition -------------------- //
    public void parseInput() {

    }
}
