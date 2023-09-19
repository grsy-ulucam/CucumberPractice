package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {


    private WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "sp-cc-accept")
    private WebElement pop;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;


    public  void clickPop(){
        pop.click();
    }

    public void searchBox(String key){
        searchBox.sendKeys(key+Keys.ENTER);
    }

}
