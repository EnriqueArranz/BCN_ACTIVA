package n1exercici2;



public class MAIN {

	public static void main(String[] args) {
		// Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un
		// arbre de directoris amb el contingut de tots els seus nivells (recursivament)
		// de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada
		// nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva
		// última data de modificació.

		// LISTAMOS CONTENIDO Y LO CLASIFICAMOS EN DIRECTORIO(D) O ARCHIVO (F) DE FORMA
		// RECURSIVA
		String rutaDirectorio = "./src/directori";
		ListaDirectorio lista = new ListaDirectorio(rutaDirectorio);
		lista.listarContenido();
	}

}
