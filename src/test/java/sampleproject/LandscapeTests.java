package sampleproject;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class LandscapeTests extends BaseClass {

	@Test(priority = 1)
	public void scrollUp() throws InterruptedException {

		// rotate device to landscape
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(7000);

		// swipe page up
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);
		Thread.sleep(5000);
		System.out.println("scrollUp done.....");
	}

	@Test(priority = 2)
	public void scrollDown() throws InterruptedException {

		// swipe page down
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "down");
		driver.executeScript("mobile: swipe", args);
		Thread.sleep(5000);
		System.out.println("scrollDown done.....");
	}

	@Test(priority = 3)
	public void buttons() throws InterruptedException {

		driver.findElement(By.id("AAPLButtonViewController")).click();
		Thread.sleep(2000);
		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("UICatalog");
		element.click();
		Thread.sleep(2000);
		System.out.println("Completed buttons.....");

	}

}
