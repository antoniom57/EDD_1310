/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

/**
 *
 * @author mario
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        colasADT<Integer> cola = new colasADT<>();
        
        cola.enqueue(12);
        cola.enqueue(45);
        cola.enqueue(76);
        cola.enqueue(34);
        
        System.out.println("¿La cola esta vacia?: " + cola.isEmpty());
        
        System.out.println("Tamanio de la cola: " + cola.lenght());
        
        System.out.println(cola.toString());
        
        System.out.println("Probando dequeue: ");
        
        cola.dequeue();
        
        System.out.println(cola.toString());
        
        System.out.println("Tamanio de la cola: " + cola.lenght());
              
    }
    
}
