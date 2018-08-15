package com.serenity.appium.poc.serenity;

import com.serenity.appium.poc.pages.TestPage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSteps extends PageObject {
     TestPage testPage;

     @Step
     public void allThreeCategoriesAreDisplayed() {
         assertThat(testPage.isFirstCategoryElementShown()).isTrue();
         assertThat(testPage.isSecondCategoryElementShown()).isTrue();
         assertThat(testPage.isThirdCategoryElementShown()).isTrue();
     }

     @Step
     public void selectFirstCheeseOnTheList() {
        testPage.selectSecondCheeseOnTheList();
    }

     @Step
     public boolean infoTitleIsDisplayed() {
         for (int i = 0; i < 32; i++) {
             if (testPage.getInfoTitleElement().isDisplayed()) {
                 return true;
             } else {
                 testPage.scrollDown();
             }
         }
         return false;
     }

     @Step
     public boolean friendsTitleIsDisplayed() {
        for (int i = 0; i < 32; i++) {
            if (testPage.getFriendsTitleElement().isDisplayed()) {
                return true;
            } else {
                testPage.scrollDown();
            }
        }
        return false;
     }

     // scrollDown does not work
     @Step
     public boolean relatedTitleIsDisplayed() {
        for (int i = 0; i < 32; i++) {
            if (testPage.getRelatedTitleElement().isDisplayed()) {
                return true;
            } else {
                testPage.scrollDown();
            }
        }
        return false;
     }

     @Step
     public void selectNightAlwaysMode() {
        testPage.selectNightAlwaysMode();
    }
}