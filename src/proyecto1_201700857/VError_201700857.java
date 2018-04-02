
package proyecto1_201700857;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VError_201700857 {
    JFrame VError;
    JLabel Icono,Mensaje;
    JPanel P1;    
    JButton Aceptar;
    public boolean visible =false;
    
    public void Set_Visible(){
        VError.setVisible(true);
        
    }
            
    public void CrearPanelEr(String mensaje){
        //Agregados
        Font font = new Font("Arial Black",Font.BOLD,13);
        
        //Paneles
        P1 = new JPanel();
        P1.setLayout(null);
        //Botones
        Aceptar=new JButton("ACEPTAR");
        Aceptar.setFont(font);
        Aceptar.setBounds(240,175,170,50);
        Aceptar.addMouseListener(boton);
        //Labels
        Mensaje = new JLabel(mensaje);
        Mensaje.setFont(font);
        Mensaje.setBounds(175,25,400,100);
        Icono = new JLabel();
        Icono.setBounds(50,57,100,100);
        Icono.setIcon(new ImageIcon("img/Advertencia.png"));
        Icono.setVisible(true);
        //Agregar objetos
        P1.add(Icono);
        P1.add(Mensaje);
        P1.add(Aceptar);
        P1.setVisible(true);
    }
    
    public void CrearVentanaEr(){
        VError = new JFrame("ERROR");
        VError.setBounds(300,150,600,280);
        VError.add(P1);
        VError.setVisible(visible);
        VError.setDefaultCloseOperation(VError.HIDE_ON_CLOSE);
    }
    
//    public void Ventana Visible(boolean valor){
//        
//    }
    public VError_201700857(String n){
        CrearPanelEr(n);
        CrearVentanaEr();
    }
    
    MouseListener boton = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
        if(e.getSource()==Aceptar){
            VError.setVisible(false);
        }
        }

        @Override
        public void mousePressed(MouseEvent e) {
         }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    };
}
