package com.core.java.structural.designpattern.facade;

public class FacadeClient {
    public static void main(String[] args) {
        Lighting lighting = new Lighting();
        MusicSystem musicSystem = new MusicSystem();
        ClimateControl climateControl = new ClimateControl();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(lighting,musicSystem,climateControl);
        smartHomeFacade.startEveningRoutine();
        smartHomeFacade.endEveningRoutine();
    }
}
