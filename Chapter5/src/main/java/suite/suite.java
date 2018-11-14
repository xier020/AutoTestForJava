package suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class suite {
    @BeforeMethod
    public void BeforeMethod(){
        System.out.print("加载。。。。");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.print("结束。。。。");
    }
}
