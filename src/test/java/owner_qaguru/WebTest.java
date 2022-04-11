package owner_qaguru;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import owner_qaguru.config.DriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WebTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new DriverProvider().get();
    }

    @Test
    @Tag("web")
    public void testGitHubTitle() throws Exception {
        Thread.sleep(2000);
        assertEquals(driver.getTitle(), "Convertio — Конвертер файлов");
    }

    @AfterEach
    public void stopDriver() { driver.quit();
    }


}
