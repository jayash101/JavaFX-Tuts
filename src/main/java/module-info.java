module com.jayash.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.jayash.javafxproject to javafx.fxml;
    exports com.jayash.javafxproject;
    exports com.jayash.javafxproject.layouts;
    opens com.jayash.javafxproject.layouts to javafx.fxml;
}