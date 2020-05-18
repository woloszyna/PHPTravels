package Pages.Frontend;

import Basis.BasicOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasicOperations {

    public WebElement mainHeader = driver.findElement(By.className("header-main"));
    public WebElement topHeader = driver.findElement(By.className("header-top"));

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
    public WebElement languageOptionUSD = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[1]"));
    public WebElement languageOptionGBP = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[2]"));
    public WebElement languageOptionSAR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[3]"));
    public WebElement languageOptionEUR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[4]"));
    public WebElement languageOptionPKR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[5]"));
    public WebElement languageOptionKWD = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[6]"));
    public WebElement languageOptionJPY = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[7]"));
    public WebElement languageOptionINR = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[8]"));
    public WebElement languageOptionCNY = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[9]"));
    public WebElement languageOptionTRY = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[10]"));
    public WebElement languageOptionRUB = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[11]"));

    public WebElement myAccDropdown = driver.findElement(By.className("dropdown-login"));

    public String myAccFont = driver.findElement(By.className("dropdown-login")).getCssValue("font-size");//13px
    public WebElement myAccIcon = driver.findElement(By.className("bx-user"));

    //MyAcc Options
    public WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]"));
    public WebElement signUp = driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]"));

    public WebElement headerNavigation = driver.findElement(By.className("header-nav"));
    public WebElement HomeOption = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[1]/li/a"));
    public String HomeOptionFont = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[1]/li/a")).getCssValue("font-size");
    public WebElement VisaOption = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li[1]/a"));
    public String VisaOptionFont = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li[1]/a")).getCssValue("font-size");
    public WebElement CompanyOption = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li[2]"));
    public String CompanyOptionFont = driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li[2]")).getCssValue("font-size");
    public WebElement PhoneNumber = driver.findElement(By.className("navbar-phone"));
    public String PhoneNumberFont = driver.findElement(By.className("navbar-phone")).getCssValue("font-size");//13px
    public String PhoneNumberText = driver.findElement(By.className("navbar-phone")).getText();


    //Search area
    public WebElement holsModal = driver.findElement(By.className("hero-form-inner"));
    public WebElement hotels = driver.findElement(By.className("hotels"));
    public WebElement flights = driver.findElement(By.className("flights"));
    public WebElement tours = driver.findElement(By.className("tours"));
    public WebElement cars = driver.findElement(By.className("cars"));
    public WebElement visa = driver.findElement(By.className("visa"));

    public WebElement destinationSearch = driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[1]/div/div[2]"));
    public WebElement checkin = driver.findElement(By.xpath("//*[@id=\"airDatepickerRange-hotel\"]/div[1]/div/div[2]"));

    //TODO: start here


}
