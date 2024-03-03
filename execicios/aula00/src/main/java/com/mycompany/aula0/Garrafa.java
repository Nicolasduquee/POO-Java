package com.mycompany.aula0;


public class Garrafa {
    String material;
    boolean tampada;
    int capacidade;
    int quantidade;

    public Garrafa(String material, boolean tampada, int capacidade) {
        this.material = material;
        this.tampada = tampada;
        this.capacidade = capacidade;
        this.quantidade = capacidade;
    }
    void status(){
        System.out.println("Mateiral: " + this.material);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Quantidade: " + this.quantidade);
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
    void tomar(){
        if (tampada == true){
            System.out.println("Impossivel tomar, garrafa tampada.");
        }else{
            System.out.println("Tomando...");
            this.quantidade -=10;
        }
        
        
    }
    
    
}

