package com.mbuszek;

import java.util.ArrayList;

public class PlanetaryMixer {

    private String mixerName;
    private Operator operator;
    private ArrayList<Antenna> antennas = new ArrayList<Antenna>();
    private ArrayList<MoistureSensor> moistureSensors = new ArrayList<MoistureSensor>();
    private ArrayList<TemperatureSensor> temperatureSensors = new ArrayList<TemperatureSensor>();
    private ArrayList<Transceiver> transceivers = new ArrayList<Transceiver>();


    public PlanetaryMixer(String mixerName, Operator operator) {
        super();
        this.mixerName = mixerName;
        this.operator = operator;
    }

    public String getMixerName() {
        return mixerName;
    }

    public void setMixerName(String mixerName) {
        this.mixerName = mixerName;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ArrayList<Antenna> getAntennas() {
        return antennas;
    }

    public void setAntennas(ArrayList<Antenna> antennas) {
        this.antennas = antennas;
    }

    public ArrayList<MoistureSensor> getMoistureSensors() {
        return moistureSensors;
    }

    public void setAmplifiers(ArrayList<MoistureSensor> moistureSensors) {
        this.moistureSensors = moistureSensors;
    }

    public ArrayList<TemperatureSensor> getTemperatureSensors() {
        return temperatureSensors;
    }

    public void setTemperatureSensors(ArrayList<TemperatureSensor> temperatureSensors) {
        this.temperatureSensors = temperatureSensors;
    }

    public ArrayList<Transceiver> getTransceivers() {
        return transceivers;
    }

    public void setTransceivers(ArrayList<Transceiver> transceivers) {
        this.transceivers = transceivers;
    }

    @Override
    public String toString() {
        return "Mixer name.....: " + mixerName;
    }
}
