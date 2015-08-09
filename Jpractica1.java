/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpractica1;

import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Jpractica1  {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
//        JListaDoble milista = new JListaDoble();
//        int opcion=0;
//        String elemento;
//        do{
//            try{
//                opcion =Integer.parseInt(JOptionPane.showInputDialog(null,
//                         "1. Agregar un nodo al inicio\n"
//                        +"2. Agregar un nodo al final\n"
//                        +"3. Mostrar la lista de inicio\n"
//                        +"4. Mostrar la lista de fin\n"
//                        +"5. Salir\n"
//                        +"Que Deseas Hacer?","Menu de opciones", JOptionPane.INFORMATION_MESSAGE));
//                
//                switch(opcion){
//                    case 1:
//                        elemento = JOptionPane.showInputDialog(null,
//                                                "Ingrese el elemento del nodo",
//                                                "Agregando nodo al inicio", 
//                                                JOptionPane.INFORMATION_MESSAGE);
//                        milista.insertarInicio(elemento);
//                        break;
//                    case 2:
//                        elemento = JOptionPane.showInputDialog(null,
//                                                "Ingrese el elemento del nodo",
//                                                "Agregando nodo al final", 
//                                                JOptionPane.INFORMATION_MESSAGE);
//                        milista.insertarFin(elemento);
//                        break;
//                    case 3:
//                        if(!milista.listavacia()){
//                            milista.mostrarInicio();
//                        }else{
//                            JOptionPane.showInputDialog(null,
//                                                "no hay nodos",
//                                                "lista vacia", 
//                                                JOptionPane.INFORMATION_MESSAGE);
//                        }
//                        break;
//                    case 4:
//                        if(!milista.listavacia()){
//                            milista.mostrarFinal();
//                        }else{
//                            JOptionPane.showInputDialog(null,
//                                                "no hay nodos",
//                                                "lista vacia", 
//                                                JOptionPane.INFORMATION_MESSAGE);
//                        }
//                        break;
//                    case 5:
//                        JOptionPane.showInputDialog(null,
//                                                "Aplicacion Finalizada",
//                                                "finnnn", 
//                                                JOptionPane.INFORMATION_MESSAGE);
//                        break;
//                    default:
//                        JOptionPane.showInputDialog(null,
//                                                "la opcion no existe",
//                                                "Error", 
//                                                JOptionPane.INFORMATION_MESSAGE);
//                        break;
//                }
//            }catch(NumberFormatException n){
//                JOptionPane.showMessageDialog(null, "Error "+n.getMessage());
//            }
//        }while(opcion!=5);
        
        JVentanaInicio miventana = new JVentanaInicio();
        miventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miventana.setVisible(true);
    }
    
}
