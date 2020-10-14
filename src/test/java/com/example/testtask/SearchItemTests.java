package com.example.testtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchItemTests extends TestBase{

    @Test
            public void testItem(){

        goToMarcet();
        switchToNextTab();
        selectComputers();

        filterItem(new item("planshety", "20000", "35000", "Apple"));
        WebElement item = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]"));
        String itemName= item.findElement(By.xpath(".//h3")).getText();
        //wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]//h3")).getText();

    }


}
