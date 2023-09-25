package com.company;

import java.util.stream.IntStream;

public class MultiplesTreeOrFive {

    public static int solution(int number) {
        return IntStream.range(0, number).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
