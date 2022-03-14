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
public class Item {

    protected int value;
    protected String creator;

    public Item() {

    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void output() {
        System.out.println("Value : " + value);
        System.out.println("Creator : " + creator);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a Value: ");
        value = sc.nextInt();
        sc.nextLine();
        while (value < 0) {
            System.out.println("creator is not empty");
            System.out.println("Yeu cau nhap lai Value !!!");
            value = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Input creator: ");
        creator = sc.nextLine();
    }

}
