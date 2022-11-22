/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;


import java.util.ArrayList;

/**
 *
 * @author mario
 * @param <T>
 */
public class pilasADT <T>{
    ArrayList<T> datos = new ArrayList<>();
    private int top;

    public pilasADT() {
    }
    
    public void push(T dato){
        datos.add(dato);
        top++;
    }
    
    public int lenght(){
        return this.top;
    }
    
    public boolean isEmpty(){
        return this.datos==null;
    }
    
    public T pop(){
        T dato = datos.remove(top-1);
        top--;
        return dato;
    }
    
    public T peek(){
        T dato = datos.get(top-1);
        return dato;
    }
    
    @Override
    public String toString(){
        String estado = "";
        
        for (T dato : datos) {
            estado += dato + " ->" + " " ;             
        }
        return estado;
    }
}

