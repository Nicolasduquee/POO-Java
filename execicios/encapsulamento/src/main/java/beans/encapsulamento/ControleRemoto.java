/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.encapsulamento;

/**
 *
 * @author Nicolas Duque
 */
public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado, tocando, menuAberto;

    //contrutor
    public ControleRemoto() {
        volume = 0;
        ligado = false;
        tocando = false;
        menuAberto = false;
    }
    
    //getters e setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    public boolean isMenuAberto() {
        return menuAberto;
    }

    public void setMenuAberto(boolean menuAberto) {
        this.menuAberto = menuAberto;
    }
    
    //metodos
    @Override
    public void ligar(){
        setVolume(50);
        setLigado(true);
        setTocando(true);
    }
    
    @Override
    public void desligar(){
        setVolume(0);
        setLigado(false);
        setTocando(false);  
    }
    
    @Override
    public void abrirMenu(){
        setMenuAberto(true);
    }
    
    @Override
    public void fecharMenu(){
        setMenuAberto(false);
    }
    
    @Override
    public void maisVolume(){
        if (isTocando() == false){
            setTocando(true);
            return;
        }
        
        if (getVolume() == 100)System.out.println("O volume esta no maximo!");
        else setVolume(getVolume() + 10);
    }
    
    @Override
    public void menosVolume(){
        if (isTocando() == false){
            setTocando(true);
            return;
        }
        if(getVolume() == 0) System.out.println("O volume esta no minimo!");
        else setVolume(getVolume() - 10);
    }
    
    @Override
    public void ligarMudo(){
        if (isTocando() == false) System.out.println("Televisao ja esta no mudo!");
        else setTocando(false);
    }
    
    @Override
    public void desligarMudo(){
        if (isTocando() == true) System.out.println("Televisao ja esta tocando!");
        else setTocando(true);
    }
    
    //toString

    @Override
    public String toString() {
        return """
               -----------------------
               
               ControleRemoto
               
               volume =""" + volume + ";\nligado = " + ligado + ";\ntocando = " + tocando + ";\nmenuAberto = " + menuAberto;
    }
    
    
    
    
    
    
}
