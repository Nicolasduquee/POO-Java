package beans.aula02;

public class Caneta {
    public String modelo;
    private double ponta;
    private boolean tampada;
    

    public Caneta(String modelo, double ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = true;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void  setModelo(String m){
        this.modelo = m;
    }
    
    public double getPonta(){
        return ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }
    
    public boolean getTampada(){
        return tampada;
    }
    
    public void tampar (){
        this.tampada = true;
    }
    
    public void destampar (){
        this.tampada = false;
    }

    @Override
    public String toString() {
        return "\nCaneta\n" + "modelo = " + modelo + "; \nponta = " + ponta + "; \ntampada = " + tampada + ".\n";
    }
    
    
    
    
}
