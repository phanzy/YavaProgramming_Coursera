
import edu.duke.*;
import java.io.*;

public class Part4 {
    public void findUrl(){
        URLResource file = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        
        for (String word : file.words()){
            //System.out.println(item);
            String lcurl = word.toLowerCase();
            int curIndex = lcurl.indexOf("youtube.com"); //setting curIndex to current yt index
             if (curIndex != -1){  
               int startIndex = lcurl.lastIndexOf("\"", curIndex); //grabbing the last doublequotes before the current youtube url
               int stopIndex = lcurl.indexOf("\"", curIndex + 1); 
               System.out.println("This is the start index "  + curIndex); 
               //using word string to get the links with correct capitalization(using lcurl like a template/index key)
               String realUrl = word.substring(startIndex + 1, stopIndex);
               System.out.println(realUrl);}
        }
    
    }
}

