/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Kang Ji
//
//  first compile th program
//      javac interpreter.java
//  run the program
//      java program//
//  define a class
public class interpreter{
    
//add main method
  public static void main(String[] args) {
  int suit1  = (int)(Math.random()*4)+1;
  int identity1 = (int)(Math.random()*13)+1;
  String a = " ";
  String b = " ";
  if (suit1 == 1)
  a = "diamond";
  if (suit1 == 2)
  a = "club";
  if (suit1 == 3)
  a = "spade";
  if (suit1 == 4)
  a = "heart";
   switch (identity1){
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

  int suit2  = (int)(Math.random()*4)+1;
  int identity2 = (int)(Math.random()*13)+1;
  String c = " ";
  String d = " ";
  if (suit2 == 1)
  c = "diamond";
  if (suit2 == 2)
  c = "club";
  if (suit2 == 3)
  c = "spade";
  if (suit2 == 4)
  c = "heart";
  switch (identity2){
    case 1: d = "ace";
    break;
    case 2: d = "2";
    break;
    case 3: d = "3";
    break;
    case 4: d = "4";
    break;
    case 5: d = "5";
    break;
    case 6: d = "6";
    break;
    case 7: d = "7";
    break;
    case 8: d = "8";
    break;
    case 9: d = "9";
    break;
    case 10: d = "10";
    break;
    case 11: d = "Jack";
    break;
    case 12: d = "Queen";
    break;
    default: d = "King";
    break;
  }
    System.out.println("you pick " +d+ " of the "+c);

  int suit3  = (int)(Math.random()*4)+1;
  int identity3 = (int)(Math.random()*13)+1;
  String e = " ";
  String f = " ";
  if (suit3 == 1)
  e = "diamond";
  if (suit3 == 2)
  e = "club";
  if (suit3 == 3)
  e = "spade";
  if (suit3 == 4)
  e = "heart";
  switch (identity3){
    case 1: f = "ace";
    break;
    case 2: f = "2";
    break;
    case 3: f = "3";
    break;
    case 4: f = "4";
    break;
    case 5: f = "5";
    break;
    case 6: f = "6";
    break;
    case 7: f = "7";
    break;
    case 8: f = "8";
    break;
    case 9: f = "9";
    break;
    case 10: f = "10";
    break;
    case 11: f = "Jack";
    break;
    case 12: f = "Queen";
    break;
    default: f = "King";
    break;
  }
    System.out.println("you pick " +f+ " of the "+e);

  int suit4  = (int)(Math.random()*4)+1;
  int identity4 = (int)(Math.random()*13)+1;
  String g = " ";
  String h = " ";
  if (suit4 == 1)
  g = "diamond";
  if (suit4 == 2)
  g = "club";
  if (suit4 == 3)
  g = "spade";
  if (suit4 == 4)
  g = "heart";
  switch (identity4){
    case 1: h = "ace";
    break;
    case 2: h = "2";
    break;
    case 3: h = "3";
    break;
    case 4: h = "4";
    break;
    case 5: h = "5";
    break;
    case 6: h = "6";
    break;
    case 7: h = "7";
    break;
    case 8: h = "8";
    break;
    case 9: h = "9";
    break;
    case 10: h = "10";
    break;
    case 11: h = "Jack";
    break;
    case 12: h = "Queen";
    break;
    default: h = "King";
    break;
  }
    System.out.println("you pick " +h+ " of the "+g);
  int suit5  = (int)(Math.random()*4)+1;
  int identity5 = (int)(Math.random()*13)+1;
  String i = " ";
  String j = " ";
  if (suit5 == 1)
  i = "diamond";
  if (suit5 == 2)
  i = "club";
  if (suit5 == 3)
  i = "spade";
  if (suit5 == 4)
  i = "heart";
  switch (identity5){
    case 1: j = "ace";
    break;
    case 2: j = "2";
    break;
    case 3: j = "3";
    break;
    case 4: j = "4";
    break;
    case 5: j = "5";
    break;
    case 6: j = "6";
    break;
    case 7: j = "7";
    break;
    case 8: j = "8";
    break;
    case 9: j = "9";
    break;
    case 10: j = "10";
    break;
    case 11: j = "Jack";
    break;
    case 12: j = "Queen";
    break;
    default: j = "King";
    break;
  }
    System.out.println("you pick " +j+ " of the "+i);
int p=0;
if (identity1==identity2){
p=p+1;
}
else if (identity1==identity3){
p=p+1;
}
else if (identity1==identity4){
p=p+1;
}
else if (identity1==identity5){
p=p+1;
}
else if (identity2==identity3){
p=p+1;
}
else if (identity2==identity4){
p=p+1;
}
else if (identity2==identity5){
p=p+1;
}
else if (identity3==identity4){
p=p+1;
}
else if (identity3==identity5){
p=p+1;
}
else if (identity4==identity5){
p=p+1;
}
else {
System.out.println("you have a high hand card!");
}
if (p==1){
System.out.println("You have a pair!");
}
else if (p==2){
System.out.println("You have two pairs!");
}
}
}