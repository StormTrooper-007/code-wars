package org.example.kyu6;

import java.util.stream.IntStream;

public class ArrayDiff {
    public int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }
}
