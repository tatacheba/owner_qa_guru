package owner_qaguru.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:web.properties",
        "classpath:web.properties"
})
public interface WebConfig extends Config {

    @Key("baseurl")
    @DefaultValue("https://convertio.co/ru/")
    String getBaseUrl();

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("isRemote")
    Boolean isRemote();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("timeout")
    int timeout();

}
