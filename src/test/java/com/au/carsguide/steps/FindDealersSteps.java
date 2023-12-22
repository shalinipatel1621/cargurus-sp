package com.au.carsguide.steps;

import com.au.carsguide.pages.FindDealerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FindDealersSteps {
    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealerNames) {
        System.out.println("dealers name: " + dealerNames);
        Assert.assertEquals(new FindDealerPage().checkDealerNamesAvailable(dealerNames), dealerNames, "Error");
    }

    @And("I click ‘Find a Dealer’")
    public void iClickFindADealer() {
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {
    }

    @And("I should see the dealer names <dealersName> are display on page")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage() {
    }
}