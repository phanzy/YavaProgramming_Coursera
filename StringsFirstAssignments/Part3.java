
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb){
        int currIndex = 0;
        int count = 0;   
        currIndex = stringb.indexOf(stringa,currIndex);
        while (currIndex != -1) {
            int stopIndex = currIndex + stringa.length();
            count = count + 1;
            currIndex = stringb.indexOf(stringa,stopIndex);
        
        }
        
        if (count > 1){
            return true;
        }
        
        return false;
    }
    public String lastPart(String stringaa, String stringbb){
        int startIndex = stringbb.indexOf(stringaa);
        int aalength = stringaa.length();
        if(startIndex != -1)
        {
           String last = stringbb.substring(startIndex + aalength);
            return last;
        }
        
        return stringbb;
    }
    public void testOccurrences() {
        String stringa = "by";
        String stringb = "A story by Abby Long";
        boolean occur = twoOccurrences(stringa, stringb);
        System.out.println(occur);
        
        stringa = "lol";
        stringb = "LOL im ded";
        occur = twoOccurrences(stringa, stringb);
        System.out.println(occur);
    }
    public void testlastPart() {
        String stringa = "an";
        String stringb = "banana";
        String part = lastPart(stringa, stringb);
        System.out.println(part);
        
        stringa = "zoo";
        stringb = "forest";
        part = lastPart(stringa, stringb);
        System.out.println(part);
    }
}
