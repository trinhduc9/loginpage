package finalproject.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField username,adminUser;
    @FXML
    private TextField password;
    @FXML
    private Label loginFail, adminLog;
    @FXML
    private DialogPane dialogPane;

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private void toCustomer(ActionEvent e) throws IOException {
        if (username.getText().equals("abc")) {
            root = FXMLLoader.load(getClass().getResource("customerUI.fxml"));
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            loginFail.setVisible(true);
        }
    }
    @FXML
    private void toAdmin(ActionEvent e) throws IOException {
        if (adminUser.getText().equals("abc")) {
            root = FXMLLoader.load(getClass().getResource("adminUI.fxml"));
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            adminLog.setVisible(true);
        }
    }
    @FXML
    private void toAdminLogin(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("adminLogin.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void toCustomerLogin(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void toRegister(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("adminUI.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void enableDialog(ActionEvent e){
        dialogPane.setVisible(true);
    }

}
