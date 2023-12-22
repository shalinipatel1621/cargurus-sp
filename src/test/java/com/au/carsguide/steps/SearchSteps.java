package com.au.carsguide.steps;

import com.au.carsguide.pages.BuyAndSellPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnBuySellTab(String buyNSell) throws InterruptedException {
        new BuyAndSellPage().mouseHoverBuyAndSellTab(buyNSell);
    }

    @And("I click {string} link")
    public void iClickSearchCarsLink(String searchCars) throws InterruptedException {
        System.out.println(searchCars);
        new BuyAndSellPage().searchCarsLink(searchCars);
    }

    @And("I select make {string}")
    public void iSelectMake(String make) {
        new BuyAndSellPage().selectMake(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new BuyAndSellPage().selectModel(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new BuyAndSellPage().selectLocation(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new BuyAndSellPage().selectPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new BuyAndSellPage().clickOnFindMyNextCar();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertEquals(new BuyAndSellPage().verifyTheMake(make),make, "Error");
    }

    @Then("I navigate to {string} page")
    public void iNavigateToPage(String typesOfCars) throws InterruptedException {
        new BuyAndSellPage().navigateToNewAndUsedSearchCars(typesOfCars);
    }

}
