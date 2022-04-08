package test_package;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import reportingPackage.ExtentReportingManager;


public class LoginTest {
	public ExtentTest test;
	public ExtentReports report; 
	
	@BeforeTest
	public void init() {
	    report=ExtentReportingManager.getReporting_By_Manoj();
		test=report.createTest("Login Test Started... ");
	}
	
	@Test
	public void loginTest() throws IOException {
	    test.log(Status.INFO," Login Test Started .... ");	
	    System.out.println("   Login Done.... ");
	    test.addScreenCaptureFromPath("C:\\Users\\Manoj\\Desktop\\Login_Done.jpg", "File Open and Saved....");
	}
	
	@AfterTest
	public void tearDown() {
		 report.flush();	
		 test.log(Status.PASS, "Login End...");
	}
}
