import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/* Please follow this website for more testng code details
https://www.softwaretestingmaterial.com/category/testng/ */
public class SoftAssertion {

    @Test
    public void softAssert(){
        SoftAssert softAssertion= new SoftAssert();
        System.out.println("softAssert Method Was Started");
        softAssertion.assertTrue(true);
        System.out.println("softAssert Method Was Executed");
    }

    @Test
    public void hardAssert(){
        System.out.println("hardAssert Method Was Started");
        Assert.assertTrue(false);
        System.out.println("hardAssert Method Was Executed");
    }
}