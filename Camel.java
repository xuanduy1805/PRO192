/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Camel {

    private String desert;
    private int step;

    public Camel() {
    }

    public Camel(String desert, int step) {
        this.desert = desert;
        this.step = step;
    }

    public String getDesert() {
        return desert.toLowerCase();
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

}
