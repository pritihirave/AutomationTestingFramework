package JavaPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Page Locators

    By emailId=By.id("username");
    By password=By.id("password");
    By login=By.id("loginBtn");

    //Page action

    public String getLoginPageTitle()
    {
        return driver.getTitle();
    }
    public void doLogin(String username, String pwd)
    {
        doSendKeys(emailId,username);
        doSendKeys(password,pwd);
        doClick(login);

    }
}
