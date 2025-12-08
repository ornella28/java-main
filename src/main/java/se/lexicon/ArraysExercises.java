package se.lexicon;

import java.util.Arrays;

public class ArraysExercises {

    void main(){

        //ex1();
        indexOf();
        ex3();





    }

    static void ex1(){
        int [] numbers = {11, 23, 39};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


    }
//exercise2
    static void indexOf(){

        int [] numbers = {25, 9, 5, 44, 88, 2, 65};

        for (int i = 0; i< numbers.length; i++){

            System.out.println("The index position of the number [" + numbers[i] + "] =" + i);

        }

    }

    static void ex3(){
        String [] countries = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(countries);
        for (String country: countries){// the loop is needed to have some output
            System.out.println(country);
        }

    }

    static void ex4(){

    }


}
