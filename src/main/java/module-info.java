module com.example.javafxaeroluxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.google.zxing;
    requires java.desktop;
    requires java.sql.rowset;

    exports com.example.javafxaeroluxproject.controllers;
    opens com.example.javafxaeroluxproject to javafx.fxml;
    opens com.example.javafxaeroluxproject.controllers to javafx.fxml;
    opens com.example.javafxaeroluxproject.models to javafx.base;
    exports com.example.javafxaeroluxproject;
}