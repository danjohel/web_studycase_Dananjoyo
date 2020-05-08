package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import demo.webdriver.WebDriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }


  @And("User click on create modifier button")
  public void userClickOnCreateModifierButton() {
    modifiersPage.clickCreateModifierButton();
  }

  @When("User input random modifier name")
  public void userInputRandomModifierName() {
    modifiersPage.inputModifierName();
  }

  @And("User click on add or manage options")
  public void userClickOnAddOrManageOptions() {
    modifiersPage.clickAddOrManage();
  }

  @And("User click on add options")
  public void userClickOnAddOptions() {
    modifiersPage.clickAddOptions();
  }

  @And("User input {string} in option name")
  public void userInputInOptionName(String keyword) {
    modifiersPage.inputNameOptions(keyword);
  }

  @And("User input {string} in option price")
  public void userInputInOptionPrice(String price) {
    modifiersPage.inputPriceOptions(price);
  }

  @And("User click save button on add options")
  public void userClickSaveButton() {
    modifiersPage.clickSaveButtonOptions();
  }

  @And("User click save button on modifier page")
  public void userClickSaveButtonOnModifierPage() {
    modifiersPage.waitABit(2);
    modifiersPage.clickSaveButtonModifier();
  }

  @Then("User see random modifier name in modifiers list")
  public void userSeeRandomModifierNameInModifiersList() {

    String actualName = modifiersPage.modifierName;
    String expectedName = modifiersPage.getModifierName(modifiersPage.modifierName);
    modifiersPage.waitABit(5);
    Assert.assertEquals(actualName, expectedName);

  }

  @And("user click create category")
  public void userClickCreateCategory() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]")).click();
  }

  @And("user input random category name")
  public void userInputRandomCategoryName() {
    categoriesPage.inputCategoriesName();
  }

  @And("user click save on category page")
  public void userClickSaveOnCategoryPage() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary PhtzjEWwHfB2xdkEDI8ca']")).click();
  }

  @Then("user see random category name on category list")
  public void userSeeRandomCategoryNameOnCategoryList() {
    String actualName = categoriesPage.categoriesName;
    String expectedName = categoriesPage.getCategoriesName(categoriesPage.categoriesName);
    categoriesPage.waitABit(5);
    Assert.assertEquals(actualName, expectedName);
  }

  @And("user click on create item")
  public void userClickOnCreateItem() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]")).click();
  }

  @And("user input random food name")
  public void userInputRandomFoodName() {
    itemLibraryPage.inputItemName();
  }

  @And("user input {string} on price")
  public void userInputOnPrice(String price) {
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys(price);
  }

  @And("user click save on item library page")
  public void userClickSaveOnItemLibraryPage() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary no-outline']")).click();
  }

  @Then("user see random item name in item library page")
  public void userSeeRandomItemNameInItemLibraryPage() {
    String actualName = itemLibraryPage.itemName;
    String expectedName = itemLibraryPage.getItemLibraryName(itemLibraryPage.itemName);
    itemLibraryPage.waitABit(5);
    Assert.assertEquals(actualName, expectedName);
  }
}
