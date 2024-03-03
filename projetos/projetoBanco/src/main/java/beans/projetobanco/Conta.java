package beans.projetobanco;


public class Conta {
    //atributos
    public final String numConta;
    protected String nomeCliente;
    private final String tipoConta;
    private float saldo;
    private boolean statusConta;
    
    //contructor
    public Conta(String numConta, String nomeCliente, String tipoConta) {
        this.statusConta = true;
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        
        if (tipoConta.equals("CC")){
            this.saldo = 50;
        }else if (tipoConta.equals("CP")){
            this.saldo = 150;
        }
    }
    
    //getters and setters  
    public String getNumConta(){
        return numConta; 
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //metodos  
    public float sacar (float valor){
        saldo -= valor;
        return saldo;
    }
    
    public float depositar (float valor){
        saldo += valor;
        return saldo;
    }
    
    public float pagaMes(){
        saldo -= 12;
        return saldo;
    }
    
    public boolean fecharConta(){
        statusConta = false;
        return statusConta;
    }
   
    //toString

    @Override
    public String toString() {
        return """
               
                Informacoes da Conta 
               
               Numero da conta: """  + numConta + ";\nNome do Cliente: " + nomeCliente + "\nTipo de Conta: " + tipoConta + ";\nSaldo: " + saldo + ";\nStatus da conta: " + statusConta + ".";
    }

    
    
}
