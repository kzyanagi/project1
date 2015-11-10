package jp.co.iscj.sample;

public class Sample2 {

	public boolean func2(int num){

		boolean result=false;

		if ("0".equals(num)){
			System.out.println("this is 0");
			result =true;
		}else{
			result =false;
		}

		return result;
	}

}
