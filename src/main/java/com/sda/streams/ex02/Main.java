package com.sda.streams.ex02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Marek", "Tomek", "Piotrek", "Adam", "Kamil",
                "Klaudia", "Ela", "Ola", "Ala", "Kinga"));

        strings.stream().limit(5).forEach(System.out::println);
    }
}
