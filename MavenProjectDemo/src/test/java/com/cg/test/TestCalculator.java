package com.cg.test;

import org.junit.Test;

import junit.framework.Assert;

import com.cg.bean.Calculator;

public class TestCalculator {

	
	@Test
	public void test_add(){
		Calculator calc=new Calculator();
		int res=calc.add(6, 2);
		Assert.assertEquals(8, res);
	}
	
	@Test
	public void test_subtract(){
		Calculator calc=new Calculator();
		int res=calc.subtract(6, 2);
		Assert.assertEquals(4, res);
	}
	
	
	@Test
	public void test_mul(){
		Calculator calc=new Calculator();
		int res=calc.mul(6, 2);
		Assert.assertEquals(12, res);
	}
	
	@Test
	public void test_calcSquare(){
		Calculator calc=new Calculator();
		int res=calc.calcSquare(6);
		Assert.assertEquals(36, res);
	}
}
