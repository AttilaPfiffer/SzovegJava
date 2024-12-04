package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bekeros {
    private ArrayList<String> tarolo;
    private String[] tombTarolo;

    public Bekeros(String szoveg) {
        this.tarolo = new ArrayList<>();
        this.tombTarolo = szoveg.split("");
        Collections.addAll(tarolo, tombTarolo);
    }

    public void tombKiiratas() {
        for (int i = 0; i < tombTarolo.length; i++) {
            System.out.print(tombTarolo[i]);
            if (i < tombTarolo.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public void listaKiiratas() {
        for (int i = 0; i < tarolo.size(); i++) {
            System.out.print(tarolo.get(i));
            if (i < tarolo.size() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Bekeros{" +
                "tarolo=" + tarolo +
                ", tombTarolo=" + Arrays.toString(tombTarolo) +
                '}';
    }
}
