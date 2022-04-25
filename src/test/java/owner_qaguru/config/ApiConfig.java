package owner_qaguru.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:${properties}.properties",
        "classpath:${properties}.properties"
})
public interface ApiConfig extends Config {

    @Key("isRemote")
    Boolean isRemote();

    @Key("apibaseurl")
    @DefaultValue("https://yandex.ru")
    String apibaseurl();

    @Key("username")
    String username();

    @Key("password")
    String password();

}