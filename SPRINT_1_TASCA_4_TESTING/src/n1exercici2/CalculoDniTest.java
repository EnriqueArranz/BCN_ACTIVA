package n1exercici2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculoDniTest {

	@ParameterizedTest // TEST QUE SE EJECUTA MULTIPLES VECES CON DIFERENTES CONJUNTOS DE ARGUMENTOS
	@MethodSource("letrasEsperadas") // REFERENCIA A UN METODO CON LOS ARGUMENTOS NECESARIOS PARA EL TEST
	public void testCalcularLetraDni(int numeroDni, char letraEsperada) {
		char letraCalculada = CalculoDni.calcularLetraDni(numeroDni);
		assertEquals(letraEsperada, letraCalculada);
	}

	private static Object[][] letrasEsperadas() {
		return new Object[][] { { 12345678, 'Z' }, { 98765432, 'M' }, { 54321987, 'N' }, { 11111111, 'H' },
				{ 99999999, 'R' }, { 55555555, 'K' }, { 88888888, 'Y' }, { 44444444, 'A' }, { 66666666, 'Q' },
				{ 77777777, 'B' } };
	}
}

//	 public void testCalcularLetraDni() {
//	        int[] numerosDni = {12345678, 98765432, 54321987, 11111111, 99999999, 55555555, 88888888, 44444444, 66666666, 77777777};
//	        char[] letrasEsperadas = {'Z', 'M', 'N', 'H', 'R', 'K', 'Y', 'A', 'Q', 'B'};
//
//	        for (int i = 0; i < numerosDni.length; i++) {
//	            char letraCalculada = CalculoDni.calcularLetraDni(numerosDni[i]);
//	            assertEquals(letrasEsperadas[i], letraCalculada);
//	        }
//	    }
