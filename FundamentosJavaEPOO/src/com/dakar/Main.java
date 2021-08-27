package com.dakar;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SocorristaCarro socorristaCarro = new SocorristaCarro();
        SocorristaMoto socorristaMoto = new SocorristaMoto();
        Corrida fastRun = new Corrida("RachaDaQuebrada",12000, 50000,15);

        fastRun.adicionarCarro(new Carro("Subaru", "H8PE31", 100, 3.6, 23.7));
        fastRun.adicionarCarro(new Carro("Subaru2", "H8PE32", 120, 3.8, 23.7));
        fastRun.adicionarCarro(new Carro("Subaru3", "H8PE33", 130, 3.2, 23.7));
        fastRun.adicionarCarro(new Carro("Subaru4", "H8PE34", 90, 3.0, 23.7));
        fastRun.adicionarMoto(new Moto("Suzuki", "S23RT1", 125, 4.1, 29.5));
        fastRun.adicionarMoto(new Moto("Suzuki2", "S23RT2", 95, 4.3, 29.5));
        fastRun.adicionarMoto(new Moto("Suzuki3", "S23RT3", 155, 4.5, 29.5));
        fastRun.adicionarMoto(new Moto("Suzuki4", "S23RT4", 115, 4.7, 29.5));Carro carro = new Carro("Subaru","Pkjxk",95,4,25);
        fastRun.adicionarCarro(new Carro("Subaru5","Pkjxk",95,4,25));
        fastRun.adicionarCarro(new Carro("Subaru6","Pkjxk1",95,4,25));
        fastRun.adicionarCarro(new Carro("S1ubaru6","Pkjxk1",95,4,25));
        fastRun.adicionarCarro(new Carro("S2ubaru6","Pkjxk1",95,4,25));
        fastRun.adicionarMoto(new Moto("Subaru5", "H8PE332", 130, 3.2, 23.7));
        fastRun.adicionarMoto(new Moto("Subaru6", "H8PE33", 130, 3.2, 23.7));
        fastRun.adicionarMoto(new Moto("1Subaru6", "1H8PE33", 130, 3.2, 23.7));
        fastRun.adicionarMoto(new Moto("2Subaru6", "2H8PE33", 130, 3.2, 23.7));

        socorristaCarro.socorrerCarro(fastRun.veiculos.get(2));
        socorristaMoto.socorrerMoto(fastRun.veiculos.get(6));
        socorristaMoto.socorrerMoto(fastRun.veiculos.get(9));
        socorristaCarro.socorrerCarro(fastRun.veiculos.get(3));

        fastRun.removeVeiculoComPlaca("S23RT2");
        fastRun.removerVeiculo(fastRun.veiculos.get(9));


        fastRun.calculaVencedor(fastRun.veiculos);
        }

}
