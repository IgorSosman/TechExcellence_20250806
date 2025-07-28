export class ShopPage {
    private readonly robotBaseURL: string = "http://localhost:4200/";

    visit(): this {
        cy.visit(this.robotBaseURL);
        return this;
    }

    navigate(menuItem: string): Cypress.Chainable {
        return cy.get(`[data-cy="${menuItem}"]`).click();
    }

    retrieveProductList(): Cypress.Chainable {
        return cy.get('.products li');
    }

    filter(partType: string): Cypress.Chainable {
        return cy.get(`[data-cy="${partType}"]`).click();
    }

}