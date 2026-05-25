
import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        //output
        // System.out.println("Hello, World!");
        System.out.print("Hello World of Java !\n");

        //variables
        int a=5;
        int b=3;
        int sum=a+b;
        System.out.print(sum+"\n");

        //input
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); //takes only one token
        // System.out.println(name);

        String fname=sc.nextLine(); //inputs whole line
        System.out.println(fname);

        //task
        System.out.println("Enter first number: ");
        int vara=sc.nextInt();

        System.out.println("Enter second number: ");
        int varb=sc.nextInt();

        System.out.println(vara+varb);
    }
}


