import org.testng.annotations.Test;

public class loginTest extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;
    
    public void setUp() {
        homePage = new HomePage(driver);
        homePage.goToLogInPage();
        loginPage = new LoginPage(driver);

	}

    @Test(priority = 0)
    public void inVvalid(){


        loginPage.InValidlogIn();


    }
    
    @Test(priority =1)
    public void valid(){


        loginPage.logIn();


    }
}
