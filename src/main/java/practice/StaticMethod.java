package practice;

public class StaticMethod {
    int  a;
    static int  b;
    StaticMethod() {
        b++;
    }
    public void ShowData() {
        System.out.println("value of a ="+a);
        System.out.println("value of b ="+b );
    }
}
