package com.class129_Encapsulation;

public interface WebDriver extends TakeScreenShot, Executes{

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
	
	
}
