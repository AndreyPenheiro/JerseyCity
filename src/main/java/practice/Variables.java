package practice;

public class Variables {
String name = "Robin ";//(global scope)

    public void intVariables(){
        int salary = 1000;
        System.out.println("My salary is:" + salary);
    }
    public void floatVariables(){
        float price = 45.6f;
        System.out.println("Product price is:" +price);
    }
    public void booleanVariables(){
        boolean red = true;
        boolean green = false;
        System.out.println("red light is:" + red + "green light is:" + green);
    }
    public void charectervariables(){
        char alphabet = 'A';
        System.out.println("Alphabet is:" + alphabet);
    }
    public void stringvariables(){
       // String name = "Robin";
        String city = "Philadelphia";
        System.out.println("My name is:"+ name + " I live in:" + city);
    }
    public void aurk() {
        System.out.println( name );

    }

}
