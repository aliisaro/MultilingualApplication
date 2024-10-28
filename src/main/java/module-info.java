module app.multilingualapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.multilingualapplication to javafx.fxml;
    exports app.multilingualapplication;
}