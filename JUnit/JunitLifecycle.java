package com.junit.mevenjunt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitLifecycle {
	
	
	
	@Before
	public void beforeTestMethod()
	{
		System.out.println("Before -run before test method");
	}
	@After
	public void afterTestMethod()
	{
		System.out.println("after - run after test method");
	}
	@BeforeClass  // it runs first and execute once
	public static void runOnceBeforeClass()
	{
		System.out.println("Beforeclass- run before test method");
	}
	@AfterClass  // it runs last and execute once
	public static void runOnceAfterClass()
	{
		System.out.println("Afterclass - run after test method");
	}
	@Ignore
	public void ignore()
	{
		System.out.println("Ignore stmt.");
	}
	@Ignore
	@Test(timeout=1000)
	public void testTimeOut()
	{
		System.out.println("test timeout - 1s sec.");
	}
	@Test(timeout=500)
	public void testTimeOut1()
	{
		System.out.println("test timeout - 0.5 sec.");
	}
	@Test(timeout=500)
	public void testTimeOut2()
	{
		System.out.println("test timeoutdefault");
	}
	

}