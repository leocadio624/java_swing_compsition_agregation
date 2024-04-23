
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
import java.util.ArrayList;
public class grupo {
    
private String nombre;
private ArrayList<contacto> Invitados= new ArrayList<contacto>();

    

    public grupo(){
    this(" ");
    }
    public grupo(String nombre){
    this.nombre=nombre;
    //this.edad=edad;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public String getNombre(){
    return nombre;
    }
    

    
 
    
    
    
    public void copiaContacto(contacto p){
    //p.nombre=this.nombre;
    //p.edad=this.edad;
    }
    
    public void addInvitado(String nombre,String correo){
    contacto n=new contacto(nombre,correo);
    Invitados.add(n);
    
    }
    
    public int getSizeInvitado(){
    return this.Invitados.size();
    }
    public ArrayList getInvitado(){
    return this.Invitados;
    }
    
    public void destruir(){
    nombre=null;
    System.gc();
    }
    
    @Override
    public String  toString(){
    return "\nNombre: "+nombre+"\n";
    }
    
    public String  imprimeInvitados(){
        //System.out.println("Invitados:");
        String str=" ";
        
     for(int i=0;i<Invitados.size();i++)str=str+"\n"+Invitados.get(i).toString();
     
     return str;
    }
    
    
    
 
    
}