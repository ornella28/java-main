package se.lexicon;

import java.util.Arrays;

public class ArraysExercises {

    void main(){

        ex1();
        indexOf();
        ex3();
        ex4();
        ex5();





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
        int [] array1 = {1, 15, 20};
        int[] array2 = Arrays.copyOf(array1, 3);
        for (int number: array2){
            System.out.println(number);

        }


    }

    static void ex5(){
        String [][] countries = new String[2][2];

        countries [0][0] = "France";
        countries[0][1] = "Paris";

        countries[1][0] = "Sweden";
        countries[1][1] = "Stockholm";

        for (int i=0; i< countries.length; i++){

                System.out.println(countries[i][0] + " " + countries[i][1]);

        }




    }


}
