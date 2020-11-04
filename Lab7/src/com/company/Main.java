package com.company;

public class Main {

    public static void main(String[] args) {
//        SettingsManager settingsManager = new SettingsManager();
        SettingsManager sm1 = SettingsManager.getInstance();
        SettingsManager sm2 = SettingsManager.getInstance();

        sm1.setDeviceName("tester 1");

        System.out.println(sm2.getDeviceName());
    }
}
