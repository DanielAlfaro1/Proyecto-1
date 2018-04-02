
package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VLogin_201700857{
    JFrame VLog;
    JLabel Usuario, Contraseña,Carita;
    JPanel P1;
    JButton Ingresar, Cancelar;
    JTextField usuario, contraseña;
    
    public void CrearPanelL(){
    //Agregados
    Font font = new Font("Arial Black",Font.BOLD,13);
    //Paneles
    P1 = new JPanel();
    P1.setLayout(null);
    //Botones
    Ingresar = new JButton("Ingresar");
    Cancelar = new JButton("Cancelar");
    Ingresar.setBounds(50,300,130,45);
    Ingresar.setFont(font);
    Ingresar.setVisible(true);
    Ingresar.addMouseListener(boton);
    Cancelar.setBounds(235,300,130,45);
    Cancelar.setFont(font);
    Cancelar.setVisible(true);
    Cancelar.addMouseListener(boton);
    //Labels
    Usuario = new JLabel("Usuario");
    Contraseña = new JLabel("Contraseña");
    Carita = new JLabel();
    Usuario.setBounds(25,25,100,25);
    Usuario.setFont(font);
    Usuario.setVisible(true);
    Contraseña.setBounds(25,125,100,25);
    Contraseña.setFont(font);
    Contraseña.setVisible(true);
    Carita.setIcon(new ImageIcon("img/Simel.png"));
    Carita.setBounds(300,65,140,140);
    Carita.setVisible(true);
    //Cuadros de texto
    usuario = new JTextField();
    contraseña = new JTextField();
    usuario.setBounds(50,75,200,25);
    usuario.setVisible(true);
    contraseña.setBounds(50,175,200,25);
    contraseña.setVisible(true);
    //Agregar objetos
    P1.add(Usuario);
    P1.add(Contraseña);
    P1.add(Ingresar);
    P1.add(usuario);
    P1.add(contraseña);
    P1.add(Cancelar);
    P1.add(Carita);
}
    public void CrearVentanaL(){
        VLog = new JFrame("Login");
        VLog.setBounds(150,150,475,450);
        VLog.add(P1);
        VLog.setVisible(true);
        VLog.setDefaultCloseOperation(VLog.HIDE_ON_CLOSE);
    }
    public VLogin_201700857(){
        CrearPanelL();
        CrearVentanaL();
    }
    
    MouseListener boton = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Cancelar){
                VLog.setVisible(false);
            }
            if (e.getSource()==Ingresar){
                int exUSad=0,exPaad=0,exUSal=0,exPaal=0,exUSma=0,exPama=0,PAdmin=0,PEstudiante=0,PMaestro=0;
                for (usuario_201700857 u:clasePrincipal_201700857.admin){
                    PAdmin++;
                    String n = u.obtener_user();
                    
                    System.out.println(n);
                    if(usuario.getText().equals(n)){
                        exUSad=1;
                        System.out.println("Usuario correcto");
                    }
                    if (contraseña.getText().equals(u.obtener_pass())){
                        exPaad=1;
                        System.out.println("Bien hecho concuerda la contraseña");
                    }
                    
                }
                if(exUSad==1&&exPaad==1){
                    System.out.println("Felicidades usted a ingresado como administrador bienvenido");
                    clasePrincipal_201700857.ventana.Set_Invisible();
                    clasePrincipal_201700857.VAdmin.Set_Visible();
                    VLog.setVisible(false);
                }
                
                if(exUSad==0&&exPaad==0){
                for (usuario_201700857 m:clasePrincipal_201700857.alumno){
                        String alU = m.obtener_user();
                        
                       if(usuario.getText().equals(alU)){
                           exUSal=1;
                           System.out.println("Lo lograste otra vez yeah");
                       }
                       if(contraseña.getText().equals(m.obtener_pass())){
                       exPaal=1;
                       }
                    }
                
                }
                
                if(exUSal==1&&exPaal==1){
                    System.out.println("Felicidades usted a ingresado como estudiante, Bienvenido");
                    clasePrincipal_201700857.ventana.Set_Invisible();
                }
                if((exUSal==1&&exPaal==0)||(exUSal==0&&exPaal==1)){
                    
                }
                if(exUSal==0&&exPaal==0){
                    
                        for(usuario_201700857 ma:clasePrincipal_201700857.maestro){
                            if (usuario.getText().equals(ma.obtener_user())){
                                exUSma=1;
                            }
                            if(contraseña.getText().equals(ma.obtener_pass())){
                                exPama=1;
                        }
                        }
                }
                if(exUSma==1&&exPama==1){
                    System.out.println("Felicidades usted a ingresado como maestro. Bienvenido");
                    clasePrincipal_201700857.ventana.Set_Invisible();
                }
                if((exUSad==1&&exPaad==0)||(exUSad==0&&exPaad==1)||(exUSal==1&&exPaal==0)||(exUSal==0&&exPaal==1)||(exUSma==1&&exPama==0)||(exUSma==0&&exPama==1)){
                    System.out.println("El Usuario o la contraseña es incorreccta");
                    clasePrincipal_201700857.VError.visible=true;
                    clasePrincipal_201700857.VError.Set_Visible();
                }
                if((exUSad==0&&exPaad==0)&&(exUSal==0&&exPaal==0)&&(exUSma==0&&exPama==0)){
                    System.out.println("EL USUARIO NO EXISTE, PONERSE EN CONTACTO CON EL ADMINISTRADOR PARA SOLICITAR UN REGISTRO");
                    clasePrincipal_201700857.VExiste.Set_Visible();
                }
                
                
//Ya estando en la ventana Login quiero que los datos que yo esriba en los textfield los compare con
//Los datos del objeto admin que se encuentra en clasePrincipal_201700857
//Pero ya intenté diferentes cosas y no puedo llamar a ese objeto con sus atributos aquí
                    
               
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
