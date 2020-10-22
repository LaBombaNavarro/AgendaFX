package agendafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClasePrincipal extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        MenuBar mbar=new MenuBar();
        Menu menMostrar=new Menu("Mostrar Contactos");
        Menu menCrear=new Menu("Añadir Contacto");
        Menu menBuscar=new Menu("Buscar Contactos");
        Label eti1=new Label("hola 1");
        Label eti2=new Label("hola 2");
        mbar.getMenus().addAll(menMostrar,menCrear,menBuscar);
        
        VBox VBprin = new VBox(mbar,eti1);
        Scene principal = new Scene(VBprin,450,300);
            
            VBox VBlist = new VBox(mbar,eti2);
            Scene listar = new Scene(VBlist,450,300);
        
        
        menMostrar.setOnAction((t) -> {
            stage.setScene(listar);
            stage.show();
        });
        
        stage.setScene(principal);
        stage.show();
    }
    
}
