package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDefinitions {

    @Given("Kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {

        Driver.getDriver().get("https://www.google.com/");

    }

    @When("Kullanici samsung kelimesini arar")
    public void kullaniciSamsungKelimesiniArar() {

        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");

    }

    @Then("Kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() throws InterruptedException {

        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        Driver.closeDriver();
    }

    @Given("User is on google page")
    public void userIsOnGooglePage() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("User search samsung on google page")
    public void userSearchSamsungOnGooglePage() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());

        sp.searchFor("cucumber");
    }

    @Then("User verify samsung result")
    public void userVerifySamsungResult() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
        Driver.closeDriver();
    }

    @When("User search cucumber on google page")
    public void userSearchCucumberOnGooglePage() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());

        sp.searchFor("cucumber");

    }

    @Then("User verify cucumber result")
    public void userVerifyCucumberResult() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
        Driver.closeDriver();
    }

    @When("User search selenium on google page")
    public void userSearchSeleniumOnGooglePage() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("selenium");
    }

    @Then("User verify selenium result")
    public void userVerifySeleniumResult() throws InterruptedException {
         Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
        Driver.closeDriver();
    }

    @When("User search {string} on google page")
    public void userSearchOnGooglePage(String key) {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);
    }

    @Then("User verify {string} result")
    public void userVerifyResult(String key) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
        Driver.closeDriver();
    }
}
