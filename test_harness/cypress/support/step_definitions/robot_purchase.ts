import {Given} from "@badeball/cypress-cucumber-preprocessor";
import {ShopPage} from "../../pages/shop.page";
const shopPage: ShopPage = new ShopPage();
Given("User is ont the robot shop page", () => {
    shopPage.visit();
});