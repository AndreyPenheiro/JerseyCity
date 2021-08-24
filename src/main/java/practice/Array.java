package practice;

import java.util.*;

public class Array {
    public void strinarray() {
        String[] myList = {"Florida", "California", "Georgia", "Texas"};
        for (int i = 0; i < myList.length; i++) {
            System.out.println("State Name Is:" + myList[i]);
        }
    }

    public void sortarray() {

        String[] states = {"Florida", "California", "Georgia", "Texas"};
        Arrays.sort(states);
        System.out.println(Arrays.toString(states));
    }

    public void sortarrayDesc() {
        String[] states = {"Florida", "California", "Georgia", "Texas"};
        Arrays.sort(states, Collections.reverseOrder());
        System.out.println(Arrays.toString(states));
    }

    List<String> lists = new ArrayList<String>();

    public void addValueToTheList() {
        lists.add("one");
        lists.add("Two");
        lists.add("Three");
    }

    public void readValueFromTheList() {
        System.out.println(lists);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println("print value using for loop indexing:" + lists.get(i));
        }
    }

    public void removeValueFromTheList() {
        lists.remove("Two");
    }

    //Creating Array
    public void arrayToList() {
        String[] array = {"Java", "Python", "PHP", "c++"};
        System.out.println("Printing Array:" + Arrays.toString(array));


        //converting array to the list

        List<String> list=new ArrayList<String>();
        for(String lang:array) {
            list.add(lang);
        }
        System.out.println("printing List:" +list);

    }

    public void listToArray() {

        List<String> fruitlist = new ArrayList<>();
        fruitlist.add("Mango");
        fruitlist.add("Banana");
        fruitlist.add("Apple");
        fruitlist.add("Strawberry");

        //converting Arraylist to array

        String[] array = fruitlist.toArray(new String[fruitlist.size()]);
        System.out.println("Printing array:" +Arrays.toString(array));
        System.out.println("printing List:" +fruitlist);
    }


}