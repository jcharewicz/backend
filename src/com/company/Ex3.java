package com.company;

public class Ex3 {

        public static int Ex3(int value, int[] array) {
            double index = 0.0D;
            double limit = (double)(array.length - 1);

            while(index <= limit) {
                int point = (int)Math.ceil((index + limit) / 2.0D);
                int entry = array[point];
                if (value > entry) {
                    index = (double)(point + 1);
                } else {
                    if (value >= entry) {
                        return point;
                    }

                    limit = (double)(point - 1);
                }
            }
            return -1;
        }
}