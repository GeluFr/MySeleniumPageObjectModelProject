package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.DropdownPage.Dropdown_URL;

public class DropdownTest extends BaseTest{

    @Test
    public void dropdownTest(){
        driver.get(Dropdown_URL);
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.dropdownBarSelect();
        dropdownPage.option1Select();
        Assert.assertTrue(dropdownPage.option1IsSelected());
        waitForNumberOfSeconds(2);
        dropdownPage.dropdownBarSelect();
        dropdownPage.option2Select();
        Assert.assertTrue(dropdownPage.option2IsSelected());
        waitForNumberOfSeconds(2);
    }
}
