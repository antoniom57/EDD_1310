/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

/**
 *
 * @author mario
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       tablasHashADT lista = new tablasHashADT(35);
       lista.add(77, "Monse");
       lista.add(145,"Maria");
       lista.add(70, "Juan");
       lista.add(38, "Luis");
       lista.add(78, "Julia");
       
        System.out.println("Imprimiendo el valor dada una llave: ");
       
       lista.valueOf(77);
       lista.valueOf(145);
       lista.valueOf(70);
       lista.valueOf(38);
       lista.valueOf(78);
       
        System.out.println("Eliminando un valor dada la llave: ");
        
        lista.remove(70);
        lista.valueOf(70);
       
       
    }
    
}
