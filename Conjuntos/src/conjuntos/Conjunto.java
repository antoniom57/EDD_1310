package conjuntos;

import conjuntos.interfaz;
import java.util.*;


public class Conjunto implements interfaz {
    private Object[] datos;     
    private int nElems;         

    
    public Conjunto() {
	this(20);
    }

    
    public Conjunto(int tam) {
	datos = new Object[tam <= 0 ? 20 : tam];
	for (int i = 0; i < datos.length; i++)
	    datos[i] = null;
	nElems = 0;
    }

    
    public Conjunto(Conjunto c) {
	datos = new Object[c.datos.length];

	for (int i = 0; i < c.datos.length; i++)
	    datos[i] = c.datos[i];
	nElems = c.nElems;
    }

    
    public boolean estaVacio(){ 
	return nElems == 0;
    }

    
    public int tamanio(){ 
	return nElems;
    }

    
    public void vaciar(){ 
	nElems = 0;
    }

    
    public boolean contiene (Object elem){
	if (!estaVacio())
	    for (int i = 0; i < nElems; i++)
		if (elem.equals(datos[i]))
		    return true;
	return false;
    }

    
    public void eliminar(Object elem) { 
	if (!estaVacio())
	    for (int i = 0; i < nElems; i++) 
		if (elem.equals(datos[i])){
			datos[i] = datos[nElems--];
		    return;
		}
    }

    
    public void agregar(Object elem){
	if (nElems >= datos.length)
	    crecerArreglo();
	if (! contiene(elem)) {
	    datos[nElems++] = elem;
	}
    }

    private void crecerArreglo() {
	int tamanoNuevo =datos.length + 10;
	Object[] arregloNuevo = new Object[tamanoNuevo];
	
	for (int i = 0; i < nElems; i++)
	    arregloNuevo[i] = datos[i];
	datos = arregloNuevo;
    }

    
    public Iterator iterador () {
	return new miIterador();
    }

   
    private class miIterador implements Iterator {
	private int pos;       

	public miIterador(){   
	    pos = 0;
	}

	
	public boolean hasNext() { 
	    return (pos < nElems);
	}

	
	public Object next() throws NoSuchElementException {
	    if (hasNext()) 
		return datos[pos++];
	    throw new NoSuchElementException("No hay elementos en el conjunto");
	}
    
	
	public void remove() throws UnsupportedOperationException,
                                IllegalStateException {
	    throw new UnsupportedOperationException();
	}
    }

   
    public Conjunto union(interfaz c) {
	Conjunto cUnion = new Conjunto(this);
	Iterator it = c.iterador();
	while(it.hasNext())  {
	    cUnion.agregar(it.next());
	}
	return cUnion;
    }

    
    public Conjunto interseccion(interfaz c) {
	Conjunto cInterseccion = new Conjunto(this);

	Iterator it = iterador();
	while (it.hasNext()) {
	    Object elemento = it.next();
	    if (!c.contiene(elemento))
		cInterseccion.eliminar(elemento);
	}
	return cInterseccion;
    }

    
    public Conjunto diferencia(interfaz c) {
	Conjunto cMenos = new Conjunto(this);
	Iterator it = iterador();

	while (it.hasNext()) {
	    Object elemento = it.next();
	    if (c.contiene(elemento))
		cMenos.eliminar(elemento);
	}
	return cMenos;
    }

    
    public boolean subconjunto(interfaz c) {
	Iterator it = iterador();
	while (it.hasNext())
	    if (!c.contiene(it.next()))
		return false;
	return true;
    }
}
