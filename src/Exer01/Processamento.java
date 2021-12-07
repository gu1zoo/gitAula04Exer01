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
public class Processamento {
    private CPU cpu;
    private VGA vga;
    private RAM ram;
    private HD hd;

    public void ligarPC(int nucleos, String modelo, int quantidade, int armazenamento) {
        cpu = new CPU(nucleos);
        vga = new VGA(modelo);
        ram = new RAM(quantidade);
        hd = new HD(armazenamento);
    }
    
    public void imprimeDados(){
        System.out.println("Nucleos: "+cpu.getNucleos());
        System.out.println("VGA: "+vga.getModelo());
        System.out.println("RAM: "+ram.getQuantidade()+"GB");
        System.out.println("Armazenamento: "+hd.getArmazenamento()+"GB");
    }
    
    
}
