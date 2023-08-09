package com.course1;

public class Arrays {
    public int[] data;
    public Arrays(int[] data) {
        this.data = data;
    }

    public void printArray() {
        int[] data = new int[3];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        for (int num : data) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] myData = {1, 2, 3};
        Arrays exampleArrays = new Arrays(myData);
        exampleArrays.printArray();
    }
}
