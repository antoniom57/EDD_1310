/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

/**
 *
 * @author mario
 */
public class tablasHashADT {
    private int key;
    private int tableSize;
    private String valor;
    private int index;
    
    Object lista[];
    
    public tablasHashADT(int tableSize){
        this.tableSize=tableSize;
        lista= new Object[tableSize];
    }

    public void add(int key, String valor){
        this.key=key;
        this.valor=valor;
        this.index = key % tableSize;
        lista[index]=valor;
    }
    
    public void valueOf(int key){
        this.index = key % tableSize;
        System.out.println(lista[index]);
    }
    
    public void remove(int key){
        this.index = key % tableSize;
        lista[index]=null;
    }
    
    
    
}
