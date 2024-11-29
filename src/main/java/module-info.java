module com.spacrod.genkeys {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spacrod.genkeys to javafx.fxml;
    exports com.spacrod.genkeys;
}