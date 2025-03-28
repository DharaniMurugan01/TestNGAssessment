package com.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclass implements ITestListener{
  public void onTestStart(ITestResult res) {
	  System.out.println("test start "+res.getName());
  }
  public void onTestStop(ITestResult res) {
	  System.out.println("test start "+res.getName());
  }  
  public void onTestSuccess(ITestResult res) {
	  System.out.println("test start "+res.getName());
  }
  public void onTestFailed(ITestResult res) {
	  System.out.println("test start "+res.getName());
  }
}
