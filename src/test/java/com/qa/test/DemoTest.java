package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {

int a = 20 ; int b = 10;
	
@Test
public void add() {
	int a = 20 ; int b = 10;
	
	Assert.assertEquals(30, a+b);
	
}
@Test
public void sub() {
	int a = 20 ; int b = 10;
	Assert.assertEquals(10, a-b);

}
@Test
public void mul() {
	int a = 20 ; int b = 10;
	Assert.assertEquals(200, a*b);

}
@Test
public void div() {
	int a = 20 ; int b = 10;
	Assert.assertEquals(2, a/b);

	
}
	
	
	
	
}
