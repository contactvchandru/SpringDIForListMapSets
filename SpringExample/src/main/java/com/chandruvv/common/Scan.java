package com.chandruvv.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Scan {
	
	@Autowired
	ScanImpl scanImpl;
	
	@Override
	public String toString() {
		return "Scan is called from Auto Scan" + "  And Autowired with" + scanImpl;
	}
}
