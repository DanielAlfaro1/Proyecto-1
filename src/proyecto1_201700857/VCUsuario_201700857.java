
package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VCUsuario_201700857 {
    JFrame VCUsuario;
    JLabel ID, Nombre, Apellido, User, Rol, Contraseña, CContraseña;
    JTextField id, nombre, apellido, user, contraseña, cContraseña;
    JButton Crear, Cancelar;
    JComboBox rol;
    JPanel P1;
    public static VError_201700857 VExiste,VExisteId,VRol,Vvacio,Vpass,VBdatos,VCreado;
    
    public void Set_Visible(){
        VCUsuario.setVisible(true);
    }
    
    public void CrearPanel(){
        //Adds
        Font font = new Font("Arial Black",Font.BOLD,13);
        //Paneles
        P1 = new JPanel();
        P1.setLayout(null);
        //Labels
        ID = new JLabel("ID");
        ID.setFont(font);
        ID.setBounds(25,25,100,30);
        Nombre = new JLabel("NOMBRE");
        Nombre.setFont(font);
        Nombre.setBounds(25,85,100,30);
        Apellido = new JLabel("APELLIDO");
        Apellido.setFont(font);
        Apellido.setBounds(25,145,100,30);
        User = new JLabel("USUARIO");
        User.setFont(font);
        User.setBounds(25,205,100,30);
        Rol = new JLabel("ROL");
        Rol.setFont(font);
        Rol.setBounds(25,265,100,30);
        Contraseña = new JLabel("CONTRASEÑA");
        Contraseña.setFont(font);
        Contraseña.setBounds(25,325,300,30);
        CContraseña = new JLabel("CONFIRMAR CONTRASEÑA");
        CContraseña.setFont(font);
        CContraseña.setBounds(25,385,300,30);
        //combobox
        rol = new JComboBox();
        rol.addItem("ROL");
        rol.addItem("ESTUDIANTE");
        rol.addItem("CATEDRATICO");
        rol.setFont(font);
        rol.setBounds(280,260,200,40);
        //Campos de texto
        id = new JTextField();
        id.setFont(font);
        id.setBounds(280,20,200,40);
        nombre = new JTextField();
        nombre.setFont(font);
        nombre.setBounds(280,80,200,40);
        apellido = new JTextField();
        apellido.setFont(font);
        apellido.setBounds(280,140,200,40);
        user = new JTextField();
        user.setFont(font);
        user.setBounds(280,200,200,40);
        contraseña = new JTextField();
        contraseña.setFont(font);
        contraseña.setBounds(280,320,200,40);
        cContraseña = new JTextField();
        cContraseña.setFont(font);
        cContraseña.setBounds(280,380,200,40);
        //Botones
        Crear = new JButton("CREAR");
        Crear.setFont(font);
        Crear.setBounds(75,480,150,50);
        Crear.addMouseListener(boton);
        Cancelar = new JButton("CANCELAR");
        Cancelar.setFont(font);
        Cancelar.setBounds(300,480,150,50);
        Cancelar.addMouseListener(boton);
        //Agregar Objetos
        P1.add(ID);
        P1.add(Nombre);
        P1.add(Apellido);
        P1.add(User);
        P1.add(Rol);
        P1.add(Contraseña);
        P1.add(CContraseña);
        P1.add(id);
        P1.add(nombre);
        P1.add(apellido);
        P1.add(user);
        P1.add(rol);
        P1.add(contraseña);
        P1.add(cContraseña);
        P1.add(Crear);
        P1.add(Cancelar);
        P1.setVisible(true);
    }
    
    public void CrearVentana(){
        VCUsuario = new JFrame("CREAR USUARIO");
        VCUsuario.setBounds(300,65,535,600);
        VCUsuario.add(P1);
        VCUsuario.setVisible(false);
        VCUsuario.setDefaultCloseOperation(VCUsuario.HIDE_ON_CLOSE);
    }
    
    public VCUsuario_201700857(){
        String existe = ("<html><body>ESE NOMBRE DE USUARIO YA EXISTE.<br>POR FAVOR INGRESE OTRO NOMBRE DE USUARIO.</body></html>");
        String Usexiste= ("<html><body>EL USUARIO CON ESA ID YA EXISTE.</body></html>");
        CrearPanel();
        CrearVentana();
        VExiste = new VError_201700857(existe);
        VExisteId = new VError_201700857(Usexiste);
        VRol = new VError_201700857("POR FAVOR ELIJA UN ROL");
        Vvacio = new VError_201700857("POR FAVOR NO DEJE CAMPOS VACÍOS.");
        Vpass = new VError_201700857("LAS CONTRASEÑAS NO COINCIDEN");
        VBdatos = new VError_201700857("<html><body>LO SENTIMOS PERO LA BASE DE DATOS<br>ESTÁ LLENA. CONTACTE CON SOPORTE</body></html>");
        VCreado = new VError_201700857("SE HA CREADO EL USUARIO CON EXITO");
    }
    
    MouseListener boton = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
        if(e.getSource()==Cancelar){
            VCUsuario.setVisible(false);
        }
        if(e.getSource()==Crear){
            int errorusal=0, erroridal=0,errorusma=0,erroridma=0;
            for (usuario_201700857 u:clasePrincipal_201700857.alumno){
                if(user.getText().equals(u.User)){
                    VExiste.Set_Visible();
                    errorusal=1;
                    System.out.println("Ese nombre de usuario ya existe");
                }
                if(id.getText().equals(u.ID)){
                    VExisteId.Set_Visible();
                    erroridal=1;
                    System.out.println("Este usuario ya existe");
                }
            }
            for (usuario_201700857 ma:clasePrincipal_201700857.maestro){
                if(user.getText().equals(ma.User)){
                    VExiste.Set_Visible();
                    errorusma=1;
                    System.out.println("Ese nombre de usuario ya existe");
                }
                if(id.getText().equals(ma.ID)){
                    VExisteId.Set_Visible();
                    erroridma=1;
                    System.out.println("Este usuario ya existe");
                }
            }
            if ((errorusal==0)&&(erroridal==0)&&(errorusma==0)&&(erroridma==0)){
                if((rol.getSelectedItem().toString().equals("ROL"))){
                    VRol.Set_Visible();
                }    
                if(id.getText().equals("")||nombre.getText().equals("")||apellido.getText().equals("")||user.getText().equals("")||contraseña.getText().equals("")){
                    System.out.println("Aquí no puede quedar en blanco ID");
                    Vvacio.Set_Visible();
                }else{
                if(contraseña.getText().equals(cContraseña.getText())){
                    if (rol.getSelectedItem().toString().equals("ESTUDIANTE")){
//                        System.out.println(clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl-1)].ID);
                    clasePrincipal_201700857.contAl++;
                    if(clasePrincipal_201700857.contAl<11){
                        System.out.println(clasePrincipal_201700857.contAl);
                    clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl)].ID=id.getText();
                    clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl)].Nombre=nombre.getText();
                    clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl)].Apellido=apellido.getText();
                    clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl)].Password=contraseña.getText();
                    clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl)].Rol="Estudiante";
                    clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl)].User=user.getText();
                    VCreado.Set_Visible();
                    System.out.println(clasePrincipal_201700857.alumno[(clasePrincipal_201700857.contAl)].mostrar_datos());
                    }else{
                        VBdatos.Set_Visible();
                        System.out.println("Lo lamentamos pero la base de datos está llena");
                    }
                }   if (rol.getSelectedItem().toString().equals("CATEDRATICO")){
                        clasePrincipal_201700857.contMa++;
                    if(clasePrincipal_201700857.contMa<11){
                        System.out.println(clasePrincipal_201700857.contMa);
                    clasePrincipal_201700857.maestro[(clasePrincipal_201700857.contMa)].ID=id.getText();
                    clasePrincipal_201700857.maestro[(clasePrincipal_201700857.contMa)].Nombre=nombre.getText();
                    clasePrincipal_201700857.maestro[(clasePrincipal_201700857.contMa)].Apellido=apellido.getText();
                    clasePrincipal_201700857.maestro[(clasePrincipal_201700857.contMa)].Password=contraseña.getText();
                    clasePrincipal_201700857.maestro[(clasePrincipal_201700857.contMa)].Rol="Catedratico";
                    clasePrincipal_201700857.maestro[(clasePrincipal_201700857.contMa)].User=user.getText();
                    VCreado.Set_Visible();
                    System.out.println(clasePrincipal_201700857.maestro[(clasePrincipal_201700857.contMa)].mostrar_datos());
                    }else{
                        VBdatos.Set_Visible();
                        System.out.println("Lo lamentamos pero la base de datos está llena");
                    }
                    }
                }else{
                    System.out.println("Las contraseñas no coinciden");
                    Vpass.Set_Visible();
                }
                }
        }
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
