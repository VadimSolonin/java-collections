package ru.solonin;

import java.util.ArrayList;
import java.util.List;

public class Yarkiy {
    private String address;

    private int number;

    List<Sony> cameras = new ArrayList<>();

    public Yarkiy(String address, int number){
        this.address = address;
        this.number = number;

    }

    public void addSonyModel(Sony cameraName){
        cameras.add(cameraName);
    }

    public void printCameraNames(){
        for (int i = 0; i < cameras.size(); i++) {
            System.out.println("Camera name: " + cameras.get(i).getModelName());
        }
    }

    public void deleteListValue(Sony cameraName){
        cameras.remove(cameraName);
    }

    public void findListValue(Sony value){
        System.out.println(cameras.contains(value));
    }
}
