import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ParsingWithJsoup {

    @Test
    void findElements() throws IOException {
        System.setProperty("webdriver.chrome.driver", "selenium\\chromedriver100.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://1xstavka.ru/line/Football/");
        Document document = Jsoup.parse(webDriver.getPageSource());
        Elements link = document.select(".SSR");
        for (Element links : link) {

        }

        webDriver.quit();
    }
}
