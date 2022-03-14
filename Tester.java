/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop3.part2;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        Guitar obj2 = new Guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood");
        System.out.println("-------------------------------------------");
        System.out.println("State of obj1:");
        obj1.createSound();
        System.out.println("-------------------------------------------");
        System.out.println("State of obj2:");
        obj2.createSound();
        System.out.println("-------------------------------------------");
        System.out.println("set price = 3000 of obj1");
        obj1.setPrices(3000);
        System.out.println("get price of obj1: " + obj1.getPrices());
    }
}
