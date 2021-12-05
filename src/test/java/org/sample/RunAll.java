package org.sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunAll {
	@Test
	public void tc1() {
		Result r = JUnitCore.runClasses();
		System.out.println("failure count:"+r.getFailureCount());
		System.out.println("ignored:"+r.getIgnoreCount());
		System.out.println("runtime:"+r.getRunTime());
		System.out.println("runcount:"+r.getRunCount());
		System.out.println("\n failures");
		List<Failure> fail = r.getFailures();
		for (int i = 0; i < fail.size(); i++) {
			Failure f = fail.get(i);
			System.out.println(f);
		}
		int run=r.getRunCount()-r.getFailureCount();
		System.out.println("passed count:"+run);
		
	}

}
