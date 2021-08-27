package com.dakar;

import lombok.Data;


public class SocorristaMoto {
    public void socorrerMoto(Veiculo moto) {
        System.out.println("Socorrendo Moto "+moto.getMarca());
    }
}
