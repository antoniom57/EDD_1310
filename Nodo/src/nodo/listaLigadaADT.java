/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo;

/**
 *
 * @author mario
 */
public class listaLigadaADT<T> {
    private T dato;
    private listaLigadaADT<T> head;
    
   
   
    public listaLigadaADT() {
    }

    public listaLigadaADT(T valor) {
        this.dato = valor;
    }

    public listaLigadaADT(T dato, listaLigadaADT<T> siguiente) {
        this.dato = dato;
        this.head = siguiente;
    }

    public listaLigadaADT<T> getSiguiente() {
        return head;
    }

    public void setSiguiente(listaLigadaADT<T> siguiente) {
        
        this.head = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public boolean estaVacio(){
        return this.head==null;
    }
    
    public int getTamanio(){
        int cont = 0;
        listaLigadaADT<T> aux = head;
        while(aux != null){
            aux=aux.getSiguiente();
            cont++;
        }
        return cont;
    }
    
    public void agregarAlFinal(T valor){
        if(this.head == null){
            head=new listaLigadaADT<>(valor);  
        }else{
            listaLigadaADT<T> nuevo = new listaLigadaADT(valor);
            listaLigadaADT<T> aux = head;
            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
           aux.setSiguiente(nuevo);  
        }
    }
    
    public void agregarAlInicio(T valor){
        if(head==null){
            head=new listaLigadaADT<>(valor); 
        }else{
            listaLigadaADT<T> nuevo = new listaLigadaADT(valor);
            nuevo.setSiguiente(head);
            head=nuevo;
        }
    }
    
    public void agregarDespuesDe(T dato, T valor){
        if(head==null){
            head=new listaLigadaADT<>(valor); 
        }else{
           listaLigadaADT<T> aux = head;
           while(aux.getSiguiente()!=null && aux.getDato()!= dato){
               aux=aux.getSiguiente();
           }
           listaLigadaADT<T> nuevo = new listaLigadaADT<>(valor, aux.getSiguiente());
           aux.setSiguiente(nuevo);
        }
    }
    
    public int buscar(T dato){
        int cont = 0;
        listaLigadaADT<T> aux = head;
        
        while(aux != null){
            if(aux.getDato() == dato){
            break;
            }else{
                aux=aux.getSiguiente();
                cont++;
            } 
        }
        
        return cont+1;
    }
    
    
    public void actualizar(T a_buscar, T valor){
        listaLigadaADT<T> aux = head;
        while(aux != null && aux.getDato()!= a_buscar){
            aux=aux.getSiguiente();
        }
        
        aux.setDato(valor);
    }
    
    
    
    public void eliminarElPrimero(){
         head=head.getSiguiente();
         
     }
    
    public void eliminarElFinal(){
        listaLigadaADT<T> nuevo = null;
        listaLigadaADT<T> aux = head;
        
        while(aux.getSiguiente()!=null){
            nuevo=aux;
            aux=aux.getSiguiente();
            
        }
       nuevo.setSiguiente(null);
         
    }
    
    public void eliminar(int posi){
         int index = 1;
         listaLigadaADT<T> nuevo = null;
         listaLigadaADT<T> aux = head;
         while(aux.getSiguiente()!=null && index < posi){
             nuevo = aux;
             aux=aux.getSiguiente();
             index++;
         }
         nuevo.setSiguiente(aux.getSiguiente());
     }
    
    
    
    public void transversal(){
        
        listaLigadaADT<T> aux = head;
        while (aux != null) {
            
            System.out.print("|"+aux.dato+"| -->");
            
            aux = aux.getSiguiente();
        }
    }

    @Override
    public String toString() {
        
        return "|"+dato+"| -->"; 
    }
   
}
