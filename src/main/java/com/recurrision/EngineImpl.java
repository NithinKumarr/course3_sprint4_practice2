package com.recurrision;

public class EngineImpl {
    public static void main(String[] args) {
        petrolEngine obj = new petrolEngine("kA64i", 12.0f, 210, 120);
        CNGEngine obj1 = new CNGEngine("SD32n", 34.7f, 180, 120);
        DisealEngine obj2 = new DisealEngine("MS54l", 48.77f, 200, 180);
        ElectricEngine obj3 = new ElectricEngine("MG327", 87.9f, 300, 260);
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
