package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReport extends BaseClass{
 
	public static ExtentReports setUp(String reportNmae) {
		String path=System.getProperty("user.dir")+"//ExtentReports//"+reportNmae+getDate()+".html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		ExtentReports exts=new ExtentReports();
		exts.attachReporter(report);
	return exts;
		
	}
	
	public static String getDate() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(getDate()) ;
		
	}
	
	public static String TakescreenShot(String Foldername,String screenshotname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		String Path=System.getProperty("user.dir")+"//"+Foldername+"//"+screenshotname+getDate()+".png";
		FileUtils.copyFile(f, new File(Path));
		return Path;
		
	}
}
