package Pages;

import Utils.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {
    WebDriver driver;

    private By inputfield = By.xpath("//input[@name='inputfield']");
    private By SubmitButton = By.xpath("//input[@value='Submit']");
    private By BacktoHome = By.xpath("//input[@value='Back']");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterInputandSubmit(String input) throws InterruptedException {
        String URL = Utilities.getProperty("URL");
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for input field to be visible and enter value
            WebElement Inputfield = wait.until(ExpectedConditions.visibilityOfElementLocated(inputfield));
            Inputfield.sendKeys(input);

            // Wait for the submit button to be clickable and click
            WebElement Submit = wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
            Submit.click();

            System.out.println("Input is entered and Submit button is clicked");
        }
        catch (Exception e){
            System.err.println("---Error--- " + e.getMessage());
            e.printStackTrace();
        }

    }
}
