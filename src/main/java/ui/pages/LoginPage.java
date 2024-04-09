package ui.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Button;
import entities.Account;

public class LoginPage extends WebPage {

    @Css("#username")
    private UIElement usernameField;

    @Css("#password")
    private UIElement usernamePassword;

    @Css(".login__form_action_container")
    private Button signInButton;

    public void loginAs(String user, String password) {
        usernameField.sendKeys(user);
        usernamePassword.sendKeys(password);
        signInButton.click();
    }

    public void loginAs(Account account) {
        loginAs(account.login, account.password);
    }


}
