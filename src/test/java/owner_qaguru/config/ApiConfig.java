package owner_qaguru.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:api.properties",
        "classpath:api.properties"
})
public interface ApiConfig extends Config {

    @Key("apibaseurl")
    @DefaultValue("https://yandex.ru")
    String apibaseurl();

    @Key("username")
    String username();

    @Key("password")
    String password();

}