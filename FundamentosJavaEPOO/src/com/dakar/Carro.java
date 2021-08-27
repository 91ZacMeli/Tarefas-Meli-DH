package com.dakar;

public class Carro extends Veiculo {

    public Carro(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(marca, placa, velocidade, aceleracao, anguloDeVirada);
        this.setTipo("Carrro");
        this.setPeso(1000);
        this.setRodas(4);
    }
    public Carro(String placa){
        super(placa);
    }
}
