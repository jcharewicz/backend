package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = new int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        int index = 12;

        Ex1.Ex1();
        Ex2.Ex2();
        System.out.println("Ex 3 for index = 12 equals " + Ex3.Ex3(index, array));

        Ex5 UTCdatetime = new Ex5();
        System.out.println("Ex 5 UTC date time = " + UTCdatetime.UTCdate());
        Ex5 GMTdatetime = new Ex5();
        System.out.println("Ex 5 GMT date time = " + GMTdatetime.GMTdate());

        Ex6.Ex6();

    }
}
