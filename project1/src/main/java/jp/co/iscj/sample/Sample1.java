package jp.co.iscj.sample;

public class Sample4 {

	public boolean func1(String str){
		if (str.equals("ISCJ")){
			System.out.println("this is iscj");
			return true;

		}else{
			return false;
		}
	}

	public boolean func2(String str){
		if ("ISCJ".equals(str)){
			System.out.println("this is iscj");
			return true;

		}else{
			return false;
		}
	}

}
