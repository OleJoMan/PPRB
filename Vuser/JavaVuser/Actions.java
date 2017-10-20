/*
 * LoadRunner Java script. (Build: _build_number_)
 * 
 * Script Description: 
 *                     
 */
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;
import lrapi.lr;
import java.util.HashMap;
import java.util.Map;

public class Actions
{	
	public int init() throws Throwable {
		return 0;
	}//end of init


	public int action() throws Throwable {
		lr.start_transaction("getTest");
		getTest();
		lr.end_transaction("getTest", lr.AUTO);

		lr.start_transaction("changeTest");		
		changeTest(lr.eval_string("{count}"));
		lr.end_transaction("changeTest", lr.AUTO);
		return 0;
	}//end of action

	public static void changeTest(String index){
        Map<String, String> params = new HashMap<String, String>();
        
        params.put("index", index);
        
        TestNG stChange = new TestNG();

        XmlSuite changeSuite = new XmlSuite();
        changeSuite.setName("Change Suite");

        XmlTest changeTest = new XmlTest(changeSuite);
        changeTest.setName("Change Test");

        changeTest.setParameters(params);

        List<XmlClass> myClasses = new ArrayList<XmlClass>();
        myClasses.add(new XmlClass("SingletonProjectChangeTest"));

        changeTest.setXmlClasses(myClasses);

        List<XmlTest> myTests = new ArrayList<XmlTest>();
        myTests.add(changeTest);

        changeSuite.setTests(myTests);

        List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
        mySuites.add(changeSuite);

        stChange.setXmlSuites(mySuites);

        stChange.run();
	}
	
	public static void getTest(){
        TestNG stGet = new TestNG();
        XmlSuite getSuite = new XmlSuite();
        getSuite.setName("Get Suite");

        XmlTest getTest = new XmlTest(getSuite);
        getTest.setName("Get Test");

        List<XmlClass> myClasses = new ArrayList<XmlClass>();
        myClasses.add(new XmlClass("SingletonProjectGetTest"));

        getTest.setXmlClasses(myClasses);

        List<XmlTest> myTests = new ArrayList<XmlTest>();
        myTests.add(getTest);

        getSuite.setTests(myTests);

        List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
        mySuites.add(getSuite);
        
        stGet.setXmlSuites(mySuites);
        
        stGet.run();
        
	}
	public int end() throws Throwable {
		return 0;
	}//end of end
}
