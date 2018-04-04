package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VMosDoc_201700857 {
    JFrame VMosD;
    JPanel P1;
    JButton Volver;
    JTable Docs;
    JLabel Listado;
    JScrollPane Scrol;
    public static String[] NomCol;
    public static String[][] Data;
    public static int posicion=0, posicion2=-1;
    
    public void CrearPanel(){
        //addons
        Font font = new Font("Arial Black",Font.BOLD,13);
        //Paneles
        P1 = new JPanel();
        P1.setLayout(null);
        
        //Boton
        Volver = new JButton ("VOLVER");
        Volver.setFont(font);
        Volver.setVisible(true);
        Volver.setBounds(400,600,150,50);
        
        //Label
        Listado = new JLabel("LISTADO DE DOCUMENTOS AÑADIDOS");
        Listado.setFont(font);
        Listado.setBounds(350,100,400,50);
        //Tabla
        Data = new String [40][19];
        for (int z=0;z<Data.length;z++){
            for(int x=0;x<Data.length;x++){
                Data[z][x]="";
            }
        }
        System.out.println("Ya estan inicializados");
        posicion = 0;
        for(int i =0;i<clasePrincipal_201700857.Libro.length;i++){
            if (clasePrincipal_201700857.Libro[i].Titulo.equals("titulolibro")==false){
                System.out.println("ESTO SI LO VA A TRANSCRIBIR");
                posicion++;
                Data[i][0]=""+i;
                Data[i][1]=clasePrincipal_201700857.Libro[i].Autor;
                Data[i][2]=String.valueOf(clasePrincipal_201700857.Libro[i].Año);
                Data[i][3]=clasePrincipal_201700857.Libro[i].Titulo;
                Data[i][4]=clasePrincipal_201700857.Libro[i].Descripcion;
                Data[i][5]=clasePrincipal_201700857.Libro[i].Claves[0];
                Data[i][6]=clasePrincipal_201700857.Libro[i].Claves[1];
                Data[i][7]=clasePrincipal_201700857.Libro[i].Claves[2];
                Data[i][8]=clasePrincipal_201700857.Libro[i].Temas[0];
                Data[i][9]=clasePrincipal_201700857.Libro[i].Temas[1];
                Data[i][10]=clasePrincipal_201700857.Libro[i].Temas[2];
                Data[i][11]=String.valueOf(clasePrincipal_201700857.Libro[i].Copias);
                Data[i][12]=String.valueOf(clasePrincipal_201700857.Libro[i].Edicion);
            }else{
                System.out.println("AQUI NO HARÁ NADA");
            }
        }
        System.out.println(posicion);
        for(int k=0;k<clasePrincipal_201700857.Revista.length;k++){
            if(clasePrincipal_201700857.Revista[k].Titulo.equals("titulorevista")){
                
            }
        }
    }
}
