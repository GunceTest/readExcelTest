

package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByCssSelector;

import utilities.PageBase;

public class MasraflarPage extends PageBase {

    //*********Constructor*********
    public MasraflarPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
   By btnEkleBy = By.cssSelector("a.btn-add");
   By btnDosyaNoBy = By.cssSelector("span[aria-labelledby='select2-ExpenseInsertModalFileCaseId-container']");
   By txtToplamTutarBy = By.cssSelector("ExpenseInsertModalTotalAmount");
   By btnMasrafKategorisiBy = By.cssSelector("span[aria-labelledby='select2-ExpenseInsertModalPrmExpenseCategoryId-container']");
   By btnMasrafAltKategorisiBy = By.cssSelector("span[aria-labelledby='select2-ExpenseInsertModalPrmExpenseSubCategory-container']");
   By txtAciklamaBy = By.id("ExpenseInsertModalExplanation");
   By txtNedenBelgesizBy = By.id("ExpenseInsertModalReasonForNoDocument");
   By txtTextBoxBy = By.cssSelector("input.select2-search__field");
   By btnKaydetBy = By.cssSelector("");
   By txtMasrafTarihiBy = By.id("ExpenseInsertModalExpenseDate");
   String masrafKategorisi1 = "Kullanım, Yararlanma, Bakım, Kira, Banka vb giderler";
   String masrafKategorisi2	= "Mahkeme, noter, ticaret ve diğer sicil harç ve giderleri";
   String masrafKategorisi3 =  "Danışma, Eğitim, Güvenlik, Çeviri vb Dış Tedarik Giderleri";
   String masrafKategorisi4 =  "Seyahat, Ulaşım ve Konaklama Giderleri"; //tren
   String masrafKategorisi5 =  "Tanıtım, Üyelik, Katılım ve Sponsorluk Giderleri";//baro
   String masrafKategorisi6 =  "Yemek, İçecek ve Bahşiş Giderleri";//yemek
   By btnMasraflarBy = By.id("masraflar");
   By btnMasrafKaydiBy = By.cssSelector("tr.dx-data-row:nth-child(1) > td:nth-child(1)");
   By btnDahaFazlaBy = By.cssSelector("a.btn-more.dropdown-toggle");
   By btnMasrafiSilBy = By.cssSelector("button.dropdown-item.mt-0");
   By btnMasrafSilEvetBy = By.cssSelector("button.swal2-confirm.swal2-styled");
   By btnMasrafBy = By.cssSelector("tr.dx-data-row:nth-child(1) > td:nth-child(8)");
   int eklenenMasrafSayisi = 0;
	//*********Page Methods*********
   
    public MasraflarPage masrafEkle() {
    	sleep(1);
    	String dosyaNo = System.getProperty("dosya_no_1");
    	sleep(1);
    	clickElementJs("a.btn-add", 0);
    	sleep(1);
    	System.out.println("Dosya ekleme basarili.");
    	click(btnDosyaNoBy);
    	writeText(txtTextBoxBy, 0, dosyaNo);
    	sleep(1);
    	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
    	sleep(1);
    	
    	String masrafTarihi = "20.01.2020";
    	writeText(txtMasrafTarihiBy, masrafTarihi);
    	sleep(1);
    	System.setProperty("masraf_tarihi", masrafTarihi);
    	sleep(1);
    	click(btnMasrafKategorisiBy);
    	writeText(txtTextBoxBy, 0, masrafKategorisi1);
    	sleep(1);
    	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
    	sleep(10);
    	click(btnMasrafAltKategorisiBy);
    	writeText(txtTextBoxBy, 0, "banka");
    	sleep(1);
    	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
    	sleep(1);
    	writeText(txtAciklamaBy, SetRandomString(20));
    	sleep(1);
    	String masrafMiktari1 ="1000";
    	System.setProperty("masraf_miktari_1", masrafMiktari1);
    	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, "1000");
    	sleep(2);
    	writeText(txtNedenBelgesizBy, "çünkü!");
    	clickElementJs("i.gunceFonts.gi-save-action", 2);
    	
    	return this;
    }
   public MasraflarPage masrafEkle2() {
	   sleep(1);
	   String dosyaNo = System.getProperty("dosya_no_1");
	   sleep(1);
	   clickElementJs("a.btn-add", 0);
    	sleep(1);
    	System.out.println("1. masraf ekleme islemi basarili.");
    	sleep(1);
    	click(btnDosyaNoBy);
    	writeText(txtTextBoxBy, 0, dosyaNo);
    	sleep(1);
    	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
    	sleep(1);
    	String masrafTarihi = "20.01.2020";
    	writeText(txtMasrafTarihiBy, masrafTarihi);
    	sleep(1);
    	click(btnMasrafKategorisiBy);
    	writeText(txtTextBoxBy, 0, masrafKategorisi2);
    	System.setProperty("masraf_kategorisi", masrafKategorisi2);
    	sleep(1);
    	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
    	sleep(10);
    	click(btnMasrafAltKategorisiBy);
    	writeText(txtTextBoxBy, 0, "icra");
    	sleep(1);
    	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
    	sleep(1);
    	writeText(txtAciklamaBy, SetRandomString(20));
    	sleep(1);
    	String masrafMiktari2 = "2000";
    	System.setProperty("masraf_miktari_2", masrafMiktari2);
    	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, "2000");
    	sleep(2);
    	writeText(txtNedenBelgesizBy, "çünkü!");
    	clickElementJs("i.gunceFonts.gi-save-action", 2);
    	
    	return this;
    }
   public MasraflarPage masrafEkle3() {
	   sleep(1);
   		String dosyaNo = System.getProperty("dosya_no_1");
	   sleep(1);
	   clickElementJs("a.btn-add", 0);
	sleep(1);
	System.out.println("2. masraf ekleme islemi basarili.");
	sleep(1);
   	click(btnDosyaNoBy);
   	writeText(txtTextBoxBy, 0, dosyaNo);
   	sleep(1);
   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   	sleep(1);
   	String masrafTarihi = "20.01.2017";
	writeText(txtMasrafTarihiBy, masrafTarihi);
	sleep(1);
	System.setProperty("masraf_tarihi_2", masrafTarihi);
   	click(btnMasrafKategorisiBy);
   	writeText(txtTextBoxBy, 0, masrafKategorisi3);
   	sleep(1);
   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   	sleep(10);
   	click(btnMasrafAltKategorisiBy);
   	writeText(txtTextBoxBy, 0, "eğitim");
   	sleep(1);
   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   	sleep(1);
   	writeText(txtAciklamaBy, SetRandomString(20));
   	sleep(1);
   	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, "3000");
   	sleep(2);
   	writeText(txtNedenBelgesizBy, "çünkü!");
   	clickElementJs("i.gunceFonts.gi-save-action", 2);
   	
   	return this;
   }
   public MasraflarPage masrafEkle4() {
	   sleep(1);
   	String dosyaNo = System.getProperty("dosya_no_1");
	   sleep(1);
	   clickElementJs("a.btn-add", 0);
    	sleep(1);
    	System.out.println("3. masraf ekleme islemi basarili.");
    	sleep(1);
	   	click(btnDosyaNoBy);
	   	writeText(txtTextBoxBy, 0, dosyaNo);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	click(btnMasrafKategorisiBy);
	   	writeText(txtTextBoxBy, 0, masrafKategorisi4);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(10);
	   	click(btnMasrafAltKategorisiBy);
	   	writeText(txtTextBoxBy, 0, "tren");
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	writeText(txtAciklamaBy, SetRandomString(20));
	   	sleep(1);
	   	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, "4000");
	   	sleep(2);
	   	writeText(txtNedenBelgesizBy, "çünkü!");
	   	clickElementJs("i.gunceFonts.gi-save-action", 2);
	   	
	   	return this;
	   }
   public MasraflarPage masrafEkle5() {
	   sleep(1);
   		String dosyaNo = System.getProperty("dosya_no_1");
	   sleep(1);
	   clickElementJs("a.btn-add", 0);
    	sleep(1);
    	System.out.println("4. masraf ekleme islemi basarili.");
    	sleep(1);
	   	click(btnDosyaNoBy);
	   	writeText(txtTextBoxBy, 0, dosyaNo);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	click(btnMasrafKategorisiBy);
	   	writeText(txtTextBoxBy, 0, masrafKategorisi5);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(10);
	   	click(btnMasrafAltKategorisiBy);
	   	writeText(txtTextBoxBy, 0, "baro");
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	writeText(txtAciklamaBy, SetRandomString(20));
	   	sleep(1);
	   	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, "5000");
	   	sleep(2);
	   	writeText(txtNedenBelgesizBy, "çünkü!");
	   	clickElementJs("i.gunceFonts.gi-save-action", 2);
	   	
	   	return this;
	   }
   public MasraflarPage masrafEkle6() {
	   sleep(1);
	   String dosyaNo = System.getProperty("dosya_no_1");
	   sleep(1);
	   clickElementJs("a.btn-add", 0);
    	sleep(1);
    	System.out.println("5. masraf ekleme islemi basarili.");
    	sleep(1);
	   	click(btnDosyaNoBy);
	   	writeText(txtTextBoxBy, 0, dosyaNo);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	click(btnMasrafKategorisiBy);
	   	writeText(txtTextBoxBy, 0, masrafKategorisi6);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(10);
	   	click(btnMasrafAltKategorisiBy);
	   	writeText(txtTextBoxBy, 0, "yemek");
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	writeText(txtAciklamaBy, SetRandomString(20));
	   	sleep(1);
	   	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, "6000");
	   	sleep(2);
	   	writeText(txtNedenBelgesizBy, "çünkü!");
	   	clickElementJs("i.gunceFonts.gi-save-action", 2);
	   	
	   	return this;
	   }
   public MasraflarPage masrafEkle7() {
	   	
	   sleep(1);
	   String dosyaNo = System.getProperty("dosya_no_1");
	   sleep(1);
	   clickElementJs("a.btn-add", 0);
	   sleep(1);
   	System.out.println("6. masraf ekleme islemi basarili.");
   	sleep(1);
	   	click(btnDosyaNoBy);
	   	writeText(txtTextBoxBy, 0, dosyaNo);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	click(btnMasrafKategorisiBy);
	   	writeText(txtTextBoxBy, 0, masrafKategorisi6);
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(10);
	   	click(btnMasrafAltKategorisiBy);
	   	writeText(txtTextBoxBy, 0, "yemek");
	   	sleep(1);
	   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
	   	sleep(1);
	   	writeText(txtAciklamaBy, SetRandomString(20));
	   	sleep(1);
	   	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, "7000");
	   	sleep(2);
	   	writeText(txtNedenBelgesizBy, "çünkü!");
	   	clickElementJs("i.gunceFonts.gi-save-action", 2);
	   	
	   	return this;
	   }
   public MasraflarPage masrafEkle8() {
	   sleep(1);
   	String dosyaNo = System.getProperty("dosya_no_2");
   	sleep(1);
   	clickElementJs("a.btn-add", 0);
   	sleep(1);
   	System.out.println("Dosya ekleme basarili.");
   	click(btnDosyaNoBy);
   	writeText(txtTextBoxBy, 0, dosyaNo);
   	sleep(1);
   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   	sleep(1);
   	
   	String masrafTarihi = "20.01.2020";
   	writeText(txtMasrafTarihiBy, masrafTarihi);
   	sleep(1);
   	System.setProperty("masraf_tarihi", masrafTarihi);
   	sleep(1);
   	click(btnMasrafKategorisiBy);
   	writeText(txtTextBoxBy, 0, masrafKategorisi1);
   	sleep(1);
   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   	sleep(10);
   	click(btnMasrafAltKategorisiBy);
   	writeText(txtTextBoxBy, 0, "banka");
   	sleep(1);
   	writeText(txtTextBoxBy, 0, Keys.ENTER.toString());
   	sleep(1);
   	writeText(txtAciklamaBy, SetRandomString(20));
   	sleep(1);
   	String masrafMiktari2 ="8000";
   	System.setProperty("masraf_miktari_2", masrafMiktari2);
   	writeElementJs("input#ExpenseInsertModalTotalAmount", 0, masrafMiktari2);
   	sleep(2);
   	writeText(txtNedenBelgesizBy, "çünkü!");
   	clickElementJs("i.gunceFonts.gi-save-action", 2);
   	
   	return this;
   }
   public MasraflarPage failedTestMasraflariSil() {
	   System.out.println("Onceki basarisiz testlere ait masraf kayitlari silinecek.");
	   
	   try {
		   for (int i = 0; i<8 ; i++) {
			   if(driver.findElement(By.cssSelector("tr.dx-data-row:nth-child(1) > td:nth-child(7)")).isDisplayed()) {
				   click(btnMasrafKaydiBy);
				   click(btnDahaFazlaBy);
				   click(btnMasrafiSilBy);
				   click(btnMasrafSilEvetBy); 
				   sleep(3);
			   }
		   }
	  }
	   
	   catch (Exception e) {
		   if (driver.findElement(By.cssSelector("p.no-data-title")).isDisplayed())
		   System.out.println("Onceki testten kalan masraf kayitlari silindi.");
	   }
	   
	   
	 sleep(3);
	 
	 
	 return this;
   }
   
   public MasraflarPage successfulTestMasraflariSil() {
	   sleep(1);
	 System.out.println("Masraf kayitlari ve indirilen Excel dosyasi bir sonraki test icin silinecek.");
	 sleep(1);
	 
	   for (int i = 0; i < 8; i++) {
		   click(btnMasraflarBy);
		   	   click(btnMasrafKaydiBy);
			   click(btnDahaFazlaBy);
			   click(btnMasrafiSilBy);
			   click(btnMasrafSilEvetBy); 
			  
		   }
			 return this;
   }

}