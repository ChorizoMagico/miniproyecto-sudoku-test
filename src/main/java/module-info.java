module com.test.miniproyectotest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.test.miniproyectotest to javafx.fxml;
    exports com.test.miniproyectotest;
}