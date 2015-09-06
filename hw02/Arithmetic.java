/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Kang Ji
//hw02
//Arithmetic
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{
    
//  add main method
  public static void main(String[] args) {
        int nSocks=3;  //
        int nGlasses=6;  //
        int nEnvelopes=1;  //
        double sockCost$=2.58;  //
        double glassCost$=2.29;  //
        double envelopeCost$=3.25;  //
        double taxPercent$=0.06; //
        double totalSockCost$;  //
        double totalGlassCost$;  //
        double totalEnvelopeCost$;  //
        double totalCostBeforeTax$;  //
        double actualCost$;  //
        
//  print the statement with box around it
        totalSockCost$=nSocks*sockCost$;
        totalGlassCost$=nGlasses*glassCost$;
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        totalCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        actualCost$=totalCostBeforeTax$*(totalCostBeforeTax$+taxPercent$);
        System.out.println("total cost of socks is"+ (nSocks*sockCost$));
        System.out.println("total cost of glasses is"+ (nGlasses*glassCost$));
        System.out.println("total cost of envelopes is"+ (nEnvelopes*envelopeCost$));
        System.out.println("total cost before tax is"+ (totalSockCost$+totalGlassCost$+totalEnvelopeCost$));
        System.out.println("actual cost is"+ (totalCostBeforeTax$*(1+taxPercent$)));
  }//end of main method
}//end of class
