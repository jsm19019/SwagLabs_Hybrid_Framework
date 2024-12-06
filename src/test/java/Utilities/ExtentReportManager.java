package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter Extentspark;
	public ExtentReports Extentreport;
	public ExtentTest Extenttest;

	public void onTestStart(ITestResult result) {

		Extentspark = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/failed5.html");

		Extentspark.config().setDocumentTitle("QA Fox - Automation");
		Extentspark.config().setReportName("QA FOX - Automation Project");
		Extentspark.config().setTheme(Theme.STANDARD);

		Extentreport = new ExtentReports();
		Extentreport.attachReporter(Extentspark);

		Extentreport.setSystemInfo("OS", "Windows");
		Extentreport.setSystemInfo("Env", "QA");
		Extentreport.setSystemInfo("Browser", "Chrome");
	}

	public void onTestSuccess(ITestResult result) {

		Extenttest = Extentreport.createTest(result.getName());
		Extenttest.log(Status.PASS, "Test Case passed is:" + result.getName());
	}

	public void onTestFailure(ITestResult result) {

		Extenttest = Extentreport.createTest(result.getName());
		Extenttest.log(Status.FAIL, "Failed Testcase is: " + result.getName() + "Failed Testcase Exception: " + result.getThrowable());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		Extenttest = Extentreport.createTest(result.getName());
		Extenttest.log(Status.SKIP, "TestCase is SKIPPED is:" + result.getName());
	}

	public void onFinish(ITestContext context) {
		Extentreport.flush();
	}
}
