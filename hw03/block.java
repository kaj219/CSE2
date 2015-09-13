/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Kang Ji
//
//  first compile the program
//       javac block.java
//  run the program
//      java program//
import java.util.Scanner;
//  define a class 
public class block{
    
//add main method
  public static void main(String[] args) {
      Scanner myScanner = new Scanner ( System.in );
      System.out.print("enter the length of the block in the form x.x: ");
      double blockLength=myScanner.nextDouble();
      System.out.print("enter the width of the block in the form x.x: ");
      double blockWidth=myScanner.nextDouble();
      System.out.print("enter the height of the block in the form x.x ");
      double blockHeight=myScanner.nextDouble();
      double blockVolume;
      double blockSurfacearea;
      blockVolume=(int)(blockLength*blockWidth*blockHeight);
      blockSurfacearea=(int)(((blockWidth*blockLength)*2)+((blockHeight*blockWidth)*2)+((blockHeight*blockLength)*2));//
      System.out.println("The volume of the block of dimensions"+blockLength+"x"+blockWidth+"x"+blockHeight+"is"+blockVolume);
      System.out.println("The surface of the block is"+blockSurfacearea);
      
      
      
  }//end of main method
}//end of class 