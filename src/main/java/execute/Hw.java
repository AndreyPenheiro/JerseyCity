package execute;

import java.util.HashMap;
import java.util.Map;

public class Hw {

    public HashMap<String, Integer> word0(String[] strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String arr : strings) {
            if (hashMap.containsKey(arr) == false) {
                hashMap.put(arr, 0);
            }
        }
        return hashMap;
    }

    public HashMap<String ,Integer> word1(String [] str){
        HashMap<String ,Integer> hmap = new HashMap<>();

        for (String a: str ){
            if(hmap.containsKey(a)==false){
                hmap.put(a,a.length());
            }
        }
        return hmap;
    }

    /*public int[] fizzarray (int n){
        int[] array = new int[n];
        if(n==0){
            return array;
        }
        for (int i=0; i<n; i++){
            array[i] = i;
        }
        return array;

    }*/
    public int[] num1 (int n){
        int[] num2 = new int[n];

        if (n==0){
            return num2;
        }
        for( int i=0; i<n; i++ ){
            num2[i]=i;
        }
        return num2;
    }

    public int counthi (String str){
        int counter = 0;
        for (int i=0; i<str.length() -1; i++){
            String name = str.substring(i, i+2);
            if (name.equals("hi")){
                counter++;
            }
        }
        return counter;

    }
    public int loneSum(int a, int b, int c){
        int sum =0;
        if(a != b && a != c) {
            sum += a;
        }
        if(b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }
}
