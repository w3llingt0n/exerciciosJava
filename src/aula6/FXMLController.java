/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author rapwe
 */
public class FXMLController implements Initializable {

    @FXML
    private AnchorPane principal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void novo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("novo.fxml"));
        Scene cena = new Scene(root);
        Stage stage = new Stage(StageStyle.UTILITY);
        stage.setTitle("Nova Janela");
        stage.setScene(cena);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private void carregar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("novo.fxml"));
        principal.getChildren().setAll(root);
    }

    @FXML
    private void carregarN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("novo1.fxml"));
        principal.getChildren().setAll(root);
    }
    
}
