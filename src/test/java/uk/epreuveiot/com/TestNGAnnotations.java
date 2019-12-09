package uk.epreuveiot.com;

import org.testng.annotations.*;

public class TestNGAnnotations {
    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("**Executing Before Suite Annotation");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println(" ***Executing Before Test Annotation");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println(" ****Executing Before Class Annotation");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println(" *****Executing Before Method Annotation");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("*****Executing After Method Annotation");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("****Executing After Class Annotation");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("***Executing After Test Annotation");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("**Executing After Suite Annotation");
    }



}
