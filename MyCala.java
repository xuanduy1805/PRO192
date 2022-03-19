
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala o : t) {
            if (Character.isLetter(o.getOwner().charAt(1))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int min = t.get(0).getPrice();
        int count = 0;
        for (Cala o : t) {
            if (o.getPrice() < min) {
                min = o.getPrice();
            }
        }
        int index = -1;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() == min) {
                count++;
            }
            if (count == 2) {
                index = i;
                break;
            }
        }
        t.remove(index);

    }

    @Override
    public void f3(List<Cala> t) {
        for (int i = 0; i < t.size() - 1; i++) {
            for (int j = i + 1; j < t.size(); j++) {
                if (t.get(i).getOwner().charAt(1) < t.get(j).getOwner().charAt(1)) {
                    Collections.swap(t, i, j);
                }
            }
        }
    }

}
