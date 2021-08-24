package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadDataThroughTerminal {
    public void GetInputFromUser() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String s= in.nextLine();
        System.out.println("your entered string " +s);

        System.out.println("Enter Your Age: ");
        int a = in.nextInt();
        System.out.println("You Entered Integer: " +a);

        System.out.println("Enter Product Price");
        float b = in.nextFloat();
        System.out.println("You Entered Float "+b);

    }
}
