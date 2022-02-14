package com.stepdefinitions;

import com.BaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public void BeforeExecution() {
		LaunchBrowser();
		MaxiWindow();
		LoadUrl("https://adactinhotelapp.com/index.php");
		
	}
	@After
	public void AfterExecution() {
		quitBrowser();
		
		
	}

}
