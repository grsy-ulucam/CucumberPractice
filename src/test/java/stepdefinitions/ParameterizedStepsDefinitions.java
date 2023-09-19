package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepsDefinitions {

    @When("User search pen on google page")
    public void userSearchPenOnGooglePage() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("pen");

    }
    @Then("User see title contains pen")
    public void userSeeTitleContainsPen() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("pen"));
        Driver.closeDriver();
    }
}
