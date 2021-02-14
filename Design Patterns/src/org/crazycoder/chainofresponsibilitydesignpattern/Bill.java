package org.crazycoder.chainofresponsibilitydesignpattern;

public class Bill extends Handler{
	@Override
	public Handler processWork() {
		System.out.println("Process is going on : "+this.getClass());
		return successor.processWork();
	}
}
