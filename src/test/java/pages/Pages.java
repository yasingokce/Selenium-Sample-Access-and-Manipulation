package pages;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.KeyValueName;

public class Pages {

    WebDriver driver;
    WebDriverWait wait;
    List<WebElement> elements;
    public Pages(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        
    }
    private void simpleFunction(Map.Entry<String, KeyValueName<String, String>> entry){
        switch (entry.getValue().getType()) {
            case "xpath":
                elements = driver.findElements(By.xpath(entry.getValue().getValue()));
                break;
            case "CssSelector":
                elements = driver.findElements(By.cssSelector(entry.getValue().getValue()));
                break;
            case "IdLocator":
                elements = driver.findElements(By.id(entry.getValue().getValue()));
                break;
            default:
        }

    }

    // element checking
    public void elementChecking(Map.Entry<String, KeyValueName<String, String>> entry ) {
        simpleFunction(entry);
        if (elements.size() > 0) {
            // Element found
            System.out.println("Element found. " + entry.getValue().getKey());
        } else {
            // Element not found
            System.out.println("Element not found. " + entry.getValue().getKey());
        }
        elements.clear();

    }

    //isDisplayed??
    public void elementIsDisplayed(Map.Entry<String, KeyValueName<String, String>> entry ) {
        simpleFunction(entry);
        if (elements.size() > 0) {
            // Element found
            if(elements.get(0).isDisplayed()){
                System.out.println("Element is displayed. " + entry.getValue().getKey()); 
            }else{
                System.out.println("Element is not displayed. " + entry.getValue().getKey());  
            }
            
        } else {
            // Element not found
            System.out.println("Element not found for displayed function. " + entry.getValue().getKey());
        }
        elements.clear();

    }

     //isEnabled??
     public void elementIsEnabled(Map.Entry<String, KeyValueName<String, String>> entry ) {
        simpleFunction(entry);
        if (elements.size() > 0) {
            // Element found
            if(elements.get(0).isEnabled()){
                System.out.println("Element is enabled. " + entry.getValue().getKey()); 
            }else{
                System.out.println("Element is not enabled. " + entry.getValue().getKey());  
            }      
        } else {
            // Element not found
            System.out.println("Element not found for enabled function. " + entry.getValue().getKey());
        }
        elements.clear();
    }



    // visible
    public void visibleInpageCssSelector(String elementId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementId)));
    }

    public void visibleInpageId(String elementId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }

    public void visibleInpageXpath(String elementId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementId)));
    }

    // select
    public void selectItemxpath(String itemPath) {
        driver.findElement(By.xpath(itemPath)).click();
    }

    public void selectItemCSS(String itemPath) {
        driver.findElement(By.cssSelector(itemPath)).click();
    }

    public void selectItemId(String itemPath) {
        driver.findElement(By.id(itemPath)).click();
    }

    // using
    public void usingSearchPanelxpath(String tusId, String uText) {
        driver.findElement(By.xpath(tusId)).sendKeys(uText, Keys.ENTER);
    }

    public void usingSearchPanelCss(String tusId, String uText) {
        driver.findElement(By.cssSelector(tusId)).sendKeys(uText, Keys.ENTER);
    }

    public void usingSearchPanelId(String tusId, String uText) {
        driver.findElement(By.id(tusId)).sendKeys(uText, Keys.ENTER);
    }

    // displayed (element showed)
    public void displayedElementID(String uText) {
        driver.findElement(By.id(uText)).isDisplayed();
    }

    public void displayedElementCss(String uText) {
        driver.findElement(By.cssSelector(uText)).isDisplayed();
    }

    public void displayedElementXpath(String uText) {
        driver.findElement(By.xpath(uText)).isDisplayed();

    }


}
