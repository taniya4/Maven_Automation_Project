package Day3_03042023;

import java.util.ArrayList;

public class T3_Array_Loop_Conditions {
    public static void main(String[] args) {

        /*
        iterate through list of fruit using ArrayList
        but only print when fruit is grape or apple
        */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Grape");

        for (int i = 0; i < fruits.size(); i++) {

            //TWO COMMON WAYS TO RUN THIS CODE
            //EX#1 (THIS IS ONE WAY OF RUNNING THE CODE)
            /*
            if (fruits.get(i) == "Apple") {
                System.out.println("Fruit: "Apple");
            } else if (fruits.get(i) == "Grape") {
                System.out.println("Fruit: Grape");
            }
            */
            //EX#2 (DIFFERENT WAY OF RUNNING THE CODE)
            //for single print statement to get both of the fruit at the same time
            //using the OR (||) operator
            if (fruits.get(i) == "Apple" || fruits.get(i) == "Grape"){
                System.out.println("Fruit: " + fruits.get(i));
            }
        }//end of loop
    }//end of main
}//end of class
