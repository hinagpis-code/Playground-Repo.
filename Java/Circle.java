import java.util.Scanner;
public class Circle{
  
    static Scanner in = new Scanner(System.in);
    static double PI = Math.PI;
    double radius, diameter,result;
  
  public double circumference(){
   System.out.print("Enter the radius : ");
    radius = in.nextDouble();
    result = 2 * Circle.PI * radius;
    System.out.println("The Circumference is " + result);
    return result;
  }
  
  public double diameter(){
     System.out.print("Enter the radius : ");
      radius = in.nextDouble();
      result = 2 * radius;
     System.out.println("The Diameter is " + result);
    return result;
  }
  
  public double radius(){
  System.out.print("Enter the diameter : ");
      diameter = in.nextDouble();
      result = diameter/2;
     System.out.println("The Radius is " + result);
    return result;
  
  }
  
  
  public static void main(String [] args){
   
    Circle obj = new Circle();
    
    System.out.println("Press 1 - find the Circumference of the Circle");
    System.out.println("Press 2 - find the Diameter of the Circle");
    System.out.println("Press 3 - find the Radius of the Circle");
    
     System.out.print("Enter your choice : ");
    int choice = in.nextInt();
    
    switch(choice){
  
      case 1:
        obj.circumference();
        break;
        
      case 2: 
         obj.diameter();
        break;
        
      case 3:
         obj.radius();
        break;
        
      default:
        System.out.println("Error Choices");
        break;
    }
    
  }
  
}
