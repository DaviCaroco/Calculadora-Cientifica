package calculadorajavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import jdk.nashorn.internal.runtime.ParserException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class FXMLDocumentController {

    @FXML
    private Button Dividir;

    @FXML
    private Pane TabOperations;

    @FXML
    private TextField TextFieldNumber;

    @FXML
    private Button ApagarConsole;

    @FXML
    private Button Delertar;

    @FXML
    private Button AnsButton;

    @FXML
    private Button SenoButton;

    @FXML
    private Button CossenoButton;

    @FXML
    private Button TangenteButton;

    @FXML
    private Button Somar;

    @FXML
    private Button Subtrair;

    @FXML
    private Button SenohButton;

    @FXML
    private Button CossenohButton;

    @FXML
    private Button TangentehButton;

    @FXML
    private Button Multiplicar;

    @FXML
    private Button LogaritimoButton;

    @FXML
    private Button Numero1;

    @FXML
    private Button Numero2;

    @FXML
    private Button Numero3;

    @FXML
    private Button Igual;

    @FXML
    private Button Numero7;

    @FXML
    private Button Numero4;

    @FXML
    private Button Numero5;

    @FXML
    private Button Numero8;

    @FXML
    private Button Numero0;

    @FXML
    private Button Numero6;

    @FXML
    private Button Numero9;

    @FXML
    private Button ExpButton;

    @FXML
    private Button RaizButton;

    @FXML
    private Button Porcentagem;

    @FXML
    private ColorPicker CorPicker;

    @FXML
    private TextArea TextAreaHistory;

    @FXML
    private Pane PanelBackgroud;

    @FXML
    private void changeColor(ActionEvent event) {
        String Color = CorPicker.getValue().toString().substring(2, CorPicker.getValue().toString().length() - 2);
        PanelBackgroud.setStyle("-fx-background-color: #" + Color);
        TabOperations.setStyle("-fx-background-color: #" + Color);
    }
    
    @FXML
    void addOperation(ActionEvent event) {
        if (OperationOn) {
            TextFieldNumber.setText(TextFieldNumber.getText() + ((Button)event.getSource()).getText());
            OperationOn = false;
        }
    }

    @FXML
    void addValue(ActionEvent event) {
        TextFieldNumber.setText(TextFieldNumber.getText() + ((Button)event.getSource()).getText());
        OperationOn = true;
    }
    
    private boolean OperationOn = true;
    private double LastOperationOn = 0;

    public void ApagarConsole(){
        TextFieldNumber.setText("");
        OperationOn = true;
    }
    
    public void Deletar(){
        if(!(TextFieldNumber.getText().length() == 0)){
            TextFieldNumber.setText(TextFieldNumber.getText().substring(0, TextFieldNumber.getText().length() - 1));
        }
    }
    
    public void MakeOperation(){
        String Operation5 = TextFieldNumber.getText();
        
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try{
            Object operation = engine.eval(TextFieldNumber.getText().replaceAll("x","*"));
            TextFieldNumber.setText("" + operation);
            TextAreaHistory.setText(Operation5 + " = " + TextFieldNumber.getText() + "\n" + TextAreaHistory.getText());
            LastOperationOn = Double.parseDouble(TextFieldNumber.getText());
        } catch(ScriptException | ParserException e){
            TextFieldNumber.setText("");
        }
    }
    
    public void getLastResult(){
        if (!(LastOperationOn == 0)){
            TextFieldNumber.setText(TextFieldNumber.getText() + LastOperationOn);
        }
    }
}
