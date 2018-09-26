/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author rapwe
 */
public class FXMLController implements Initializable {

    @FXML
    private CheckBox checkHS;
    @FXML
    private CheckBox checkTR;
    @FXML
    private CheckBox checkEvil4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getData(ActionEvent event) {
        if(checkHS.isSelected()){
            System.out.println(checkHS.getText());
        }
        if(checkTR.isSelected()){
            System.out.println(checkTR.getText());
        }
        if(checkEvil4.isSelected()){
            System.out.println(checkEvil4.getText());
        }
    }
    
}
