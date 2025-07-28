import {Given, When, Then} from "@badeball/cypress-cucumber-preprocessor";
import {ShopPage} from "../../pages/shop.page";
const shopPage: ShopPage = new ShopPage();
let productList: Cypress.Chainable = undefined;


Given(/^the user is on the Robot Shop page$/, function () {
    shopPage.visit();
});
When(/^the user selects the "([^"]*)"$/,(menuItem: string) => {
   shopPage.navigate(menuItem);
    productList = shopPage.retrieveProductList();
});
Then(/^a list of robot parts is displayed$/, function () {
    expect(productList).to.not.be.undefined;
    assert.isDefined(productList, 'Product list should be visible');
});
Then(/^(\d+) parts are available$/,  (count: number) => {
    productList.then((items) => {
        assert.lengthOf(items, count, 'product list should have 19 items');
    });
});
When(/^selects (.*)$/,(robotPartType: string) => {
  shopPage.filter(robotPartType)
});
Then(/^(\d+) are available$/, (count: number) => {

});
