package test_package;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import reportingPackage.ExtentReportingManager;

public class RegistationTest {
	public ExtentTest test;
	public ExtentReports report; 
	
	@BeforeTest
	public void init() {
	    report=ExtentReportingManager.getReporting_By_Manoj();
		test=report.createTest("Registration Test Started... ");
	}
	
	@Test
	public void registrationTest() {
	    test.log(Status.INFO," Registration Done.... ");	
	    System.out.println("   Registration Done....  ");
	}
	
	@AfterTest
	public void tearDown() {
		 test.log(Status.PASS, "Registration End...");
	     report.flush();
	}
}
