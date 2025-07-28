export class ShopPage {
    private readonly robotBaseURL: string = "http://localhost:4200/";
    visit(): this {
        cy.visit(this.robotBaseURL);
        return this;
    }

    retrieveProductList(): Cypress.Chainable {
        return cy.get('.products li');
    }

}