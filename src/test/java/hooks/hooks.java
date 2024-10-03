package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utility.ConfigReader;
import webdriver.BaseClass;

import java.util.Properties;


public class hooks {
    public static WebDriver driver;
    private Properties properties;

    @Before
    public void startUp() {
        ConfigReader configReader = new ConfigReader();
        this.properties = configReader.init_prop();

        String browser = properties.getProperty("browser"); // Default to Chrome if no browser is provided
        driver = BaseClass.createDriver(browser);
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}