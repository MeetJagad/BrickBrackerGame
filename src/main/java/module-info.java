module com.example.brickbrackprojectminorjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brickbrackprojectminorjavafx to javafx.fxml;
    exports com.example.brickbrackprojectminorjavafx;
}