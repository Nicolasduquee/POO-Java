package com.mycompany.aula01;

public class Aula01 {

    public static void main(String[] args) {
        Garrafa g1 = new Garrafa("plastico", true, 1000);
        g1.status();
        g1.destampar();
        g1.tomar();
        g1.status();
        g1.tampar();
        g1.status();
    }
}
