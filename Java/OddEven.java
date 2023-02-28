import java.util.*;
public class OddEven{
 
  //Drivers Program
 public static void main(String[] args){
  
   Scanner in = new Scanner(System.in);
  
   //Storage input
   int num;
   
   System.out.print("Enter a number: ");
   num = in.nextInt();
   
   //condition
   if(num%2 == 0){
    System.out.println("Inputed Number: " + num + "\nIs Even Number.");
   }
   else System.out.println("Inputed Number: " + num  + "\nIs Odd Number.");
 }
  
}
