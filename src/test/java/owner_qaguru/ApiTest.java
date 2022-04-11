package owner_qaguru;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import owner_qaguru.config.ApiConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {

    @Test
    @Tag("api")
    public void printApiData() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.apibaseurl()).isEqualTo("https://yandex.ru");
        assertThat(config.username()).isEqualTo("qaguru11Cheba");
        assertThat(config.password()).isEqualTo("098poilkjmnb!");
    }
}
