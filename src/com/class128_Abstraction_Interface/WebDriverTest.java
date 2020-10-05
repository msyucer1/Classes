package com.class128_Abstraction_Interface;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver obj = new FirefoxDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.findElement();
		obj.maximizeWindows();
		
		WebDriver obj1 = new ChromeDriver();
		obj1.openBrowser();
		obj1.closeBrowser();
		obj1.findElement();
		obj1.maximizeWindows();
		
	}
}
