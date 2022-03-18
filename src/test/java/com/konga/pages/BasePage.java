package com.konga.pages;

import com.konga.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends DriverManager
{

    public String BASE_URL = "https://www.konga.com/";
    public void NavigateToHomePage()
    {
        driver.navigate().to(BASE_URL);
    }

}