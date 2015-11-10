package jp.co.iscj.sample;
import junit.framework.TestCase;

public class CancatSampleTest  extends TestCase {


	public void testCase1(){

		ConcatSample samp=new ConcatSample();

		String result=samp.add("AAAA","BBBB");

		assertEquals("AAAA/BBBB", result);

	}

}
