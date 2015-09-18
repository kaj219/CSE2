/////////////////////////////////////////////////////////////////////////////////////////////////////////]
//Kang Ji
//
//  first compile the program
//      javac cardgenerator.java
//  run the program
//      java program//
//  define a class
public class cardgenerator{
    
//add main method
  public static void main(String[]args) {
  int suit  = (int)(Math.random()*4)+1;
  int identity = (int)(Math.random()*13)+1;
  String a = " ";
  String b =" ";
  if (suit == 1)
  a = "diamond";
  if (suit == 2)
  a = "club";
  if (suit == 3)
  a = "spade";
  if (suit == 4)
  a = "heart";
  switch (identity){
    case 1: b = "ace";
    break;
    case 2: b = "2";
    break;
    case 3: b = "3";
    break;
    case 4: b = "4";
    break;
    case 5: b = "5";
    break;
    case 6: b = "6";
    break;
    case 7: b = "7";
    break;
    case 8: b = "8";
    break;
    case 9: b = "9";
    break;
    case 10: b = "10";
    break;
    case 11: b = "Jack";
    break;
    case 12: b = "Queen";
    break;
    default: b = "King";
    break;
  }
  System.out.println("you pick " +b+ " of the "+a);
  
  }
}
        