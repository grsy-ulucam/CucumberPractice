package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import pages.AmazonSearchPage;
import utilities.Driver;


public class AmazonStepDefinitions {

    AmazonHomePage homePage=new AmazonHomePage(Driver.getDriver());
    AmazonSearchPage searchPage=new AmazonSearchPage(Driver.getDriver());

    @Given("User is on amazon page")
    public void userIsOnAmazonPage() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
        homePage.clickPop();
    }


    @When("User search {string} on amazon page.")
    public void userSearchOnAmazonPage(String key) {
        homePage.searchBox(key);
    }

    @Then("User verify {string} result.")
    public void userVerifyResult(String key) {
        searchPage.resultText(key);
    }

    @And("User take screen shoot on page")
    public void userTakeScreenShootOnPage() {
        System.out.println("Take screenshot on page");
    }

    @And("User close browser")
    public void userCloseBrowser() {
        Driver.closeDriver();
    }
}
