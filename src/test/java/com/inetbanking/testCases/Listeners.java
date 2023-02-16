package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.inetbanking.utilities.ExtentReportNG;

public class Listeners extends BaseClass implements ITestListener  {
	ExtentTest test;
	ExtentReports extent = ExtentReportNG.getReportObject();
	
	 public void onTestStart(ITestResult result) {
		 
		test = extent.createTest(result.getMethod().getMethodName());
		 
		 }
		 
		 public void onTestSuccess(ITestResult result) {
		 
			 test.log(Status.PASS, "Test Passed");
			 
		 }
		 
		 public void onTestFailure(ITestResult result) {
			 test.fail(result.getThrowable());
			 String filePath = null;
			 try {
			 filePath = getScreenshot(result.getMethod().getMethodName());
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
			 test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
			 
		 }
		 
		 

		

		public void onTestSkipped(ITestResult result) {
		 
		 System.out.println("Test Skipped" +result.getName());
		 
		 }
		 
		 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
		 System.out.println("Test Failed but within success percentage" +result.getName());
		 
		 }
		 public void onFinish(ITestContext context) {
			 
			 extent.flush();
		 }

}
