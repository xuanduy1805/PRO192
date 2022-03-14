package workshop1;

import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in); // nên để scanner để đầu 
        System.out.println("Nhap list ten ");
        n = sc.nextInt();
        sc.nextLine();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            //Scanner mat = new Scanner(System.in);
            list[i] = sc.nextLine();
        }
        System.out.println("-------------------------");
        System.out.println("Các tên đã được viết hoa");
        for (int i = 0; i < n; i++) {
            String name = list[i].toUpperCase();
            System.out.println(name);
        }
    }

    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;
        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }
        return titleCase.toString();
    }

}
