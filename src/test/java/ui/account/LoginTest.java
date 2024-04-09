package ui.account;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ui._init.AbstractTest;

import static entities.Account.DEMO_ACCOUNT;
import static ui._site.ServerSite.*;

public class LoginTest extends AbstractTest {

    @Test
    @Story("Sign up and login flow")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login, check storage, logout")
    public void loginTest() {
        homePage.open();
        homePage.verifyHomePageOpened();
        homePage.openLoginForm();
        loginPage.loginAs(DEMO_ACCOUNT);
        accountPage.verifyUserLoggedIn();
        accountPage.verifyLocalStorage();
        accountPage.logOut();
        homePage.verifyHomePageOpened();
    }
}
