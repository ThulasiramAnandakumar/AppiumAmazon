package Appium_Oct8.Appium_Oct8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Amazon 
{

	@Test
	void Run()
	{
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability("deviceName","OnePlus 6T");
		dc.setCapability("platformName", "Android");
		dc.setCapability("automation_Name", "UiAutomator2");
		dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");

		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(dc);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sso_continue")).click();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).click();


		WebDriverWait wait=new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")));
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("Iphone 13 mini");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"iphone 13 mini 128\")])[1]")));
		driver.findElement(By.xpath("(//*[contains(@text,\"iphone 13 mini 128\")])[1]")).click();

		driver.findElementByAndroidUIAutomator
		("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "Apple iPhone 13 Mini (256GB) - Starlight"
				+ "\").instance(0))")
		.click();
		
		driver.findElementByAndroidUIAutomator
		("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "Add to Cart"
				+ "\").instance(0))")
		.click();
		
	


	}

}
