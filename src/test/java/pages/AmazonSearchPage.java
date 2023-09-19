package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage {

    private WebDriver driver;

    public AmazonSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//*[@id='search']/span[2]")
    public WebElement results;

    public  void resultText(String key){
        String result=results.getText();
        Assert.assertTrue(result.contains(key));
    }



}
