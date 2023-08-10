package com.course_2_solving_problems_w_software;

public class ArraysExample {
    public int[] data;
    public ArraysExample(int[] data) {
        this.data = data;
    }

    public void printArray() {
        for (int num : this.data) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] myData = {1, 2, 3};
        ArraysExample exampleArraysExample = new ArraysExample(myData);
        exampleArraysExample.printArray();
    }
}
