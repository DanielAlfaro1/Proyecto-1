/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.event.MouseListener;


public class V1_201700857 {
    JFrame V1;
    JPanel P1,P2,P3;
    JLabel LogoUsac,Carita,Noticias,CNoticias;
    JButton Login,Logout,About;
    
    public void Set_Visible(){
        V1.setVisible(true);
    }
    
    public void Set_Invisible(){
        V1.setVisible(false);
    }
    
    public void crearPanel(){
    //Agregados    
    Font font = new Font("Arial Black",Font.BOLD,13);
    String texto = "<html><body>Bienvenidos, bienvenidos a la nueva biblioteca<br>virtual recien creada para su disfrute y su<br> beneficio, esperamos que esta aplicación sea<br> amigable para usted usuario.<br>Bienvenido y disfrute de este nuevo servicio.</body><html>";
    //Paneles
    P1 = new JPanel();
    P2 = new JPanel();
    P3 = new JPanel();
    P2.setBounds(50,35,880,125);
    P3.setBounds(515,250,415,300);
    P2.setBorder(BorderFactory.createLineBorder(Color.black));
    P1.setLayout(null);
    P2.setLayout(null);
    //Botones
    Login = new JButton("Login");
    Logout = new JButton ("Logout");
    About = new JButton ("About");
    Login.setBounds(575,43,125,35);
    Login.setVisible(true);
    Login.setFont(font);
    Logout.setBounds(715,43,125,35);
    Logout.setVisible(true);
    Logout.setFont(font);
    About.setBounds(125,550,125,35);
    About.setVisible(true);
    About.setFont(font);
    Login.addMouseListener(boton);
    //Labels
    LogoUsac = new JLabel();
    Carita = new JLabel(" ");
    Noticias = new JLabel("NOTICIAS");
    CNoticias = new JLabel();
    Carita.setIcon(new ImageIcon("img/Carita4.png"));
    Carita.setBounds(7,7,115,115);
    Carita.setVisible(true);
    LogoUsac.setBounds(50,250,440,146);
    LogoUsac.setIcon(new ImageIcon("img/logo.png"));
    LogoUsac.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    LogoUsac.setVisible(true);
    CNoticias.setText(texto);
    CNoticias.setSize(400, 280);
    CNoticias.setFont(font);
    Noticias.setFont(font);
    //agregar objetos
    P1.add(P2);
    P2.add(Carita);
    P2.add(Login);
    P2.add(Logout);
    P1.add(LogoUsac);
    P1.add(About);
    P1.add(P3);
    P3.add(Noticias);
    P3.add(CNoticias);
    }
    
    public void crearVentana(){
        V1 = new JFrame("IPC PROYECTO 1");
        V1.setBounds(150,0,1000,700);
        V1.add(P1);
        V1.setVisible(true);
        V1.setDefaultCloseOperation(V1.EXIT_ON_CLOSE);
 
        
    }
        
    public V1_201700857(){
    crearPanel();
    crearVentana();
}
    
    MouseListener boton = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Login){
                VLogin_201700857 VLog = new VLogin_201700857();/*
                Si alguien le da click en Login, me abrira la ventana para escribir los datos y logearse.
                */
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
