package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		}
public void LoadUrl (String Url) {
	driver.get(Url);
}
public void MaxiWindow() {
	driver.manage().window().maximize();
	
}

public void Type(WebElement e,String Value) {
	e.sendKeys(Value);
}
public void Btnclick(WebElement e) {
	e.click();
}
public String GetText(WebElement e,String Value) {
	 String t = e.getAttribute(Value);
return t;
}
public void SelectDropDown(WebElement e,int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
}
public String GetCurrentUrlWeb() {
	String url = driver.getCurrentUrl();
return url;
}
public void SelectByValue(WebElement e,String value) {
Select s=new Select(e);
s.selectByValue(value);
}
public boolean IsD(WebElement e) {
	boolean displayed = e.isDisplayed();
	return displayed;
	
	
}
public void Clear(WebElement e) {
	e.clear();
}
public void sleep() {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

public String getcurrentText(WebElement e) {
	String text = e.getText();
	System.out.println(text);
	return text;
}
public String Print(WebElement e) {
	String Text = e.getAttribute("value");
System.out.println("Order Number Is "+Text);
return Text;
}
public void quitBrowser() {
	driver.quit();
	
}

}