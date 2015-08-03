/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpractica1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JListaDoble{
    private Jnodo inicio,fin;
   
    public JListaDoble(){
        inicio= fin = null;
    }
    public boolean listavacia(){
        return inicio==null;
    }
    //se agrega al fin
    public void insertarFin(String nomb){
        if(!listavacia()){
            fin  = new Jnodo(nomb, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio=fin=new Jnodo(nomb);
        }
    }
    //se agrega al inicio
    public void insertarInicio(String nomb){
        if(!listavacia()){
            inicio  = new Jnodo(nomb, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio=fin=new Jnodo(nomb);
        }
    }
    
    public void eliminarNodo(Jnodo var){
        if(!listavacia())
        {
            
        }
    }
    public void mostrarInicio(){
        if(!listavacia()){
            String impri="";
            Jnodo aux = inicio;
            while(aux!=null){
                impri+=aux.nombre+"<-- ";
                aux=aux.siguiente;
            }
            JOptionPane.showMessageDialog(null, impri,
                    "lista inicio", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    public void mostrarFinal(){
        if(!listavacia()){
            String impri="";
            Jnodo aux = fin;
            while(aux!=null){
                impri+=aux.nombre+" -->";
                aux=aux.anterior;
            }
            JOptionPane.showMessageDialog(null, impri,
                    "lista final", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    /*
    public String imprimirLista(){
        String salida="";
        Jnodo aux;
        aux = inicio;
        while(aux!=null){
            salida += aux.nombre+"   ";
            aux=aux.siguiente;
        }
        return salida;
    }*/
}

class Nodo { 
// variables de cada nodo de la lista 
Nodo sig, ant; // referencias al anterior y al siguiente nodo 
} 
// Crear la lista 
class Lista { 
Nodo cab, fin; 
Lista () { 
cab = fin = null; 
} 
// agregar un nodo al final 
void agregarFinal (Nodo n) { 
n.sig = null; 
if (cab == null) 
cab = n; 
else { 
n.ant = fin; 
fin.sig = n; 
} 
fin = n; 
} 
// agregar un nodo al principio 
void agregarPrincipio (Nodo n) { 
n.ant = null; 
if (cab == null) 
fin = n; 
else { 
n.sig = cab; 
cab.ant = n; 
} 
cab = n; 
} 
// agregar el nodo n despues de n1 
void agregarDespues (Nodo n, Nodo n1) { 
n.ant = n1; 
n.sig = n1.sig; 
n1.sig = n; 
if (n.sig != null) 
n.sig.ant = n; 
else 
fin = n; 
} 
// eliminar un nodo 
void eliminar (Nodo n) { 
if (n == cab) 
cab = n.sig; 
else 
if (n == fin) 
fin = fin.ant; 
else { 
n.ant.sig = n.sig; 
n.sig.ant = n.ant; 
} 
} 
} 
