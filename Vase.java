/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wokshop4.DTO;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
        this.value = value;
        this.creator = creator;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void outputVase() {
        System.out.println("Value : " + value);
        System.out.println("Creator " + creator);

    }

    public void inputVase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a heigh");
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Input a material:");
        sc = new Scanner(System.in);
        material = sc.nextLine();
    }

}
