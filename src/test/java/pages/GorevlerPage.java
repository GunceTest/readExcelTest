

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class GorevlerPage extends PageBase {

    //*********Constructor*********
    public GorevlerPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
    
    By btnProfilBy = By.cssSelector("span.avatar.avatar-online.mr-10");
	By btnCikisYapBy = By.cssSelector("i.icon.wb-power");
	By btnEkleBy = By.cssSelector("a.btn-add");
	By btnDosyaNoBy = By.cssSelector("span[aria-labelledby='select2-FileCaseId-container']");
	By txtTextBoxBy = By.cssSelector("input.select2-search__field");
	By btnGorevVerilenKisiBy = By.cssSelector("span[aria-labelledby='select2-AssignedEmployeeId-container']");
	By btnGoreviVerenKisi = By.cssSelector("span[aria-labelledby='select2-AssignerEmployeeId-container']");
	By btnGorevKisaTanimiBy = By.cssSelector("span[aria-labelledby='select2-PrmTaskTypeId-container']");
	By btnOnayVerecekKisiBy = By.cssSelector("span[aria-labelledby='select2-ApproverEmployeeId-container']");
	By btnTaslakKaydetBy = By.cssSelector("button.succesAfterDisabled.saveBtn");
	By txtGorevAramaBy = By.cssSelector("input.dx-texteditor-input");
	By btnGorevBy = By.cssSelector("td[aria-describedby='dx-col-1']");
	By btnKabulEtBy = By.cssSelector("button.d-block");
	By txtBaslangicTarihiBy = By.id("StartDateTime");
	By txtBitisTarihiBy = By.id("EndDateTime");
	By txtBaslangicSaatiBy = By.id("StartHour");
	By txtBaslangicDakikasiBy = By.id("StartMinute");
	By txtBitisSaatiBy = By.id("EndHour");
	By txtBitisDakikasiBy = By.id("EndMinute");
	By txtResmiSonGunBy = By.id("OfficialDeadline");
	By btnKaydetBy = By.cssSelector("button[type='submit']");
	By btnKOGHayir = By.cssSelector("button.swal2-cancel.swal2-styled");
	By txtGeriGondermeNedeniBy = By.id("ReasonForReturn");
	By btnGorevDurumuBy = By.cssSelector("select2-PrmStatusId-container");
	By btnDahaFazlaBy = By.cssSelector("a.dropdown-toggle");
	By btnGoreviSilBy = By.cssSelector("button[type='button']");
	By btnGoreviSilEvetBy = By.cssSelector("button.swal2-confirm.swal2-styled");
	By btnArtiTusuBy = By.cssSelector("i.far.fa-plus");
    By btnArtiTusuMenuItemsBy = By.cssSelector("a.dropdown-item.changePage");
    By btnDurumuBy = By.cssSelector("span[aria-labelledby='select2-PrmStatusId-container']");
	
	//*********Page Methods*********
	
	
	public GorevlerPage gorevleriSil() {
		for(int i = 0; i <= 99; i++) {
		click(btnGorevBy, 0);
		click(btnDahaFazlaBy, 1);
		click(btnGoreviSilBy, 4);
		click(btnGoreviSilEvetBy);
		}
		return this;
	}
	
   	public GorevlerPage gorevEkle() {
   		click(btnEkleBy);
   		click(btnDosyaNoBy);
   		writeText(txtTextBoxBy, 0, "apple");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevVerilenKisiBy);
   		writeText(txtTextBoxBy, 0, "mert ulu");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevKisaTanimiBy);
   		writeText(txtTextBoxBy, 0, "duruşma");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToEndOfPage();
   		click(btnGoreviVerenKisi);
   		writeText(txtTextBoxBy, 0, "hale çalı");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
   		click(btnOnayVerecekKisiBy);
   		writeText(txtTextBoxBy, 0, "elif sel");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToTopOfPage();
   		sleep(1);
   		click(btnTaslakKaydetBy, 0);
   		return this;
   	}

   	public GorevlerPage gorevEkle2() {
   		click(btnEkleBy);
   		System.out.println("1. gorev ekleme islemi basarili.");
   		click(btnDosyaNoBy);
   		writeText(txtTextBoxBy, 0, "apple");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevVerilenKisiBy);
   		writeText(txtTextBoxBy, 0, "mert ulu");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevKisaTanimiBy);
   		writeText(txtTextBoxBy, 0, "duruşma");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToEndOfPage();
   		click(btnGoreviVerenKisi);
   		writeText(txtTextBoxBy, 0, "hale çalı");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
   		click(btnOnayVerecekKisiBy);
   		writeText(txtTextBoxBy, 0, "elif sel");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		writeText(txtBaslangicTarihiBy, "10.10.2020");
   		writeText(txtBaslangicSaatiBy, "9");
   		writeText(txtBaslangicDakikasiBy, "30");
   		writeText(txtBitisTarihiBy, "11.10.2020");
   		writeText(txtBitisSaatiBy, "13");
   		writeText(txtBitisDakikasiBy, "45");
   		goToTopOfPage();
   		sleep(1);
   		click(btnTaslakKaydetBy, 0);
   		return this;
   	}
   	public GorevlerPage gorevEkle3() {
   		click(btnArtiTusuBy);
		click(btnArtiTusuMenuItemsBy, 5);
   		System.out.println("2. gorev ekleme islemi basarili.");
   		click(btnDosyaNoBy);
   		writeText(txtTextBoxBy, 0, "apple");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevVerilenKisiBy);
   		writeText(txtTextBoxBy, 0, "mert ulu");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevKisaTanimiBy);
   		writeText(txtTextBoxBy, 0, "duruşma");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToEndOfPage();
   		click(btnGoreviVerenKisi);
   		writeText(txtTextBoxBy, 0, "hale çalı");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
   		click(btnOnayVerecekKisiBy);
   		writeText(txtTextBoxBy, 0, "elif sel");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToTopOfPage();
   		sleep(1);
   		click(btnTaslakKaydetBy, 0);
   		return this;
   	}
	public GorevlerPage gorevEkle4() {
		click(btnArtiTusuBy);
		click(btnArtiTusuMenuItemsBy, 5);
   		System.out.println("3. gorev ekleme islemi basarili.");
   		click(btnDosyaNoBy);
   		writeText(txtTextBoxBy, 0, "apple");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevVerilenKisiBy);
   		writeText(txtTextBoxBy, 0, "mert ulu");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevKisaTanimiBy);
   		writeText(txtTextBoxBy, 0, "duruşma");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToEndOfPage();
   		click(btnGoreviVerenKisi);
   		writeText(txtTextBoxBy, 0, "hale çalı");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
   		click(btnOnayVerecekKisiBy);
   		writeText(txtTextBoxBy, 0, "elif sel");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		writeText(txtBaslangicTarihiBy, "10.10.2020");
   		writeText(txtBaslangicSaatiBy, "9");
   		writeText(txtBaslangicDakikasiBy, "30");
   		writeText(txtBitisTarihiBy, "12.10.2020");
   		writeText(txtBitisSaatiBy, "13");
   		writeText(txtBitisDakikasiBy, "45");
   		writeText(txtResmiSonGunBy, "11.10.2020");
   		goToTopOfPage();
   		sleep(1);
   		click(btnTaslakKaydetBy, 0);
   		return this;
   	}

	

	public GorevlerPage gorevGuncelle() {
		sleep(3);
		writeText(txtGorevAramaBy, 0, "mert ulu");
		sleep(1);
		System.out.println("4. gorev ekleme islemi basarili.");
		sleep(1);
		click(btnGorevBy, 0);
		writeText(txtBaslangicTarihiBy, "20.10.2020");
		writeText(txtBitisTarihiBy, "22.10.2020");
		click(btnKaydetBy, 0);
		return this;
	}
	public GorevlerPage gorevGuncelle2() {
		sleep(5);
		writeText(txtGorevAramaBy, 7, "kabul bekliyor");
		sleep(1);
		System.out.println("Gorev guncelleme basarili.");
		sleep(1);
		click(btnGorevBy, 0);
		click(btnKaydetBy, 0);
		sleep(5);
		writeText(txtGorevAramaBy, 7, "kabul edildi");
		sleep(3);
		click(btnGorevBy, 0);
		click(btnKaydetBy, 1); //yapıldı onaya gönder
		return this;
	}

	public GorevlerPage gorevGuncelle3() { //4 - 9
		sleep(5);
		writeText(txtGorevAramaBy, 7, "onay bekliyor");
		sleep(1);
		System.out.println("Gorev guncelleme basarili.");
		sleep(3);
		click(btnGorevBy, 0);
		click(btnKaydetBy, 0);
		click(btnKOGHayir, 0);
		sleep(3);
		return this;
	}
	
	public GorevlerPage gorevGuncelleGeriGonder() { //4 - 9
		sleep(5);
		writeText(txtGorevAramaBy, 7, "onay bekliyor");
		sleep(1);
		System.out.println("Gorev guncelleme basarili.");
		sleep(3);
		click(btnGorevBy, 0);
		sleep(3);
		goToEndOfPage();
		sleep(1);
		writeText(txtGeriGondermeNedeniBy, "iptal edildi");
		sleep(1);
		goToTopOfPage();
		sleep(1);
		click(btnKaydetBy, 1);
		sleep(3);
		return this;
	}
	public GorevlerPage gorevGuncelleGeriGonderileniYap() { //4 - 9
		sleep(5);
		writeText(txtGorevAramaBy, 7, "geri gönderildi");
		sleep(1);
		System.out.println("Gorev guncelleme basarili.");
		sleep(3);
		click(btnGorevBy, 0);
		click(btnKaydetBy, 1);
		sleep(3);
		return this;
	}
	public GorevlerPage gorevGuncelleGeriGonderileniYapiliyor() { 
		sleep(5);
		writeText(txtGorevAramaBy, 7, "geri gönderildi");
		sleep(1);
		System.out.println("Gorev guncelleme basarili.");
		sleep(3);
		click(btnGorevBy, 0);
		sleep(3);
		goToEndOfPage();
		sleep(1);
		click(btnDurumuBy);
		writeText(txtTextBoxBy, 0, "görev yapılıyor");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
		click(btnKaydetBy, 0);
		sleep(3);
		return this;
	}
	public GorevlerPage gorevGuncelleGeriGonderilenBeklemede() { 
		sleep(5);
		writeText(txtGorevAramaBy, 7, "geri gönderildi");
		sleep(1);
		System.out.println("Gorev guncelleme basarili.");
		sleep(3);
		click(btnGorevBy, 0);
		sleep(3);
		goToEndOfPage();
		sleep(1);
		click(btnDurumuBy);
		writeText(txtTextBoxBy, 0, "beklemede");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
		click(btnKaydetBy, 0);
		sleep(3);
		return this;
	}
	
	
	public GorevlerPage gorevEkle5() {
   		click(btnEkleBy);
   		click(btnDosyaNoBy);
   		writeText(txtTextBoxBy, 0, "apple");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevVerilenKisiBy);
   		writeText(txtTextBoxBy, 0, "mert ulu");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		click(btnGorevKisaTanimiBy);
   		writeText(txtTextBoxBy, 0, "duruşma");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToEndOfPage();
   		click(btnGoreviVerenKisi);
   		writeText(txtTextBoxBy, 0, "hale çalı");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
   		click(btnOnayVerecekKisiBy);
   		writeText(txtTextBoxBy, 0, "elif sel");
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		goToTopOfPage();
   		sleep(1);
   		click(btnKaydetBy, 0);
   		return this;
   	}
	
	
	public GorevlerPage logOut() {
	sleep(1);
	click(btnProfilBy);
	click(btnCikisYapBy);
	return this;
}
}
