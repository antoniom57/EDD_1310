/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajadores;

import adts.Arreglo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author mario
 */
public class NominaADT {
    String nombreEmpresa;
    Arreglo<Empleado> nomina;
    String rutaArchivo;
    
    
    public NominaADT(String ruta) {
        this.rutaArchivo=ruta;
        try{
        BufferedReader datos = new BufferedReader(new FileReader("C:\\Users\\mario\\OneDrive\\Documentos\\NetBeansProjects\\empresa\\src\\empresa\\junio.dat"));
        datos.readLine();
        String linea1 = null;
        
        while ((linea1=datos.readLine())!= null){
            
            String coma[] = linea1.split(",");
            Empleado a = new Empleado();
            a.setId(Integer.parseInt(coma[0]));
            a.setNombre(coma[1]);
            a.setPaterno(coma[2]);
            a.setMaterno(coma[3]);
            a.setHorasExtra(Integer.parseInt(coma[4]));
            a.setSueldoBase(Integer.parseInt(coma[5]));
            a.setAnioIngreso(Integer.parseInt(coma[6]));
            System.out.println(a);
            System.out.println("Sueldo: " + a.calcularSueldo());
            
             
            
        }   
        } catch(FileNotFoundException ex){
            System.err.println(ex.getMessage());
        } catch(IOException ex){
            System.err.println(ex.getMessage());
        } 
        
        
        
    }
    
    
    
        
    }

    
