package mavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;


import mavenDemo.MavenDemo;

public class MavenTest {
	MavenDemo obj = new MavenDemo();
	String expectedTitle = "Demo Web Shop. Login";
	@Test
	public void checkTitle() {
		Assert.assertEquals(obj.getTitleDemo(),expectedTitle);
	
	}
}
