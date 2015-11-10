package jp.co.iscj.sample;

import junit.framework.TestCase;

public class Sample1Test extends TestCase {

	public void testCase1(){
		Sample1 smp= new Sample1();

		assertTrue(smp.func1("ISCJ"));

		assertFalse(smp.func1(""));

		assertTrue(smp.func2("ISCJ"));

		assertFalse(smp.func2(null));

	}

}
