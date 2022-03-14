/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class BeeColony extends Colony implements Role {

    public String type_honeyORwasp;

    public BeeColony() {
    }

    public BeeColony(String type_honeyORwasp, String place_landORocean, int size) {
        super(place_landORocean, size);
        this.type_honeyORwasp = type_honeyORwasp;
    }

    public String getType_honeyORwasp() {
        return type_honeyORwasp;
    }

    public void setType_honeyORwasp(String type_honeyORwasp) {
        this.type_honeyORwasp = type_honeyORwasp;
    }

    @Override
    public void createWoker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString() {
        return "BeeColony{" + "type_honeyORwasp=" + type_honeyORwasp + '}';
    }

}
