package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;

public class InstructorsPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public InstructorsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void userIsOnEterationAcademyHomePage() {
    }

    public void userGoesToInstructorsPage() {
        By instructorsMenu = By.xpath("//a[contains(text(),'Eğitmenler')]");
        elementHelper.click(wait, instructorsMenu);
    }

    public List<WebElement> instructors(){
        return driver.findElements(By.cssSelector(".instructor-item"));
    }

    public void instructorListShouldNotBeEmpty() {
        Assert.assertFalse(instructors().isEmpty());
    }

    public void insructorNumberShouldBe(int numberOfInsructors) {
        System.out.println("Number of instructors: " + instructors().size());
        Assert.assertEquals(instructors().size(), numberOfInsructors);
    }
}
