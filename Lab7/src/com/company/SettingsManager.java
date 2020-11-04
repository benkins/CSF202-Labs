package com.company;

public class SettingsManager {
    private String deviceName;
    private float backlightLevel;
    private static SettingsManager settingsManager = new SettingsManager();

    private SettingsManager(){

    }

    public static SettingsManager getInstance(){
        return settingsManager;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public float getBacklightLevel() {
        return backlightLevel;
    }

    public void setBacklightLevel(float backlightLevel) {
        this.backlightLevel = backlightLevel;
    }
}
