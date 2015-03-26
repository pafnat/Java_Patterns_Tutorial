package com.pafnat.tutorial.patterns._12_.Command;

public class TVRemote {

    public static ElectronicDevice getDevice(){

        return new Television();

    }

}
