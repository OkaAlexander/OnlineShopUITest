package baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.RegisterUserPage;

public class BaseClass {
    protected static RegisterUserPage registerUserPage;

    public static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
        registerUserPage=new RegisterUserPage(driver);

    }

    @AfterAll
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
