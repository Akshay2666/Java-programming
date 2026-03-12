import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of sub 1");
        int a=sc.nextInt();
        System.out.println("Enter marks of sub 2");
        int b=sc.nextInt();
        System.out.println("Enter marks of sub 3 ");
        int c=sc.nextInt();
        System.out.println("Enter marks of sub 4");
        int d=sc.nextInt();
        System.out.println("Enter marks of sub 5");
        int e=sc.nextInt();

        int res=(a+b+c+d+e)/5;
        System.out.println("Your total percentage is"+res+"%");
        
    }
    
}
