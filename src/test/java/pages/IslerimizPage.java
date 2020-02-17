

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class IslerimizPage extends PageBase {

    //*********Constructor*********
    public IslerimizPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
   By btnEkleBy = By.cssSelector("a.btn-add");

   By txtTextBoxBy = By.cssSelector("input.select2-search__field");
   By btnKaydetBy = By.cssSelector("button[type='submit']");
   
   
	//*********Page Methods*********
   	
    public IslerimizPage raporEkle() {
    	
    	return this;
    }

}