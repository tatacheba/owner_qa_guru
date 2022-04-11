package owner_qaguru.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.sleep;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        WebDriver driver = new DriverProvider().get();
/*
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;


        ChromeOptions chromeOptions = new ChromeOptions();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        OperaOptions operaOptions = new OperaOptions();

        switch (Configuration.browser) {
            case "chrome":
//                chromeOptions.addArguments("--no-sandbox");
//                chromeOptions.addArguments("--disable-infobars");
//                chromeOptions.addArguments("--disable-popup-blocking");
//                chromeOptions.addArguments("--disable-notifications");
//                chromeOptions.addArguments("--lang=en-en");
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                break;
            case "firefox":
                firefoxOptions.addArguments("--fast-start");
                firefoxOptions.addArguments("--enable-logging");
                firefoxOptions.addArguments("--ignore-certificate-errors");
                firefoxOptions.addArguments("--disable-gpu");
                capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
                break;
            case "opera":
                operaOptions.addArguments("--disable-gpu");
                capabilities.setCapability(OperaOptions.CAPABILITY, operaOptions);
                break;
        }

        if (DriverProvider.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = DriverProvider.webConfig.getRemoteUrl();
        }

        Configuration.browserCapabilities = capabilities;
*/
    }

    @AfterEach
    void addAttachments() {
        sleep(5000);
        closeWebDriver();
    }
}