package practice;

public class StringMethods {
   public void indexOf() {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
    }

    public void indexoFl() {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("e",5));
    }

    public void indextest () {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("test"));

    }

    public void SubString() {
       String str = "JavaPoint";
       String substr = str.substring(2);
        System.out.println(substr);

    }
    public void subString() {
       String str = "JavaPoint";
       String substr = str.substring(0,4);
        System.out.println(substr);
    }

    public void LenGth() {
       String txt = "aaaaaaaaaabbbbbbbbbbcccccccc";
        System.out.println(txt.length());
    }

    public void RePlace() {
       String mystr = "Hello";
        System.out.println(mystr.replace('1','p'));
    }

    public void Trim() {
       String myStr = "       Hello!      ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }

    public void Char(){
       String mystr = "Hello";
       char result = mystr.charAt(0);
        System.out.println(result);
    }
    public void Demo() {
       int value = 30;
       String s1 = String.valueOf(value);
        System.out.println( s1 + 10);
    }
    //"My salary is Jonathan and i am 20 years old and my salary is $40000 yearly"
    public void salaryName() {
       String name = " Jonathan ";
       int age =   20 ;
       int salary =  40000 ;

        System.out.println("My name is" + name + "and i am " + age + " years old and my salary is$ "+ salary+ " yearly");

    }
    public void NameSalary (){
        String name = " Jonathan ";
        int age =   20 ;
        int salary =  40000 ;
        String s = String.format("My name is %s and i am %d years old and my slary is $%d yearly", name,age,salary);
        System.out.println(s);
    }
    public void Contains () {
       String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));
        System.out.println(myStr.contains("e"));
        System.out.println(myStr.contains("hi"));
    }
    public void SplitArray(){
       String name = "John,Ali,Mathew.,Abraham";
       String [] nameArray = name.split(",");
       for (String person : nameArray){
           System.out.println("Person name is :" +person);
       }
    }

    public void ArraySplit() {
       String Sentence = "I live in NewYork";

       String[] Words = Sentence.split(" ");
       for(String word: Words) {
         //  System.out.println("word is:" +word);

       }
       String reverse = "";
       for (int i = Words.length - 1; i>= 0; i--) {
           reverse += Words[i] + " ";
       }
        System.out.println("Sentence is:" +reverse);
       }
    }


