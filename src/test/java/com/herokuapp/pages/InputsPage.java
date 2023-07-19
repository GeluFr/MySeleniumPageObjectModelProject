package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage{
    public InputsPage(WebDriver driver) {
        super(driver);
    }
    public static String INPUTS_URL = BASE_URL+"inputs";

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/input") private WebElement numberInput;

    public void enterNumber (String number){
        numberInput.sendKeys(number);
    }
    public String returnNumberInputValue(){
        return numberInput.getAttribute("value");
    }
}
