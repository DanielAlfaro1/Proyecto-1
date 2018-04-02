package proyecto1_201700857;


public class clasePrincipal_201700857 {
    public static int contAl=0,contMa=0;
        public static usuario_201700857 admin[]=new usuario_201700857[1];
        public static usuario_201700857 alumno[]=new usuario_201700857[11];
        public static usuario_201700857 maestro[]=new usuario_201700857[11];
        public static VError_201700857 VError;
        public static VError_201700857 VExiste;
        public static VAdmin_201700857 VAdmin;
        public static V1_201700857 ventana;
        public static VCUsuario_201700857 VCusuario;
        public static VModUsuario_201700857 VModU;
        public static VEUsuario_201700857 VEU;
    public static void main(String[] args) {
        int e=1,m=1;
        String mensaje="<html><body>EL USUARIO Y CONTRASEÑA NO COINCIDEN <br> POR FAVOR REVISE SUS DATOS.</body></html>";
        String existencia="<html><body>EL USUARIO NO EXISTE POR FAVOR PONGASE<br> EN CONTACTO CON EL ADMINISTRADOR<br>PARA SOLICITAR SU REGISTRO.</body></html>";
        
        admin[0]=new Admin_201700857("admin","admin","admin","admin","admin","admin");/*Aqui le di los valores
        al objeto admin el cual quiero que sea leido cuando haga el login
        */
        alumno[0]=new Estudiante_201700857("3006786905050","Joselito","Joselito2","Estrenador","Estudiante","miquillo");
        
        maestro[0]=new Maestro_201700857("215411845411","Michael","Michael2","Coestrenador","Maestro","Biblio");
        for (usuario_201700857 u:admin){
            System.out.println(u.mostrar_datos());
        }
        for(int a=1;a<alumno.length;a++){
            alumno[a]=new Estudiante_201700857(" "," "," "," "," "," ");
                       
        }
        for(int b=1;b<maestro.length;b++){
            maestro[b]=new Maestro_201700857(" "," "," "," "," "," ");
            
        }
        for(usuario_201700857 ad:admin){
            System.out.println(ad.mostrar_datos());
        }
        for(usuario_201700857 al:alumno){
            System.out.println(al.mostrar_datos());
        }
        for(usuario_201700857 ma:maestro){
            System.out.println(ma.mostrar_datos());
        }
        ventana = new V1_201700857();//Aquí creo la primera ventana donde dice login        
//        VLogin_201700857 VLog = new VLogin_201700857();
        VError = new VError_201700857(mensaje);
        VExiste = new VError_201700857(existencia);
        VAdmin = new VAdmin_201700857();
        VCusuario = new VCUsuario_201700857();
        VModU = new VModUsuario_201700857();
        VEU = new VEUsuario_201700857();
    }
    
}
