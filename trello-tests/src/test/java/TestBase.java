import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver wd;

  @BeforeClass
  public void setUp() {
    wd = new ChromeDriver();
    wd.get("https://trello.com/");
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    clickLoginButton();
    login("shinya@bk.ru", "12345.com");
    //  elena.telran@yahoo.com 12345.com
  }

  public void submitBoardCreation() {
    click(By.cssSelector("[type=submit]"));
  }

  public void typeBoardName() {
    type(By.cssSelector("input.subtle-input"), "new");
  }

  public void initBoardCreationFromHeader() throws InterruptedException {
    clickOnPlusButtonOnHeader();
    Thread.sleep(2000);
    click(By.cssSelector("a.js-new-board"));
  }

  public void clickOnPlusButtonOnHeader() throws InterruptedException {
    Thread.sleep(3000);
    click(By.cssSelector("a.js-open-add-menu"));
  }

  @AfterClass
  public void tearDown() {
    wd.quit();

  }

  public void login(String userName, String password) {
    type(By.name("user"), userName);
    type(By.id("password"), password);

    click(By.id("login"));
  }

  public void click(By locator) {
    wd.findElement(locator).click();
  }

  public void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void clickLoginButton() {
    click(By.cssSelector("[href='/login']"));
  }
}
