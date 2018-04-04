
package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VAdmin_201700857 {
    JFrame VAdmin;
    JButton Logout, CrearUsuario, ModificarUsuario, EliminarUsuario, MostrarUsuario, CrearBiblio,ModificarBiblio,EliminarBiblio,MostrarBiblio,ReporteUsuario,ReporteLibros;
    JLabel Usuarios, Bibliografias, Reportes;
    JPanel P1;
    JCheckBox normal, masiva;
    public static VMosUsuario_201700857 VMosU;
    public static VError_201700857 Carga1 = new VError_201700857("POR FAVOR ELIJA UNA OPCIÓN");
    public static VError_201700857 Carga2 = new VError_201700857("POR FAVOR ELIJA SOLO UNA OPCIÓN");
    public static VError_201700857 Disp = new VError_201700857("<html><body>LO LAMENTAMOS ESTA FUNCIÓN NO SE ENCUENTRA DISPONIBLE.<br>POR FAVOR PERDONE AL DESARROLLADOR</body></html>");
    public void Set_Visible(){
        VAdmin.setVisible(true);
    }
    
    public void CrearPanelAd(){
    //Adds
    Font font = new Font("Arial Black",Font.BOLD,13);
    
    //Paneles
    P1 = new JPanel();
    P1.setLayout(null);
    //Botones
    CrearUsuario = new JButton ("CREAR");
    CrearUsuario.setFont(font);
    CrearUsuario.setBounds(150,150,150,50);
    CrearUsuario.addMouseListener(boton);
    ModificarUsuario = new JButton ("MODIFICAR");
    ModificarUsuario.setFont(font);
    ModificarUsuario.setBounds(300,150,150,50);
    ModificarUsuario.addMouseListener(boton);
    EliminarUsuario = new JButton("ELIMINAR");
    EliminarUsuario.setFont(font);
    EliminarUsuario.setBounds(450,150,150,50);
    EliminarUsuario.addMouseListener(boton);
    MostrarUsuario = new JButton("MOSTRAR");
    MostrarUsuario.setFont(font);
    MostrarUsuario.setBounds(600,150,150,50);
    MostrarUsuario.addMouseListener(boton);
    CrearBiblio = new JButton("CREAR");
    CrearBiblio.setFont(font);
    CrearBiblio.setBounds(150,405,150,50);
    CrearBiblio.addMouseListener(boton);
    ModificarBiblio = new JButton("MODIFICAR");
    ModificarBiblio.setFont(font);
    ModificarBiblio.setBounds(300,405,150,50);
    ModificarBiblio.addMouseListener(boton);
    EliminarBiblio = new JButton("ELIMINAR");
    EliminarBiblio.setFont(font);
    EliminarBiblio.setBounds(450,405,150,50);
    EliminarBiblio.addMouseListener(boton);
    MostrarBiblio = new JButton("MOSTRAR");
    MostrarBiblio.setFont(font);
    MostrarBiblio.setBounds(600,405,150,50);
    MostrarBiblio.addMouseListener(boton);
    ReporteUsuario = new JButton("REPORTE USUARIOS");
    ReporteUsuario.setFont(font);
    ReporteUsuario.setBounds(75,550,250,50);
    ReporteUsuario.addMouseListener(boton);
    ReporteLibros = new JButton("REPORTE LIBROS");
    ReporteLibros.setFont(font);
    ReporteLibros.setBounds(375,550,250,50);
    ReporteLibros.addMouseListener(boton);
    Logout = new JButton("LOGOUT");
    Logout.setFont(font);
    Logout.setBounds(750,600,150,50);
    Logout.addMouseListener(boton);
    //Labels
    Usuarios = new JLabel("USUARIOS");
    Usuarios.setFont(font);
    Usuarios.setBounds(100,45,200,30);
    Bibliografias = new JLabel("BIBLIOGRAFÍAS");
    Bibliografias.setFont(font);
    Bibliografias.setBounds(100,300,200,30);
    Reportes = new JLabel("REPORTES");
    Reportes.setFont(font);
    Reportes.setBounds(100,500,200,30);
    //CheckBox
    normal = new JCheckBox("CARGA NORMAL");
    normal.setFont(font);
    normal.addMouseListener(boton);
    normal.setBounds(150,350,200,30);
    masiva = new JCheckBox("CARGA MASIVA");
    masiva.setFont(font);
    masiva.setBounds(150,375,200,30);
    //Agregar objetos
    P1.add(CrearUsuario);
    P1.add(ModificarUsuario);
    P1.add(EliminarUsuario);
    P1.add(MostrarUsuario);
    P1.add(CrearBiblio);
    P1.add(ModificarBiblio);
    P1.add(EliminarBiblio);
    P1.add(MostrarBiblio);
    P1.add(ReporteUsuario);
    P1.add(ReporteLibros);
    P1.add(Usuarios);
    P1.add(Bibliografias);
    P1.add(Reportes);
    P1.add(Logout);
    P1.add(normal);
    P1.add(masiva);
    P1.setVisible(true);
}
    
    public void crearVentana(){
        VAdmin = new JFrame("ADMINISTRADOR");
        VAdmin.setBounds(150,0,1000,700);
        VAdmin.add(P1);
        VAdmin.setVisible(false);
        VAdmin.setDefaultCloseOperation(VAdmin.EXIT_ON_CLOSE);
    }
    
    public VAdmin_201700857(){
        CrearPanelAd();
        crearVentana();
    }
    
    MouseListener boton = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Logout){
                VAdmin.setVisible(false);
                clasePrincipal_201700857.ventana.Set_Visible();
            }
        if (e.getSource()==CrearUsuario){
            clasePrincipal_201700857.VCusuario.Set_Visible();
        }
        if (e.getSource()==ModificarUsuario){
            clasePrincipal_201700857.VModU.Set_Visible();
        }
        if (e.getSource()==EliminarUsuario){
            clasePrincipal_201700857.VEU.Set_Visible();
        }
        if (e.getSource()==MostrarUsuario){
            VMosU = new VMosUsuario_201700857();
        }
        if (e.getSource()==CrearBiblio){
             if (normal.isSelected()&&(masiva.isSelected()==false)){
            System.out.println("NORMAL HA SIDO SELECCIONADO");
            clasePrincipal_201700857.VCBiblio.Set_Visible();
            }
             if ((normal.isSelected()==false)&&masiva.isSelected()){
                 System.out.println("MASIVA HA SIDO SELECCIONADO");
                 Disp.Set_Visible();
             }
             if(normal.isSelected()&&masiva.isSelected()){
                 System.out.println("POR FAVOR SOLO ELIJA UNA OPCIÓN");
                 Carga2.Set_Visible();
             }
             if((normal.isSelected()==false)&&(masiva.isSelected()==false)){
                 System.out.println("POR FAVOR ELIJA ALGUNA OPCIÓN");
                 Carga1.Set_Visible();
             }
        }
        if (e.getSource()==MostrarBiblio){
            
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
