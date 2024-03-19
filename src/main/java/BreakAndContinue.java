package com.qualizeal.javaapp.breakcontinue;

public class BreakAndContinue {
	public void breakDemo() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
	public void continueDemo() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
		
