/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GERARD
 */
public class libroController {
    
    libro[] tablaLibros;
    int indiceArray;
    
    
    
    
     public libroController(){
    
        this.tablaLibros= new libro[100];
        this.indiceArray = 0;
    
    }
    
    
     
     public void guardarLibros(libro librog){
    this.tablaLibros[this.indiceArray]=librog;
        this.indiceArray=this.indiceArray + 1;
   
    }
    
    
    public libro[] getLibros(){
    return this.tablaLibros;
      
    }
     
     
     
    
}
