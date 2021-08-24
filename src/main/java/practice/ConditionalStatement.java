package practice;

public class ConditionalStatement {

    public void Ifstatement(){

        int x = 10;
        //If X value is less than 20 then print the value
        if(x < 20);
        System.out.println("this is if statement:");
    }
    public void Elsestatement() {

        int x= 30;

        if (x < 20)
        {
            System.out.println("this is if statement");
        }
        else
        {
            System.out.println("this is else statement");
        }
    }

    public void SwitchStatement() {
        char grade = 'C';

        switch (grade)
        {
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("better luck next time");
                break;
            default:
                System.out.println("invalid Grade");

        }
        System.out.println("your grade is:" + grade);
    }

    public void learnIfElse(char Grade) {

        if (Grade == 'A') {
            System.out.println("you got an A");
        } else if (Grade == 'B') {
            System.out.println("you got B");
        } else if (Grade == 'C') {
            System.out.println("you got a C");
        } else if (Grade == 'F') {
            System.out.println("you failed in the exam");
        }
    }
        public void conditionalOperator() {

        int a, b;
        a = 10;
        b = ( a == 1 ) ? 20:30;
            System.out.println("value of b is:" +b);

        b = (a == 10) ? 20:30;
            System.out.println("value of b is:" +b);

        }


    }

