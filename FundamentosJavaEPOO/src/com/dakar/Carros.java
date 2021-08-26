package com.dakar;

public class Carros extends Veiculo {

    public Carros (String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada);
        setTipo("Carro");
        setPeso(1000);
        setRodas(4);
    }
}
