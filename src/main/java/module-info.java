module com.example.ethanmorrisonassignment2comp1011 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ethanmorrisonassignment2comp1011 to javafx.fxml;
    exports com.example.ethanmorrisonassignment2comp1011;
}