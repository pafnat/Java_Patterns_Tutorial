package com.pafnat.tutorial.patterns._21_.Proxy;

public class HasPin implements ATMState {

    ATMMachine_Proxy atmMachine;

    public HasPin(ATMMachine_Proxy newATMMachine){

        atmMachine = newATMMachine;

    }

    @Override
    public void insertCard() {

        System.out.println("You already entered a card");

    }

    @Override
    public void ejectCard() {

        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        if(cashToWithdraw > atmMachine.cashInMachine){

            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

        } else {

            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if(atmMachine.cashInMachine <= 0){

                atmMachine.setATMState(atmMachine.getNoCashState());

            }
        }
    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("You already entered a PIN");

    }
}
