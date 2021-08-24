package practice;

enum Day {

    Sunday,MONDAY,TUESDAY,WEDNESDAY,
    THURSDAY,FRIDAY,SATURDAY,
}

public class EnumInJava {
    Day day;

    EnumInJava(Day day) {
        this.day = day;

    }

    public void dayIslike() {
        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case Sunday:
            case SATURDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek are so so");
                break;

        }
    }

}
