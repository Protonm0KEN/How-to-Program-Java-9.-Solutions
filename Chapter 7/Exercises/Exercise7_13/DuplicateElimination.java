package Exercise7_13;

import java.util.Scanner;

/*
* (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.
* */


public class DuplicateElimination {
    static boolean contains(int number, int[] arr){
        for(int k : arr){
            if(k == number){
                return true;
            }
        }
        return false;
    }
    static boolean isCorrectRange(int number, int min, int max){
        return number >= min && number <= max;
    }
    static void displayList(int[] arr){
        for(int i : arr){
            if(i != 0){
                System.out.printf("%d\n", i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbersEntered = new int[5];
        for(int i = 0; i<numbersEntered.length; i++){
            System.out.print("Enter the number in correct range [10, 100] and unique: ");
            int numberEntered = input.nextInt();
            if (contains(numberEntered, numbersEntered) || !isCorrectRange(numberEntered, 10, 100)) {
                while(contains(numberEntered, numbersEntered) || !isCorrectRange(numberEntered, 10, 100)){
                    if(contains(numberEntered, numbersEntered)){
                        System.out.print("The number was already entered, so enter new one: ");
                        numberEntered = input.nextInt();
                    }
                    if(!isCorrectRange(numberEntered, 10, 100)){
                        System.out.print("The number is not in correct range, enter again: ");
                        numberEntered = input.nextInt();
                    }
                }
            }
            numbersEntered[i] = numberEntered;
            System.out.println("Values entered are: ");
            displayList(numbersEntered);
        }
    }
}
