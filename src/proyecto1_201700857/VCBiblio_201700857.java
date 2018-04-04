
package proyecto1_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VCBiblio_201700857 {
    JFrame VCrear;
    JPanel P1;
    JTextField tamaño,ejemplares,autor, año, titulo, descripcion, clave1,clave2,clave3,edicion,tema1,tema2,tema3,copias,area,categoria,isbn;
    JComboBox tipo;
    JButton Cargar, Cancelar;
    JLabel Tamaño,Ejemplares,Solo1,Solo2,Solo3,Solo4,Solo5,Solo6,Maximo1,Maximo2,Autor, Año, Titulo, Descripcion, Palabras, Edicion, Temas, Copias,  Area, Categoria, Isbn, Tipo;
    VError_201700857 Etitulo = new VError_201700857("DEBE AGREGAR TITULO DEL DOCUMENTO");
    VError_201700857 Split = new VError_201700857("TIENE MAS DE 3 ELEMENTOS EN TEMAS O PALABRAS CLAVE");
    VError_201700857 Ecopia = new VError_201700857("DEBE AGREGAR ALMENOS 1 COPIA DEL DOCUMENTO");
    VError_201700857 Etesis = new VError_201700857("DEBE AGREGAR UN AREA O UNIDAD ACADEMICA");
    VError_201700857 EBdatos = new VError_201700857("LO SENTIMOS PERO LA BASE DE DATOS ESTÁ LLENA");
    VError_201700857 Ecategoria = new VError_201700857("DEBE AGREGAR UNA CATEGORÍA: CIENCIA, TECNOLOGÍA, ETC");
    VError_201700857 ENejemplar = new VError_201700857("DEBE AGREGAR EL NÚMERO DE EJEMPLAR");
    VError_201700857 EIsbn = new VError_201700857("POR FAVOR AGREGUE EL NÚMERO ÚNICO DE IDENTIFICADOR DEL LIBRO/ISBN");
    VError_201700857 Etamaño = new VError_201700857("DEBE INGRESAR EL TAMAÑO DEL DOCUMENTO");
    VError_201700857 Exito = new VError_201700857("EL DOCUMENTO SE HA AGREGADO CON EXITO");
    VError_201700857 Tdocumento = new VError_201700857("POR FAVOR ELIJA UN TIPO DE DOCUMENTO");
    
    public void CrearPanel(){
        //Addons
        Font font = new Font("Arial Black",Font.BOLD,13);
        
        
        //Paneles
        P1 = new JPanel();
        P1.setLayout(null);
        //Botones
        Cargar = new JButton("CARGAR");
        Cargar.setFont(font);
        Cargar.setBounds(90,600,150,50);
        Cargar.addMouseListener(boton);
        Cancelar = new JButton("CANCELAR");
        Cancelar.setFont(font);
        Cancelar.setBounds(350,600,150,50);
        Cancelar.addMouseListener(boton);
        //Labels
        Autor = new JLabel("AUTOR");
        Autor.setFont(font);
        Autor.setBounds(25,25,100,30);
        Año = new JLabel("AÑO");
        Año.setFont(font);
        Año.setBounds(25,65,100,30);
        Titulo = new JLabel("TÍTULO");
        Titulo.setFont(font);
        Titulo.setBounds(25,105,100,30);
        Descripcion = new JLabel("DESCRIPCIÓN");
        Descripcion.setFont(font);
        Descripcion.setBounds(25,145,200,30);
        Palabras = new JLabel("PALABRAS CLAVE");
        Palabras.setFont(font);
        Palabras.setBounds(25,185,200,30);
        Edicion = new JLabel("EDICIÓN");
        Edicion.setFont(font);
        Edicion.setBounds(25,225,200,30);
        Solo5 = new JLabel("SOLO LIBROS Y LIBROS DIGITALES");
        Solo5.setForeground(Color.BLUE);
        Solo5.setBounds(25,237,200,30);
        Temas = new JLabel("TEMAS");
        Temas.setFont(font);
        Temas.setBounds(25,265,200,30);
        Copias = new JLabel("NO. COPIAS");
        Copias.setFont(font);
        Copias.setBounds(25,305,200,30);
        Area = new JLabel("ÁREA");
        Area.setFont(font);
        Area.setBounds(25,345,200,30);
        Solo4 = new JLabel("SOLO TESIS");
        Solo4.setForeground(Color.BLUE);
        Solo4.setBounds(25,357,200,30);
        Categoria = new JLabel("CATEGORÍA");
        Categoria.setFont(font);
        Categoria.setBounds(25,385,200,30);
        Solo2 = new JLabel("SOLO REVISTAS");
        Solo2.setForeground(Color.BLUE);
        Solo2.setBounds(25,397,200,30);
        Isbn = new JLabel("ISBN");
        Isbn.setFont(font);
        Isbn.setBounds(25,425,200,30);
        Solo1 = new JLabel("SOLO LIBROS");
        Solo1.setForeground(Color.BLUE);
        Solo1.setBounds(25,437,200,30);
        Tipo = new JLabel("TIPO");
        Tipo.setFont(font);
        Tipo.setBounds(25,465,200,30);
        Maximo1 = new JLabel("3 PALABRAS MAXIMO");
        Maximo1.setForeground(Color.red);
        Maximo1.setBounds(25,197,200,30);
        Maximo2 = new JLabel("3 TEMAS MAXIMO");
        Maximo2.setForeground(Color.RED);
        Maximo2.setBounds(25,277,200,30);
        Ejemplares = new JLabel("EJEMPLARES");
        Ejemplares.setFont(font);
        Ejemplares.setBounds(25,505,200,30);
        Solo3 = new JLabel("SOLO REVISTAS");
        Solo3.setForeground(Color.BLUE);
        Solo3.setBounds(25,517,200,30);
        Tamaño = new JLabel("TAMAÑO(BYTES)");
        Tamaño.setFont(font);
        Tamaño.setBounds(25,545,200,30);
        Solo6 = new JLabel("SOLO LIBROS DIGITALES");
        Solo6.setForeground(Color.BLUE);
        Solo6.setBounds(25,557,200,30);
        //Combo box
        tipo = new JComboBox();
        tipo.addItem("TIPO DE DOCUMENTO");
        tipo.addItem("LIBRO");
        tipo.addItem("REVISTA");
        tipo.addItem("TESIS");
        tipo.addItem("LIBRO DIGITAL");
        tipo.setFont(font);
        tipo.setBounds(250,465,300,30);
        //Campos de texto
        autor = new JTextField();
        autor.setFont(font);
        autor.setBounds(250,25,300,30);
        año = new JTextField();
        año.setFont(font);
        año.setBounds(250,65,300,30);
        titulo = new JTextField();
        titulo.setFont(font);
        titulo.setBounds(250,105,300,30);
        descripcion = new JTextField();
        descripcion.setFont(font);
        descripcion.setBounds(250,145,300,30);
        clave1 = new JTextField();
        clave1.setFont(font);
        clave1.setBounds(250,185,300,30);
        edicion = new JTextField();
        edicion.setFont(font);
        edicion.setBounds(250,225,300,30);
        tema1 = new JTextField();
        tema1.setFont(font);
        tema1.setBounds(250,265,300,30);
        copias = new JTextField();
        copias.setFont(font);
        copias.setBounds(250,305,300,30);
        area = new JTextField();
        area.setFont(font);
        area.setBounds(250,345,300,30);
        categoria = new JTextField();
        categoria.setFont(font);
        categoria.setBounds(250,385,300,30);
        isbn = new JTextField();
        isbn.setFont(font);
        isbn.setBounds(250,425,300,30);
        ejemplares = new JTextField();
        ejemplares.setFont(font);
        ejemplares.setBounds(250,505,300,30);
        tamaño = new JTextField();
        tamaño.setFont(font);
        tamaño.setBounds(250,545,300,30);
       //Agregar Objetos
       P1.add(autor);
       P1.add(año);
       P1.add(titulo);
       P1.add(descripcion);
       P1.add(clave1);
       P1.add(edicion);
       P1.add(tema1);
       P1.add(copias);
       P1.add(area);
       P1.add(categoria);
       P1.add(isbn);
       P1.add(tipo);
       P1.add(Cargar);
       P1.add(Cancelar);
       P1.add(Autor);
       P1.add(Año);
       P1.add(Titulo);
       P1.add(Descripcion);
       P1.add(Palabras);
       P1.add(Edicion);
       P1.add(Temas);
       P1.add(Copias);
       P1.add(Area);
       P1.add(Categoria);
       P1.add(Isbn);
       P1.add(Tipo);
       P1.add(Maximo1);
       P1.add(Maximo2);
       P1.add(Solo1);
       P1.add(Solo2);
       P1.add(Solo3);
       P1.add(Solo4);
       P1.add(Solo5);
       P1.add(Solo6);
       P1.add(Ejemplares);
       P1.add(ejemplares);
       P1.add(tamaño);
       P1.add(Tamaño);
       P1.setVisible(true);
    }
    
    public void CrearVentana(){
        VCrear = new JFrame("CARGAR NOMRAL DE CONTENIDO");
        VCrear.setBounds(400,0,600,700);
        VCrear.add(P1);
        VCrear.setVisible(false);
        VCrear.setDefaultCloseOperation(VCrear.HIDE_ON_CLOSE);
    }
    public void Set_Visible(){
        VCrear.setVisible(true);
    }
    public VCBiblio_201700857(){
        CrearPanel();
        CrearVentana();
    }
    
    MouseListener boton = new  MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Cancelar){
               
                autor.setText("");
                año.setText("");
                titulo.setText("");
                descripcion.setText("");
                clave1.setText("");
                edicion.setText("");
                tema1.setText("");
                copias.setText("");
                area.setText("");
                categoria.setText("");
                isbn.setText("");
                ejemplares.setText("");
                tamaño.setText("");
                VCrear.setVisible(false);
            }
            if (e.getSource()==Cargar){
                    String[] partes = clave1.getText().split(",");
                    String[] temas = tema1.getText().split(",");
                    if(tipo.getSelectedItem().toString().equals("TIPO DE DOCUMENTO")){
                        System.out.println("POR FAVOR ELIJA UN TIPO DE DOCUMENTO");
                        Tdocumento.Set_Visible();
                    }else{
            if(titulo.getText().equals("")){
                            System.out.println("DEBE AGREGAR EL TITULO DEL LIBRO POR FAVOR");
                            Etitulo.Set_Visible();
                        }else{
                     if (partes.length>3||temas.length>3){
                            System.out.println("LO LAMENTO EN ESTE LUGAR NO PUEDEN IR MÁS DE 3 ELEMENTOS");
                            Split.Set_Visible();
                        }else{
             if (Integer.parseInt(copias.getText())<1){
                        System.out.println("DEBE AGREGAR ALMENOS 1 COPIA");
                        Ecopia.Set_Visible();
                    }else{
                 if(tipo.getSelectedItem().toString().equals("TESIS")){
                     if (area.getText().equals("")){
                         System.out.println("DEBE AGREGAR UN AREA O UNIDAD ACADEMICA");
                         Etesis.Set_Visible();
                     }else{
                         clasePrincipal_201700857.contT++;
                         if (clasePrincipal_201700857.contT<11){
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Autor=autor.getText();
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Año=Integer.parseInt(año.getText());
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Titulo=titulo.getText();
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Claves=clave1.getText().split(",");
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Area=area.getText();
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Temas=tema1.getText().split(",");
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Descripcion=descripcion.getText();
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Edicion=Integer.parseInt(edicion.getText());
                             clasePrincipal_201700857.Tesis[(clasePrincipal_201700857.contT)].Copias=Integer.parseInt(copias.getText());
                             Exito.Set_Visible();
                         }else{
                             System.out.println("LO SENTIMOS PERO LA BASE DE DATOS ESTÁ LLENA");
                             EBdatos.Set_Visible();
                         }
                     }
                 }
                if(tipo.getSelectedItem().toString().equals("REVISTA")){
                    if (categoria.getText().equals("")){
                        System.out.println("DEBE AGREGAR UNA CATEGORÍA: CIENCIA, TECNOLOGÍA, ETC");
                        Ecategoria.Set_Visible();
                    }else{
                        if(ejemplares.getText().equals("")||Integer.parseInt(ejemplares.getText())<1){
                            System.out.println("DEBE AGREGAR EL NÚMERO DE EJEMPLAR");
                            ENejemplar.Set_Visible();
                        }else{
                            clasePrincipal_201700857.contR++;
                            if(clasePrincipal_201700857.contR<11){
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Autor=autor.getText();
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Año=Integer.parseInt(año.getText());
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Titulo=titulo.getText();
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Edicion=Integer.parseInt(edicion.getText());
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Descripcion=descripcion.getText();
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Categoria=categoria.getText();
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Ejemplares=Integer.parseInt(ejemplares.getText());
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Temas=tema1.getText().split(",");
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Claves=clave1.getText().split(",");
                                clasePrincipal_201700857.Revista[(clasePrincipal_201700857.contR)].Copias=Integer.parseInt(copias.getText());
                            Exito.Set_Visible();
                            }else{
                                System.out.println("LO SENTIMOS PERO LA BASE DE DATOS ESTÁ LLENA");
                             EBdatos.Set_Visible();
                            }
                        }
                    }
                }
                
                if(tipo.getSelectedItem().toString().equals("LIBRO")){
                    if(isbn.equals("")||Integer.parseInt(isbn.getText())<1){
                        System.out.println("POR FAVOR AGREGUE EL NÚMERO ÚNICO DE IDENTIFICADOR DEL LIBRO/ISBN");
                        EIsbn.Set_Visible();
                    }else{
                    clasePrincipal_201700857.contL++;
                    if (clasePrincipal_201700857.contL<11){
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Autor=autor.getText();
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Año=Integer.parseInt(año.getText());
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Claves=clave1.getText().split(",");
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Copias=Integer.parseInt(copias.getText());
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Descripcion=descripcion.getText();
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Edicion=Integer.parseInt(edicion.getText());
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].ISBN=Integer.parseInt(isbn.getText());
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Temas=tema1.getText().split(",");
                        clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Titulo=titulo.getText();
                        Exito.Set_Visible();
                    }else{
                        System.out.println("LO SENTIMOS PERO LA BASE DE DATOS ESTÁ LLENA");
                             EBdatos.Set_Visible();
                    }
                    }
                   }
                    System.out.println(clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Copias+" "+clasePrincipal_201700857.Libro[(clasePrincipal_201700857.contL)].Descripcion);
                }
             
             if(tipo.getSelectedItem().toString().equals("LIBRO DIGITAL")){
                 if(tamaño.getText().equals("")||Integer.parseInt(tamaño.getText())<1){
                     System.out.println("DEBE INGRESAR EL TAMAÑO DEL DOCUMENTO");
                     Etamaño.Set_Visible();
                 }else{
                     clasePrincipal_201700857.contLD++;
                     if(clasePrincipal_201700857.contLD<11){
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Autor=autor.getText();
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Año=Integer.parseInt(año.getText());
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Titulo=titulo.getText();
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Edicion=Integer.parseInt(edicion.getText());
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Clave=clave1.getText().split(",");
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Descripcion=descripcion.getText();
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Temas=tema1.getText().split(",");
                         clasePrincipal_201700857.Digital[(clasePrincipal_201700857.contLD)].Tamaño=Integer.parseInt(tamaño.getText());
                         Exito.Set_Visible();
                     }else{
                         System.out.println("LO LAMENTAMOS PERO LA BASE DE DATOS ESTÁ LLENA");
                         EBdatos.Set_Visible();
                     }
                 }
             }
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
