/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaula2;

import beans.Figura2D;
import beans.Objeto2D;
import beans.Ponto2D;
import beans.Quadrado;
import beans.SegmentoReta;

/**
 *
 * @author aluno
 */
public class POOaula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto2D p0 = new Ponto2D(2, 3.5);
        Ponto2D p1 = new Ponto2D(7,1.5);
        Objeto2D segReta = new SegmentoReta(p0,p1);
        Figura2D quadrado = new Quadrado(p1, 2);
        System.out.println(quadrado);
    }
    
}
