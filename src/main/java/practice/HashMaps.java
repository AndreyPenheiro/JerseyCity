package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    HashMap<String,String> hmap = new HashMap<>();
    public void AddHashMapValue() {
        hmap.put("IE", "Internet Explorer");
        hmap.put("CHROME", "Chrome Browser");
        hmap.put("Firefox", "Mozilla Firefox");
        hmap.put("Safari", "Mackbook Browser");
        hmap.put("Opera", "Linux Browser");

        System.out.println("Browser name:" + hmap.get("Safari"));
        System.out.println("----------------------------------");

        for(Map.Entry map:hmap.entrySet()){
            System.out.println(map.getKey()+ " " + map.getValue());
        }
    }
    public void IntStrValuetype () {
        //create and empty hash map
        HashMap<String , Integer> map = new HashMap<>();

        //add elements to the map
        map.put("Vishal", 10);
        map.put("Sachin", 30);
        map.put("Vaibhav", 20);

        //print size and content
        System.out.println("size of map is:" + map.size());
        System.out.println(map);

    }
}
