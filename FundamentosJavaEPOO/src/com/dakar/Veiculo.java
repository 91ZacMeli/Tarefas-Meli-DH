package com.dakar;

import lombok.Data;

@Data
public class Veiculo {
    private float velocidade;
    private float aceleracao;
    private float anguloVirada;
    private String marca;
    private double peso;
    private int rodas;

}
