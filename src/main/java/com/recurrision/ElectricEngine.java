package com.recurrision;

public class ElectricEngine extends Engine{
    public ElectricEngine(String modelNo, float displacement, int maxRpm, int maxPower) {
        super(modelNo, displacement, maxRpm, maxPower);
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxRpm=" + maxRpm +
                ", maxPower=" + maxPower +
            '}';
}

}
