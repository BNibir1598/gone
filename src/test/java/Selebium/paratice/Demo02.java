package Selebium.paratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo02 {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver();
        // Instantiate ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleHomePage() {
        // Navigate to Google
        driver.get("https://google.com");

        // Additional checks can be added here
        String title = driver.getTitle();
        System.out.println("Page title is:Nibir" + title);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        // Close the browser
        if (driver != null) {
            driver.close();
            driver.wait();
        }
    }
    
    // Existing test cases would go here
}


