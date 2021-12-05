package org.sample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {
	int min = 0, max = 3;

	public boolean retry(ITestResult arg0) {
		if (min < max) {
			min++;
			return true;
		}

		return false;
	}

} 

//tc1=== failed
//tc2.....passed
//tc3....failed......min=0  0<3t   rerun
//tc3.....failed     min=1  1<3t   rerun
// tc3...failed      min=2  2<3t....rerun
//tc4=3....failed    min=3  3<3f.................return false

