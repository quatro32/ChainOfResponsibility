package com.company;

import com.company.dispensers.Dispenser10;
import com.company.dispensers.Dispenser20;
import com.company.dispensers.Dispenser50;

import java.util.ArrayList;
import java.util.List;

public class DispenseChain {
    private List<Chain> chainList;

    public DispenseChain() {
        // initialize the chain
        chainList = new ArrayList<>();

        chainList.add(new Dispenser50());
        chainList.add(new Dispenser20());
        chainList.add(new Dispenser10());

        // set the chain of responsibility
        for (int i = 0; i < chainList.size() - 1; i++)
            chainList.get(i).setNextChain(chainList.get(i+1));
    }

    Chain getDispenser() {
        return chainList.get(0);
    }
}
