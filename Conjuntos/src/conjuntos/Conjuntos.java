
package conjuntos;



/**
 *
 * @author mario
 */
public class Conjuntos {

    
    public static void main(String[] args) {
        
        
        
        
        Conjunto con1 = new Conjunto();
        
        con1.agregar("a");
        con1.agregar("c");
        con1.agregar("h");
        con1.agregar("d");
        con1.agregar("m");
        con1.agregar("o");
        con1.agregar("ñ");
        con1.agregar("w");
        
        /**for(int i = 0; i<con1.tamanio(); i++){
            System.out.println(con1.iterador().next());
        }
        */
        
        
        Conjunto con2 = new Conjunto();
        
        con2.agregar("a");
        con2.agregar("j");
        con2.agregar("l");
        con2.agregar("o");
        con2.agregar("m");
        con2.agregar("p");
        
        
        System.out.println("Tamaño del conjunto 1: " + con1.tamanio());
        
        System.out.println("Tamaño del conjunto 2: " + con2.tamanio());
        
        System.out.println("¿El conjunto 1 contiene a? " + con1.contiene("a"));
        
        System.out.println("¿El conjunto 2 contiene k? " + con2.contiene("k"));
           
        System.out.println("¿El conjunto 1 esta dentro del conjunto 2? " + con2.subconjunto(con1));
        
        System.out.println("El tamaño de la union del conjunto 1 y 2 es:  " + con1.union(con2).tamanio());
        
        System.out.println("El tamaño de la interseccion del conjunto 1 y 2 es: " +con2.interseccion(con1).tamanio());
        
        System.out.println("El tamaño de la diferencia del conjunto 1 y 2 es: " +con2.diferencia(con2).tamanio());
        
        con1.eliminar("a");
        
        System.out.println("¿El conjunto 1 contiene a? " + con1.contiene("a"));

        System.out.println("¿El conjunto 1 y 2 tienen los mismos elementos? "+con1.iterador().equals(con2));
       
        
       
        
        
                
        
        
        
        
        
        
        
        
        
        
    }
    
}
