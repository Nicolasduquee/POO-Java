package beans.projetobanco;

public class Conta {
    //atributos
    public String numConta;
    protected String nomeCliente;
    private String tipoConta;
    private float saldo;
    private boolean statusConta;
    
    //contructor
    public Conta(String numConta, String nomeCliente) {
        this.setNumConta(numConta);
        this.setNomeCliente (nomeCliente);
    }
    
    //getters and setters  
    public String getNumConta(){
        return numConta; 
    }

    public void setNumConta (String numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatusConta(){
        return statusConta;
    }

    public void setStatusConta(boolean statusConta){
        this.statusConta = statusConta;
    }
    
    //metodos  
    public void sacar (float valor){
        if(this.getStatusConta() && this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso na conta de " + this.getNomeCliente());
        }else if(!this.getStatusConta()){
            System.out.println("Impossivel sacar de uma conta fechada!");
        }else if (this.getSaldo() < valor){
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void depositar (float valor){
        if(this.getStatusConta() == true){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Deposito realizado com sucesso na conta de " + this.getNomeCliente());
        }else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    
    public void pagaMes(){
        int valor =0;
        if (this.getTipoConta() == "CC") {
            valor = 12;
        }else if (this.getTipoConta() == "CP"){
            valor = 20;
        }

        if (this.getStatusConta()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga por " + this.getNomeCliente());
        }else {
        System.out.println("Impossivel pagar mensalidade de uma conta fechada!");
        }
    }

    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);

        float valor = 0;

        if (this.getTipoConta() =="CC"){
            valor = 50;
        }else if (this.getTipoConta() == "CP"){
            valor = 150;
        }

        this.setStatusConta(true);
        this.setSaldo (valor);
        System.out.println("Conta aberta com sucesso!");

    }
    
    public void fecharConta(){
        if (this.getSaldo() == 0) {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }else if (this.getSaldo() > 0) {
            System.out.println("Você não pode feixar sua conta pois seu saldo é positivo!");
        }else if (this.getSaldo() < 0) {
            System.out.println("Você não pode feixar sua conta pois seu saldo é negativo!");
        }
    }
   
    //toString
    @Override
    public String toString() {
        return """
               
                Informacoes da Conta 
               
               Numero da conta: """  + this.getNumConta() + ";\nNome do Cliente: " + this.getNomeCliente() + "\nTipo de Conta: " + this.getTipoConta() + ";\nSaldo: " + this.getSaldo() + ";\nStatus da conta: " + this.getStatusConta() + ".";
    }

    
    
}
