import java.util.*;

public class SecondClass {
    //if_else
    public static void main(String[] args){
        // System.out.println("Hello!");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{System.out.println("Not Adult");}
    }
}
