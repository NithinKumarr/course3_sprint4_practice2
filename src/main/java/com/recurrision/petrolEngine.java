package com.recurrision;

public class petrolEngine extends Engine{
    public petrolEngine(String modelNo, float displacement, int maxRpm, int maxPower) {
        super(modelNo, displacement, maxRpm, maxPower);
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxRpm=" + maxRpm +
                ", maxPower=" + maxPower +
            '}';
}

}
