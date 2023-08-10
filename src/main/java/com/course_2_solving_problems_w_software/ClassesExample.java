package com.course_2_solving_problems_w_software;

public class ClassesExample {
    private String color;
    public ClassesExample(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public static void main(String[] args) {
        ClassesExample myClassesExample = new ClassesExample("yellow");
        System.out.println("My table color is: " + myClassesExample.getColor());
        var x = (2 + 5.0) % 2;
        System.out.println(x);
    }
}
