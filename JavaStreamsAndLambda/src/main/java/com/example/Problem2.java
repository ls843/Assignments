package com.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem2 {

     static void main(String[] args) {

        String input = "streamapi";

        Map<Character, Long> frequency =
                input.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(frequency);
    }
}
