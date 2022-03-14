/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wokshop4.GUI;

import java.util.Scanner;
import wokshop4.DTO.Item;
import wokshop4.DTO.Statue;
import wokshop4.DTO.Vase;
import wokshop4.DTO.painting;

public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------------------------------");
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("Input a choice:");
            choice = sc.nextInt();
            System.out.println("--------------------------------");

            switch (choice) {
                case 1:
                    item = new Vase();

                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();

                    break;
                case 3:
                    item = new painting();
                    ((painting) item).inputPainting();

                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof painting) {
                            ((painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("you need to create an object");
                    }
                    break;
            }
        } while (choice <= 4);
    }
}
