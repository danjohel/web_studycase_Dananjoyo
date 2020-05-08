package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage {

  public String categoriesName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void inputCategoriesName(){
    categoriesName = RandomUtils.generateRandomModifierName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']")).sendKeys(categoriesName);
  }

  public String getCategoriesName(String name){
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
