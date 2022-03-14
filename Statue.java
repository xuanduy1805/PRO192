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
public class Statue extends Item {

    private int weight;
    private String colour;
    public Statue(){
        
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value,creator);
        this.weight = weight;
        this.colour = colour;
        this.value = value;
        this.creator = creator;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputStatue() {
    System.out.println("weight : " + weight);
    System.out.println("colour " + colour);

    }

    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a weight");
        weight = sc.nextInt();
        sc.nextLine();
        System.out.println("Input a colour:");
        colour = sc.nextLine();
    }
}
