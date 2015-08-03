/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpractica1;

import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Jnodo extends JLabel{
    public String nombre;
    Jnodo siguiente,anterior;
    
    public Jnodo(String nomb){
        this(nomb,null,null);
    }
    
    public Jnodo(String nombre, Jnodo sig,Jnodo ant){
        this.nombre = nombre;
        this.siguiente = sig;
        this.anterior = ant;
    }
}
