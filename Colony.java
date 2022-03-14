/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class Colony extends Organization {

    protected String place_landORocean;

    public Colony() {

    }

    public Colony(String place_landORocean, int size) {
        super(size);
        this.place_landORocean = place_landORocean;
    }

    public void grow() {
        System.out.println("an annual cycle of growth that begins in spring");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "{ The colony  size is " + size + ", The colony's place is " + place_landORocean + " } ";

    }

    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

}
