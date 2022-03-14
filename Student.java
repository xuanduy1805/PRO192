/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop6;

/**
 *
 * @author Admin
 */
public class Student {

    String code;
    String name;
    int mark;

    public Student() {
        String code = "";
        String name = "";
        int mark = 0;
    }

    public Student(String code, String name, int mark) {
        this.code = code.toUpperCase();
        this.name = name.toUpperCase();
        this.mark = (mark >= 0 && mark <= 10) ? mark : 0;
    }

    @Override
    public String toString() {
        return  code + ", " + name + ", " + mark;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        }
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        name = name.trim().toUpperCase();
        if (name.length() > 0) {
            this.name = name;
        }
    }

}
