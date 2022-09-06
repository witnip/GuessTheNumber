module com.witnip.guessnumber {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.witnip.guessnumber to javafx.fxml;
    exports com.witnip.guessnumber;
}