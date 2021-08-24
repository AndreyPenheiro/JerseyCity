package practice;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Random;

public class JavaRandomMethod {

    public void randomvalue() {
        Random rand = new Random();

        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);

        System.out.println("Random Integers:" + rand_int1);
        System.out.println("Random Integers:" + rand_int2);

        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();

        System.out.println("Random doubles" + rand_dub1);
        System.out.println("Random doubles" + rand_dub2);

    }
    public void MathRound()
    {
        double num1 = 74.65;
        System.out.println(Math.round(num1));
    }
    public void MathRoundf(){
        float num2 = 1337.345523f;
        System.out.println(Math.round(num2));
    }
    public void MathMax () {
        System.out.println(Math.max(12.123,12.456));
        System.out.println(Math.max(23.12,23.0));
    }
    public void MathMin () {
        int x = 9875;
        int y = 154;
        System.out.println("Math.min("+x+","+y+")="+Math.min(x,y));
    }

    public void javaDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


    }
}