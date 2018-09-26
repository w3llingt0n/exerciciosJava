/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author rapwe
 */
public class FXMLController implements Initializable {

    @FXML
    private PasswordField password;
    @FXML
    private TextArea txt;
    @FXML
    private Spinner<Integer> fidget;
    @FXML
    private Spinner<String> spin;
    @FXML
    private ListView<String> lista;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SpinnerValueFactory<Integer> valores = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
        fidget.setValueFactory(valores);
        ObservableList<String> meses = FXCollections.observableArrayList("Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
        fidget.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_HORIZONTAL);
        SpinnerValueFactory<String> mesesSpinner = new SpinnerValueFactory.ListSpinnerValueFactory<String>(meses) {
        };
        spin.setValueFactory(mesesSpinner);
        lista.setItems(meses);
    }

    @FXML
    private void pegarDados(ActionEvent event) {
        /*
        if(password.getText().equals("")){
            
        }
        else{
            
        }
         */
        System.out.println(password.getText());
        System.out.println(txt.getText());
        System.out.println(fidget.getValue());
        System.out.println(lista.getSelectionModel().getSelectedItem());
    }

}
