import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirefoxScenarioTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path of the geckodriver executable.
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test(priority = 1)
    public void openFirefoxAndMaximize() {
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void navigateToIamNeoWebsite() {
        driver.get("http://iamneo.ai");
    }

    @Test(priority = 3)
    public void navigateToFacebookPage() {
        driver.get("https://www.facebook.com");
    }

    @Test(priority = 4)
    public void navigateBackToIamNeoWebsite() {
        driver.navigate().back();
    }

    @Test(priority = 5)
    public void printCurrentURL() {
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    @Test(priority = 6)
    public void navigateForward() {
        driver.navigate().forward();
    }

    @Test(priority = 7)
    public void reloadPage() {
        driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
