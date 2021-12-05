package org.sample;

import org.testng.annotations.Test;

public class FaceBook {
	@Test(groups="NewAcc")
	private void fName() {
		System.out.println("first name");
	}
	@Test(groups="NewAcc")
	private void lName() {
		System.out.println("Last name");
	}
	@Test(groups="log")
	private void email() {
		System.out.println("Email");
	}
	@Test(groups="log",priority=2)
	private void pass() {
		System.out.println("Pass");
	}
	@Test(groups="log",priority=3)
	private void login() {
		System.out.println("Login");
	}





}
