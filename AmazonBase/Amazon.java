package Nov2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pom.Homepage;
import Pom.Setup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Amazon
{
	AndroidDriver<MobileElement> ad;
	
	@BeforeTest(description = "load")
	void setUp()
	{
		Setup s=new Setup();
		s.setup();
		
	}

	
	@Test
	void homepage()
	{
		Homepage hp=new Homepage(ad);
		System.out.println(hp.homepage(ad));
	}
}
