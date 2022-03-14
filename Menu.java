/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    public static int getChoice(ArrayList options) {
        for (int i = 0; i < options.size(); i++) {
           System.out.print((i + 1) + "--" + options.get(i));
        }
        System.out.print("Choose 1.." + options.size() + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);

        }
        System.out.print("Choose 1..." + options.length + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }
}
