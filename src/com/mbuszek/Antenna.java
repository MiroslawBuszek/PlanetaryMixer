package com.mbuszek;

public class Antenna {

    private String producer;
    private String model;
    private String type;

    public Antenna(String producer, String model, String type) {
        super();
        this.producer = producer;
        this.model = model;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", producer, model, type);
    }
}

