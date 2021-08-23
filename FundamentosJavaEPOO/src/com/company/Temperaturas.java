package com.company;

public class Temperaturas {

    public static void main(String[] args) {

        final String[] cidades = {"Londres","Madrid","Nueva York","Buenos Aires","Asunción","São Paulo","Lima","Santiago de Chile","Lisboa","Tokio"};
        double[][] temperaturas = {{ -2, 33 }, { -3,32 }, { -8, 27 }, { 4, 37 },{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};

        for(int i =0;i< cidades.length;i++){
            System.out.print(cidades[i]);
            System.out.println(" Mínima de : " + temperaturas[i][0] + " Máxima de " + temperaturas[i][1] );
        }
    }
}
