package com.company.SeleniumTest01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DSLoginPageTest {

    private static WebDriver webDriver;
    private static final String APP_URL = "https://ds.first-egg-bank.com/catalog-6291/#donors";



    public static void setChromeDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/IdeaProjects/zJars/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:/Users/ShBr2k/IdeaProjects/zJars/chromedriver.exe");
    }


    @BeforeClass
    public static void prepareApplication() {
        setChromeDriverProperty();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }


    @Test(priority = 1)
    public static void launchApplication() {

        webDriver.get(APP_URL);

        WebElement topSlider = (new WebDriverWait(webDriver, 60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='slider-wrapper-panel']")));
        new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='slider-wrapper-panel']")));
        new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Log in')]")));

    }


    // Checking elements at def. page
    @Test(priority = 2)
    public static void defaultPage() {

        WebElement topSlider = webDriver.findElement(By.xpath("//div[@id='slider-wrapper-panel']"));
        Assert.assertEquals(topSlider.isDisplayed(), true);

        WebElement catalogName = webDriver.findElement(By.xpath("//div[@class='gwt-HTML GHKAII4CEJ col-md-6']"));
        Assert.assertEquals(catalogName.isDisplayed(), true);

        WebElement defaultDonorImage = webDriver.findElement(By.xpath("//img[@class='gwt-Image']"));
        Assert.assertEquals(defaultDonorImage.isDisplayed(), true);

        WebElement bottomEmail = webDriver.findElement(By.xpath("//div[contains(text(),'info@first-egg-bank.com')]"));
        Assert.assertEquals(bottomEmail.isDisplayed(), true);

        WebElement loginButton = webDriver.findElement(By.xpath("//div[contains(text(),'Log in')]"));;
        Assert.assertEquals(loginButton.isDisplayed(), true);

        loginButton.click();

    }


    // Checking elements at login form
    @Test(priority = 3)
    public static void loginForm() {

        WebElement loginForm = webDriver.findElement(By.xpath("//div[@class='feb-abstract-dialog']"));
        Assert.assertEquals(loginForm.isDisplayed(), true);

        WebElement userNameInput = webDriver.findElement(By.xpath("//input[@name='username']"));
        Assert.assertEquals(userNameInput.isDisplayed(), true);

        WebElement passwordInput = webDriver.findElement(By.xpath("//input[@name='password']"));
        Assert.assertEquals(passwordInput.isDisplayed(), true);

        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        Assert.assertEquals(loginButton.isDisplayed(), true);

        WebElement cancelButton = webDriver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
        Assert.assertEquals(cancelButton.isDisplayed(), true);

        doLogin();

    }


    // Checking load catalog page
    @Test(priority = 4)
    public static void loadCatalogPage() {

        WebElement logOutButton = (new WebDriverWait(webDriver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Logout')]")));

    }


    // Checking elements at catalog page
    @Test(priority = 5)
    public static void catalogPage() {

        WebElement filtersSet = webDriver.findElement(By.xpath("//div[@class='GHKAII4CLP GHKAII4CBQ']"));
        Assert.assertEquals(filtersSet.isDisplayed(), true);

        WebElement donorIDEdit = webDriver.findElement(By.xpath("@placeholder='Donor ID'"));
        Assert.assertEquals(donorIDEdit.isDisplayed(), true);

        //======================

        donorIDEdit.sendKeys("VL0893");
        webDriver.findElement(By.xpath("//img[@class='gwt-Image']")).click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='feb-select-btn']"))).click();
        new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Go to cart')]"))).click();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    // Checking searching donors
    //donorIDEdit.sendKeys("VL0893");


    @AfterClass(alwaysRun = true)
    public static void closeBrowser() {
        if (webDriver != null)
            webDriver.quit();
    }


    // Do login
    public static void doLogin() {

        webDriver.findElement(By.xpath("//input[@name='username']")).sendKeys("shbr2k");
        webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("FEB_001");
        webDriver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

    }

}