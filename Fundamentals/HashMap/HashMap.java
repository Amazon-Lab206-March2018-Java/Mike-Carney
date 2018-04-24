import  java.util.*;
public class HashMap {
    public void mapFunction(){
        HashMap<String,String> tracklist= new HashMap<>();
        tracklist.put("Wanted", "BonJovi");
        tracklist.put("Paint it Black", "Rolling Stones");
        tracklist.put("Rooster", "Alice in Chains");
        tracklist.put("Space Oddity", "David Bowie");
        System.out.println(tracklist.get("Wanted"));
        System.out.println(tracklist);
    }
}