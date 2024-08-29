module com.example.a12_110502201 {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens com.example.a12_110502201 to javafx.fxml;
    exports com.example.a12_110502201;
}