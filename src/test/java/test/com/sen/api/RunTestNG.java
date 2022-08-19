package test.com.sen.api;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;


public class RunTestNG {
    private  final static Logger logger= Logger.getLogger(RunTestNG.class);
    public static void main(String [] args){
        logger.info("开始执行");
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("testng.xml");//需要调用的xml文件
        testNG.setTestSuites(suites);
        testNG.run();
        logger.info("执行完毕");
    }
}
