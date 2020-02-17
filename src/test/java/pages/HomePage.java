

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class HomePage extends PageBase {

    //*********Constructor*********
    public HomePage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
    By btnDurusmaVeGorevlerBy = By.id("sidebarDurusma");
    By btnGorevlerBy = By.id("gorevler");
    By btnArtiTusuBy = By.cssSelector("i.far.fa-plus");
    By btnArtiTusuMenuItemsBy = By.cssSelector("a.dropdown-item.changePage");
    By btnBuromuzBy = By.id("buromuz");
    By btnEkipArkadaslarimizBy = By.id("ekip_arkadaslarimiz");
    By btnIslerimizBy = By.id("islerimiz");
    By btnDosyalarBy = By.id("dosyalar");
    By btnIliskilerimizBy = By.id("sidebariliskilerimiz");
    By btnKontaklarimizBy = By.id("kontaklarimiz");
    By btnMasraflarBy = By.id("masraflar");
    By btnRaporlarBy = By.id("raporlar");
	//*********Page Methods*********
   	
	public HomePage goToEkipArkadaslarimiz() {
		click(btnBuromuzBy);
		click(btnEkipArkadaslarimizBy);
		
		return this;
	}
    public HomePage getSetExample() {
    	   String ali = "abcde";
    	    System.setProperty("ali_degeri", ali);
    	return this;
    }
    public HomePage goToDosyalar() {
    	sleep(7);
    	clickElementJs("a#islerimiz", 0);
    	sleep(5);
    	clickElementJs("a#dosyalar", 0);
    	return this;
    }
    
    public HomePage goToRaporlar() {
    	sleep(7);
    	clickElementJs("a#raporlar", 0);
    	return this;
    }
    public HomePage goToKontaklarimiz() {
    	
    	
    	
    	click(btnIliskilerimizBy);
    	click(btnKontaklarimizBy);
    	
    	return this;
    }
    public HomePage goToMasraflar() {
    	sleep(7);
    	clickElementJs("a#masraflar", 0);
    	
    	return this;
    }
    public HomePage goToGorevler() {
		click(btnDurusmaVeGorevlerBy);
		click(btnGorevlerBy);
		return this;
	}
	public HomePage gorevEkleKisayol() {
		click(btnArtiTusuBy);
		click(btnArtiTusuMenuItemsBy, 5);
		
		return this;
	}
}