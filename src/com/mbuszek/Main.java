package com.mbuszek;

public class Main {

    public static void main(String[] args) {

        Operator operator = new Operator("Jan", "Kowalski");

        PlanetaryMixer mixer1 = new PlanetaryMixer("Big John", operator);

        mixer1.getTransceivers().add(new Transceiver("Yaesu", " Ft-2000D"));
        mixer1.getTransceivers().add(new Transceiver("Icom", "Ic-7800"));

        mixer1.getAntennas().add(new Antenna("Force-x15", "VV-50", "Yag"));
        mixer1.getAntennas().add(new Antenna("Vortex", "55BT", "Vertical"));

        mixer1.getTemperatureSensors().add(new TemperatureSensor("Limatherm", "TOPE-367"));
        mixer1.getTemperatureSensors().add(new TemperatureSensor("Pepperl+Fuchs", "TSEN-01"));

        mixer1.getMoistureSensors().add(new MoistureSensor("PCE Instruments", "PCE-MWM 210"));
        mixer1.getMoistureSensors().add(new MoistureSensor("PCE Instruments", "PCE-MWM 200"));

        System.out.println(mixer1);
        System.out.println(operator);
        System.out.println("");

        System.out.println("Equipment List");
        System.out.println("-----------------------------");
        System.out.println("Transceivers ...............: " + mixer1.getTransceivers());
        System.out.println("Antennas....................: " + mixer1.getAntennas());
        System.out.println("Moisture sensors............: " + mixer1.getMoistureSensors());
        System.out.println("Temperature sensors.........: " + mixer1.getTemperatureSensors());

    }
}
