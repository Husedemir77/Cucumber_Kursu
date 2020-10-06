package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends _Parent{

    public DialogContent(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    WebElement myElement;

    @FindBy(id = "mat-input-0")
    // public WebElement username; private cevirdik
    private WebElement username;

    @FindBy(id = "mat-input-1")
    // public WebElement password;
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    // public WebElement loginButton;
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    //public WebElement gotItBtn;
    private WebElement gotItBtn;

    public void findElementAndClickFunction(String ElementName) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */
        switch (ElementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":
                myElement = gotItBtn;
                break;
        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (ElementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;
        }

        sendKeysFunction(myElement, value);
    }

}
