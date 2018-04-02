/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201700857;

/**
 *
 * @author Bminas
 */
public class usuario_201700857 {
    public String ID;
    public String Nombre;
    public String Apellido;
    public String User;
    public String Rol;
    public String Password;
    
  
    
    public usuario_201700857(String i,String n,String a,String u,String r,String p){
    this.ID=i;
    this.Nombre=n;
    this.Apellido=a;
    this.User=u;
    this.Rol=r;
    this.Password=p;  
}
    public String mostrar_datos(){
        String datos = "Los datos del usuario ID: "+ID+" Nombre: "+Nombre+" Usuario: "+User+" Rol: "+Rol+" Contraseña: "+Password;
        return datos;
    }
    public String obtener_DPI(){
        String Id1=ID;
        return Id1;
    }
    public String obtener_nombre(){
        String user1=Nombre;
        return user1;
    }
    public String obtener_apellido(){
        String apel1=Apellido;
        return apel1;
    }
    public String obtener_pass(){
        String pass1=Password;
        return pass1;
    }
    public String obtener_user(){
        String user1=User;
        return user1;
    }
    public String obtener_rol(){
        String rol1=Rol;
        return rol1;
    }
    public void set_id(String id){
        this.ID=id;
    }
    public void set_nombre(String nom){
        this.Nombre=nom;
    }
    public void set_apellido(String ap){
        this.Apellido=ap;
    }
    public void set_user(String us){
        this.User=us;
    }
    public void set_rol(String r){
        this.Rol=r;
    }
    public void set_pass(String p){
        this.Password=p;
    }
}
