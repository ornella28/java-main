package se.lexicon;

import java.util.ArrayList;

public class CollectionExercises {

    void main(){

        ex1();
        ex2();
        ex3();
        ex4();


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
    static void ex3(){
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        days.add(3, "Thrusday");
        System.out.println(days);
    }

    static void ex4(){
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        ArrayList<String> firstThree = new ArrayList<>(days.subList(0,3));
        System.out.println(firstThree);
    }

}
