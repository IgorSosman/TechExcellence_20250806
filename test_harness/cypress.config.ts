import {defineConfig} from 'cypress'
import createBundler from "@bahmutov/cypress-esbuild-preprocessor";
import {addCucumberPreprocessorPlugin} from "@badeball/cypress-cucumber-preprocessor";
import createEsbuildPlugin from "@badeball/cypress-cucumber-preprocessor/esbuild";


export default defineConfig({
    video: true,
    screenshotOnRunFailure: true,
    experimentalSourceRewriting: true,
    experimentalFetchPolyfill: true,
    // chromeWebSecurity: true,
    e2e: {
       // baseUrl: "http://localhost:4200/",
       // specPattern: "cypress/e2e/**/*.{cy,spec}.{js,ts}",
        specPattern: "**/*.feature",

        async setupNodeEvents(
            on: Cypress.PluginEvents,
            config: Cypress.PluginConfigOptions
        ): Promise<Cypress.PluginConfigOptions> {
            await addCucumberPreprocessorPlugin(on, config);
            on(
                "file:preprocessor",
                createBundler({
                    plugins: [createEsbuildPlugin(config)],
                })
            );
            return config;
        },

        chromeWebSecurity: true,
        experimentalSessionAndOrigin: true,
        projectId: "bfi83g",
        supportFile: false,
        // setupNodeEvents
    },
})