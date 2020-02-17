

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class EkipArkadaslarimizPage extends PageBase {

    //*********Constructor*********
    public EkipArkadaslarimizPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
	
    By btnProfilBy = By.cssSelector("span.avatar.avatar-online.mr-10");
	By btnCikisYapBy = By.cssSelector("i.icon.wb-power");
	By btnEkleBy = By.cssSelector("a.btn-add");
	By txtEkipArkadasiAdiBy = By.id("EmployeeInsertName");
	By txtEkipArkadasiSoyadiBy = By.id("EmployeeInsertSurname");
	By txtRumuzBy = By.id("NickName");
	By rdRadioLabelBy = By.id("label.radio-first-label");
	By txtEkipArkadasiEmailBy = By.id("UserEmail");
	By txtEkipArkadasiSifreBy = By.id("password-field");
	By txtTextBoxBy = By.cssSelector("input.select2-search__field");
	By btnAnasayfaGorunumuBy = By.cssSelector("span[aria-labelledby='select2-UserDashboardId-container']");
	By btnKaydetBy = By.cssSelector("button[type='submit']");
	

	
	//*********Page Methods*********
	

	
 public EkipArkadaslarimizPage ekipArkadasiEkle(String ekipArkadasiAdi, String ekipArkadasiSoyadi) {
		
		sleep(1);
		System.out.print("Calisan: " + ekipArkadasiAdi + " ");
		System.out.println(ekipArkadasiSoyadi);
		String ekipArkadasiEmail = ekipArkadasiAdi + ekipArkadasiSoyadi + "@gun.av.tr";
		System.out.println(ekipArkadasiEmail);
		sleep(1);
		click(btnEkleBy);
		sleep(5);
	 writeText(txtEkipArkadasiAdiBy, ekipArkadasiAdi);
	 writeText(txtEkipArkadasiSoyadiBy, ekipArkadasiSoyadi);
	 //writeText(txtRumuzBy, SetRandomString(3));
	// goToEndOfPage();
	 clickElementJs("label.radio-first-label", 2);
	 sleep(3);
	 writeText(txtEkipArkadasiEmailBy, ekipArkadasiEmail);
	 writeText(txtEkipArkadasiSifreBy, "Gunce.Demo1");
	 goToEndOfPage();
	 sleep(1);
	 writeText(txtTextBoxBy, 2, "hesap sahibi");
	 sleep(1);
	 writeText(txtTextBoxBy, 2, Keys.ENTER.toString());
	 click(btnAnasayfaGorunumuBy);
	 sleep(1);
	 writeText(txtTextBoxBy, 3, "standart");
	 sleep(1);
	 writeText(txtTextBoxBy, 3, Keys.ENTER.toString());
	 sleep(1);
	 goToTopOfPage();
	 sleep(1);
	 click(btnKaydetBy);
	 waitAllRequest();
	 
	 return this;
 }
	
	
	public EkipArkadaslarimizPage logOut() {
	sleep(1);
	click(btnProfilBy);
	click(btnCikisYapBy);
	return this;
}
}
