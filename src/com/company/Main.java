package com.company;


import java.util.Scanner;

public class Main {
    private Chain c1;


    public static void main(String[] args) {
        DispenseChain ATM = new DispenseChain();
        while (true) {
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();
            if (amount % 1 != 0) {
                System.out.println("Enter valid amount.");
                return;
            }
            // process the request
            ATM.getDispenser().dispense(new Currency(amount));
        }

    }
}
