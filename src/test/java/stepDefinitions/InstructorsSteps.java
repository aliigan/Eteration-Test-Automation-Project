package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.InstructorsPage;
import util.DriverFactory;

public class InstructorsSteps {

    WebDriver driver = DriverFactory.getDriver();
    InstructorsPage instructors = new InstructorsPage(driver);

    @Given("User is on Eteration Academy home page")
    public void userIsOnEterationAcademyHomePage() {
        instructors.userIsOnEterationAcademyHomePage();
    }

    @When("User goes to Instructors page")
    public void userGoesToInstructorsPage() {
        instructors.userGoesToInstructorsPage();
    }

    @Then("Instructor list should not be empty")
    public void instructorListShouldNotBeEmpty() {
        instructors.instructorListShouldNotBeEmpty();
    }

    @And("Insructor number should be {int}")
    public void insructorNumberShouldBe(int numberOfInsructors) {
        instructors.insructorNumberShouldBe(numberOfInsructors);
    }
}
