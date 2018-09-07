
package ethiomediaplayer;

import static ethiomediaplayer.EthioMediaPlayer.listOfFiles;
import java.io.File;
import java.nio.file.FileVisitor;
import java.nio.file.SimpleFileVisitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import javafx.*;
import javafx.scene.*;
import javafx.scene.control.TableView;

import com.mpatric.mp3agic.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Playlist extends SimpleFileVisitor{
       public static ArrayList<String> playlist;
       public static ArrayList<Mp3File> Mp3z;
       public static Mp3File g;
       
    public Playlist(){
     playlist = new ArrayList<String>();
     Mp3z = new ArrayList<Mp3File>();
   // for(int i=0;i<EthioMediaPlayer.listOfFiles.length;i++){
        
        //if(EthioMediaPlayer.listOfFiles[i].isDirectory()==false){
    //playlist.add(EthioMediaPlayer.listOfFiles[i].getName());
//}
    
   // }
    String w = "/Users/myuniverese/Desktop/utorrents/";
           try {
               checkAllSongs(w);
               //printlist();
               //noRepeats();
               // printlist();
           } catch (IOException ex) {
               Logger.getLogger(Playlist.class.getName()).log(Level.SEVERE, null, ex);
           }
    Mp3s();
    
    }
    
    public static void printlist(){
    
    
        Collections.sort(playlist);
    for(int j=0;playlist.size()>j;j++){
    System.out.println(playlist.get(j));
    
    }
    
}
    public  void checkAllSongs(String s) throws IOException{

        File root = new File(s);
        File[] list = root.listFiles();
        if (list != null) {  // In case of access error, list is null
            for (File f : list) {
                if (f.isDirectory()) {

                 //System.out.println(f.getAbsoluteFile());

                    checkAllSongs(f.getAbsolutePath());

                } else {
                    if(f.getName().matches(".*.mp3")){
                   // System.out.println(f.getAbsoluteFile());
                   
                        try {
                            g = new Mp3File(f.getAbsoluteFile().toString());
                        } catch (UnsupportedTagException ex) {
                            Logger.getLogger(Playlist.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InvalidDataException ex) {
                            Logger.getLogger(Playlist.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    Mp3z.add(g);
                }
                }

            }
            
            
            
            
            
            }
        

 

    

   
    
    }public void Mp3s(){
        
        
        
        for(int i =0;i<Mp3z.size();i++){
      
            if(Mp3z.get(i).hasId3v1Tag()==true){
            //System.out.println(Mp3z.get(i).getId3v1Tag().getTitle());
            System.out.println("yup v1");
            }else if(Mp3z.get(i).hasId3v2Tag()==true)
              System.out.println(Mp3z.get(i).getId3v2Tag().getTitle());
            
      }Mp3Table.tableCreate();
    
    }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
   







