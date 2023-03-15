package machine;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
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
    }

    public void handleSaveClick() {
        System.out.println("Save");
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
}
