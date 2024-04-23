/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class contacto {
    
   private String nombre;
   private String correo;
   
   
    public contacto (){
   
    }
    public contacto(String nombre){
        this.nombre=nombre;
    
    }
    public contacto(String nombre, String correo){
    this.nombre=nombre;
    this.correo=correo;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
   
   
   public String getCorreo(){
   return correo;
   }
   
   public void setCorreo(String correo){
   this.correo=correo;
   } 
   
    
    
    @Override
    public String toString(){
    return "\nCorreo: "+nombre+"\nCorreo invitado:"+correo;   
    }
    
    
    
    
    
}

