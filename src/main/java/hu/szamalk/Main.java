package hu.szamalk;

import model.Bekeros;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy tetszőleges szöveget: ");
        String tetszolegesSzoveg = scanner.nextLine();

        if(tetszolegesSzoveg.length() < 15 && tetszolegesSzoveg.length() > 5) {
            Bekeros bekeros = new Bekeros(tetszolegesSzoveg);
            System.out.println("Tömbben: ");
            bekeros.tombKiiratas();
            System.out.println("Listában: ");
            bekeros.listaKiiratas();
        } else {
            System.out.println("Nem megfelelő szöveg, próbáld újra!");
        }
    }


}