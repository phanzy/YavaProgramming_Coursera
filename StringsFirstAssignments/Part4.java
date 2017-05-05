
import edu.duke.*;
import java.io.*;

public class Part4 {
    public void findUrl(){
        URLResource file = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        
        for (String word : file.words()){
            //System.out.println(item);
            String lcurl = word.toLowerCase();
            int currIndex = lcurl.indexOf("youtube.com"); //setting currIndex to current yt index
             if (currIndex != -1){  
               int dqstartIndex = lcurl.lastIndexOf("\"", currIndex); //grabbing the last doublequotes before the current youtube url
               int dqstopIndex = lcurl.indexOf("\"", currIndex+1); 
               System.out.println("This is the start index "  +currIndex); 
               //using word string to get the links with correct capitalization(using lcurl like a template/index key)
               String realUrl = word.substring(dqstartIndex + 1, dqstopIndex);
               System.out.println(realUrl);}
        }
    
    }
}
