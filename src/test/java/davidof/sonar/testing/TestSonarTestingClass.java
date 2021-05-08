package davidof.sonar.testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestSonarTestingClass {

	@Test
	public void testGetTrue() {
		SonarTestingClass sonar = new SonarTestingClass();
		Assert.assertTrue(sonar.getTrue());
	}

}
