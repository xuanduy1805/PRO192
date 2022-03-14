/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop3;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        part1 c = new part1();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        part1 c2 = new part1("red", 100, true, true);
        System.out.println("-----------------------------------");
        c2.pressAcceleratorButton();
        c2.output();
        System.out.println("-----------------------------------");
        c2.setColour("black");
        System.out.println("Colour of c2: " + c2.getColour());
        c2.output();
    }
}
