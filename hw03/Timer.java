/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Kang Ji
//
//  first compile the program
//       javac Timer.java
//  run the program
//      java program//
import java.util.Scanner;
//  define a class
public class Timer{
    
//add main method
  public static void main(String[] args) {
      Scanner myScanner = new Scanner ( System.in );
      System.out.print("enter the current time in the form HHMM: ");
      double currentTime=myScanner.nextDouble();
      System.out.print("enter the time that you will be eating dinner(in the form HHMM): ");
      double eatingTime=myScanner.nextDouble();
      double remainHours;
      double remainMinutes;
      remainHours=(int)((eatingTime-currentTime)/100);
      remainMinutes=(eatingTime-currentTime)-remainHours*100;//
      
      
      System.out.println("you have "+ remainHours+" hours "+remainMinutes+" minutes until dinner");
      
  }//end of main method
}//end of class
 