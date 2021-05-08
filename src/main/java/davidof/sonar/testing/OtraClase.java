package davidof.sonar.testing;

public class OtraClase {
	
	private static final String NOMBRE_CHICO = "David";
	private static final String NOMBRE_CHICA = "Ana";
	
	public String getNombre(boolean male) {
		if (male)
			return NOMBRE_CHICO;
		else
			return NOMBRE_CHICA;
	}

}
