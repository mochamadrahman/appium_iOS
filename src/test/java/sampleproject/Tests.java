package sampleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass {

	@Test
	public void buttons() throws InterruptedException {

		driver.findElement(By.id("AAPLButtonViewController")).click();
		Thread.sleep(10000);
		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("UICatalog");
		element.click();
		Thread.sleep(10000);
		System.out.println("Completed buttons.....");
		
	}
//	
	@Test
	public void actionSheets() throws InterruptedException {
		driver.findElement(By.id("AAPLActionSheetViewController")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Okay / Cancel")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("OK")).click();
		Thread.sleep(5000);
		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("UICatalog");
		element.click();
		Thread.sleep(10000);
		System.out.println("Completed actionSheets....."); 
		
	}

//	@Test
//	public void alertViews() throws InterruptedException {
//		driver.findElement(By.id("AAPLAlertViewController")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("Text Entry")).click();
//		Thread.sleep(2000);
//		driver.findElementById("E5000000-0000-0000-2702-000000000000E5000000-0000-0000-2702-000000000000").sendKeys("6666ßTest");
//		
//		
//		System.out.println("Completed activityIndicators...");

//	}

}
