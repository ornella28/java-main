package se.lexicon;

import java.util.ArrayList;

public class CollectionExercises {

    void main(){

        ex1();
        ex2();


    }

    static void ex1(){
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);

    }

    static void ex2(){
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");


        for (int i = 0; i< days.size(); i++){
            System.out.println(days.get(i));
        }
    }
}
