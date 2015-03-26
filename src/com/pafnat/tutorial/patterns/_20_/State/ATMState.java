package com.pafnat.tutorial.patterns._20_.State;

public interface ATMState {

    // Different states expected
    // HasCard, NoCard, HasPin, NoCash

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}