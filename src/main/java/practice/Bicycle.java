package practice;

public class Bicycle extends Inheritance {
    public int seatHeight;

    public Bicycle( int gear, int speed, int seatHeight){
        super(gear,speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newHeight){
        seatHeight = newHeight;
    }

    public void printData() {
        super.showData();
        System.out.println("seat height is:" + seatHeight);
    }
}
