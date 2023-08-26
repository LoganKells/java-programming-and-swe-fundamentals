package com.java_examples;

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
