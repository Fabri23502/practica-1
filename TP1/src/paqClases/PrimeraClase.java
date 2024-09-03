/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author fabri
 */
public class PrimeraClase {
    
    String unaCadena;
    int unEntero;
    
    void mostrar(){
        System.out.println("Atributos: " + unaCadena + " y " + unEntero);
        
    }
    
    public static void main(String[] args) {
        
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();  
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Escritorio";
        unObjeto2.unEntero = 6;
        unObjeto3.unaCadena = "hola";
        unObjeto3.unEntero = 8;
        unObjeto4.unaCadena = "chau";
        unObjeto4.unEntero = 2;
        unObjeto5.unaCadena = "adios";
        unObjeto5.unEntero = 9;
        
        unObjeto1.mostrar();
        unObjeto2.mostrar();
        unObjeto3.mostrar();
        unObjeto4.mostrar();
        unObjeto5.mostrar();
        System.out.println("\n");
        
        
        ArrayList<PrimeraClase> ListaObjetos = new ArrayList<>();
        ListaObjetos.add(unObjeto1);
        ListaObjetos.add(unObjeto2);
        ListaObjetos.add(unObjeto3);
        ListaObjetos.add(unObjeto4);
        ListaObjetos.add(unObjeto5);
        
        for(PrimeraClase objeto : ListaObjetos){
            objeto.mostrar();
        }
        
        
        
    }
    
    
}
