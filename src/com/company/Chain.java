package com.company;

public interface Chain {
    void setNextChain(Chain nextChain);
    void dispense(Currency currency);
}
