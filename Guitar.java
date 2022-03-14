/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop3.part2;

/**
 *
 * @author Admin
 */
public class Guitar {

    private String serialNumber;
    private double prices;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar() {
        serialNumber = null;
        prices = 0;
        builder = null;
        model = null;
        backWood = null;
        topWood = null;
    }

    public Guitar(String serialNumber, double prices, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.prices = prices;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println("serialNumber : " + serialNumber);
        System.out.println("prices : " + prices);
        System.out.println("builder : " + builder);
        System.out.println("model : " + model);
        System.out.println("backWood : " + backWood);
        System.out.println("topWood : " + topWood);

    }

}
