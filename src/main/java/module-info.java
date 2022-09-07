module finalproject.loginpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens finalproject.loginpage to javafx.fxml;
    exports finalproject.loginpage;
}