package ui.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Button;

import static utils.PageWaiters.waitForJStoLoad;

@Url("")
public class HomePage extends WebPage {

    @Css(".nav__logo-link")
    private UIElement logo;

    @Css(".nav__button-secondary")
    private Button signInButton;

    public void verifyHomePageOpened() {
        waitForJStoLoad();
        logo.shouldBe().displayed();
        signInButton.shouldBe().displayed();
    }

    public void openLoginForm() {
        signInButton.click();
    }


}
