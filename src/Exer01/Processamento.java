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
    private GPU gpu;
    private RAM ram;
    private HD hd;

    public void ligarPC(int nucleos, String modelo, int quantidade, int armazenamento) {
        cpu = new CPU(nucleos);
        gpu = new GPU(modelo);
        ram = new RAM(quantidade);
        hd = new HD(armazenamento);
    }
    
    public void imprimeDados(){
        System.out.println("Nucleos: "+cpu.getNucleos());
        System.out.println("GPU: "+gpu.getModelo());
        System.out.println("RAM: "+ram.getQuantidade()+"GB");
        System.out.println("Armazenamento: "+hd.getArmazenamento()+"GB");
    }
    
    
}
