

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class TenMinutesMailPage extends PageBase {

    //*********Constructor*********
    public TenMinutesMailPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
    
    By txt10EmailBy = By.id("mailAddress");
	By btnParentOfLink = By.cssSelector("td[class='cta-block__button']");
	By txtNameBy = By.id("Name");
	By txtSurnameBy = By.id("Surname");
	By txtPhoneBy = By.id("Phone");
    By txtEmailBy = By.id("Email");
	By chbSozlesmeBy = By.cssSelector("input[name='IsServiceAgreement']");
	By txtFirmaAdiBy = By.id("CompanyName");
 	By btnHesapOlusturBy = By.cssSelector("button[type='submit']");
	By btnEmailBy = By.cssSelector("span[class='inc-mail-address']");
	By btnMailDropdownBy = By.id("ui-id-1");

	
	//*********Page Methods*********
    //Go to LoginPage
	public TenMinutesMailPage goToUrl(String url) {
		navigateToURL(url);
		return this;
	}
	
	public TenMinutesMailPage getSetExample() {
		String a = System.getProperty("ali_degeri");
		System.out.println(a);
		return this;
	}
	
	public TenMinutesMailPage CreateTempMail() {
		goToEndOfPage();
		String mail = getAttribute2(txt10EmailBy);
		System.setProperty("user_email", mail);
		return this;
	}
	public String getMail() {
		
		return this.getMail();
	}
	
	public TenMinutesMailPage activateMail() {
		goToEndOfPage();
		click(btnMailDropdownBy);
		sleep(1);
		goToEndOfPage();
		sleep(1);
		click(getChild(btnParentOfLink, "a", 0));
		switchToNewTab(true);
		return this;
	}
	public TenMinutesMailPage getSetNameExample(String name, String lastName, String userEmail) {
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(userEmail);
		return this;
	}
}

