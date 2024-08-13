package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user clicks on sign in link.")
    public void user_clicks_on_sign_in_link() {

        clickOnElement(By.xpath("//*[@id=\"signinLink\"]"));
    }
    @Then("validate user is in sign in page.")
    public void validate_user_is_in_sign_in_page() {
       String pageSubtitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in",pageSubtitle);

    }
    @When("user enters username and password and click on login")
    public void user_enters_username_and_password_and_click_on_login() {
        sendText(SignInPage.EMAIL_INPUT,"youssefmoe84@gmail.com");
        sendText(SignInPage.PASSWORD_INPUT,"Moe@1984");
        clickOnElement(SignInPage.LOGIN_BUTTON);

    }
    @Then("user should be able to see account link.")
    public void user_should_be_able_to_see_account_link() {
        boolean isAccountDisplayed = isElementDisplyed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isAccountDisplayed);

    }
}
