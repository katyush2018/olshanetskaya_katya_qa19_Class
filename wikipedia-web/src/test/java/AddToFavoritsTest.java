import org.testng.annotations.Test;

public class AddToFavoritsTest extends TestBase {

  @Test
    public  void testAddFavorits(){
      selectLanguage();
      initLogin();
      fillLoginForm("Hjghjgk", "jkhjkhjkh");
      confirmLogin();
  }

}
