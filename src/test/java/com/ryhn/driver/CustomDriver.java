package com.ryhn.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomDriver implements DriverSource {

    private EnvironmentVariables environmentVariables =
            SystemEnvironmentVariables.createEnvironmentVariables();

    @Override
    public WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
