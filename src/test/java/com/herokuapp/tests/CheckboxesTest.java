package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.CheckboxesPage.Checkboxes_URL;

public class CheckboxesTest extends BaseTest{

    @Test
    public void checkboxesTest(){
        driver.get(Checkboxes_URL);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.checkboxCheck1();
        checkboxesPage.checkboxCheck2();
        waitForNumberOfSeconds(3);
    }
}
