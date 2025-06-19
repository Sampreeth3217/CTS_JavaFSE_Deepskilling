package com.example;
public class BuilderPatternTest {
    public static void main(String[] args){
        Computer basicComputer=new Computer.Builder("Intel i5","8GB")
                                    .setStorage("256GB SSD")
                                    .setOperatingSystem("Windows 10")
                                    .build();
        System.out.println("=== Basic Computer ===");
        System.out.println(basicComputer);
        System.out.println();
        Computer gamingComputer=new Computer.Builder("Intel i9","32GB")
                                     .setStorage("1TB SSD")
                                     .setGraphicsCard("NVIDIA RTX 4090")
                                     .setOperatingSystem("Windows 11")
                                     .build();
        System.out.println("=== Gaming Computer ===");
        System.out.println(gamingComputer);
        System.out.println();
        Computer linuxWorkstation=new Computer.Builder("AMD Ryzen 7","16GB")
                                       .setStorage("512GB SSD")
                                       .setOperatingSystem("Ubuntu 22.04 LTS")
                                       .build();

        System.out.println("=== Linux Workstation ===");
        System.out.println(linuxWorkstation);
    }
}
