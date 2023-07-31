import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScenarioTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the system property to use FirefoxDriver
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        // Instantiate FirefoxDriver
        driver = new FirefoxDriver();
    }

    @Test
    public void testScenario() {
        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to "http://iamneo.ai"
        driver.get("http://iamneo.ai");

        // Navigate to "https://www.facebook.com"
        driver.get("https://www.facebook.com");

        // Navigate back to the iamneo.ai website
        driver.navigate().back();

        // Print the URL of the current page
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
