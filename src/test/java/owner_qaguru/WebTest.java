package owner_qaguru;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import owner_qaguru.config.TestBase;

import static com.codeborne.selenide.Selenide.$x;

public class WebTest extends TestBase {

    @Test
    @Tag("web")
    public void testGitHubTitle() throws Exception {
        Thread.sleep(2000);
        $x("//div[@class='page-title text-center']/child::h1").shouldHave(Condition.text("Конвертер файлов"));
    }

}
