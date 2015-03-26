package com.pafnat.tutorial.patterns._21_.Proxy;

public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}
