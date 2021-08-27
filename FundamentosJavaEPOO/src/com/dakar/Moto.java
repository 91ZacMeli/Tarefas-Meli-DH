package com.dakar;

 public class Moto extends Veiculo{
    public Moto(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada);
        this.setTipo("Moto");
        this.setPeso(300);
        this.setRodas(2);
    }
}

