package com.recurrision;

public class CNGEngine extends Engine{
    public CNGEngine(String modelNo, float displacement, int maxRpm, int maxPower) {
        super(modelNo, displacement, maxRpm, maxPower);
    }

    @Override
    public String toString() {
        return "CNGEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxRpm=" + maxRpm +
                ", maxPower=" + maxPower + '}';
    }

}
