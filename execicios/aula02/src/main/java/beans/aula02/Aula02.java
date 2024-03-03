package beans.aula02;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("Bic", 0.7);
        
        System.out.println(c1.toString());
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o modelo da caneta?");
        String m = leitor.next();
        c1.setModelo(m);

        System.out.println("Qual o modelo da ponta?");
        String po = leitor.next(); 
        double p = Double.parseDouble(po);
        c1.setPonta(p);
        
        System.out.println("Caneta esta tampada? s/n");
        String t = leitor.next();
        if (t.equals("s")){
            c1.tampar();
        }else{
            c1.destampar();
        }

        leitor.close();
        
        System.out.println(c1.toString());

    }
}
