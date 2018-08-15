package com.serenity.appium.poc.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class TestPage extends MobilePageObject {

    AndroidDriver driver;

    public TestPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CATEGORY 1']")
    private MobileElement firstCategoryElement;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CATEGORY 2']")
    private MobileElement secondCategoryElement;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CATEGORY 3']")
    private MobileElement thirdCategoryElement;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Info']")
    private MobileElement infoTitleElement;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Friends']")
    private MobileElement friendsTitleElement;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Related']")
    private MobileElement relatedTitleElement;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']")
    private MobileElement secondCheeseElementOnTheList;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    private MobileElement ellipsisThreeDots;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout")
    private MobileElement nightMode;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Night (always)']")
    private MobileElement nightAlwaysMode;


    public MobileElement getInfoTitleElement() {
        return infoTitleElement;
    }

    public MobileElement getFriendsTitleElement() {
        return friendsTitleElement;
    }

    public MobileElement getRelatedTitleElement() {
        return relatedTitleElement;
    }

    public boolean isInfoTitleElementShown(){
        return infoTitleElement.getText().contains("Info");
    }

    public boolean isFriendsTitleElementShown(){
        return friendsTitleElement.getText().contains("Friends");
    }

    public boolean isRelatedTitleElementShown(){
        return relatedTitleElement.getText().contains("Related");
    }

    public boolean isFirstCategoryElementShown(){
        return firstCategoryElement.getText().contains("CATEGORY 1");
    }

    public boolean isSecondCategoryElementShown(){
        return secondCategoryElement.getText().contains("CATEGORY 2");
    }

    public boolean isThirdCategoryElementShown(){
        return thirdCategoryElement.getText().contains("CATEGORY 3");
    }

    public void selectSecondCheeseOnTheList() {
        element(secondCheeseElementOnTheList).click();
    }


    public void selectNightAlwaysMode(){
        element(ellipsisThreeDots).click();
        element(nightMode).click();
        element(nightAlwaysMode).click();
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
    }
}
