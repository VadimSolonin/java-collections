package ru.solonin;

import java.util.*;

public class Mvideo {
    private String address;
    private int number;
    Queue<Sony> cameras = new LinkedList<Sony>();

    public Mvideo(String address, int number) {
        this.address = address;
        this.number = number;
    }

    public void addSonyModel(Sony name){
        cameras.add(name);
    }

    public void printCameraNames(){
        for(Sony s : cameras) {
            System.out.println(s.getModelName());
        }
    }

    public void printCameraNames1(){
        Iterator<Sony> iterator = cameras.iterator();
        if(iterator.hasNext()){
            do{
                System.out.println(iterator.next().getModelName());
            }
            while (iterator.hasNext());
        }

    }

    public void deleteQueueValue(Sony cameraName){
        cameras.remove(cameraName);
    }

    public void findQueueValue(Sony value){
        System.out.println(cameras.contains(value));
    }
}
