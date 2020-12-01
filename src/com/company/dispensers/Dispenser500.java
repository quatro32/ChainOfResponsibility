package com.company.dispensers;

import com.company.Chain;
import com.company.Currency;

public class Dispenser500 implements Chain {
    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 500){
            int num = cur.getAmount()/500;
            int remainder = cur.getAmount() % 500;

            System.out.println("Dispensing "+num+" €500 note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}