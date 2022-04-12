package owner_qaguru.config;

import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    public void beforeAll() {
        DriverProvider.configure();
        DriverProvider.openPage();
    }
}