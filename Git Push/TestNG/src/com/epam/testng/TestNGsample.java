package com.epam.testng;

import org.testng.annotations.Test;

public class TestNGsample {
	
	@Test(priority=1, description = "This test case will verify login functionality ")
	public void loginApplication() {
		System.out.println("This is sample login application");
	}
   
	@Test(priority=2, description = "This test case will add the items ")
	public void items() {
		System.out.println("Select the items you want to buy");
	}
	
	@Test(priority=3, description = "This test case will checkout for the bill")
	public void checkout() {
		System.out.println("Checkout the items and take the bill");
	}
	
}
