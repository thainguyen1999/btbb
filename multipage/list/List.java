package multipage.list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import multipage.Main;

public class List {

    public ListView lv;

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent listPage= FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Stage newStage = new Stage();
        Main.rootStage.setTitle("thêm môn học");
        Main.rootStage.setScene(listScene);

    }
}
