/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecCala extends Cala {

    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }

    public void setData() {
        StringBuilder repl = new StringBuilder(super.getOwner());
        repl.replace(2, 3, "XX");
        setOwner(repl.toString());
    }

    public int getValue() {
        if (color % 2 == 1) {
            return getPrice() + 7;
        } else {
            return getPrice() + 3;
        }

    }
}
