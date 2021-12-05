package org.sample;

import org.testng.annotations.Test;

public class ClassC {
	private void tc111() {
		System.out.println("test111:"+Thread.currentThread().getId());

	}
	@Test
	private void tc222() {
		System.out.println("test222:"+Thread.currentThread().getId());

	}
	@Test
	private void tc333() {
		System.out.println("test333:"+Thread.currentThread().getId());

	}


}
