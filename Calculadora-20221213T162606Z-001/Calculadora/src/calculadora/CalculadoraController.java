/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CalculadoraController implements Initializable {
    
    double valor1 = 0; double valor2 = 0; double resultado = 0;
    String Operaçao = "";

    @FXML
    private TextField TelaTextField;
    @FXML
    private Button UmButton;
    @FXML
    private Button DoisButton;
    @FXML
    private Button TresButton;
    @FXML
    private Button CincoButton;
    @FXML
    private Button SeisButton;
    @FXML
    private Button SeteButton;
    @FXML
    private Button OitoButton;
    @FXML
    private Button NoveButton;
    @FXML
    private Button ZeroButton;
    @FXML
    private Button ApagaButton;
    @FXML
    private Button IgualButton;
    @FXML
    private Button QuatroButton;
    @FXML
    private Button PontoButton;
    @FXML
    private Button SenoButton;
    @FXML
    private Button CossenoButton;
    @FXML
    private Button TangButton;
    @FXML
    private Button RaizButton;
    @FXML
    private Button PotenciaButton;
    @FXML
    private Button LogaritimoButton;
    @FXML
    private Button SomaButton;
    @FXML
    private Button SubtrairButton;
    @FXML
    private Button MultiplicaçaoButton;
    @FXML
    private Button DividirButton;
    @FXML
    private Button FatorialButton;
    @FXML
    private Button PiButton;
    @FXML
    private Button ExponencialButton;
    @FXML
    private Button InputButton;
    @FXML
    private Button PorCentoButton;
    @FXML
    private Button ParanteseDireito;
    @FXML
    private Button ParanteseEsquerdo;
    @FXML
    private Button EButton;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        UmButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "1");
            }
        });
        
        DoisButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "2");
            }
        });
        
        TresButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "3");
            }
        });
        
        QuatroButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "4");
            }
        });
        
        CincoButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "5");
            }
        });
        
        SeisButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "6");
            }
        });
        
        SeteButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "7");
            }
        });
        
        OitoButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "8");
            }
        });
        
        NoveButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "9");
            }
        });
        
        ZeroButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "0");
            }
        });
        
        ParanteseDireito.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ ")");
            }
        });
        
        ParanteseEsquerdo.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText(TelaTextField.getText()+ "(");
            }
        });
        
        MultiplicaçaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                Operaçao = "*";
                
            }
        });
        
        SomaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                Operaçao = "+";
                
            }
        });
        
        SubtrairButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                Operaçao = "-";
                
            }
        });
        
        DividirButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("");
                Operaçao = "/";
                
            }
        });
        
        ApagaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                TelaTextField.setText("");
                valor1 = 0; valor2 = 0;
                Operaçao = "";
            }
        });
        
        RaizButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(TelaTextField.getText());
                TelaTextField.setText("√(");
                Operaçao = "Math.sqrt(valor1)";
                
            }
        });
        
        IgualButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor2 = Double.parseDouble(TelaTextField.getText());
                
                switch(Operaçao){
                    case "+":
                        resultado = valor1 + valor2;
                        TelaTextField.setText(String.valueOf(resultado));
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        TelaTextField.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        TelaTextField.setText(String.valueOf(resultado));
                        break;
                    case "/":
                        resultado = valor1 / valor2;
                        TelaTextField.setText(String.valueOf(resultado));
                        break;
                    case "sqrt":
                        resultado = Math.sqrt(valor2);
                        TelaTextField.setText(String.valueOf(resultado));
                }
                Operaçao = "";
                valor1 = 0; valor2 = 0;
            }
        }); 
    }     
}
