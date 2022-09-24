package com.junit;

import org.junit.Test;


public String analyzeMood(String message) {
	if(message.contains("sad"))
		return "SAD";
	else
		return "HAPPY";
}
}
