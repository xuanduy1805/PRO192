/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop2;

import java.util.Scanner;

public class Part2_2 {

    public String inputString() throws Exception {
        String s = "";
        String pattern = "SE+\\d{3}";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap String: ");
        s = sc.nextLine();
        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }

    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        boolean cont = false;
        do {
            try {
                String d = obj.inputString();
                System.out.println("The string is " + d);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
