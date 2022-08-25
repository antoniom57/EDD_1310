/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasearreglo;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class ClaseArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<cuentaHabiente> lista=new ArrayList<cuentaHabiente>();
        
        lista.add(0, new cuentaHabiente("Alejandro Corona", 319145077, 10500));
        lista.add(0, new cuentaHabiente("Raul Jimenez", 319134037, 9000));
        lista.add(0, new cuentaHabiente("Paola Guerra", 31487927, 50000));
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.get(1));
        lista.clear();
        System.out.println(lista);
       
        
        
        
        
        
        
    }
    
}
