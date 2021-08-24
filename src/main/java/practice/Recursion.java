package practice;

public class Recursion {

    public int sumRangeOfNumbers(int k){
        if (k > 0) {
            return k + sumRangeOfNumbers(k - 1);
        }else{
            return 0;
        }
    }

}
