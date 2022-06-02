module com.example.ramdomstring {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ramdomstring to javafx.fxml;
    exports com.example.ramdomstring;
}