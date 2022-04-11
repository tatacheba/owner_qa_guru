package owner_qaguru.config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.util.function.Supplier;

public class DriverProvider implements Supplier<WebDriver> {

private final WebConfig webConfig=ConfigFactory.create(WebConfig.class, System.getProperties());


    public DriverProvider() {
//        this.webConfig =ConfigFactory.create(WebConfig.class, System.getProperties());
        System.out.println("979"+webConfig.getBaseUrl());
    }

    @Override
    public WebDriver get() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("999"+webConfig.getBaseUrl());
        driver.get(webConfig.getBaseUrl());
        return driver;
    }

    public boolean isRemoteWebDriver() {
        return !webConfig.getRemoteUrl().equals("");
    }

    public String browserName() {
        return webConfig.browserName();
    }

    public String browserVersion() {
        return webConfig.getBrowserVersion();
    }

    public String browserSize() {
        return webConfig.getBrowserSize();
    }

}
