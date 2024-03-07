
package com.mycompany.aula0;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor + ", do modelo " + this.modelo + ", com ponta" + this.ponta +"mm");
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Qual sua carga? " + this.carga);
    }
    
    void rabiscar(){
        if (tampada == true){
            System.out.println("Nao posso rabiscar, caneta tampada!");
        }else{
            System.out.println("Rabiscando...");
            carga -= 10;
    }
        
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
