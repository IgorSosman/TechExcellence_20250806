import {defineConfig} from 'cypress'
import createBundler from "@bahmutov/cypress-esbuild-preprocessor";
import {addCucumberPreprocessorPlugin} from "@badeball/cypress-cucumber-preprocessor";
import createEsbuildPlugin from "@badeball/cypress-cucumber-preprocessor/esbuild";


export default defineConfig({
    retries: 1,
    video: false,
    screenshotOnRunFailure: true,
    experimentalSourceRewriting: true,
    experimentalFetchPolyfill: true,
    e2e: {
        viewportWidth: 1280,
        viewportHeight:1280,
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

    },
})