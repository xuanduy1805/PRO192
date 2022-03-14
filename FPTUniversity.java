/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class FPTUniversity extends University implements Role {

    public String address;

    public FPTUniversity() {
    }

    public FPTUniversity(String address, String Name, int size) {
        super(Name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void createWoker() {
        System.out.println("providing human resources");
    }

    @Override
    public String toString() {
        return "FPTUniversity{" + "address=" + address + '}';
    }

}
