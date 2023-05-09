module com.example.uml_clasesusotga {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uml_clasesusotga to javafx.fxml;
    exports com.example.uml_clasesusotga;
}