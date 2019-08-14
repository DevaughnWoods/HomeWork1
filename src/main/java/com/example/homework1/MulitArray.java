package com.example.homework1;

public class MulitArray {
    public static void main(String[] args) {
        printTables();
    }
    public static void printTables(){
        int size = 10;

        for (int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                System.out.print(" " + j * i + " ");
            }
            System.out.println();
        }
    }


}
