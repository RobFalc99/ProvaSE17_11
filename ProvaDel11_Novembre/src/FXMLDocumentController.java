/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author FALCONE
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Button btnLuigi;
    @FXML
    private Button btnLuigi1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Ciao Eugenio!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BottoneLuigi(ActionEvent event) {
        System.out.println("Hai cliccato sul bottone Luigi");
    }

    @FXML
    private void BottoneLuigiNuovo(ActionEvent event) {
        System.out.println("Hey ho creato un nuovo bottone porco zio");
    }
    
}
