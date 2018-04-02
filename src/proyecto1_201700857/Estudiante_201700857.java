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
public class Estudiante_201700857 extends usuario_201700857{
    
    public Estudiante_201700857(String i,String n,String a,String u,String r,String p){
        super(i,n,a,u,r,p);
    }
    @Override
    public String mostrar_datos(){
        String nueva;
        nueva = super.mostrar_datos();
        return nueva;
    }
    @Override
    public String obtener_nombre(){
        String nomAl;
        nomAl = super.obtener_nombre();
        return nomAl;
    }
    @Override
    public String obtener_pass(){
        String passAl;
        passAl=super.obtener_pass();
        return passAl;
    }
    @Override
    public String obtener_user(){
        String userAl=super.obtener_user();
        return userAl;
    }
}
