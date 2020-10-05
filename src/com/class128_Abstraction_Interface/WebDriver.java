package com.class128_Abstraction_Interface;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindows();
	void findElement();
	
}

class ChromeDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("you can open CHROME browser easily");
	}

	@Override
	public void closeBrowser() {
		System.out.println("you can close CHROME browser easily");
	}

	@Override
	public void maximizeWindows() {
		System.out.println("you can maximize windows by using START and + buttons together in CHROME browser");
	}

	@Override
	public void findElement() {
		System.out.println("you can find elements by using CTRL+F buttons together in CHROME browser ");
	}
}

class FirefoxDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("you can open FIREFOX browser easily");
	}

	@Override
	public void closeBrowser() {
		System.out.println("you can open FIREFOX browser by press X button");
	}

	@Override
	public void maximizeWindows() {
		System.out.println("you can maximize windows by using SHIFT and + buttons together in FIREFOX browser");
	}

	@Override
	public void findElement() {
		System.out.println("you can find elements by using SHIFT+F buttons together in FIREFOX browser ");
	}
}
