import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num 1");
        int a=sc.nextInt();
        System.out.println("Enter num 2");
        int b=sc.nextInt();
        System.out.println("select operator");
        char sign=sc.next().charAt(0);

        switch (sign) {
            case '+':{
System.out.println("Addition is:"+(a+b));
                 break;
            }
            case '-':{
System.out.println("subtraction is:"+(a-b));
                 break;
            }
            case '*':{
System.out.println("multiplication is:"+(a*b));
                 break;
            }
            case '/':{
System.out.println("division is:"+(a/b));
                 break;
            }
                
               
        
            default:{
                System.out.println("Maths padh le");
            }
                break;
        }
        
    }
}
