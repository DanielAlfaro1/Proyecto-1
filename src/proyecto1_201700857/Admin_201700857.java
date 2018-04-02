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
public class Admin_201700857 extends usuario_201700857 {
    
    public Admin_201700857(String i,String n,String a,String u,String r,String p){
        super(i,n,a,u,r,p);
    }
    
    @Override
    public String mostrar_datos(){
        String nueva;
        nueva = super.mostrar_datos();
        return nueva;
    }
//    @Override
//    public String obtener_nombre(){
//        String nomAd;
//        nomAd = super.obtener_nombre();
//        return nomAd;
//    }
//    @Override
//    public String obtener_pass(){
//        String passAd;
//        passAd=super.obtener_pass();
//        return passAd;
//    }
//    @Override
//    public String obtener_user(){
//        String userAd=super.obtener_user();
//        return userAd;
//    }
    @Override
    public String obtener_DPI(){
        String Id1=super.obtener_DPI();
        return Id1;
    }
    @Override
    public String obtener_nombre(){
        String user1=super.obtener_nombre();
        return user1;
    }
    @Override
    public String obtener_apellido(){
        String apel1=super.obtener_apellido();
        return apel1;
    }
    @Override
    public String obtener_pass(){
        String pass1=super.obtener_pass();
        return pass1;
    }
    @Override
    public String obtener_user(){
        String user1=super.obtener_user();
        return user1;
    }
    @Override
    public String obtener_rol(){
        String rol1=super.obtener_rol();
        return rol1;
    }
    @Override
    public void set_id(String id){
        this.ID=id;
    }
    @Override
    public void set_nombre(String nom){
        this.Nombre=nom;
    }
    @Override
    public void set_apellido(String ap){
        this.Apellido=ap;
    }
    @Override
    public void set_user(String us){
        this.User=us;
    }
    @Override
    public void set_rol(String r){
        this.Rol=r;
    }
    @Override
    public void set_pass(String p){
        this.Password=p;
    }
}
