package activities;

import javax.sound.midi.Soundbank;
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        //Hashset Declaration
        HashSet<String> hs = new HashSet<String>();
        //Element in hash set
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");

        //HashSet print
        System.out.println("Original HashSet: "+hs);
        System.out.println("Size of hashset: " +hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        //Remove element that is not present
        if(hs.remove("Z")) {
            System.out.println("Z removed from the Set");
        } else {
            System.out.println("Z is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if M is present: " + hs.contains("M"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
