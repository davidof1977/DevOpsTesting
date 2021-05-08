package davidof.sonar.testing;

import org.junit.Assert;
import org.junit.Test;

public class TestSonarTestingClass {

	@Test
	public void testGetTrue() {
		SonarTestingClass sonar = new SonarTestingClass();
		Assert.assertTrue(sonar.getTrue());
	}
	
	@Test
	public void testGetFalse() {
		SonarTestingClass sonar = new SonarTestingClass();
		Assert.assertFalse(sonar.getFalse());
	}

}
