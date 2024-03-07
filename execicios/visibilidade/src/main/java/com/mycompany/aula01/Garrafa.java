
package com.mycompany.aula01;


public class Garrafa {
    public String material;
    public boolean tampada;
    private final int capacidade;
    protected int quantidade;

   public Garrafa(String material, boolean tampada, int capacidade) {
       this.material = material;
       this.tampada = tampada;
       this.capacidade = capacidade;
       this.quantidade = capacidade;
    }
    public void status(){
        System.out.println("Mateiral: " + this.material);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Quantidade: " + this.quantidade);
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
    
    public void tomar(){
        if (tampada == true){
            System.out.println("Impossivel tomar, garrafa tampada.");
        }else{
            System.out.println("Tomando...");
            this.quantidade -=10;
        }
        
        
    }
    
    
}
