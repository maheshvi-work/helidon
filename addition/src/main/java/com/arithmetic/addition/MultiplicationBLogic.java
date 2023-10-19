package com.arithmetic.addition;


import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MultiplicationBLogic {
	public int execute(int a, int b,int c) {
		System.out.println(" MultiplicationBLogic.execute(" + a + "," + b + ","+ c  +")");
		return a * b *c;
	}
}
