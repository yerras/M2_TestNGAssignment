package uk.epreuveiot.com;

import org.testng.annotations.*;

public class TestNGAssignment {
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

    @Test(dependsOnGroups = "smoketest", groups = {"functest"})
    public void testFuncCase1() {
        System.out.println("                                                        --Functional test case 1");
    }

    @Test(dependsOnGroups = "smoketest", groups = {"functest"})
    public void testFuncCase2() {
        System.out.println("                                                        --Functional test case 2");
    }

    @Test(dependsOnGroups = "smoketest", groups = {"functest"})
    public void testFuncCase3() {
        System.out.println("                                                        --Functional test case 3");
    }

    @Test(priority = 1, description = "First Priority Test", groups = {"functest", "regtest", "smoketest"})
    public void testFuncCase4() {
        System.out.println("                                                        --Functional(+Regression+Smoke) test case 4");
    }

    @Test(priority = 2, description = "Second Priority Test", groups = {"functest", "smoketest"})
    public void testFuncCase5() {
        System.out.println("                                                        --Functional(+Smoke) test case 5");
    }

    @Test(priority = 3, description = "Third Priority Test", groups = {"regtest", "functest"})
    public void testRegCase1() {
        System.out.println("                                                            ---Regression(+Functional) test case 1");
    }

    @Test(priority = 4, description = "Fourth Priority Test", groups = {"regtest", "smoketest"})
    public void testRegCase2() {
        System.out.println("                                                            ---Regression(+Smoke) test case 2");
    }

    @Test(dependsOnGroups = "functest", groups = {"regtest"})
    public void testRegCase3() {
        System.out.println("                                                            ---Regression test case 3");
    }

    @Test(groups = {"smoketest"})
    public void testSmokeCase1() {
        System.out.println("                                                    +++Smoke Test Case 1");
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
