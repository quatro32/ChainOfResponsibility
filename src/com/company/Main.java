package com.company;

import com.company.dispensers.Dispenser10;
import com.company.dispensers.Dispenser20;
import com.company.dispensers.Dispenser50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private Chain c1;



    public static void main(String[] args) {
        DispenseChain ATM = new DispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            ATM.getDispenser().dispense(new Currency(amount));
        }

    }
}
