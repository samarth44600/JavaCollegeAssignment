// Write a multithreaded program that consist of three classes. First class calculates the sum
// of two numbers inputted by user. Second class checks whether the input given by user is
// even or odd. And third class simply prints name given by user. Create 3 threads and start
// it and analyze the output.

package assignment7;

import java.util.Scanner;

class SumCalculator extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        scanner.close();
    }
}

class EvenOddChecker extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's even or odd: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close();
    }
}

class NamePrinter extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}

public class MultithreadedProgram5 {
    public static void main(String[] args) {
        SumCalculator sumThread = new SumCalculator();
        EvenOddChecker evenOddThread = new EvenOddChecker();
        NamePrinter nameThread = new NamePrinter();

        sumThread.start();
        evenOddThread.start();
        nameThread.start();
    }
}
