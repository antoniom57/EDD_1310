/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasconprioridad;

/**
 *
 * @author mario
 */
public class ColasConPrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        colasConPrioridadADT<String> cola = new colasConPrioridadADT<String>(7);
        queue.enqueue(0, "niños");
        queue.enqueue(0, "niñas");
        queue.enqueue(1, "tercera edad");
        queue.enqueue(2,"mujeres");
        queue.enqueue(3, "hombres");
        queue.enqueue(4,"velero");
        queue.enqueue(4,"maestro marinero");
        queue.enqueue(5,"timonel");
        queue.enqueue(6,"maestre");
        queue.enqueue(7,"capitan");
        
        System.out.println("¿la cola esta vacia?: "+cola.isEmpty());
        System.out.println("tamaño de la cola: "+cola.length());
        System.out.println("dequeue: " + cola.dequeue());
        
    }
    
}
