/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conjuntos;

/**
 *
 * @author mario
 */
public interface interfaz {
    
     
  public boolean estaVacio();
    
  public int tamanio();
    
  public void vaciar();
    
  public void agregar(Object elemento);
    
  public void eliminar(Object elemento);
    
  public boolean contiene (Object elemento);
    
  public interfaz union(interfaz c1);
    
  public interfaz interseccion(interfaz c1);
    
  public interfaz diferencia(interfaz c1);
    
  public boolean subconjunto(interfaz c1);
    
  public java.util.Iterator iterador();
}


    

