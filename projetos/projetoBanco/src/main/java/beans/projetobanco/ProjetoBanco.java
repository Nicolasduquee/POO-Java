
package beans.projetobanco;

//import java.util.Scanner;

public class ProjetoBanco {

    public static void main(String[] args){
        
        //criando objeto na classe de contas
        Conta c1 = new Conta("1", "Nicolas Duque");
        c1.abrirConta("CC");

        Conta c2 = new Conta("2", "Maria Clara");
        c2.abrirConta("CP");

        c1.sacar(50);
        c2.sacar(150);

        c1.depositar(200);
        c1.depositar(150);

        c1.pagaMes();
        c2.pagaMes();

        c1.fecharConta();
        c2.fecharConta();

        System.out.println(c1.toString());

        System.out.println(c2.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}