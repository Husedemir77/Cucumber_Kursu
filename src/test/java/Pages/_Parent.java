package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _Parent {
    /**
     * Bu dosya diğer bütün page ler için ortak click ve sendkeys
     * için nekleme, scroll ve clear gibi bütün işleleri tek yereden
     * yapabilmek için eklendi.Bu class diğer pageler tarafından exten edilerek
     * kullanılacak.Böylece tüm pagelerdeki elemanların click ve sendkeys özelliği
     * hem bekleme hem scroll hem de clear çözelliği kazanmış olacak.
     */

    WebDriver driver;
    WebDriverWait wait;

    public _Parent(){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);
    }

    public void clickFunction(WebElement element){

        // eleman clickable olana kadar bekle
        // eleman kadar scroll yap
        // click yap

        waitUntilClickable(element);
        scrollTolElement(element);


    }

    public void sendKeysFunction(WebElement element, String value){
        // eleman clikable olana kadar bekle
        // eleman kadar scroll yap
        // click yap
        waitUntilVisible(element);
        scrollTolElement(element);
        element.clear();
        element.sendKeys(value);

    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }


    public void scrollTolElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView;", element);

    }



}
