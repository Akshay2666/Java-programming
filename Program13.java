import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter marks of sub 1");   
     double num1=sc.nextDouble();
      System.out.println("Enter marks of sub 2");   
     double num2=sc.nextDouble();
      System.out.println("Enter marks of sub 3");   
     double num3=sc.nextDouble();

     if ((num1+num2+num3)/3>40 && num1>33 && num2>33 && num3>33) {
        System.out.println("You are pass");  
     }
     else{
        System.out.println("You are fail");
     }
    }
}
