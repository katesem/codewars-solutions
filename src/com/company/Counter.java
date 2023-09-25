
package com.company;

//solution of the Counting sheep https://www.codewars.com/kata/54edbc7200b811e956000556
import java.util.stream.Stream;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Stream.of(arrayOfSheeps).filter(i -> i != null && i == true).count();
    }
}