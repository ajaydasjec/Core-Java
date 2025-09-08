package com.core.java.structural.designpattern.facade;

public class SmartHomeFacade {
    private final Lighting lighting;
    private final MusicSystem musicSystem;
    private final ClimateControl climateControl;

    public SmartHomeFacade(Lighting lighting, MusicSystem musicSystem, ClimateControl climateControl) {
        this.lighting = lighting;
        this.musicSystem = musicSystem;
        this.climateControl = climateControl;
    }

    public void startEveningRoutine(){
        lighting.on();
        musicSystem.playMusic();
        climateControl.setTemperature(20);
    }
    public void endEveningRoutine(){
        lighting.off();
        musicSystem.stopMusic();
        climateControl.setTemperature(25);
    }
}
