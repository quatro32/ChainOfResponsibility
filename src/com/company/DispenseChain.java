package com.company;

import com.company.dispensers.Dispenser10;
import com.company.dispensers.Dispenser20;
import com.company.dispensers.Dispenser50;

public class DispenseChain {
    private Chain c1;

    public DispenseChain() {
        // initialize the chain
        this.c1 = new Dispenser50();
        Chain c2 = new Dispenser20();
        Chain c3 = new Dispenser10();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    Chain getDispenser() {
        return c1;
    }
}
