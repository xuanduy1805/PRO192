/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wokshop4.DTO;

import java.util.Scanner;

public class painting extends Item {

    private int height;
    private int width;
    boolean isWatercolour;
    boolean isFramed;

    public painting() {

    }

    public painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
        this.value = value;
        this.creator = creator;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        System.out.println("height : " + height);
        System.out.println("width " + width);
        System.out.println("isWatercolour : " + isWatercolour);
        System.out.println("isFramed : " + isFramed);

    }

    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a heigh");
        height = sc.nextInt();
        System.out.println("Input a width:");
        width = sc.nextInt();
        System.out.println("Is isWatercolour ? (True or False)");
        isWatercolour = sc.nextBoolean();
        System.out.println("Is isFramed ? (True or False) ");
        isFramed = sc.nextBoolean();
    }
}
