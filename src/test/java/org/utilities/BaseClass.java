package org.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Actions a;
	public static WebDriver driver;

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void closeChrome() {
		driver.close();

	}

	public static void screenshot(String name) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;

		File src = tk.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Kannan\\EclipseProjects\\FacebookProject\\target\\screenshots\\" + name + ".jpg");

		FileUtils.copyFile(src, des);
	}

	public static void quitChrome() {
		driver.quit();
	}

	public static void doubleC(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void rightClick(WebElement ele) {

		a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	public static void move(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();

	}

	public static void dragDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}

}
