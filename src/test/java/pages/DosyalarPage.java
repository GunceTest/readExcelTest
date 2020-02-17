

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class DosyalarPage extends PageBase {

    //*********Constructor*********
    public DosyalarPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
   By btnEkleBy = By.cssSelector("a.btn.add");
   By btnEkle2By = By.cssSelector("i.fa.fa-caret-down.font-size-14");
   By btnEkleDavaDosyasiBy = By.cssSelector("a[href='/FileCase/InsertFileCase?caseType=3']");
   By btnMuvekkilBy = By.cssSelector("span[aria-labelledby='select2-FileCaseContactClientId-container']");
   By btnDosyaSorumlusuBy = By.cssSelector("span[aria-labelledby='select2-OrganizationEmployeeCaseResponsibleId-container']");
   By txtTextBoxBy = By.cssSelector("input.select2-search__field");
   By txtDosyaKonusuBy = By.id("FileSubject");
   By txtDosyaKonuAciklamasiBy = By.id("SubjectMatterDescription");
   By btnFaturaBilgileriTabi = By.cssSelector("a[aria-controls='tabInvoice']");
   By btnFaturaKiminAdinaOlusturulacakBy = By.cssSelector("span[aria-labelledby='select2-PrmStatementBillingNameId-container']");
   By btnFaturaKimeGonderilecekBy = By.cssSelector("span[aria-labelledby='select2-PrmStatementSentToTypeId-container']");
   By btnUcretBildirimFormatiBy = By.cssSelector("span[aria-labelledby='select2-ParameterStatementTemplateId-container']");
   By btnFaturaninGonderilecegiAdresBy = By.cssSelector("span[aria-labelledby='select2-ContactAddressStatementSentToLocationId-container']");
   By btnUcretVeTarifeBilgileriBy = By.cssSelector("a[href='#tabTariff']");
   By btnTarifeTipiBy = By.cssSelector("span[aria-labelledby='select2-PrmContactTariffTypeId-container']");
   By btnParaBirimiBy = By.cssSelector("span[aria-labelledby='select2-ParameterCurrencyId-container']");
   By txtTarifeAciklamasiBy = By.id("TariffDescription");
   By btnKaydetBy = By.cssSelector("button[type='submit']");
   By btnOzelUcretEkleBy = By.cssSelector("a.font-mb-20.float-right.font-weight-600");
   By btnOzelUcretCalisanBy = By.cssSelector("span[aria-labelledby='select2-TarifRate_0__TariffEmployeeId-container']");
   By txtSaatUcretiBy = By.id("TarifRate_0__TariffEmployeeRate");
   By txtReadDosyaNo1By = By.cssSelector(".dx-data-row > td:nth-child(1)");
   By txtReadDosyaNo2By = By.cssSelector("tr.dx-data-row:nth-child(2) > td:nth-child(1)");
  
   
   By btnIslerimizBy = By.id("islerimiz");
   By btnDosyalarBy = By.id("dosyalar");
   By btnDahaFazlaBy = By.cssSelector("a.dropdown-toggle");
   By btnDosyayiSilBy = By.cssSelector("button[type='button']");
   
   By btnBuromuzBy = By.id("buromuz");
   By btnEkipArkadaslarimizBy = By.id("ekip_arkadaslarimiz");
   By btnDosyaSilEvetBy = By.cssSelector("button.swal2-confirm.swal2-styled");
   
   By btnIliskilerimizBy = By.id("sidebariliskilerimiz");
   By btnKontaklarimizBy = By.id("kontaklarimiz");
   By btnMasraflarBy = By.id("masraflar");
   By btnRaporlarBy = By.id("raporlar");
   By btnDosyaKaydiBy = By.cssSelector("tr.dx-data-row:nth-child(1) > td:nth-child(2)");
   
   //*********Page Methods*********
   	
    public DosyalarPage dosyaEkle(String kurumAdi, String ekipArkadasiAdi, String adresAdi) {
//    	String dosyaSorumlusuName = System.getProperty("random_name_2");
//    	String KurumAdi = System.getProperty("kurum_adi");
//    	String AdresAdi = System.getProperty("adres_adi");
    	sleep(1);
    	System.out.println("Kurum ekleme basarili.");
    	sleep(1);
    	clickElementJs("i.fa.fa-caret-down.font-size-14", 0);
    	sleep(1);
    	clickElementJs("a.dropdown-item", 21);
    	click(btnMuvekkilBy);
    	writeText(txtTextBoxBy, 0, kurumAdi);
   		sleep(1);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
    	click(btnDosyaSorumlusuBy);
    	writeText(txtTextBoxBy, 1, ekipArkadasiAdi);
   		sleep(1);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		sleep(1);
    	writeText(txtDosyaKonusuBy, SetRandomString(20));
    	writeText(txtDosyaKonuAciklamasiBy, SetRandomString(20));    	
    	goToEndOfPage();
    	sleep(1);
    	clickElementJs("label.radio-first-label", 2);
    	sleep(1);
    	goToTopOfPage();
    	sleep(1);
    	click(btnFaturaBilgileriTabi);
    	click(btnFaturaKiminAdinaOlusturulacakBy);
    	writeText(txtTextBoxBy, 1, "müvekkil");
   		sleep(1);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		sleep(1);
   		click(btnFaturaKimeGonderilecekBy);
    	writeText(txtTextBoxBy, 1, "müvekkil");
   		sleep(1);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		sleep(1);
   		click(btnUcretBildirimFormatiBy);
    	writeText(txtTextBoxBy, 1, "varsayılan şablon");
   		sleep(1);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		sleep(1);
   		click(btnFaturaninGonderilecegiAdresBy);
    	writeText(txtTextBoxBy, 1, adresAdi);
   		sleep(1);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		sleep(1);
   		click(btnUcretVeTarifeBilgileriBy);
   		click(btnTarifeTipiBy);
   		writeText(txtTextBoxBy, 1, "özel veya indirimli");
   		sleep(1);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		click(btnParaBirimiBy);
   		writeText(txtTextBoxBy, 1, "euro");
   		sleep(1);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		writeText(txtTarifeAciklamasiBy, SetRandomString(20));
   		sleep(1);
   		goToEndOfPage();
   		//click(btnOzelUcretEkleBy);
   		clickElementJs("i.far.fa-plus.mr-10", 4);
   		click(btnOzelUcretCalisanBy);
   		writeText(txtTextBoxBy, 1, ekipArkadasiAdi);
   		sleep(2);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		sleep(1);
   		writeText(txtSaatUcretiBy, "200");
   		sleep(1);
   		goToTopOfPage();
   		sleep(1);
   		click(btnKaydetBy);
   		sleep(5);
   		String dosyaNo1 = getTextContent(txtReadDosyaNo1By);
   		System.setProperty("dosya_no_1", dosyaNo1);
   		sleep(3);
    	return this;
    }
    
    public DosyalarPage dosyaEkle2(String kurumAdi, String ekipArkadasiAdi, String adresAdi) {
//    	String dosyaSorumlusuName = System.getProperty("random_name_2");
//    	String KurumAdi = System.getProperty("kurum_adi");
//    	String AdresAdi = System.getProperty("adres_adi");
    	sleep(2);
    	System.out.println("4. rapor filtreleme islemi basarili.");
    	sleep(2);
    	clickElementJs("i.fa.fa-caret-down.font-size-14", 0);
    	clickElementJs("a.dropdown-item", 21);
    	click(btnMuvekkilBy);
    	writeText(txtTextBoxBy, 0, kurumAdi); //kurumAdi
   		sleep(2);
   		writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   		sleep(1);
    	click(btnDosyaSorumlusuBy);
    	writeText(txtTextBoxBy, 1, ekipArkadasiAdi); //ekipArkadasiAdi
   		sleep(2);
   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
   		sleep(1);
    	writeText(txtDosyaKonusuBy, SetRandomString(20));
    	sleep(1);
    	writeText(txtDosyaKonuAciklamasiBy, SetRandomString(20));   
    	sleep(1);
    	goToEndOfPage();
    	sleep(1);
    	clickElementJs("label.radio-first-label", 3);
    	sleep(1);
//    	clickElementJs("a[aria-controls='tabInvoice']", 0);
//    	sleep(1);
//    	click(btnFaturaKiminAdinaOlusturulacakBy);
//    	writeText(txtTextBoxBy, 1, "müvekkil");
//   		sleep(2);
//   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
//   		sleep(1);
//   		click(btnFaturaKimeGonderilecekBy);
//    	writeText(txtTextBoxBy, 1, "müvekkil");
//   		sleep(2);
//   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
//   		sleep(1);
//   		click(btnUcretBildirimFormatiBy);
//    	writeText(txtTextBoxBy, 1, "varsayılan şablon");
//   		sleep(2);
//   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
//   		sleep(1);
//   		click(btnFaturaninGonderilecegiAdresBy);
//    	writeText(txtTextBoxBy, 1, adresAdi); //adresAdi
//   		sleep(2);
//   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
//   		sleep(1);
//   		click(btnUcretVeTarifeBilgileriBy);
//   		click(btnTarifeTipiBy);
//   		writeText(txtTextBoxBy, 1, "özel veya indirimli");
//   		sleep(2);
//   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
//   		click(btnParaBirimiBy);
//   		writeText(txtTextBoxBy, 1, "euro");
//   		sleep(2);
//   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
//   		writeText(txtTarifeAciklamasiBy, SetRandomString(20));
//   		sleep(2);
//   		goToEndOfPage();
//   		//click(btnOzelUcretEkleBy);
//   		clickElementJs("i.far.fa-plus.mr-10", 4);
//   		click(btnOzelUcretCalisanBy);
//   		writeText(txtTextBoxBy, 1, ekipArkadasiAdi);//ekipArkadasiAdi
//   		sleep(2);
//   		writeText(txtTextBoxBy, 1, Keys.ENTER.toString());
//   		sleep(1);
//   		writeText(txtSaatUcretiBy, "200");
//   		sleep(1);
   		goToTopOfPage();
   		sleep(1);
   		click(btnKaydetBy);
   		sleep(5);
   		String dosyaNo2 = getTextContent(txtReadDosyaNo2By);
   		System.setProperty("dosya_no_2", dosyaNo2);
   		sleep(3);
    	return this;
    }
    
    public DosyalarPage dosyalariSil() {
    	for(int i = 0; i <=2 ; i++) {
    	click(btnIslerimizBy);
    	click(btnDosyalarBy);
    	click(btnDosyaKaydiBy);
    	sleep(3);
		   click(btnDahaFazlaBy, 1);
		   click(btnDosyayiSilBy, 4);
		   click(btnDosyaSilEvetBy, 0);
    	}
    	return this;
    }

}