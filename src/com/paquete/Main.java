package com.paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("\n----------------------------------------------------------------\n");
        System.out.println("Ingreso de diferentes tipos de datos");
        System.out.println("\n----------------------------------------------------------------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un String");
        String input = scanner.nextLine();
        System.out.println("Introduce un long ");
        long largo = scanner.nextLong();
        System.out.println("Introduce un double ");
        double val = scanner.nextDouble();
        System.out.println("Introduce un float ");
        float fval = scanner.nextFloat();
        System.out.println("Introduce un int ");
        int i = scanner.nextInt();
        System.out.println("Introduce un boolean ");
        boolean b = scanner.nextBoolean();
        System.out.println("Introduce un byte ");
        byte bbyte = scanner.nextByte();
        System.out.println("Introduce un short ");
        short s = scanner.nextShort();
        System.out.println("Introduce un char ");
        char c = scanner.next().charAt(0);
        System.out.println("\n Usted introdujo los siguientes valorese "+" "+ input+" " +" "+ largo+" " + val+" " + fval+" " + i+" " + b+" " + bbyte+" " + s+" " + c);



    }
}