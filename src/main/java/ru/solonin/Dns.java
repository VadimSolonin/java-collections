package ru.solonin;

import java.util.HashMap;
import java.util.Map;

public class Dns {
    private String address;
    private int number;
    Map<Integer, Sony> cameras = new HashMap<>();

    public Dns(String address, int number) {
        this.address = address;
        this.number = number;
    }
    public void addSonyModel(Sony cameraName){
        int id = cameras.size() + 1;
        cameras.put(id, cameraName);
    }
    public void printCameraNames(){
        for (var entry : cameras.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue().getModelName());
        }
    }

    public void deleteMapValue(Sony cameraName){
        cameras.entrySet().removeIf(entry -> entry.getValue().equals(cameraName));
    }


    public void findMapValue(Sony value){
        System.out.println(cameras.containsValue(value));
    }
}
