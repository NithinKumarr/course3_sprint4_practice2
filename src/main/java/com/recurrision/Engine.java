package com.recurrision;

public class Engine {
    String modelNo;
    float displacement;
    int maxRpm;
    int maxPower;
    int voltage;

    public Engine(String modelNo, float displacement, int maxRpm, int maxPower) {
        this.modelNo = modelNo;
        this.displacement = displacement;
        this.maxRpm = maxRpm;
        this.maxPower = maxPower;
    }
}
