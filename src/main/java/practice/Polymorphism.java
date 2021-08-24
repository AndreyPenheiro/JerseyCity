package practice;

public class Polymorphism {
    public int sum(int x, int y)
    {
        return (x + y);
    }
    public int sum (int x, int y , int z)
    {
        return (x + y+ z);
    }
    public double sum (double x , double y)
    {
        return(x+y);
    }

    public void show(){
        System.out.println("Parent's show()");

    }
}
