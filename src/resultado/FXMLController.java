/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultado;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author rapwe
 */
public class FXMLController implements Initializable {

    @FXML
    private Label resultado;
    @FXML
    private TextField num;
    @FXML
    private RadioButton dobro;
    @FXML
    private ToggleGroup calculo;
    @FXML
    private RadioButton triplo;
    @FXML
    private RadioButton quadrado;
    @FXML
    private RadioButton cubo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void calcular(ActionEvent event) {
        RadioButton option = (RadioButton) calculo.getSelectedToggle();
        switch (option.getText()) {
            case "dobro":
                resultado.setText("O resultado é: " + Double.parseDouble(num.getText()) * 2);
                break;
            case "triplo":
                resultado.setText("O resultado é: " + Double.parseDouble(num.getText()) * 3);
                break;
            case "quadrado":
                resultado.setText("O resultado é: " + Math.pow(Double.parseDouble(num.getText()), 2));
                break;
            case "cubo":
                resultado.setText("O resultado é: " + Math.pow(Double.parseDouble(num.getText()), 3));
                break;
            default:
                resultado.setText("Nenhuma opção selecionada.");
        }
    }

}
