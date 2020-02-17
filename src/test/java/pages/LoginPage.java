

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class LoginPage extends PageBase {

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
    
	By txtEmailBy = By.id("Email");
    By txtPasswordBy = By.id("password-field");
	By btnGirisBy = By.cssSelector("button.btn.btn-blue");
	By txtAdiBy = By.id("Name");
	By txtSoyadiBy = By.id("Surname");
	By txtTelefonBy = By.id("Phone");
	By txtFirmaAdiBy = By.id("CompanyName");
	By chbHizmetSozlesmesiBy = By.id("IsServiceAgreement");
	By btnHesapOlusturmakIcinTiklayinizBy = By.cssSelector("a[href='/Licence/InsertDemoCustomer']");
	By btnHesapOlusturBy = By.cssSelector("button.btn.btn-primary.btn-blue");
  	By txtPasswordReBy = By.id("password-fieldre");
 	By btnAktifEtBy = By.cssSelector("div.text-center");
 	By btnAtlaBy = By.cssSelector("a.introjs-skipbutton");
 	
 	String FirmaAdi = SetRandomString(5);

	//*********Page Methods*********
	public LoginPage goToUrl(String url) throws Exception {
		goToWebPage(url);
		return this;
	}
	
	public LoginPage hesapOlustur(String name, String lastName,String userEmail) {
		sleep(1);
		System.out.print("Hesap sahibi: " + name + " ");
		System.out.println(lastName);
		System.out.println(userEmail);
		sleep(1);
		click(btnHesapOlusturmakIcinTiklayinizBy);
		sleep(5);
		writeText(txtAdiBy, name);
		writeText(txtSoyadiBy, lastName);
		writeText(txtTelefonBy, "05554443322");
		writeText(txtEmailBy, userEmail);
		writeText(txtFirmaAdiBy, FirmaAdi);
		checked(chbHizmetSozlesmesiBy, 0);
		click(btnHesapOlusturBy);
		waitSweetAlert();
		waitAllRequest();
		return this;
	}
	
	public LoginPage loginUser() {
		writeText(txtEmailBy,"guncetestuser6@gun.av.tr"); //Hale Çalı
	writeText(txtPasswordBy, "Gunce.Demo1");
	click(btnGirisBy);
	return this;
}

	public LoginPage setPassword() {
		writeText(txtPasswordBy, "Gunce.Demo1");
		writeText(txtPasswordReBy, "Gunce.Demo1");
		click(getChild(btnAktifEtBy, "button", 0));
		click(btnAtlaBy);
		waitAllRequest();
		
		
		return this;
	}
	

}

