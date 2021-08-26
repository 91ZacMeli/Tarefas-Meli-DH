package com.dakar;

import lombok.Data;

import java.util.HashMap;

@Data
public class Corrida {
    public double distancia;
    public double premioEmDolares;
    public String nome;
    public int quantidadeDeVeiculosPermitidos;

    HashMap<Integer, Veiculo> carro = new HashMap<>();
    HashMap<Integer, Veiculo> moto = new HashMap<>();

    int inscricao = 1;

    public void adicionarCarro(String nome, Veiculo veiculo) {
        switch (nome) {
            case "Corrida carros":
                carro.put(inscricao++, veiculo);
                break;
        }
    }

    public void adicionarMoto(Veiculo veiculo) {
        switch (nome) {
            case "Corrida motos":
                moto.put(inscricao++, veiculo);
                break;
        }
    }
}