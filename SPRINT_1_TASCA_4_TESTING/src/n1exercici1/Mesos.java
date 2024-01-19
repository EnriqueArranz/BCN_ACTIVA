package n1exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mesos {
	private List<String> llistaMesos;

	public Mesos() {
		llistaMesos = new ArrayList<>();
		inicialitzaLlista();
	}

	private void inicialitzaLlista() {
		String[] mesos = { "gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre",
				"novembre", "desembre" };

		// Afegim els mesos a la llista
		Collections.addAll(llistaMesos, mesos);
		
		
	}

	public List<String> getLlistaMesos() {
		return llistaMesos;
	}
}
