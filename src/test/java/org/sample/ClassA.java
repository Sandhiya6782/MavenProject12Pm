package org.sample;

import org.helper.BaseClass;
import org.pojo.FbPojo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA extends BaseClass {
	@Test
	private void tc1() {
		System.out.println("test1");
		Assert.assertTrue(false);


	}
	@Test
	private void tc2() {
		System.out.println("test2");
	}
	@Test
	private void tc3() {
		System.out.println("test3");
		Assert.assertTrue(false);

	}


}
