package com.recurrision;

public class DisealEngine extends Engine{
    public DisealEngine(String modelNo, float displacement, int maxRpm, int maxPower) {
        super(modelNo, displacement, maxRpm, maxPower);
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxRpm=" + maxRpm +
                ", maxPower=" + maxPower + '}';
}

}
