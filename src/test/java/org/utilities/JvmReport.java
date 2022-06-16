package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void gerateJvmReport(String jsonFile) {
		// TODO Auto-generated method stub
		
		
		//1. Mention the target folder location
		
		File f = new File(System.getProperty("user.dir")+"\\target\\reports\\JvmReport");
		
		//2. Add the details to the report using Config class
		
		Configuration con = new Configuration(f, "Facebook Application");
		con.addClassifications("Platform Name", "Windows 10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "101");
		con.addClassifications("Sprint Name", "32.0");
		
		//3. Single String Json file to List<String>
		
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);
		
		//4.`Create Object for Report Builder class and call generate report method
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
		
		
		
		

	}

}
