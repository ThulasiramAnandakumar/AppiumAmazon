package Pom;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Setup 
{
	
	public DesiredCapabilities setup()
	{
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability("platformName", "Android");
		dc.setCapability("automation_Name", "UiAutomator2");
		dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");

		return dc;
	}

}
