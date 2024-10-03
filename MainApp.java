package exercitiul5;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(21);
        System.out.println("numarul " + rand_int1 + " apartine secv Fibonacci " + Fibonacci(rand_int1));

    }



    static boolean Fibonacci(int n)
    {
        Scanner sc = new Scanner(System.in);



        int firstTerm = 0;

        int secondTerm = 1;

        int thirdTerm = 0;

        while (thirdTerm < n)
        {
            thirdTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;

            secondTerm = thirdTerm;
        }

        if(thirdTerm == n)
        {
            System.out.println("Number belongs to Fibonacci series");
            return true;
        }
        else
        {
            System.out.println("Number doesn't belongs to Fibonacci series");
            return false;
        }
    }
}


