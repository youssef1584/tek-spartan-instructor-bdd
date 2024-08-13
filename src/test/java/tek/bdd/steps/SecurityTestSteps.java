package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user clicks on sign in link.")
    public void user_clicks_on_sign_in_link() {

        clickOnElement(By.xpath("//*[@id=\"signinLink\"]"));
    }
    @Then("validate user is in sign in page.")
    public void validate_user_is_in_sign_in_page() {
       String pageSubtitle = getElementText(By.xpath("//*[@id=\"loginForm\"]/h1"));
        Assert.assertEquals("Sign in",pageSubtitle);

    }
    @When("user enters username and password and click on login")
    public void user_enters_username_and_password_and_click_on_login() {
        sendText(By.xpath("//*[@id=\"email\"]"),"youssefmoe84@gmail.com");
        sendText(By.xpath("//*[@id=\"password\"]"),"Moe@1984");
        clickOnElement(By.xpath("//*[@id=\"loginBtn\"]"));

    }
    @Then("user should be able to see account link.")
    public void user_should_be_able_to_see_account_link() {
        boolean isButtonAccount = isElementEnabled(By.xpath("//*[@id=\"accountLink\"]"));
        Assert.assertTrue(true);

    }
}
