package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class userHomepage {

    public userHomepage(){
        PageFactory.initElements(Driver.getDriver(),this);
        }

    // Üst Kısımdaki Home Linki
    @FindBy(xpath = "(//*[@href='https://qa.hauseheaven.com'])[2]")
    public WebElement Home;
}
