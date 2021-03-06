package Basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;

public class BasicOperations {

    public static WebDriver driver;
    
    String version = "83";

    public void OpenChromeFrontend() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriverv"+version);
        //System.setProperty("webdriver.chrome.driver", "WebDrivers/Winchromedriverv"+version+".exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/home");
        driver.manage().window().maximize();
    }

    public void OpenFirefoxFrontend() {
        System.setProperty("webdriver.firefox.driver", "WebDrivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
    }

    public void OpenChromeBackend() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriverv"+version);
        //System.setProperty("webdriver.chrome.driver", "WebDrivers/Winchromedriverv"+version+".exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/admin");
        driver.manage().window().maximize();
    }

    public void OpenFirefoxBackend() {
        System.setProperty("webdriver.firefox.driver", "WebDrivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/admin");
        driver.manage().window().maximize();
    }

    public void takeScreenshot() {
        {
            try {
                Thread.sleep(120);
                Robot r = new Robot();

                Date date = new Date();
                long timestamp = date.getTime();

                // It saves screenshot to desired path
                String path = "ScreenShots/screenshot" + timestamp + ".jpg";

                // Used to get ScreenSize and capture image
                Rectangle capture =
                        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage Image = r.createScreenCapture(capture);
                ImageIO.write(Image, "jpg", new File(path));
            } catch (AWTException | IOException | InterruptedException ex) {
                System.out.println(ex);
            }

        }
        System.out.println("Screenshot saved");
    }

    public void runAllure() {

        String GenerateHere = "C:/Projects/HighCode/IntelliJ/PHPTravels";

        try {
            //Runtime.getRuntime().exec("allure generate --clean /Projects/HighCode/Intellij/PHPTravels/allure-results/");//MAC
            Runtime.getRuntime().exec("cmd.exe /allure generate --clean");//WINDOWS IS SHIT AND IT DOES NOT WORK AT ALL!!!
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void waitALittle() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Close() {

        driver.close();
    }
}
