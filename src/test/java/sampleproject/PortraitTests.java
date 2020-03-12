package sampleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class PortraitTests extends BaseClass {

	@Test(priority = 1)
	public void actionSheets() throws InterruptedException {

//		// rotate device to portrait
		driver.rotate(ScreenOrientation.PORTRAIT);

		driver.findElement(By.id("AAPLActionSheetViewController")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Okay / Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("OK")).click();
		Thread.sleep(2000);
		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("UICatalog");
		element.click();
		Thread.sleep(2000);
		System.out.println("Completed actionSheets.....");

	}

}
