package tek.bdd.utility;

import com.google.common.eventbus.SubscriberExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;


   public class SeleniumUtility extends BaseSetup {

       private WebDriverWait getWait() {
           return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
       }

       private WebElement waitForVisibility(By locator){
           return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));


       }

    // create a method to click on a given locator

       public void clickOnElement(By locator) {
          // WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
          getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

       }

       public void sendText (By locator, String value){

           //getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
           waitForVisibility(locator).sendKeys(value);

       }

       public String getElementText(By locator){
         return   waitForVisibility(locator).getText();


       }
       public boolean isElementEnabled(By locator){
           return waitForVisibility(locator)
                   .isEnabled();
       }

       public boolean isElementDisplyed(By locator){
           return waitForVisibility(locator) .isDisplayed();
       }


}
