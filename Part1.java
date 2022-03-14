package workshop2;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        boolean cont = false;
        do {
            try {
                int num;
                Scanner scn = new Scanner(System.in);
                System.out.print("Nhập số: ");
                num = scn.nextInt();
                if (num < 1) {
                    throw new Exception();
                }
                System.out.println("So la " + num);
                cont = false;

            } catch (Exception e) {
                System.out.println("Kí tự không hợp lí");
                cont = true;
            }
        } while (cont);
    }
}
