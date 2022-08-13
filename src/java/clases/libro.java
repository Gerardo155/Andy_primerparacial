/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author GERARD
 */
public class libro {
    
    String Codigo;
    String Nombre;
    String Pasta;
    String Editorial;
    String Año;

    
     public libro(String codigo, String nombre, String pasta, String editorial, String año){
   
       this.Codigo=codigo;
       this.Nombre=nombre;  
       this.Pasta=pasta;
       this.Editorial=editorial;
       this.Año=año;
      
      
   } 
    
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPasta() {
        return Pasta;
    }

    public void setPasta(String Pasta) {
        this.Pasta = Pasta;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }
    
    
    
   
    
    
}
