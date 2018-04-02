package proyecto1_201700857;


public class Revista_201700857 {
    public String Autor;
    public int Año;
    public String Titulo;
    public int Edicion;
    public String[] Claves = new String[3];
    public String Descripcion;
    public String[] Temas = new String[3];
    public int Copias;
    public String Categoria;
    public int Ejemplares;
    
    public Revista_201700857(String a, int y, String t, int e, String c1,String c2, String c3, String d, String t1, String t2, String t3, int c, String cat, int eje){
        this.Autor=a;
        this.Año=y;
        this.Titulo=t;
        this.Edicion=e;
        this.Claves[0]=c1;
        this.Claves[1]=c2;
        this.Claves[2]=c3;
        this.Descripcion=d;
        this.Temas[0]=t1;
        this.Temas[1]=t2;
        this.Temas[2]=t3;
        this.Copias=c;
        this.Categoria=cat;
        this.Ejemplares=eje;
    }
}
