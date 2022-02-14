package com.BaseClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public static void generateJVMReport(String jsonFile) {
	
	File file=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\AdactinReport");
	
	Configuration con=new Configuration(file, "AdactinWebAutomatin");
	con.addClassifications("FlatForm", "Windows");
	con.addClassifications("FlatFormVersion", "Windows10");
	con.addClassifications("Sprint", "36");
	con.addClassifications("BuildNumber", "WRYT6453");
	
	List<String> JFile=new ArrayList<String>();
	JFile.add(jsonFile);
	ReportBuilder b=new ReportBuilder(JFile, con);
	b.generateReports();
	
	
}
	}


