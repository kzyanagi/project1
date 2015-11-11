package jp.co.iscj.sample;

import junit.framework.TestCase;

public class Sample2Test extends TestCase {

	public void testCase1(){
		Sample2 smp= new Sample2();

		assertFalse(smp.func2(0));

	}

}
