package Frontend;

import Basis.BasicOperations;
import Pages.Frontend.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerifyLandingPage extends BasicOperations {

    BasicOperations  BasicOperations = new BasicOperations();


    @BeforeMethod
    public void OpenChromeFrontend() {

        BasicOperations.OpenChromeFrontend();

    }

    @Test
    public void VerifyTopBanner() {

        LandingPage LandingPage = new LandingPage();

        Assert.assertTrue(LandingPage.mainHeader.isDisplayed());

        Assert.assertTrue(LandingPage.topHeader.isDisplayed());
        Assert.assertTrue(LandingPage.currencyDropdown.isDisplayed());
        Assert.assertEquals(LandingPage.currencyFont,"13px");
        LandingPage.currencyDropdown.click();
        Assert.assertTrue(LandingPage.languageOptionUSD.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionGBP.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionSAR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionEUR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionPKR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionKWD.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionJPY.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionINR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionCNY.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionTRY.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionRUB.isDisplayed());

        BasicOperations.takeScreenshot();

        Assert.assertTrue(LandingPage.languageDropdown.isDisplayed());
        Assert.assertTrue(LandingPage.flagImage.isDisplayed());
        Assert.assertEquals(LandingPage.flagFont,"13px");
        LandingPage.languageDropdown.click();
        Assert.assertTrue(LandingPage.languageOptionVietnamese.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionRussian.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionEnglish.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionArabic.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionFarsi.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionTurkish.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionFrench.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionSpanish.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionGerman.isDisplayed());

        BasicOperations.takeScreenshot();

        Assert.assertTrue(LandingPage.myAccDropdown.isDisplayed());
        Assert.assertTrue(LandingPage.myAccIcon.isDisplayed());
        Assert.assertEquals(LandingPage.myAccFont,"13px");
        LandingPage.myAccDropdown.click();
        Assert.assertTrue(LandingPage.loginBtn.isDisplayed());
        Assert.assertTrue(LandingPage.signUp.isDisplayed());

        BasicOperations.takeScreenshot();

        Assert.assertTrue(LandingPage.headerNavigation.isDisplayed());
        Assert.assertTrue(LandingPage.HomeOption.isDisplayed());
        Assert.assertEquals(LandingPage.HomeOptionFont,"13px");
        Assert.assertTrue(LandingPage.VisaOption.isDisplayed());
        Assert.assertEquals(LandingPage.VisaOptionFont,"13px");
        Assert.assertTrue(LandingPage.CompanyOption.isDisplayed());
        Assert.assertEquals(LandingPage.CompanyOptionFont,"14px");
        Assert.assertTrue(LandingPage.PhoneNumber.isDisplayed());
        Assert.assertEquals(LandingPage.PhoneNumberFont,"13px");
        Assert.assertEquals(LandingPage.PhoneNumberText,"phone Call Now : +1-234-56789");
    }

    @AfterMethod
    public void Close() {

        BasicOperations.takeScreenshot();
        BasicOperations.Close();
    }

}
