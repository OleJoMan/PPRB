import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
////        SingletonProjectGetTest stGet = new SingletonProjectGetTest();
//        TestNG stGet = new TestNG();
//        XmlSuite getSuite = new XmlSuite();
//        getSuite.setName("testGet");
//
//        XmlTest getTest = new XmlTest(getSuite);
//        getTest.setName("GetTest");
//
//        List<XmlClass> myClasses = new ArrayList<XmlClass>();
//        myClasses.add(new XmlClass("SingletonProjectGetTest"));
//
//        getTest.setXmlClasses(myClasses);
//
//        List<XmlTest> myTests = new ArrayList<XmlTest>();
//        myTests.add(getTest);
//
//
//        getSuite.setTests(myTests);
//
//
//        List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
//        mySuites.add(getSuite);
//
//        stGet.setXmlSuites(mySuites);
//
//        stGet.run();
        Map<String, String> params = new HashMap<String, String>();
        params.put("index", new String("2"));
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
}

