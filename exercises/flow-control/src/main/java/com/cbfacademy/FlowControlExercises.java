package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{213, 54, 91, 187, 2001, 2023}; //[Fizz, Fizz, 91, 187, Fizz, 2023];
        List<Integer> numbers = Arrays.asList(a);
        ArrayList<Integer> b = new ArrayList<>();
                b.add(1);
                b.add(2);
                b.add(4);
                b.add(8);
                b.add(11);
                b.add(13);
                b.add(17);
        
        System.out.println(new FlowControlExercises().sumOfOddsAndSumOfEvens());

        //System.out.println(numbers);
       
        System.out.println(numbers);
        new FlowControlExercises().fizzBuzz(numbers);
        new FlowControlExercises().whichMonth(12);
        new FlowControlExercises().reverse(b);
        
    }

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FlowControlExercises” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list

        String s = "";
        List<Integer> newList = new ArrayList<>();
        List<String> anotherList = new ArrayList<>();
        newList.addAll(numbers);
        //System.out.println("newList = " + newList);
        for (int i = 0; i < newList.size(); i++) {
            try {
                //System.out.println(newList.get(i));
                if (newList.get(i) % 3 == 0 && newList.get(i) % 5 == 0) {
                    s = "FlowControlExercises";
                    // System.out.println("add new string");
                    anotherList.add(s);
                } else if (newList.get(i) % 5 == 0) {
                    s = "Buzz";
                    // System.out.println("add new string");
                    anotherList.add(s);

                } else if (newList.get(i) % 3 == 0) {
                    s = "Fizz";
                    //System.out.println("add new string");
                    anotherList.add(s);

                } else {
                    int x = newList.get(i);
                    s = String.valueOf(x);
                    //System.out.println("add new string");
                    anotherList.add(s);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(anotherList);
        return anotherList;
        //throw new RuntimeException("Not implemented");
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"

        int newNumber = number;
        String month = "";

        switch(newNumber){
            case 1 : month = "January";
                     break;
            case 2 : month = "February";
                break;
            case 3 :month = "March";
                break;
            case 4 :month = "April";
                break;
            case 5 :month = "May";
                break;
            case 6 :month = "June";
                break;
            case 7 :month = "July";
                break;
            case 8 :month = "August";
                break;
            case 9 :month = "September";
                break;
            case 10 :month = "October";
                break;
            case 11 :month = "November";
                break;
            case 12 : month = "December";
                break;
            default : month = "Invalid month number";
                System.out.println("please input numbers between 1 and 12");

        }
        System.out.println(month);
        return month;
        //throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int calculatedSumOfEvens = 0;
        int calculatedSumOfOdds = 0;
        int sumEven = 0;
        int sumOdd = 0;
        try{
        for (int i = 1; i <= 100; i++) {
            if(i%2==0) {
                evenList.add(i);
                sumEven += i;
            }else{
                oddList.add(i);
                sumOdd += i;
            }

        }

        System.out.println(oddList);
        System.out.println(sumOdd);
        System.out.println(evenList);
        System.out.println(sumEven);

        calculatedSumOfEvens =sumEven;
        calculatedSumOfOdds = sumOdd;
        map.put("SumOfEvens", calculatedSumOfEvens);
        map.put("SumOfOdds", calculatedSumOfOdds);

       for(Map.Entry<String, Integer> e : map.entrySet()) {
           String key =  e.getKey();
           int value =  e.getValue();
           System.out.println("{\"" +  key + "\", " +  value + "} " );
       }
    }catch(Exception e){
        e.printStackTrace();
    }
       return map;
        //throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order

        int x = 0;
        List<Integer> anotherList = new ArrayList<>();// a copy of numbers
        anotherList = numbers;
        System.out.println("anotherList = " + anotherList);
        List<Integer> newList = new ArrayList<>();//will hold the reverse array of copy
        numbers = new ArrayList<>();
        //System.out.println(anotherList);
//        for(Integer i : anotherList){
//            System.out.println(i);
//            newList.add(i);
//        }
        try{
            for (int i = anotherList.size() - 1; i >= 0; --i) {
            //System.out.println("This is x");
             x = anotherList.get(i);
            newList.add(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       // throw new RuntimeException("Not implemented");
        System.out.println("newList = " + newList);
        return newList;
    }
        
    

    public String getName() {
        return "Flow Control Exercises";
    }
}
