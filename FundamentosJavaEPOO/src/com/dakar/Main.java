package com.dakar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Veiculo> veiculo = new HashMap<>();

        veiculo.put(1, new Carros("Subaru", "H8PE31", 100, 3.6, 23.7));
        veiculo.put(2, new Motos("Suzuki", "S23RT1", 125, 4.7, 29.5));

        for (Map.Entry<Integer, Veiculo> set : veiculo.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue());
        }


    }
}
