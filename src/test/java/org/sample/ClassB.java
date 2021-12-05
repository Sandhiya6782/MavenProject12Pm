package org.sample;

import org.testng.annotations.Test;

public class ClassB {
	@Test
	private void tc11() {
		System.out.println("test11:"+Thread.currentThread().getId());

	}
	@Test
	private void tc22() {
		System.out.println("test22:"+Thread.currentThread().getId());

	}
	@Test
	private void tc33() {
		System.out.println("test33:"+Thread.currentThread().getId());

	}


}
