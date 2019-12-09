package uk.epreuveiot.com;

import org.testng.annotations.*;

public class TestNGFunctionalTests {

    @Test(dependsOnGroups = "smoketest", groups = {"functest"})
    public void testFuncCase1() {
        System.out.println("                                                        ꭍ--Functional test case 1");
    }

    @Test(dependsOnGroups = "smoketest", groups = {"functest"})
    public void testFuncCase2() {
        System.out.println("                                                        ꭍ--Functional test case 2");
    }

    @Test(dependsOnGroups = "smoketest", groups = {"functest"})
    public void testFuncCase3() {
        System.out.println("                                                        ꭍ--Functional test case 3");
    }

    @Test(priority = 1, description = "First Priority Test", groups = {"functest", "regtest", "smoketest"})
    public void testFuncCase4() {
        System.out.println("                                                        ꭍ & ∞∞∞ & (:-Q)--Functional(+Regression+Smoke) test case 4");
    }

    @Test(priority = 2, description = "Second Priority Test", groups = {"functest", "smoketest"})
    public void testFuncCase5() {
        System.out.println("                                                        ꭍ & (:-Q)--Functional(+Smoke) test case 5");
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
}
