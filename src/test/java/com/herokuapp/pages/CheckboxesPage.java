package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage {

    public static String Checkboxes_URL = BASE_URL+"checkboxes";

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]") private WebElement checkbox1;
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]") private WebElement chechbox2;

    public void checkboxCheck1(){
        checkbox1.click();
    }
    public void checkboxCheck2(){
        if (!chechbox2.isSelected())
        chechbox2.click();
    }
}
