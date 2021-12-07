/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer01;

/**
 *
 * @author IFSC
 */
public class Computador {
    public static void main(String[] args) {
        Processamento processo = new Processamento();
        
        processo.ligarPC(8, "GTX 1660 TI", 16, 500);
        processo.imprimeDados();
    }
    
}
