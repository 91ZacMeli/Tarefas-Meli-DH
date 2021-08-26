package com.dakar;

 public class Motos extends Veiculo{
    public Motos(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada);
        setTipo("Moto");
        setPeso(300);
        setRodas(2);
    }
}

