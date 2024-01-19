package n1exercici1;

public class MAIN {

	public static void main(String[] args) {
     //Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
	
		
			String rutaDirectorio = "./src/directori";
			ListaDirectorio lista = new ListaDirectorio(rutaDirectorio);
			lista.listarContenido();
		}
	}


