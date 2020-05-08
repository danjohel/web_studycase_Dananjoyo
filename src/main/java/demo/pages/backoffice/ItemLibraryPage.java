package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemLibraryPage {

  public String itemName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void inputItemName(){
    itemName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys(itemName);
  }

  public String getItemLibraryName(String name){
    WebElement getItemLibraryName = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'"+name+"')]"));
    return getItemLibraryName.getText();
  }

  public void waitABit(int millis){
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}


