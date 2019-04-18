import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWiki {

    WebDriver wd;

    @Test
    public void openSite(){
        wd = new ChromeDriver();
        wd.navigate().to("https://ru.wikipedia.org/");

    }

}
