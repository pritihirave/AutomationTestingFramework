package TestPageObject;

import JavaPageObject.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;

    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app-na2.hubspot.com/login/legacy?loginRedirectUrl=https%3A%2F%2Fapp-na2.hubspot.com%2Fcontacts%2F243053421%2Fobjects%2F0-1%2Frestore&authFailureReason=401%20Unauthorized&loginPortalId=243053421");

        //create obj of page class
        page=new Page(driver,wait);

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
