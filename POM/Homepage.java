package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage 
{

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/sso_continue")
	public static WebElement clickToContinue;
	
	public Homepage(AndroidDriver<MobileElement> d)
	{
		PageFactory.initElements(new AppiumFieldDecorator(d), this);
	}
	


	public String homepage(AndroidDriver<MobileElement> ad) 
	{
		ad.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	Homepage.clickToContinue.click();
		
		
		return ad.getTitle().toString();
	}
}
