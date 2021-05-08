package davidof.sonar.testing;

import org.junit.Assert;
import org.junit.Test;

public class TestOtraClase {

	@Test
	public void testGetNombre() {
		OtraClase otra = new OtraClase();
		Assert.assertNotEquals("Felix", otra.getNombre());
	}

}
