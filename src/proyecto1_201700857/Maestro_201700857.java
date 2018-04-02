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
public class Maestro_201700857 extends usuario_201700857{
    
    
    
    public Maestro_201700857(String i,String n,String a,String u,String r,String p){
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
        String nomMa;
        nomMa = super.obtener_nombre();
        return nomMa;
    }
    @Override
    public String obtener_pass(){
        String passMa;
        passMa=super.obtener_pass();
        return passMa;
    }
    @Override
    public String obtener_user(){
        String userMa=super.obtener_user();
        return userMa;
    }
}
