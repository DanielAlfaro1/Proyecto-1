package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VMosUsuario_201700857 {
    JFrame VMosUsuario;
    JPanel P1;
    JButton Volver;
    JTable Usuarios;
    JLabel Listado;
    JScrollPane Scrol;
    public static String[] NomCol;
    public static String[][] Data;
    public static int posicion=0, posicion2=-1;
    
    public void Crear_Panel(){
        //Adds
        Font font = new Font("Arial Black",Font.BOLD,13);
        //Paneles
        P1 = new JPanel();
        P1.setLayout(null);
        
        //Boton
        Volver = new JButton ("VOLVER");
        Volver.setFont(font);
        Volver.setVisible(true);
        Volver.setBounds(400,600,150,50);
        Volver.addMouseListener(boton);
        //Label
        Listado = new JLabel("LISTADO DE USUARIOS REGISTRADOS");
        Listado.setFont(font);
        Listado.setBounds(350,100,400,50);
        //Tabla
        Data = new String[20][7];
        for(int z=0;z<Data.length;z++){
            for(int x=0;x<Data[z].length;x++){
                Data[z][x]="";
            }
        }
        System.out.println("Ya estan incializados");
        posicion=0;
        for (int i=0;i<clasePrincipal_201700857.alumno.length;i++){
//            for(int j=0;j<clasePrincipal_201700857.alumno.length;j++){
                if (clasePrincipal_201700857.alumno[i].User.equals(" ")==false){
                    System.out.println("Aquí no hará nada");
                    posicion++;
                    Data[i][0]=""+i;
                    Data[i][1]=clasePrincipal_201700857.alumno[i].ID;
                    Data[i][2]=clasePrincipal_201700857.alumno[i].Nombre;
                    Data[i][3]=clasePrincipal_201700857.alumno[i].Apellido;
                    Data[i][4]=clasePrincipal_201700857.alumno[i].User;
                    Data[i][5]=clasePrincipal_201700857.alumno[i].Rol;
                    Data[i][6]=clasePrincipal_201700857.alumno[i].Password;
                }else{
                    
                    System.out.println("Esto si lo vas a transcribir");
                }
//            }
        }
        System.out.println(posicion);
        for(int k=0;k<clasePrincipal_201700857.maestro.length;k++){
//            for (int l=0;l<clasePrincipal_201700857.maestro.length;l++){
                if (clasePrincipal_201700857.maestro[k].User.equals(" ")==false){
                    System.out.println("Maestro no hará nada");
                    
                    
                    Data[posicion][0]=""+posicion;
                    Data[posicion][1]=clasePrincipal_201700857.maestro[k].ID;
                    Data[posicion][2]=clasePrincipal_201700857.maestro[k].Nombre;
                    Data[posicion][3]=clasePrincipal_201700857.maestro[k].Apellido;
                    Data[posicion][4]=clasePrincipal_201700857.maestro[k].User;
                    Data[posicion][5]=clasePrincipal_201700857.maestro[k].Rol;
                    Data[posicion][6]=clasePrincipal_201700857.maestro[k].Password;
                    posicion++;
                }else{
                    System.out.println("bla bla bla");
                }
//            }
        }
        
        NomCol = new String [7];
        NomCol[0]="No";
        NomCol[1]="ID";
        NomCol[2]="NOMBRE";
        NomCol[3]="APELLIDO";
        NomCol[4]="USUARIO";
        NomCol[5]="ROL";
        NomCol[6]="CONTRASEÑA";
        Usuarios = new JTable(Data,NomCol);
        Usuarios.setFont(font);
        Usuarios.setPreferredScrollableViewportSize(new Dimension(500,70));
//        Usuarios.setBounds(25,200,900,700);
        Usuarios.setVisible(true);
        //Scroll Panel
        Scrol = new JScrollPane(Usuarios);
        Scrol.setBounds(50,200,875,300);
        Scrol.setVisible(true);
        //Añadir
        P1.add(Scrol);
        P1.add(Listado);
        P1.add(Volver);
        P1.setVisible(true);
    }
    public void crearVentana(){
        VMosUsuario = new JFrame("LISTA DE USUARIOS");
        VMosUsuario.setBounds(150,0,1000,700);
        VMosUsuario.add(P1);
        VMosUsuario.setVisible(true);
        VMosUsuario.setDefaultCloseOperation(VMosUsuario.HIDE_ON_CLOSE);
    }
    public VMosUsuario_201700857(){
        Crear_Panel();
        crearVentana();
    }
    
    MouseListener boton = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Volver){
                VMosUsuario.setVisible(false);
                
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
