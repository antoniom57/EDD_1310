/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajadores;

import adts.Arreglo;

/**
 *
 * @author mario
 */
public class Empleado {
    public static final double VALOR_HORAS_EXTRA = 276.5;
    public static final double PRESTACION_ANTIGUEDAD = 0.03;
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtra;
    private double sueldoBase;
    private int anioIngreso;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, int horasExtra, double sueldoBase , int anioIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", horasExtra=" + horasExtra + ", sueldoBase=" + sueldoBase +  ", anioIngreso=" + anioIngreso + '}';
    }
    
    public double calcularSueldo(){
        double prestacion=(2022-this.anioIngreso)*this.PRESTACION_ANTIGUEDAD*this.sueldoBase;
        double he = this.horasExtra * this.VALOR_HORAS_EXTRA;
        return this.sueldoBase + prestacion + he;
    }
    
    /*public void obtener_max_min(){
        
        
        Empleado emplemax;
        Empleado emplemin;
        
        int min=2999999;
        int max=0;
        
        for(Empleado t : Trabajador){
            if(t.getAnioIngreso()>max){
                max=t.getAnioIngreso();
                emplemax=t;
            }
            if(t.getAnioIngreso()<min){
                min=t.getAnioIngreso();
                emplemin=t;
                
            }
            
            System.out.println(emplemax);
            System.out.println(emplemin);
        }*/
        
        
        
        
        
        
        
        
        
    }

