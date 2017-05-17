
/**
 * Write a description of SSAPart1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class SSAPart1 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int currIndex = dna.indexOf(stopCodon,startIndex + 3);
        while (currIndex != -1){
            int diff = currIndex - startIndex;
            if (diff % 3 == 0){
                return currIndex;
            }
            else{
                currIndex = dna.indexOf(stopCodon,currIndex + 1);
            }
        }
    return -1;
    }
    public String findGene(String dna, int where){
        int startIndex = dna.indexOf("ATG",where);
        if (startIndex == -1){
            return "";
        }
        int taaIndex = findStopCodon(dna,startIndex,"TAA");
        int tagIndex = findStopCodon(dna,startIndex,"TAG");
        int tgaIndex = findStopCodon(dna,startIndex,"TGA");
        //int tempIndex = Math.min(taaIndex,tagIndex);
        //int minIndex = Math.min(tempIndex,tgaIndex);
        int minIndex = 0;
        if (taaIndex == -1 ||
            (tgaIndex != -1 && tgaIndex < taaIndex)){
                minIndex = tgaIndex;
            }
        else{
            minIndex = taaIndex;
        }
        if (minIndex == -1 ||
            (tagIndex != -1 && tagIndex < minIndex)){
                minIndex = tagIndex;
            }
        
        if (minIndex == dna.length()){
            return "";
        }
        return dna.substring(startIndex,minIndex + 3);
    }
    public void printAllGenes(String dna){
        int startIndex = 0;
        
        while ( true ) {
            String currentGene = findGene(dna, startIndex);
            
            if (currentGene.isEmpty()){
                break;
            }
            
            System.out.println(currentGene);
            startIndex = dna.indexOf(currentGene, startIndex) +
                currentGene.length();
        }
    }
}



