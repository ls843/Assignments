package com.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem1 {

     static void main(String[] args) {

        Map<String, List<String>> departments = new HashMap<>();

        departments.put("HR", Arrays.asList("Alice","Aaron","Bob","Bella"));
        departments.put("IT", Arrays.asList("Charlie","Cathy","David","Derek"));
        departments.put("Finance", Arrays.asList("Evan","Eva","Frank","Fiona"));

        List<String> allEmployees =
                departments.values()
                        .stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        char letter = 'A';

        List<String> filteredSorted = allEmployees.stream()
                .filter(e -> e.startsWith(String.valueOf(letter)))
                .sorted()
                .collect(Collectors.toList());

        Map<Character, List<String>> grouped =
                allEmployees.stream()
                        .sorted()
                        .collect(Collectors.groupingBy(e -> e.charAt(0)));

        Collections.shuffle(allEmployees);

        Map<String, List<String>> teams =
                IntStream.range(0, allEmployees.size())
                        .boxed()
                        .collect(Collectors.groupingBy(
                                i -> "Team" + (i % 5 + 1),
                                Collectors.mapping(allEmployees::get, Collectors.toList())
                        ));

        List<List<String>> teamList = new ArrayList<>(teams.values());

        Map<String, List<String>> divisions = new HashMap<>();

        divisions.put("Division1",
                Stream.concat(teamList.get(0).stream(), teamList.get(1).stream())
                        .collect(Collectors.toList()));

        divisions.put("Division2",
                Stream.concat(teamList.get(2).stream(), teamList.get(3).stream())
                        .collect(Collectors.toList()));

        divisions.put("Division3", teamList.get(4));

        System.out.println("All Employees: " + allEmployees);
        System.out.println("Filtered Sorted: " + filteredSorted);
        System.out.println("Grouped by Letter: " + grouped);
        System.out.println("Teams: " + teams);
        System.out.println("Divisions: " + divisions);
    }
}