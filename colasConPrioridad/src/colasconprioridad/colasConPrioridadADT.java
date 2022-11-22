/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasconprioridad;




/**
 *
 * @author mario
 */
public class colasConPrioridadADT<T> {
    private nodoCola<T>[] prioridad;
    private int tamaño, length;

    public colasConPrioridadADT(int tamaño) {
        prioridad = new nodoCola[tamaño];
        this.tamaño = tamaño;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueue(int priority, T valor) {
        
        prioridad[priority].enqueue(valor);
        length++;
    }

    public T dequeue() {
        for(int i = 0; i < tamaño; i++) {
            if(prioridad[i] != null && !prioridad[i].isEmpty()) {
                length--;
                return prioridad[i].dequeue();
            }
        }

        return null;
    }

    public T front() {
      for(int i = 0; i < tamaño; i++) {
            if(prioridad[i] != null && !prioridad[i].isEmpty()) {
                return prioridad[i].front();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String m = "";
        for(int i = 0; i < tamaño; i++) {
            m += i + ": ";
            if (prioridad[i] != null && !prioridad[i].isEmpty()) {
                m += prioridad[i] + "\n";
            } else {
                m += "null\n";
            }
        }
        return m;
    }
}
