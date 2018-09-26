/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author rapwe
 */
public class FXMLController implements Initializable {

    @FXML
    private ComboBox<String> combo;
    @FXML
    private ComboBox<Pessoa> comboPessoa;
    @FXML
    private DatePicker dataNasc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //lista do FXML
        ObservableList<String> options = FXCollections.observableArrayList();
        options.add("Dobro");
        options.add("Triplo");
        options.add("Quadrado");
        options.add("Cubo");
        combo.setItems(options);

        ObservableList<Pessoa> optionsPessoas = FXCollections.observableArrayList();
        optionsPessoas.add(new Pessoa("Bruno", "Barros"));
        optionsPessoas.add(new Pessoa("João", "Normanha"));
        optionsPessoas.add(new Pessoa("Henrique", "Fonseca"));

        comboPessoa.setItems(optionsPessoas);
    }

    @FXML
    private void pegarDados(ActionEvent event) {
        System.out.println(combo.getValue());
        System.out.println(comboPessoa.getValue());
        
        LocalDate data = dataNasc.getValue();
        System.out.println(data);
    }

}
