/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodo;

/**
 *
 * @author mario
 */
public class pruebaNodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        listaLigadaADT<Integer> head = new listaLigadaADT();
        
        head.agregarAlInicio(20);
        head.agregarAlInicio(5);
        head.agregarAlInicio(90);
        head.agregarAlInicio(80);
        head.agregarAlInicio(70);
        head.agregarAlFinal(10);
        
        System.out.println("La lista esta vacia: " + head.estaVacio());
        
        System.out.println("Mostrar lista: ");
        
        head.transversal();
        
        System.out.println(" ");
        
        System.out.println("Tamanio de la lista: "+ head.getTamanio());
        
        System.out.println("Agregar despues: ");
        
        head.agregarDespuesDe(20, 45);
        
        head.transversal();
        
        System.out.println(" ");
        
        System.out.println("¿En que posicion se encuentra el 5? En la posicion: "+head.buscar(5)); 
        
        System.out.println("Eliminar el primero: ");
        
        head.eliminarElPrimero();
        
        head.transversal();
        
        System.out.println(" ");
        
        System.out.println("Actualizar: ");
        
        head.actualizar(5, 15);
        
        head.transversal();
        
        System.out.println(" ");
        
        System.out.println("Eliminar la posicion 2: ");
        
        head.eliminar(2);
        
        head.transversal();
        
        System.out.println(" ");
        
        System.out.println("Eliminar el final: ");
        
        head.eliminarElFinal();
        
        head.transversal();
      
    }
}
