

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class KontaklarimizPage extends PageBase {

    //*********Constructor*********
    public KontaklarimizPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
    
    
   By btnEkleBy = By.cssSelector("a.btn-add");
   By btnKurumEkleBy = By.cssSelector("a[href='/ContactCompany/InsertContactCompany']");
   By txtKurumAdiBy = By.id("Name");
   By txtTextBoxBy = By.cssSelector("input.select2-search__field");
   By btnIletisimTabiBy = By.cssSelector("a[href='#tabsContactInfo']");
   By btnAdresEkleBy = By.cssSelector("a[href='#modal-adres-ekle']");
   By txtAdredAdiBy = By.id("AddressName");
   By txtAdresBy = By.id("AddressValue");
   By btnUlkeBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCountryIdInsert-container']");
   By btnSehirBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCityIdInsert-container']");
   By btnIlceBy = By.cssSelector("span[aria-labelledby='select2-GlobalMapCountyIdInsert-container']");
   By btnEkle2By = By.cssSelector("button[type='submit']");
   By chbVarsayilanFaturaAdresiBy = By.id("AddressIsBillingDefaultInsert");
   
	//*********Page Methods*********
   	
   public KontaklarimizPage kurumEkle() {
	   String KurumAdi = SetRandomString(10);
	   String AdresAdi = SetRandomString(10);
	   String Adres = SetRandomString(20);
	   System.setProperty("kurum_adi", KurumAdi);
	   System.setProperty("adres_adi", AdresAdi);
	   System.setProperty("adres", Adres);
	   System.out.println("Kurum adi: " + KurumAdi);
	   System.out.println("Adres adi: " + AdresAdi);
	   System.out.println("Adres: " + Adres);
	   click(btnEkleBy);
	   sleep(1);
	   System.out.println("Ekip arkadasi ekleme basarili.");
	   sleep(1);
	   click(btnKurumEkleBy, 1);
	   writeText(txtKurumAdiBy, KurumAdi);
	   System.setProperty("kurum_adi", KurumAdi);
	   sleep(1);
	   writeText(txtTextBoxBy, 0, "müvekkil");
	   sleep(1);
	   writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   click(btnIletisimTabiBy);
	   click(btnAdresEkleBy);
	   sleep(2);
	   writeText(txtAdredAdiBy, AdresAdi);
	   writeText(txtAdresBy, Adres);
	   click(btnUlkeBy);
	   writeText(txtTextBoxBy, 4, "Türkiye");
	   sleep(1);
	   writeText(txtTextBoxBy, 4, Keys.ENTER.toString());
	   click(btnSehirBy);
	   writeText(txtTextBoxBy, 4, "İstanbul");
	   sleep(1);
	   writeText(txtTextBoxBy, 4, Keys.ENTER.toString());
	   click(btnIlceBy);
	   writeText(txtTextBoxBy, 4, "Şişli");
	   sleep(1);
	   writeText(txtTextBoxBy, 4, Keys.ENTER.toString());
	   checked(chbVarsayilanFaturaAdresiBy, 0);
	   click(btnEkle2By, 1);
	   click(btnEkle2By, 0);
	   
	   waitAllRequest();
	   
	   return this;
   }

}