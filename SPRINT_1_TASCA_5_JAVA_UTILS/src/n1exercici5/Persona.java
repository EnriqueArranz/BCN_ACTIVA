package n1exercici5;

import java.io.Serializable;

public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nom;
	int edat;

	public Persona(String nom, int edat) {
		super();
		this.nom = nom;
		this.edat = edat;
	}

}
