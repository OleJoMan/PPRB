/*
 * LoadRunner Java script. (Build: _build_number_)
 * 
 * Script Description: 
 *                     
 */
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lrapi.lr;

public class Actions
{

	public int init() throws Throwable {
		return 0;
	}//end of init


	public int action() throws Throwable {
		getTest();
		changeTest(5, "test");
		return 0;
	}//end of action

	private static void getTest(){
		SingletonProjectGetTest s = new SingletonProjectGetTest();
		s.setSt();
		try {
			s.testGet();
		} 
		catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}
	
		private static void changeTest(int index, String value){
		SingletonProjectChangeTest s = new SingletonProjectChangeTest();
		s.setSt();
		try {
			s.testChange(index,value);
		} 
		catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public int end() throws Throwable {
		return 0;
	}//end of end
}
