package multipage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import multipage.Main;

public class Form {

    public TextField code;
    public TextField name;

    public void btnBack(ActionEvent actionEvent) throws Exception {
        Parent listPage= FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Stage newStage = new Stage();
        Main.rootStage.setTitle("danh sách");
        Main.rootStage.setScene(listScene);

    }
}
