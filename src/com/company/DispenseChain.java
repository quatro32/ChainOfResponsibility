package com.company;

import com.company.dispensers.*;

public class DispenseChain {
    private Chain c1;

    public DispenseChain() {
        // initialize the chain
        this.c1 = new Dispenser500();
        Chain c2 = new Dispenser200();
        Chain c3 = new Dispenser100();
        Chain c4 = new Dispenser50();
        Chain c5 = new Dispenser20();
        Chain c6 = new Dispenser10();
        Chain c7 = new Dispenser5();
        Chain c8 = new Dispenser2();
        Chain c9 = new Dispenser1();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
        c6.setNextChain(c7);
        c7.setNextChain(c8);
        c8.setNextChain(c9);
    }

    Chain getDispenser() {
        return c1;
    }
}
