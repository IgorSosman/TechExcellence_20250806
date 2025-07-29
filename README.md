# Tech Excellence 20250806

## Prepare IntelliJ IDEA for Presentation

### Increase UI font (menus, tabs, tool windows)

- Go to Settings > Appearance & Behavior > Appearance

- Check ✅ "Use custom font"

- Set a larger UI font size (e.g., 14 or 16)

- Click Apply or OK

### Increase Terminal Font Size in IntelliJ IDEA

- Go to Settings > Tools > Terminal

- Look for the Font section (usually under "Shell Path" settings)

- Increase the Font size (if editable there), or:

  - IntelliJ uses the main Editor font or system terminal config in some setups.

  - To ensure terminal uses your custom settings, adjust the Editor > Font too.

## Set up Test Features

1. Execute Gradle `CleanUp` task
   ```shell
    ./gradlew cleanUp
   ```
2. Acquire Xray authorization JWT using [Xray API](./test_harness/xrayapi/issue.http)
3. Retrieve a ***feature*** file using [Xray API](./test_harness/xrayapi/issue.http)
4. Execute Gradle `SetupFeature` task
   ```shell
    ./gradlew setupFeature
   ```
   
## Publish Test Results

1. Start the Test Subject Application
   ```shell
    ng serve
   ```
2. Run Cypress tests
  ```shell
    npx cypress run
   ```
3. Publish the  ***json result*** file using [Xray API](./test_harness/xrayapi/issue.http)