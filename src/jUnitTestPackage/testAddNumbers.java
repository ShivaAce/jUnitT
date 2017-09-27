 package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFun junit= new jUnitFun();
		int result=junit.addNum(100,200);
		assertEquals(300,result);
	}

}
