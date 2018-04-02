/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201700857;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Bminas
 */
public class Ventanas_201700857 {
    JFrame ventana;
    int ancho;
    int alto;
    int px;
    int py;
    String nombre_v;
    
    public Ventanas_201700857(int a,int b,int x,int y,String n){
        this.nombre_v=n;
        this.alto=b;
        this.ancho=a;
        this.px=x;
        this.py=y;
        ventana = new JFrame(n);
        ventana.setBounds(x, y, b, a);
    }
    
    public void CrearVentana(){
        JFrame v1 = new JFrame();
    }
}
