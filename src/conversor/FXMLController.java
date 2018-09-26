/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rapwe
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField celsius;
    @FXML
    private TextField fahrenheit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void calcular(ActionEvent event) {
        if (fahrenheit.getText().isEmpty()) {
            fahrenheit.setText(String.valueOf((Double.parseDouble(celsius.getText()) * 1.8 + 32)));
        }
        else if(celsius.getText().isEmpty()){
            celsius.setText(String.valueOf(((Double.parseDouble(fahrenheit.getText())-32)/1.8)));
        }
    }

    @FXML
    private void limpar(ActionEvent event) {
        celsius.setText("");
        fahrenheit.setText("");
    }

}
