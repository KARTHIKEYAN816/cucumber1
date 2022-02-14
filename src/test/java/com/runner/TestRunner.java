package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.BaseClass.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="com.stepdefinitions",dryRun=false,
plugin= {"junit:src\\test\\resources\\AdactinReport\\Adactin.xml","html:src\\test\\resources\\AdactinReport\\",
		"json:src\\test\\resources\\AdactinReport\\Adactin.json"})
public class TestRunner {
	
@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\AdactinReport\\Adactin.json");
		
		
	}


}

	

