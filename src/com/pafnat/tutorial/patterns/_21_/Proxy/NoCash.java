package com.pafnat.tutorial.patterns._21_.Proxy;

public class NoCash implements ATMState {

    ATMMachine_Proxy atmMachine;

    public NoCash(ATMMachine_Proxy newATMMachine){

        atmMachine = newATMMachine;

    }

    @Override
    public void insertCard() {

        System.out.println("We don't have any money");
        System.out.println("Your card is ejected");

    }

    @Override
    public void ejectCard() {

        System.out.println("We don't have any money");
        System.out.println("There is no card to eject");

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("We don't have any money");

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("We don't have any money");

    }
}
