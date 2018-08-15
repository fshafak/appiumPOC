package com.serenity.appium.poc.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import com.serenity.appium.poc.serenity.TestSteps;

public class TestScenarioSteps {
    
	@Steps
	TestSteps testSteps;

	@Given("^three categories of cheese are displayed$")
	public void threeCategoriesOfCheeseAreDisplayed() throws InterruptedException {
		testSteps.allThreeCategoriesAreDisplayed();
	}

    @Then("^three sections are displayed for the selected cheese$")
    public void threeSectionsAreDisplayedForTheSelectedCheese() {
        testSteps.infoTitleIsDisplayed();
        testSteps.friendsTitleIsDisplayed();
//        testSteps.relatedTitleIsDisplayed();
    }

    @Given("^I click first cheese in the list$")
    public void iClickFirstCheeseInTheList() {
        testSteps.selectFirstCheeseOnTheList();
    }

    @Given("^I can change the mode to Night Always$")
    public void iChangeTheModeToNightAlways() {
	    testSteps.selectNightAlwaysMode();
    }
}
