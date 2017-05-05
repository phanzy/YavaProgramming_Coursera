
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna){
    String result = "";
    int startIndex = dna.indexOf("ATG");
    if (startIndex == -1)//no ATG
    {
        return "";
    }  
    
    int stopIndex = dna.indexOf("TAA",startIndex + 3);
    if (stopIndex == -1)//no ATG
    {
        return "";
    } 
    
    while (stopIndex != -1) {
        //Check if (currIndex - startIndex) is a multiple of 3
        if((stopIndex - startIndex) % 3 == 0) {
           //If so, the text between startIndex and currIndex + 3 is your answer
           return dna.substring(startIndex, stopIndex +3);
        }
        //If not, update currIndex to the index of the next TAA, starting from (currIndex+1)
        else {
              stopIndex = dna.indexOf("TAA", stopIndex + 1);
        }
    }
    return result;
}
    public void testSimpleGene() {
        //             v  v  v  v  v
        String dna = "AATGCGTAATTAATCG";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        //       v  v  v  v  v  v  v  v
        dna = "CGATGGTTGATAAGCCTAAGCTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        //       v  v  v  v  v  v  v  v
        dna = "CGATGGTTGATAAGCCTAAGCTAAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
}
}