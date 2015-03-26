package com.pafnat.tutorial.patterns._21_.Proxy;

// In this situation the proxy both creates and destroys
// an ATMMachine_Proxy Object

public class ATMProxy implements GetATMData {

    // Allows the user to access getATMState in the
    // Object ATMMachine_Proxy

    @Override
    public ATMState getATMState() {

        ATMMachine_Proxy realATMMachine = new ATMMachine_Proxy();

        return realATMMachine.getATMState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine_Proxy

    @Override
    public int getCashInMachine() {

        ATMMachine_Proxy realATMMachine = new ATMMachine_Proxy();

        return realATMMachine.getCashInMachine();

    }

}
