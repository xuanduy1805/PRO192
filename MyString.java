/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {

        int count = 0;
        String[] words = str.split("\\s+");
        for (String o : words) {
            for (int i = 0; i < o.length(); i++) {
                if (Character.isDigit(o.charAt(i))
                        && Integer.parseInt(o.charAt(i) + "") % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    boolean isPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrom(words[i])) {
                words[i] = "XX";
                break;

            }
        }
        String res = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                res += words[i].charAt(j);
            }
            if (words.length - 1 != i) {
                res += " ";
            }

        }
        return res;
    }

}
