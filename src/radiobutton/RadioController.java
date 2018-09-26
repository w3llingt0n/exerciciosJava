/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobutton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author rapwe
 */
public class RadioController implements Initializable {

    @FXML
    private RadioButton si;
    @FXML
    private ToggleGroup cursoGrupo;
    @FXML
    private RadioButton adm;
    @FXML
    private RadioButton ec;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void pegarDados(ActionEvent event) {
        /*
        if (si.isSelected()) {
            label.setText(si.getText());
        } else if (adm.isSelected()) {
            label.setText(adm.getText());
        } else if (ec.isSelected()) {
            label.setText(ec.getText());
        }
        */
        RadioButton rb = (RadioButton) cursoGrupo.getSelectedToggle();
        label.setText(rb.getText());
    }

}
