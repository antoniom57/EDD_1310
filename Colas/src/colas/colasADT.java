/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class colasADT<T> {
    ArrayList<T> queue = new ArrayList<>();
    private int first;

    public colasADT() {
    }
    
    public void enqueue(T element){
        queue.add(element);
        first++;
    }
    
    public boolean isEmpty(){
        return this.queue==null;
    }
    
    public void dequeue(){
        queue.remove(0);
        first--;
    }
    
    public int lenght(){
        return this.first;
    }
    
    @Override
    
    public String toString(){
        String estado = "";
        
        for (T dato : queue) {
            estado += dato + " <-- " + " " ;             
        }
        return estado;
    }
}
