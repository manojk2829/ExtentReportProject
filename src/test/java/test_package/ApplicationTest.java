package test_package;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import reportingPackage.ExtentReportingManager;

public class ApplicationTest {
    public ExtentReports report;
    public ExtentTest test;
	
    @BeforeTest
	public void init() {
        report=ExtentReportingManager.getReporting_By_Manoj();
        test=report.createTest("Login test Started.... ");
	}


	@Test
	public void loginTest() {
		System.out.println("Login Facebook Application Done......");
		test.log(Status.INFO, "Information of test Login");
		test.log(Status.PASS, "Report Passing......");
	}

	@AfterTest
	public void tearDown() {
		report.flush();
	}

}
