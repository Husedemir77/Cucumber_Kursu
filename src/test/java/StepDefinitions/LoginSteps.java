package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends _Parent {

    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }



    @When("^Enter usermane and password and click Login button$")
    public void enter_usermane_and_password_and_click_Login_button()  {

        DialogContent dialogContent = new DialogContent(driver);

        //dialogContent.username.sendKeys("daulet2030@gmail.com"); asagidakine cevirdik
        dialogContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");

        // dialogContent.password.sendKeys("TechnoStudy123@"); asagidakine cevirdik
        dialogContent.findElementAndSendKeysFunction("password","TechnoStudy123@");

        //  gerek kalmadi wait ayarladik
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // dialogContent.loginButton.click();
        dialogContent.findElementAndClickFunction("gotItBtn");

       // dialogContent.gotItBtn.click();  alttaki formata cevirdik
        dialogContent.findElementAndClickFunction("loginButton");

        /**
         * Siteyle ilgili yaptigim genel islemler
         * 1- bir butona tiklamak ne gerekiyor : bekleme, kaydirma, gerekebilir
         * 2- bir inputa veri göndermek icin ne gerekiyor : bekleme , kaydirma, clear
         *
         */
    }

    @Then("^User schuld login successfully$")
    public void user_schuld_login_successfully() {

    }

}
