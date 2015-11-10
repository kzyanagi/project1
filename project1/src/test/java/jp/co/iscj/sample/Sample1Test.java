package jp.co.iscj.sample;

import junit.framework.TestCase;

public class Sample1Test extends TestCase {

	public void testCase1(){
		Sample2 smp= new Sample2();

		assertFalse(smp.func2(0));

	}

}
