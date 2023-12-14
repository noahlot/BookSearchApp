import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.*;

public class BookSearchAppMain extends Application {
   // Variables for setting up/switching between scenes
   private Stage stage;
   private Scene scene;
   private Parent root;
   
   public static void main(String[] args)
   {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception
   {
      // Adapted from Weather App sample project
      // Load the GUI from FXML built in Scene Builder
      Parent root = FXMLLoader.load(getClass().getResource("BookLibraryApp.fxml"));    
      Scene scene = new Scene(root);      
      stage.setTitle("OpenLibrary Book Search");
      stage.setScene(scene);
      stage.show();    
   }
   
   @Override
   public void stop() {
      System.out.println("Stop called in Application class");
   }
}