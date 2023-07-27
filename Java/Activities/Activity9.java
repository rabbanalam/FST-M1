package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //Array list Declaration
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Sapota");
        myArrayList.add("Cherries");
        myArrayList.add("Dragon fruit");
        myArrayList.add("Avacado");
        myArrayList.add("Papaya");

        System.out.println("Print All the items of Array List:");
        for (String fruits:myArrayList){
            System.out.println(fruits);
        }

        System.out.println("3rd element in the arrayList is: "+ myArrayList.get(2));
        System.out.println("Is sapota is in list: "+myArrayList.contains("Sapota"));
        System.out.println("Size of my Array list: "+ myArrayList.size());

        myArrayList.remove("Papaya");
        System.out.println("After removing item, Size of new Array list: "+ myArrayList.size());
    }
}
