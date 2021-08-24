package practice;

import org.w3c.dom.ls.LSOutput;

public class Eception {

    public void excepnum() {

        int num [] = {1,2,3,4};
        System.out.println(num[3]);


}
public void testException() {
        try{
            int num[] = {1,2,3,4};
            System.out.println(num[5]);
        }catch (Exception e) {
            System.out.println(e);
        }
}
}
