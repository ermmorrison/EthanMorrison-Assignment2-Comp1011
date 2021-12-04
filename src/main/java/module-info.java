module com.example.ethanmorrisonassignment2comp1011 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.ethanmorrisonassignment2comp1011 to javafx.fxml, com.google.gson;
    exports com.example.ethanmorrisonassignment2comp1011;
}