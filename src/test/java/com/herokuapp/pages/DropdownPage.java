package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage{
    public static String Dropdown_URL = BASE_URL+"dropdown";
    public DropdownPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "dropdown") private WebElement dropdownBar;
    @FindBy(xpath = "//*[@id=\"dropdown\"]/option[2]") private WebElement option1;
    @FindBy(xpath = "//*[@id=\"dropdown\"]/option[3]") private WebElement option2;
    public void dropdownBarSelect(){
        dropdownBar.click();
    }
    public void option1Select(){
        option1.click();
    }
    public void option2Select(){
        option2.click();
    }
    public boolean option1IsSelected(){
        return option1.isSelected();
    }
    public boolean option2IsSelected(){
        return option2.isSelected();
    }
}
