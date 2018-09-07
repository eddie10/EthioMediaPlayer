
 
package ethiomediaplayer;

import static ethiomediaplayer.Mp3Table.Table;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

/**
 *
 * @author myuniverese
 */
public class EthioMediaPlayer extends Application {
    public static File[] listOfFiles;
    public static Stage stage1;
    @Override
    public void start(Stage primaryStage) {
            
        
        BackgroundSize bs = new BackgroundSize(700,640,false,false,false,false);
         BackgroundImage myBI=new BackgroundImage(new Image("https://wallpapercave.com/wp/hWROViN.jpg"),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,bs);
         
        
            
            
        StackPane root = new StackPane();
        root.setBackground(new Background(myBI));
        //URL url = getClass().getResource("/Users/myuniverese/Desktop/NetBeansProjs/EthioMediaPlayer/mix.mp3");
        //System.out.println(url);
//File file = new File(url.getPath());
         //Media pick = new Media(EthioMediaPlayer.class.getResource("mix.mp3").toExternalForm()); // replace this with your own audio file
        //MediaPlayer player = new MediaPlayer(pick);
        //MediaView mediaView = new MediaView(player);
        //root.getChildren().add(mediaView);
        //root.getChildren().add();
         StackPane root1 = new StackPane();
        Scene scene1 = new Scene(root1,primaryStage.getWidth(),100);
        stage1 = new Stage();        
        stage1.setScene(scene1);
      
        
        Playlist pl = new Playlist();
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(Table);
        
        //root.getChildren().add();
        System.out.println(System.getProperty("user.dir"));
        Scene scene = new Scene(root, 700, 600);
        primaryStage.initStyle(StageStyle.UNIFIED);
        //File folder = new File("");
        //folder.getc
        

        
        
        
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
       // player.play();
       
       //pl.printlist();
       // stage1.initStyle(StageStyle.UNDECORATED);
       root1.getChildren().add(Table);
        stage1.setWidth(primaryStage.getWidth());
         stage1.setX(primaryStage.getX());
         stage1.setY(primaryStage.getY() + primaryStage.getHeight());
         stage1.show();
        
       
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
