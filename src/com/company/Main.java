package com.company;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 6.1

        loop(29);
    }

        //Point 1.
    public static void loop(int n) {

        int i = n;

        while (i > 1) {
                System.out.println(i);
            if (i % 2 == 0){
                System.out.println("Decrement");
                i = i / 2;
            }
            else {
                System.out.println("Increment");
                i = i + 1;
            }
        }
    }
}
        /*
       Point 2.
        Output of this program will be 29, 30, 15, 16, 8, 4, 2, and it's a result of increments and decrements.

       Point 3.
        Not sure how to prove it but when the program reaches 1 it will terminate because of the condition for the loop (i > 1).
        This program will not terminate if the condition for while was (i >= 1).
        */
