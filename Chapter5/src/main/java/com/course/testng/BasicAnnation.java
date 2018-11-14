package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnation {

    @BeforeSuite
    public  void BeforeSuite(){
        System.out.println("这是在测试套件前执行");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("这是在测试套件后执行");
    }

    @BeforeClass
    public  void BeforeClass(){
        System.out.println("这是在测试类前执行");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("这是在测试类后执行");
    }

    @BeforeTest
    public  void BeforeTest(){
        System.out.println("这是在测试方法前执行0000");
    }
    @AfterTest
    public  void AfterTest(){
        System.out.println("这是在测试方法后执行0000");
    }
    @BeforeMethod
    public  void BeforeMethod(){
        System.out.println("这是在测试方法前执行");
    }
    @AfterMethod
    public  void AfterMethod(){
        System.out.println("这是在测试方法后执行");
    }
    @Test()
    public  void test01(){
        System.out.println("这是测试用例1");
    }

    @Test
    public  void test02(){
        System.out.println("这是测试用例2");
    }
}
