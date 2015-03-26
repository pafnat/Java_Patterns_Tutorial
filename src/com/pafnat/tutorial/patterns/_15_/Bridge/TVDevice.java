package com.pafnat.tutorial.patterns._15_.Bridge;

// Concrete Implementor

// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices

public class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting){

        deviceState = newDeviceState;

        maxSetting = newMaxSetting;

    }

    @Override
    public void buttonFivePressed() {

        System.out.println("Channel Down");

        deviceState--;

    }

    @Override
    public void buttonSixPressed() {

        System.out.println("Channel Up");

        deviceState++;

    }

}
