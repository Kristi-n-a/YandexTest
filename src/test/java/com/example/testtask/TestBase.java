package com.example.testtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        openSite("https://yandex.ru/");
    }

    protected void filterItem(item item) {
        click(By.cssSelector("[href^='/catalog--"+ item.getItemType() +"']"));

        type(By.cssSelector("#glpricefrom"), item.getPriceForm());
        type(By.cssSelector("#glpriceto"), item.getPriceTo());
        click(By.xpath("//span[text()='" + item.getBrand() + "']"));
    }

    protected void selectComputers() {
        click(By.cssSelector("[href^='/catalog--kompiuternaia']"));
    }

    protected void goToMarcet() {
        click(By.cssSelector("[data-id='market']"));
    }

    public void switchToNextTab(){
        List<String> availableWindows = new ArrayList<>(wd.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            wd.switchTo().window(availableWindows.get(2));
        }
    }

    private void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        if (text != null) {
            wd.findElement(locator).sendKeys(text);
        }
    }

    private void openSite(String url) {
        wd.navigate().to(url);
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }
}
