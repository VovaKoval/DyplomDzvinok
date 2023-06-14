package sample.dzvinky;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class MusicController {
    @FXML
    private Button MusicExit;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button MusicPererva;

    @FXML
    private Button MusicUrok;

    Stage ClickStageUrok = new Stage();
    FileChooser fileChooserUrok = new FileChooser();
    @FXML
    void OnClickUrok(ActionEvent event){
        fileChooserUrok.setTitle("Вибір музики на урок");
        fileChooserUrok.showOpenDialog(ClickStageUrok);
    }

    Stage ClickStagePererva = new Stage();
    FileChooser fileChooserPererva = new FileChooser();
    @FXML
    void OnClickPererva(ActionEvent event) {
        fileChooserPererva.setTitle("Вибір музики на перерву");
        fileChooserPererva.showOpenDialog(ClickStagePererva);

    }

    @FXML
    void OnClickMusicExit(ActionEvent event) {
        Stage stage = (Stage) MusicExit.getScene().getWindow();
        stage.close();
    }

}
