/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

/**
 *
 * @author mario
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pilasADT<String> pila = new pilasADT<>();
        
        pila.push("Raul");
        pila.push("Laura");
        pila.push("Rene");
        pila.push("Nayeli");
        pila.push("Donaji");
        
        System.out.println("¿La pila esta vacia? " + pila.isEmpty());
        
        System.out.println("pop(): " + pila.pop());
        
        System.out.println("peek(): " + pila.peek());
        
        System.out.println("toString: " + pila.toString());
    }
    
}
