
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
        
        //startCodon = "ATG";
        //stopCodon = "TAA";
    
        String result = "";
            
        boolean isLowerCase = dna.equals(dna.toLowerCase());
        //System.out.println(isLowerCase);
    
        if (isLowerCase == true){
            
            int startIndex = dna.indexOf(startCodon.toLowerCase());
           
            if (startIndex == -1)
            {
                return "";
            }
            int stopIndex = dna.indexOf(stopCodon.toLowerCase(), startIndex+3);
            
            if (stopIndex == -1)
            {
                return "";
            }
            result = dna.substring(startIndex, stopIndex +3);
                
            return result;
    
        }
         
        else {  
            dna = dna.toUpperCase();
        
            int startIndex = dna.indexOf(startCodon.toUpperCase());
            
            if (startIndex == -1)
            {
                return "";
            }
            int stopIndex = dna.indexOf(stopCodon.toUpperCase(), startIndex+3);
            
            if(stopIndex == -1)
            {
                return "";
            }
            result = dna.substring(startIndex, stopIndex +3);
                
            return result;
    
        }
    }
    public void testSimpleGene() {
        String dna = "AATATGGGTAAG";
        String startCodon = "ATG";
        String stopCodon = "TAA";
        System.out.println("The DNA is " + dna);
        String gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("The gene is " + gene);
        
        dna = "AATATGTTAAG";
        System.out.println("The DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("The gene is " + gene);
        
        dna = "AATATGGGTAAG";
        System.out.println("The DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("The gene is " + gene);
        
        dna = "AATATGGGAG";
        System.out.println("The DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("The gene is " + gene);
        
        dna = "gatgctataat";
        System.out.println("The DNA is " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("The gene is " + gene);
    }
}
