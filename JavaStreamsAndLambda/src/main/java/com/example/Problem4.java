package com.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Laptop {

    String brand;
    String processor;
    int ram;
    int graphics;
    int hardDisk;
    LocalDate manufactureDate;

    public Laptop(String brand, String processor, int ram, int graphics, int hardDisk, LocalDate manufactureDate) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.graphics = graphics;
        this.hardDisk = hardDisk;
        this.manufactureDate = manufactureDate;
    }

    public String getProcessor() { return processor; }
    public int getRam() { return ram; }
    public int getGraphics() { return graphics; }
    public int getHardDisk() { return hardDisk; }
    public LocalDate getManufactureDate() { return manufactureDate; }

    @Override
    public String toString() {
        return brand + " RAM:" + ram + " GPU:" + graphics + " HDD:" + hardDisk + " Date:" + manufactureDate;
    }
}

public class Problem4 {

     static void main(String[] args) {

        List<Laptop> laptops = Arrays.asList(

                new Laptop("Dell","i7",16,6,512,LocalDate.of(2022,5,10)),
                new Laptop("HP","i5",8,4,512,LocalDate.of(2021,3,12)),
                new Laptop("Lenovo","i7",32,8,1024,LocalDate.of(2023,2,5)),
                new Laptop("Asus","i5",16,6,512,LocalDate.of(2022,7,8)),
                new Laptop("Acer","i7",16,4,256,LocalDate.of(2021,11,3))
        );

        int requiredRam = 16;
        int requiredGraphics = 6;

        Map<String, List<Laptop>> result =
                laptops.stream()

                        .filter(l -> l.getRam() >= requiredRam &&
                                l.getGraphics() >= requiredGraphics)

                        .collect(Collectors.groupingBy(

                                Laptop::getProcessor,

                                Collectors.collectingAndThen(
                                        Collectors.toList(),

                                        list -> list.stream()
                                                .sorted(
                                                        Comparator.comparing(Laptop::getRam)
                                                                .thenComparing(Laptop::getHardDisk)
                                                                .thenComparing(Laptop::getManufactureDate)
                                                )
                                                .collect(Collectors.toList())
                                )
                        ));

        result.forEach((processor, list) -> {
            System.out.println("Processor: " + processor);
            list.forEach(System.out::println);
        });
    }
}

