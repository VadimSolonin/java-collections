package ru.solonin;

public class Sony {
    private String modelName;
    private String type;
    private int price;

    public Sony(String modelName, String type, int price){
        this.modelName = modelName;
        this.type = type;
        this.price = price;
    }

    public String getModelName(){
        return this.modelName;
    }

}
