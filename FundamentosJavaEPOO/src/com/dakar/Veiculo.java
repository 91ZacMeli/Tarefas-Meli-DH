package com.dakar;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Veiculo {
    public String tipo;
    public String marca;
    public String placa;
    public double velocidade;
    public double aceleracao;
    public double anguloVirada;
    public int rodas;
    public int peso;


    public Veiculo(String marca, String placa, double velocidade, double aceleracao, double anguloVirada) {
        this.marca = marca;
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloVirada = anguloVirada;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloVirada=" + anguloVirada +
                ", rodas=" + rodas +
                ", peso=" + peso +
                '}';
    }
}
