package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

public class ListenerReport extends BaseClass implements ITestListener{
    ExtentReports report;
    ExtentTest test;
	@Override
	public void onStart(ITestContext context) {
		report=ExtentReport.setUp(context.getSuite().getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest("Test Case Is start" +result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case Is Pass"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case Is Fail" +result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Case Is Skip" +result.getMethod().getMethodName());
	}

@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
