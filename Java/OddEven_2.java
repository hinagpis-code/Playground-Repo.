import java.util.Scanner;

public class OperatorExample{  
   
public static void main(String args[]){  
  Scanner sc = new Scanner(System.in);
    
System.out.print("Enter a num: ");
int num = sc.nextInt();

String result = (num%2 == 0) ? "Even Number" : "Odd Number";

System.out.println(result);
}
    
}  
