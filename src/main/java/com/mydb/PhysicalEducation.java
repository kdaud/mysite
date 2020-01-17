package com.mydb;

import java.util.Scanner;

public class PhysicalEducation {
    private Scanner scan = new Scanner(System.in);
    private void mycodingjourney(){
        int [] marks = new int[4];
        for (int i=0; i<marks.length; i++){
            marks[i]=scan.nextInt();
        }
    }

    public static void main(String[] args) {
        new PhysicalEducation().mycodingjourney();
    }
}
