package com.company;

import java.util.stream.IntStream;
//solution of the Find Multiples of a Number: https://www.codewars.com/kata/58ca658cc0d6401f2700045f

public class Multiples {
    public static int[] find(int base, int limit) {
        return IntStream.range(base, limit+1).filter(i -> i % base == 0).toArray();
    }
}