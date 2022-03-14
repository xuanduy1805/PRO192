/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop6;

/**
 *
 * @author Admin
 */
public class StudentManager {

    public static void main(String[] args) {
        String[] options = {
            "Add new student",
            "Search a student",
            "Update name and mark ",
            "Remove a student",
            "List all",
            "Quit"};

        int choice = 0;
        StudentList list = new StudentList();
        do {
            System.out.println("\n -------------------Student managing Program --------------------");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1 -> list.addStudent();
                case 2 -> list.searchStudent();

                case 3 -> list.updateStudent();
                case 4 -> list.removeStudent();
                case 5 -> list.printAll();
                default -> System.out.println("Bye!");
            }
        } while (choice > 0 && choice < 6);
    }

}
