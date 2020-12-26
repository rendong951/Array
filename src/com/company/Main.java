package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her
        Array arr = new Array<>();
        for(int i = 0; i < 11; i ++) {
            arr.addLast(i);
        }

        System.out.println(arr.getSize());
        System.out.println(arr.getCapacity());
        System.out.println(arr.toString());
        for(int i = 0; i < 8; i ++) {
            arr.removeLast();
        }
        System.out.println(arr.getSize());
        System.out.println(arr.getCapacity());
        System.out.println(arr.toString());
    }
}
