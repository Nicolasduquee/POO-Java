

package com.mycompany.aula0;


public class Aula0 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.7f;
        c1.carga = 100;
        c1.modelo = "Bic";
        c1.tampada = true;
        
        Caneta c2 = new Caneta();
        c2.cor = "Verde";
        c2.ponta = 0.5f;
        c2.carga = 80;
        c2.modelo = "Brinde";
        c2.tampada = false;
        
        c1.status();
        c2.status();
        c1.destampar();
        c1.rabiscar();
        c2.tampar();
        c2.rabiscar();
        c2.destampar();
        c2.rabiscar();
        c1.status();
        c2.status();
        
        
        Garrafa g1 = new Garrafa("plastico", true, 1000);
        g1.status();
        g1.destampar();
        g1.tomar();
        g1.status();
        g1.tampar();
        g1.status();
        
        
        
    }
}
