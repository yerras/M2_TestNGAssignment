package uk.epreuveiot.com;

import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGRegressionTests {

    @Test(priority = 3, description = "Third Priority Test", groups = {"regtest", "functest"})
    public void testRegCase1() {
        System.out.println("                                                            ∞∞∞ & ꭍ ---Regression(+Functional) test case 1");
    }

    @Test(priority = 4, description = "Fourth Priority Test", groups = {"regtest", "smoketest"})
    public void testRegCase2() {
        System.out.println("                                                            ∞∞∞ & (:-Q)---Regression(+Smoke) test case 2");
    }

    @Test(dependsOnGroups = "functest", groups = {"regtest"})
    public void testRegCase3() {
        System.out.println("                                                            ∞∞∞---Regression test case 3");
    }
    @Test(dependsOnGroups = "functest",groups = {"regtest"})
    public void testRegCase4(){
        throw new SkipException("Skipping this test as it is low priority");

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
