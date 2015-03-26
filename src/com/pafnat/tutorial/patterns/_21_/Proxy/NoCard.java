package com.pafnat.tutorial.patterns._21_.Proxy;

public class NoCard implements ATMState {

    ATMMachine_Proxy atmMachine;

    public NoCard(ATMMachine_Proxy newATMMachine){

        atmMachine = newATMMachine;

    }

    @Override
    public void insertCard() {

        System.out.println("Please enter your pin");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    @Override
    public void ejectCard() {

        System.out.println("You didn't enter a card");

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("You have not entered your card");

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("You have not entered your card");

    }
}
