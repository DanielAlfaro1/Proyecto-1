
package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VModUsuario_201700857 {
    JFrame VModUsuario;
    JLabel ID, Nombre, Apellido, User, Rol, Contraseña, CContraseña;
    JTextField id, nombre, apellido, user, contraseña, cContraseña,roltxt;
    JButton Modificar, Cancelar,Buscar;
    JComboBox rol;
    JPanel P1;
    public static VError_201700857 VExiste,VExisteId,VRol,Vvacio,Vpass,VBdatos,VMod;
    public static int Pma=0,Pal=0;
    
    public void Set_Visible(){
        VModUsuario.setVisible(true);
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
        rol.setBounds(490,260,180,40);
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
        roltxt = new JTextField();
        roltxt.setFont(font);
        roltxt.setBounds(280,260,200,40);
        //Botones
        Modificar = new JButton("MODIFICAR");
        Modificar.setFont(font);
        Modificar.setBounds(75,480,150,50);
        Modificar.addMouseListener(boton);
        Cancelar = new JButton("CANCELAR");
        Cancelar.setFont(font);
        Cancelar.setBounds(300,480,150,50);
        Cancelar.addMouseListener(boton);
        Buscar = new JButton("BUSCAR");
        Buscar.setFont(font);
        Buscar.setBounds(490,20,150,50);
        Buscar.addMouseListener(boton);
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
//        P1.add(rol);
        P1.add(contraseña);
        P1.add(cContraseña);
        P1.add(Modificar);
        P1.add(Cancelar);
        P1.add(roltxt);
        P1.add(Buscar);
        P1.setVisible(true);
    }
    
    public void CrearVentana(){
        VModUsuario = new JFrame("MODIFICAR USUARIO");
        VModUsuario.setBounds(300,65,700,600);
        VModUsuario.add(P1);
        VModUsuario.setVisible(false);
        VModUsuario.setDefaultCloseOperation(VModUsuario.HIDE_ON_CLOSE);
        
    }
    
    public VModUsuario_201700857(){
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
        VMod = new VError_201700857("SE HA MODIFICADO EL USUARIO CON EXITO.");
    }
    MouseListener boton = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            int existal=0,existma=0,contramal=0;
            if (e.getSource()==Cancelar){
                VModUsuario.setVisible(false);
                id.setText("");
                nombre.setText("");
                apellido.setText("");
                cContraseña.setText("");
                contraseña.setText("");
                roltxt.setText("");
                user.setText("");
            }
            if (e.getSource()==Buscar){
                int posicion=-1;
                for (usuario_201700857 u:clasePrincipal_201700857.alumno){
                    posicion++;
                    if (id.getText().equals(u.ID)){
                        Pal=posicion;
                        System.out.println(Pal);
                        nombre.setText(u.Nombre);
                        apellido.setText(u.Apellido);
                        contraseña.setText(u.Password);
                        user.setText(u.User);
                        cContraseña.setText(u.Password);
                        if(u.Rol.equals("Estudiante")){
                            roltxt.setText("Estudiante");
                        }
                        if (u.Rol.equals("Catedratico")){
                            roltxt.setText("Catedratico");
                        }
                    }
                    
                }
                int posicion2=-1;
                for (usuario_201700857 am:clasePrincipal_201700857.maestro){
                    posicion2++;
                    if (id.getText().equals(am.ID)){
                        Pma=posicion2;
                        System.out.println(Pma);
                        nombre.setText(am.Nombre);
                        apellido.setText(am.Apellido);
                        contraseña.setText(am.Password);
                        user.setText(am.User);
                        cContraseña.setText(am.Password);
                        if(am.Rol.equals("Estudiante")){
                            roltxt.setText("Estudiante");
                        }
                        if (am.Rol.equals("Catedratico")){
                            roltxt.setText("Catedratico");
                        }
                    }
                }
            }
            if (e.getSource()==Modificar){
                if (roltxt.getText().equals("Estudiante")){
                
                    
                        if(contraseña.getText().equals(cContraseña.getText())){
                            contramal=0;
                        
                    }else{
                            contramal=1;
                            Vpass.Set_Visible();
                        }
                        for (int i=0;i<clasePrincipal_201700857.alumno.length;i++){
                            if(i!=Pal){
                                System.out.println("i es:"+i);
                                System.out.println("Pal es: "+Pal);
                            if (user.getText().equals(clasePrincipal_201700857.alumno[i].User)){
                                existal=1;
                            }
                        }
                        for (usuario_201700857 ma:clasePrincipal_201700857.maestro){
                            if (user.getText().equals(ma.User)){
                                existma=1;
                            }
                        }
                        }
                        if (existal==1||existma==1){
                            VExiste.Set_Visible();
                        }
                        if (existal==0&&existma==0&&contramal==0){
                           clasePrincipal_201700857.alumno[Pal].User=user.getText();
                           clasePrincipal_201700857.alumno[Pal].Password=contraseña.getText();
                           clasePrincipal_201700857.alumno[Pal].Apellido=apellido.getText();
                           clasePrincipal_201700857.alumno[Pal].Nombre=nombre.getText();
                           clasePrincipal_201700857.alumno[Pal].ID=id.getText();
                           VMod.Set_Visible();
                        }
                    }          
                if(roltxt.getText().equals("Catedratico")){
                    
                       
                        if(contraseña.getText().equals(cContraseña.getText())){
                        contramal=0;
                    }else{
                            contramal=1;
                            Vpass.Set_Visible();
                        }
                        
                        for (int i=0;i<clasePrincipal_201700857.maestro.length;i++){
                            if(i!=Pma){
                                System.out.println("i es:"+i);
                                System.out.println("Pal es: "+Pma);
                            if (user.getText().equals(clasePrincipal_201700857.maestro[i].User)){
                                existal=1;
                            }
                        }
                        for (usuario_201700857 al:clasePrincipal_201700857.alumno){
                            if (user.getText().equals(al.User)){
                                existma=1;
                            }
                        }
                        }
                        if (existal==1||existma==1){
                            VExiste.Set_Visible();
                        }
                        if (existal==0&&existma==0&&contramal==0){
                            clasePrincipal_201700857.maestro[Pma].User=user.getText();
                            clasePrincipal_201700857.maestro[Pma].Apellido=apellido.getText();
                            clasePrincipal_201700857.maestro[Pma].Nombre=nombre.getText();
                            clasePrincipal_201700857.maestro[Pma].Password=contraseña.getText();
                            clasePrincipal_201700857.maestro[Pma].ID=id.getText();
                            VMod.Set_Visible();
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
