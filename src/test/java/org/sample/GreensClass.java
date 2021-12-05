package org.sample;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class GreensClass {
	@Test
	public void tc1() {
		Assert.assertTrue("check tc1",false);
		System.out.println("test1");
	}
	@Test
	public void tc2() {
		System.out.println("test2");
	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("test3");
	}

}
