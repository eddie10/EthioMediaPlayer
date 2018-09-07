
package ethiomediaplayer;
import com.mpatric.mp3agic.Mp3File;
import static ethiomediaplayer.Playlist.*;

import javafx.scene.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Mp3Table {
    public static TableView<Mp3File>  Table;
    public static TableColumn Title;
    public static TableColumn Artist;
    public static TableColumn Album;
    public static TableColumn Year;
    public Mp3Table(){
      
        
    
    
    
    }
    public static void tableCreate(){
     Table = new TableView<Mp3File>();
        Title = new TableColumn();
        Title.setCellValueFactory(new PropertyValueFactory<>("Title"));
        Artist = new TableColumn();
        Artist.setCellValueFactory(new PropertyValueFactory<>("Artist"));
        Album = new TableColumn();
        Album.setCellValueFactory(new PropertyValueFactory<>("Album"));
        Year = new TableColumn();
        Year.setCellValueFactory(new PropertyValueFactory<>("Year"));
        Table.getColumns().addAll(Title,Artist,Album,Year);
        for(int i = 0;i<Mp3z.size();i++)
        Table.getItems().add(Mp3z.get(i));
        Table.setPrefSize(100, 100);
        Table.sort();
    
    
    
    }
    
    
    
}
