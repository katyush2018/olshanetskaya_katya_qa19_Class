import org.testng.annotations.Test;

public class WikiLoginTest extends TestBase {

    @Test
    public void testLogin(){

        selectLanguage();
        initLogin();
        fillLoginForm("Hjghjgk", "jkhjkhjkh");
        confirmLogin();
    }

}
