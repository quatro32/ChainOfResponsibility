package com.company;

import com.company.dispensers.Dispenser10;
import com.company.dispensers.Dispenser20;
import com.company.dispensers.Dispenser50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DispenseChain ATM = new DispenseChain();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter amount to dispense");
            int amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
            } else
                // process the request
                ATM.getDispenser().dispense(new Currency(amount));
        }

    }
}
