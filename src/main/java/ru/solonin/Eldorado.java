package ru.solonin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Eldorado {
    private String address;
    private int number;
    private Set<Sony> cameras = new HashSet<>();


    public Eldorado(String address, int number) {
        this.address = address;
        this.number = number;
    }

    public void addSonyModel(Sony name){
        cameras.add(name);
    }

    public void printCameraNames(){
        Iterator<Sony> i = cameras.iterator();
        while (i.hasNext())
            System.out.println(i.next().getModelName());
    }

    public void deleteSetValue(Sony cameraName){
        cameras.remove(cameraName);
    }

    public void findSetValue(Sony value){
        System.out.println(cameras.contains(value));
    }
}
