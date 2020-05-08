package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModifiersPage {

  public String modifierName = "";
  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void clickCreateModifierButton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]")).click();
  }

  public void inputModifierName(){
    modifierName = RandomUtils.generateRandomModifierName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(modifierName);
  }

  public void clickAddOrManage(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
  }

  public void clickAddOptions(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]")).click();
  }

  public void inputNameOptions(String keyword){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']//input[@placeholder='Name']")).sendKeys(keyword);
  }

  public void inputPriceOptions(String price){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-5']//input[@placeholder='Rp. 0']")).sendKeys(price);
  }

  public void clickSaveButtonOptions(){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]")).click();
  }

  public void clickSaveButtonModifier(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public String getModifierName(String name){
    WebElement getName = WebDriverInstance.webDriver.findElement(By.xpath("//td[text()='"+name+"']"));
    return getName.getText();
  }

  public void waitABit(int millis){
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
