package com.mbuszek;

public class MoistureSensor {
    private String producer;
    private String model;

    public MoistureSensor(String producer, String model) {
        super();
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("%s %s", producer, model);
    }
}
