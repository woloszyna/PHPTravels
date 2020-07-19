package Pages.Frontend;

import Basis.BasicOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class SearchResultsPage extends BasicOperations {

    //Headers
    public WebElement mainHeader = driver.findElement(By.className("header-main"));
    public WebElement topHeader = driver.findElement(By.className("header-top"));

    //Currency Dropdown
    public WebElement currencyDropdown = driver.findElement(By.className("dropdown-currency"));
    public String currencyFont = driver.findElement(By.className("dropdown-currency")).getCssValue("font-size");//13px

    //Language Options
    public WebElement languageOptionVietnamese = driver.findElement(By.xpath("//*[@id=\"vi\"]"));
    public WebElement languageOptionRussian = driver.findElement(By.xpath("//*[@id=\"ru\"]"));
    public WebElement languageOptionEnglish = driver.findElement(By.xpath("//*[@id=\"en\"]"));
    public WebElement languageOptionArabic = driver.findElement(By.xpath("//*[@id=\"ar\"]"));
    public WebElement languageOptionFarsi = driver.findElement(By.xpath("//*[@id=\"fa\"]"));
    public WebElement languageOptionTurkish = driver.findElement(By.xpath("//*[@id=\"tr\"]"));
    public WebElement languageOptionFrench = driver.findElement(By.xpath("//*[@id=\"fr\"]"));
    public WebElement languageOptionSpanish = driver.findElement(By.xpath("//*[@id=\"es\"]"));
    public WebElement languageOptionGerman = driver.findElement(By.xpath("//*[@id=\"de\"]"));

    public WebElement languageDropdown = driver.findElement(By.className("dropdown-language"));

    public WebElement flagImage = driver.findElement(By.className("image"));
    public String flagFont = driver.findElement(By.className("dropdown-language")).getCssValue("font-size");//13px

    //Currency Options
    public WebElement currencyOptionUSD = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[1]"));
    public WebElement currencyOptionGBP = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[2]"));
    public WebElement currencyOptionSAR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[3]"));
    public WebElement currencyOptionEUR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[4]"));
    public WebElement currencyOptionPKR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[5]"));
    public WebElement currencyOptionKWD = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[6]"));
    public WebElement currencyOptionJPY = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[7]"));
    public WebElement currencyOptionINR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[8]"));
    public WebElement currencyOptionCNY = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[9]"));
    public WebElement currencyOptionTRY = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[10]"));
    public WebElement currencyOptionRUB = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[11]"));

    public WebElement myAccDropdown = driver.findElement(By.className("dropdown-login"));
    public String myAccFont = driver.findElement(By.className("dropdown-login")).getCssValue("font-size");//13px
    public WebElement myAccIcon = driver.findElement(By.className("bx-user"));

    //MyAcc Options
    public WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]"));
    public WebElement signUpBtn = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]"));


    public WebElement headerNavigation = driver.findElement(By.className("header-nav"));
    public WebElement HomeOption = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[1]/li/a"));
    public String HomeOptionFont = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[1]/li/a")).getCssValue("font-size");
    public WebElement VisaOption = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li[1]/a"));
    public String VisaOptionFont = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li[1]/a")).getCssValue("font-size");
    public WebElement CompanyOption = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]"));
    public String CompanyOptionFont = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]")).getCssValue("font-size");
    public WebElement PhoneNumber = driver.findElement(By.className("navbar-phone"));
    public String PhoneNumberFont = driver.findElement(By.className("navbar-phone")).getCssValue("font-size");//13px
    public String PhoneNumberText = driver.findElement(By.className("navbar-phone")).getText();

    //Results Displayed
    public WebElement results = driver.findElement(By.className("product-long-item-wrapper"));
    public WebElement paginationElement = driver.findElement(By.className("pagination"));


    //Filter Search Modal
    public WebElement filterSearchModal = driver.findElement(By.className("wrapper-inner"));
    public WebElement sideBarHeader = driver.findElement(By.className("sidebar-title"));
    public String sideBarTitle = driver.findElement(By.className("text-white")).getText();
    public WebElement starGrade = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[1]"));
    public WebElement oneStar = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[1]/div[2]/div/div[1]/div/div[1]"));
    public WebElement twoStars = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[1]/div[2]/div/div[1]/div/div[2]"));
    public WebElement threeStars = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[1]/div[2]/div/div[1]/div/div[3]"));
    public WebElement fourStars = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[1]/div[2]/div/div[1]/div/div[4]"));
    public WebElement fiveStars = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[1]/div[2]/div/div[1]/div/div[5]"));



    public WebElement priceRange = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[2]"));
    public WebElement priceOrder = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[3]"));
    public WebElement highToLowRBtn = driver.findElement(By.id("priceOrderDes"));
    public WebElement lowToHighRBtn = driver.findElement(By.id("priceOrderAsc"));
    public WebElement filerSearchBtn = driver.findElement(By.id("searchform"));

    public void searchForOneStar(){

        oneStar.click();

    }

    public void searchForTwoStars(){

        twoStars.click();

    }

    public void searchForThreeStars(){

        threeStars.click();

    }

    public void searchForFourStars(){

        fourStars.click();

    }

    public void searchForFiveStars(){

        fiveStars.click();

    }

}

