package com.company;

import java.util.Arrays;
// Solution of the Odd Cubed Numbers task https://www.codewars.com/kata/580dda86c40fa6c45f00028a/java
public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr).filter(i -> i % 2 != 0).map(i -> i * i * i).sum();
    }

    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[] {-5, -5, 5, 5}));
    }
}



