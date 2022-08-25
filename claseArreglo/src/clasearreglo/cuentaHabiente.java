/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasearreglo;

/**
 *
 * @author mario
 */
public class cuentaHabiente {
    private String nombre;
    private int idCliente;
    private int saldo;

    public cuentaHabiente() {
    }

    public cuentaHabiente(String nombre, int idCliente, int saldo) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.saldo = saldo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "cuentaHabiente{" + "nombre=" + nombre + ", idCliente=" + idCliente + ", saldo=" + saldo + '}';
    }
    
  
}
