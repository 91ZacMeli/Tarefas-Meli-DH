package com.dakar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corrida {

    public List<Veiculo> veiculos = new ArrayList<>();
    double classificaco[] = new double[15];

    private String nome;
    private double distancia;
    private double premioEmDolares;
    private int quantidadeDeVeiculosPermitidos;
    private int inscricao = 1;
    private double valorMaximo = 1000000;
    double resultado;


    public Corrida(String nome,double distancia, double premioEmDolares,
                   int quantidadeDeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }

    public boolean isListaCheia() {
        if (inscricao >= quantidadeDeVeiculosPermitidos) {
            System.out.println("Limite maximo de inscritos!");
            return true;
        }
        return false;
    }

    public void adicionarCarro(Carro carro) {
        if (isListaCheia()) {
            System.out.println("As inscrições se esgotaram!");
        }else if(!isListaCheia()) {
            veiculos.add(carro);
            inscricao++;
            System.out.println("Carro Adicionado na corrida");
        }

    }

    public void adicionarMoto(Moto moto) {
        // quantidade menor que o valor da corrida
        if (isListaCheia()) {
            System.out.println("As inscrições se esgotaram!");
        } else if (!isListaCheia()) {
            veiculos.add(moto);
            System.out.println("Moto Adicionada na corrida");
            inscricao++;
        }
    }
    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
        System.out.println("Veiculo removido do Modelo " + veiculo.getMarca());
    }
    public void removeVeiculoComPlaca(String placa){
        for (int i = 0; i < veiculos.size(); i++){
            if(veiculos.get(i).getPlaca().equals(placa)){
                veiculos.remove(placa);
            }
        }
        System.out.println("Veiculo removido, Placa " + placa);
    }

    public void calculaVencedor(List Veiculo) {

            for (int i = 0; i < veiculos.size(); i++) {
                resultado = (veiculos.get(i).getVelocidade() * veiculos.get(i).getAceleracao()) +
                        (veiculos.get(i).getAnguloVirada() * (veiculos.get(i).getAnguloVirada())) *
                                (veiculos.get(i).getPeso() - veiculos.get(i).getRodas() * 100);
               classificaco[i] = resultado;
            }
       System.out.println(Arrays.stream(classificaco).max());

       }
    }