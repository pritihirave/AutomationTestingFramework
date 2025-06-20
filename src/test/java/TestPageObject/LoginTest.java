package TestPageObject;


import JavaPageObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends BaseTest {
    @Test(priority = 1)
    public void verifyLoginPageTitleTest()
    {
      String title=  page.getInstance(LoginPage.class).getLoginPageTitle();
      System.out.println("Title of the page is: "+title);
        Assert.assertEquals(title,"HubSpot Login and Sign in");
    }
    @Test(priority = 2)
    public void loginTest()
    {
        page.getInstance(LoginPage.class).doLogin("pritihirave@gmail.com","**");
    }
}
