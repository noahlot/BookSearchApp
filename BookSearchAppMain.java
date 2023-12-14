import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.*;

public class BookSearchAppMain extends Application {
   // Variables for setting up/switching between scenes
   protected Stage stage;
   protected Scene scene;
   protected Parent rootOne;
   protected Parent rootTwo;
   
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage) throws Exception
   {
      // Adapted from Weather App sample project
      // Load the GUI from FXML built in Scene Builder
      Parent rootOne = FXMLLoader.load(getClass().getResource("BookLibraryApp.fxml"));
      Parent rootTwo = FXMLLoader.load(getClass().getResource("SearchResults.fxml"));
      Scene scene = new Scene(rootOne);    
      stage.setTitle("OpenLibrary Book Search");
      stage.setScene(scene);
      stage.show();   
   }
   
   @Override
   public void stop() {
      System.out.println("Stop called in Application class");
   }
}