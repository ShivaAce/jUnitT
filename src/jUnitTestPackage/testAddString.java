package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFun junit= new jUnitFun();
		String result=junit.addString("Bennett","University");
		assertEquals("BennettUniversity",result);
	}

}
