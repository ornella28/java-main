package se.lexicon;

import java.util.Arrays;

public class ArraysExercises {

    void main(){

        ex1();
        indexOf();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();





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

    static void ex6(){
        int[] numbers = {43, 5, 23, 17, 2, 14};
        //average = 17.3
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        double average = sum/numbers.length;
        System.out.println("The average is " + average);


    }

    static void ex7(){
        int [] numbers = {1,2,4,7,9,12,15,16,18,22};
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2!=0){
                System.out.println(numbers[i]);
            }
        }
    }

    static void ex8(){

        int [] numbers = {20,20,40,20,30,40,50,60,50};
        System.out.println("Array: ");

        for (int i=0; i < numbers.length; i++){

        }
        System.out.println(Arrays.toString(numbers));

        int[] uniqueNumbers = new int [10];//New array to store unique numbers

        int uniqueCount = 0;//how many unique numbers we have added

        for (int i=0; i<numbers.length; i++){//loop through each number in the original array
            boolean alreadyExists = false;//

            //checks if the number is already in the unique array
            for (int j=0; j<uniqueCount; j++){
                if(numbers[i]== uniqueNumbers[j]){
                    alreadyExists = true;
                    break;// found a duplicate, stops the loop
                }

            }
            if (!alreadyExists){
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }

        }
        System.out.println("Array without duplicate: ");
        for (int i = 0; i<uniqueCount; i++){

        }
        System.out.println(Arrays.toString(uniqueNumbers));

    }

    static void ex9(){
        int [] originalArray = {8, 4, 7, 5};

        int[] newArray = new int [originalArray.length+1];//creating a space for the new number
        for (int i=0; i<originalArray.length; i++){
            newArray[i] = originalArray[i];
        }

        int newElement = 14;
        newArray[newArray.length - 1]= newElement;
        System.out.println(Arrays.toString(newArray));


    }


}
