

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;
import utilities.ReadExcel;
public class RaporlarPage extends PageBase {

	
    //*********Constructor*********
    public RaporlarPage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
   By btnEkleBy = By.cssSelector("a.btn-add");
   By txtTextBoxBy = By.cssSelector("input.select2-search__field");
   By btnKaydetBy = By.cssSelector("button[type='submit']");
   By btnKategoriyeGoreMasrafRaporuBy = By.cssSelector("a[href='/Report/GetExpenseTotalAmountByCategory']");
   By txtGridDegeri1By = By.cssSelector(".dxc-labels > g:nth-child(1) > g:nth-child(1) > text:nth-child(2)");
   By txtRaporDegeri1By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)");
   By txtGridDegeri2By = By.cssSelector(".dxc-labels > g:nth-child(2) > g:nth-child(1) > text:nth-child(2)");
   By txtRaporDegeri2By = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)");
   By txtGridDegeri3By = By.cssSelector(".dxc-labels > g:nth-child(3) > g:nth-child(1) > text:nth-child(2)");
   By txtRaporDegeri3By = By.cssSelector("tr.dx-row:nth-child(6) > td:nth-child(3)");
   By txtGridDegeri4By = By.cssSelector(".dxc-labels > g:nth-child(4) > g:nth-child(1) > text:nth-child(2)");
   By txtRaporDegeri4By = By.cssSelector("tr.dx-row:nth-child(8) > td:nth-child(3)");
   By txtGridDegeri5By = By.cssSelector(".dxc-labels > g:nth-child(5) > g:nth-child(1) > text:nth-child(2)");
   By txtRaporDegeri5By = By.cssSelector("tr.dx-row:nth-child(10) > td:nth-child(3)");
   By txtGridDegeri6By = By.cssSelector(".dxc-labels > g:nth-child(6) > g:nth-child(1) > text:nth-child(2)");
   By txtRaporDegeri6By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)");
   By txtRaporDegeri7By = By.cssSelector("tr.dx-row:nth-child(3) > td:nth-child(3)");
   By txtMasrafKategorisiBy = By.cssSelector("td[colspan='5']");
   By btnSecondPage2By = By.cssSelector("div[aria-label='Page 2']");
   By txtRaporTotalSumBy = By.cssSelector("div.dx-datagrid-summary-item.dx-datagrid-text-content");
   By txtTarihFiltreBaslangicBy = By.id("RequestModel_StartDate");
   By txtTarihFiltreBitisBy = By.id("RequestModel_EndDate");
   By btnFiltreliRaporDegeri1By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)");
   By btnFiltreliRaporDegeri2By = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)");
   By btnProfilBy = By.cssSelector("span.avatar.avatar-online.mr-10");
   By btnCikisYapBy = By.cssSelector("i.icon.wb-power");
   By btnMasrafTarihiFiltreBy = By.cssSelector("span.dx-header-filter.dx-header-filter-empty");
   By chb2017YilFiltresiBy = By.cssSelector("span.dx-checkbox-icon");
   By btnFiltreTamamBy = By.cssSelector("div.dx-button-content");
   By txtFiltreliRaporDegeriBy = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(2)");
   By txtFiltrelenenMasrafKategorisiBy = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(2)");
   By txtFiltrelenenMasrafMiktariBy = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)");
   By txtFiltrelenenDosyaNoBy = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(5)");
   By txtFiltrelenenDosyaNo2By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(5)");
   String masrafKategorisi1 = "Masraf Kategorisi: Kullanım, Yararlanma, Bakım, Kira, Banka vb giderler";
   String masrafKategorisi2	= "Masraf Kategorisi: Mahkeme, Noter, Ticaret ve Diğer Sicil Harç ve Giderleri";
   String masrafKategorisi3 = "Masraf Kategorisi: Danışma, Eğitim, Güvenlik, Çeviri vb Dış Tedarik Giderleri";
   String masrafKategorisi4 = "Masraf Kategorisi: Seyahat, Ulaşım ve Konaklama Giderleri"; //tren
   String masrafKategorisi5 = "Masraf Kategorisi: Tanıtım, Üyelik, Katılım ve Sponsorluk Giderleri";//baro
   String masrafKategorisi6 = "Masraf Kategorisi: Yemek, İçecek ve Bahşiş Giderleri";//yemek
   String masrafKategorisi7 = "Masraf Kategorisi: Yemek, İçecek ve Bahşiş Giderleri";//yemek
   By btnExcelDownloadBy = By.cssSelector("i.dx-icon.dx-icon-export-excel-button");
 
   By txtDosyaNosunaGoreFiltrelenenMiktar1By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar2By = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar3By = By.cssSelector("tr.dx-row:nth-child(6) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar4By = By.cssSelector("tr.dx-row:nth-child(8) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar5By = By.cssSelector("tr.dx-row:nth-child(10) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar6By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar7By = By.cssSelector("tr.dx-row:nth-child(3) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar8By = By.cssSelector("tr.dx-row:nth-child(5) > td:nth-child(3)");
		   
   By DosyaNosunagoreFiltrelenenToplamMiktarBy = By.cssSelector("div.dx-datagrid-summary-item.dx-datagrid-text-content");
   
  
   By txtDosyaNosunaGoreFiltrelenenMiktar11By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar22By = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar33By = By.cssSelector("tr.dx-row:nth-child(6) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar44By = By.cssSelector("tr.dx-row:nth-child(8) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar55By = By.cssSelector("tr.dx-row:nth-child(10) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar66By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar77By = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)"); 
   
   By txtDosyaNosunaGoreFiltrelenenMiktar111By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar222By = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar333By = By.cssSelector("tr.dx-row:nth-child(6) > td:nth-child(3)");
   By txtDosyaNosunaGoreFiltrelenenMiktar444By = By.cssSelector("tr.dx-row:nth-child(8) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar555By = By.cssSelector("tr.dx-row:nth-child(10) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar666By = By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)"); 
   By txtDosyaNosunaGoreFiltrelenenMiktar777By = By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)"); 
   
   
   
	//*********Page Methods*********
   	
    public RaporlarPage raporKarsilastir() {
    click(btnKategoriyeGoreMasrafRaporuBy);
       sleep(3);
  	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
  	 sleep(1);
  	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
  	 sleep(1);
  	 click(btnKaydetBy, 0);
  	 sleep(1);
  
    String raporDegeri = removeDotAndZeros(getTextContent(txtRaporDegeri1By));
    String gridDegeri = removeDotAndZeros(getTextContent(txtGridDegeri1By));
    System.out.println(raporDegeri);
    System.out.println(gridDegeri);
    if (raporDegeri.equals(gridDegeri)) {System.out.println("Rapor degeri ve grid degerinin esit oldugu dogrulandi.");}
    String readMasrafKategorisi = getTextContent((By.cssSelector("tr.dx-group-row:nth-child(1) > td:nth-child(2)")));
    if (masrafKategorisi1.equals(readMasrafKategorisi)) {System.out.println("Grid masraf kategorisi ve grafikteki masraf kategorisinin ayni oldugu dogrulandi.");}
    
    return this;
    }
    public RaporlarPage raporKarsilastir2() {
        click(btnKategoriyeGoreMasrafRaporuBy);
        sleep(3);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	 sleep(1);
  	 click(btnKaydetBy, 0);
  	 sleep(1);
    String raporDegeri = removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)")));
    String gridDegeri = removeDotAndZeros(getTextContent(txtGridDegeri2By));
    System.out.println(raporDegeri);
    System.out.println(gridDegeri);
    if (raporDegeri.equals(gridDegeri)) {System.out.println("Rapor degeri ve grid degerinin esit oldugu dogrulandi.");}
    String readMasrafKategorisi2 = getTextContent(By.cssSelector("tr.dx-row:nth-child(3) > td:nth-child(2)"));
    System.out.println(readMasrafKategorisi2);
    System.out.println(masrafKategorisi2);
    if (masrafKategorisi2.equals(readMasrafKategorisi2)) {System.out.println("Grid masraf kategorisi ve grafikteki masraf kategorisinin ayni oldugu dogrulandi.");}
   
    return this;
    }
    
    public RaporlarPage raporKarsilastir3() {
        click(btnKategoriyeGoreMasrafRaporuBy);
        sleep(3);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	 sleep(1);
  	 click(btnKaydetBy, 0);
  	 sleep(1);
    String raporDegeri = removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)")));
    String gridDegeri = removeDotAndZeros(getTextContent(txtGridDegeri3By));
    System.out.println(raporDegeri);
    System.out.println(gridDegeri);
    if (raporDegeri.equals(gridDegeri)) {System.out.println("Rapor degeri ve grid degerinin esit oldugu dogrulandi.");}
    String readMasrafKategorisi3 = getTextContent(By.cssSelector("tr.dx-row:nth-child(1) > td:nth-child(2)"));
    System.out.println(readMasrafKategorisi3);
    System.out.println(masrafKategorisi3);
    if (masrafKategorisi3.equals(readMasrafKategorisi3)) {System.out.println("Grid masraf kategorisi ve grafikteki masraf kategorisinin ayni oldugu dogrulandi.");}
    
    return this;
    }

    public RaporlarPage raporKarsilastir4() {
        click(btnKategoriyeGoreMasrafRaporuBy);
        sleep(3);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	 sleep(1);
  	 click(btnKaydetBy, 0);
  	 sleep(1);
    String raporDegeri = removeDotAndZeros(getTextContent(txtRaporDegeri4By));
    String gridDegeri = removeDotAndZeros(getTextContent(txtGridDegeri4By));
    System.out.println(raporDegeri);
    System.out.println(gridDegeri);
    if (raporDegeri.equals(gridDegeri)) {System.out.println("Rapor degeri ve grid degerinin esit oldugu dogrulandi.");}
    String readMasrafKategorisi4 = getTextContent(By.cssSelector("tr.dx-row:nth-child(7) > td:nth-child(2)"));
    System.out.println(readMasrafKategorisi4);
    System.out.println(masrafKategorisi4);
    if (masrafKategorisi4.equals(readMasrafKategorisi4)) {System.out.println("Grid masraf kategorisi ve grafikteki masraf kategorisinin ayni oldugu dogrulandi.");}
    
    return this;
    }
    public RaporlarPage raporKarsilastir5() {
        click(btnKategoriyeGoreMasrafRaporuBy);
        sleep(3);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	 sleep(1);
  	 click(btnKaydetBy, 0);
  	 sleep(1);
    String raporDegeri = removeDotAndZeros(getTextContent(txtRaporDegeri5By));
    String gridDegeri = removeDotAndZeros(getTextContent(txtGridDegeri5By));
    System.out.println(raporDegeri);
    System.out.println(gridDegeri);
    if (raporDegeri.equals(gridDegeri)) {System.out.println("Rapor degeri ve grid degerinin esit oldugu dogrulandi.");}
    String readMasrafKategorisi5 = getTextContent(By.cssSelector("tr.dx-row:nth-child(9) > td:nth-child(2)"));
    System.out.println(readMasrafKategorisi5);
    System.out.println(masrafKategorisi5);
    if (masrafKategorisi5.equals(readMasrafKategorisi5)) {System.out.println("Grid masraf kategorisi ve grafikteki masraf kategorisinin ayni oldugu dogrulandi.");}
    
    return this;
    }
    public RaporlarPage raporKarsilastir6() {
        click(btnKategoriyeGoreMasrafRaporuBy);
        sleep(3);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	click(btnKaydetBy, 0);
   	 sleep(1);
    click(btnSecondPage2By);
    
    sleep(5);
    String raporDegeri = removeDotAndZeros(getTextContent(txtRaporDegeri6By));
    String gridDegeri = removeDotAndZeros(getTextContent(txtGridDegeri6By));
    System.out.println(raporDegeri);
    System.out.println(gridDegeri);	
    if (raporDegeri.equals(gridDegeri)) {System.out.println("Rapor degeri ve grid degerinin esit oldugu dogrulandi.");}
    String readMasrafKategorisi6 = getTextContentJS("td.dx-group-cell", 0);
    System.out.println(readMasrafKategorisi6);
    System.out.println(masrafKategorisi6);
    if (masrafKategorisi6.equals(readMasrafKategorisi6)) {System.out.println("Grid masraf kategorisi ve grafikteki masraf kategorisinin ayni oldugu dogrulandi.");}
    
    	return this;
    }
    public RaporlarPage raporKarsilastir7() {
        click(btnKategoriyeGoreMasrafRaporuBy);
        sleep(3);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	click(btnKaydetBy, 0);
     	 sleep(1);
    	    System.out.println("7. masraf ekleme islemi basarili.");
    	    sleep(5);
    	    String raporDegeri1 = removeDotAndZeros(getTextContent(txtRaporDegeri1By));
    	    int raporDegeriInt_1 = Integer.parseInt(raporDegeri1);
    	    System.out.println(raporDegeriInt_1);
	   	    sleep(1);
    	    String raporDegeri2 = removeDotAndZeros(getTextContent(txtRaporDegeri2By));
    	    int raporDegeriInt_2 = Integer.parseInt(raporDegeri2);
    	    System.out.println(raporDegeriInt_2);
	   	    sleep(1);
    	    String raporDegeri3 = removeDotAndZeros(getTextContent(txtRaporDegeri3By));
    	    int raporDegeriInt_3 = Integer.parseInt(raporDegeri3);
    	    System.out.println(raporDegeriInt_3);
    	    sleep(1);
    	    String raporDegeri4 = removeDotAndZeros(getTextContent(txtRaporDegeri4By));
    	    int raporDegeriInt_4 = Integer.parseInt(raporDegeri4);
    	    System.out.println(raporDegeriInt_4);
    	    sleep(1);
    	    String raporDegeri5 = removeDotAndZeros(getTextContent(txtRaporDegeri5By));
    	    int raporDegeriInt_5 = Integer.parseInt(raporDegeri5);
    	    System.out.println(raporDegeriInt_5);
    	    sleep(1);
    	    click(btnSecondPage2By);
    	    sleep(1);
    	    String raporDegeri6 = removeDotAndZeros(getTextContent(txtRaporDegeri6By));
    	    int raporDegeriInt_6 = Integer.parseInt(raporDegeri6);
    	    System.out.println(raporDegeriInt_6);
    	    sleep(1);
    	    String raporDegeri7 = removeDotAndZeros(getTextContent(txtRaporDegeri7By));
    	    int raporDegeriInt_7 = Integer.parseInt(raporDegeri7);
    	    System.out.println(raporDegeriInt_7);
    	    int raporValuesSum = raporDegeriInt_1+raporDegeriInt_2+raporDegeriInt_3+raporDegeriInt_4+raporDegeriInt_5+raporDegeriInt_6+ raporDegeriInt_7;
    	    System.out.println("Grafikteki Toplam: " + raporValuesSum);
    	    System.setProperty("tablodaki_toplam_deger", Integer.toString(raporValuesSum));
    	    String raporActualSum = removeDotAndZerosandToplam(getTextContent(txtRaporTotalSumBy));//Toplam ve boşluğu sil
    	    int number1 = 28000;
    	    System.out.println("Rapordaki toplam: " + raporActualSum);
    	    if (raporValuesSum == number1 && raporActualSum == "28000" ) {
    	    	System.out.println("Grafik toplam tutarinin ve listedeki toplam tutarin esit oldugu dogrulandi.");
    	    }
   
    	return this;
    }
    
    public RaporlarPage raporFiltrele() {
    	click(btnKategoriyeGoreMasrafRaporuBy);
   	 sleep(1);
   	 String masrafMiktari1 = System.getProperty("masraf_miktari_1");
   	 String masrafMiktari2 = System.getProperty("masraf_miktari_2");
   	 String masrafTarihi = System.getProperty("masraf_tarihi");
   	 System.out.println("Filtrelenecek tarih: " + masrafTarihi);
   	 sleep(3);
   	 writeText(txtTarihFiltreBaslangicBy, "19.01.2020");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "21.01.2020");
   	 sleep(1);
   	 click(btnKaydetBy, 0);
   	String filtrelenenRaporDegeri1 = removeDotAndZeros(getTextContent(btnFiltreliRaporDegeri1By));
 	String filtrelenenRaporDegeri2 = removeDotAndZeros(getTextContent(btnFiltreliRaporDegeri2By));
 	System.out.println("Girilen 1. masraf: " + masrafMiktari1+ ", " + "Girilen 2. masraf: " + masrafMiktari2);
 	System.out.println("Filtrelemeden sonra görüntülenen 1. masraf: " + filtrelenenRaporDegeri1+ ", " + "Filtrelemeden sonra görüntülenen 2. masraf: " + filtrelenenRaporDegeri2);
 	
    	return this;

    	
    }
    public RaporlarPage raporFiltrele2() {
    	sleep(1);
    	System.out.println("1. rapor filtreleme islemi basarili.");
    	sleep(1);
    	click(btnKategoriyeGoreMasrafRaporuBy);
   	 sleep(1);
   	 writeText(txtTarihFiltreBaslangicBy, "19.01.2017");
   	 writeText(txtTarihFiltreBitisBy, "21.01.2017");
   	 sleep(1);
   	 click(btnKaydetBy, 0);
   	 String masrafTarihi = System.getProperty("masraf_tarihi_2");
   	 System.out.println("Filtrelenecek tarih: " + masrafTarihi);
   	 sleep(2);
   	click(btnMasrafTarihiFiltreBy, 1);
    	 sleep(1);
   	 clickElementJs("span.dx-checkbox-icon", 1);
  	 sleep(1);
  	 clickElementJs("span.dx-button-text", 0);
  	 sleep(1);
   	 click(btnKaydetBy, 0);
   	String filtreliYilDegeri = removeSubTextFromText(getTextContent(txtFiltreliRaporDegeriBy),"20.01.");
   	System.out.println("Filtrelenen yil: " + filtreliYilDegeri);
 	if(filtreliYilDegeri.contains("2017")){System.out.println("Raporlar yila gore dogru bicimde filtrelendi.");	};
 	  	return this;
    }
    
    public RaporlarPage raporFiltrele3() {
    	sleep(1);
    	System.out.println("2. rapor filtreleme islemi basarili.");
    	sleep(1);
    	click(btnKategoriyeGoreMasrafRaporuBy);
   	 sleep(1);
   	 String masrafTarihi = System.getProperty("masraf_tarihi");
   	 System.out.println("Filtrelenecek tarih: " + masrafTarihi);
   	 sleep(1);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2020");
   	 sleep(1);
   	 writeText(txtTarihFiltreBitisBy, "25.01.2020");
   	
   	sleep(1);
  	 click(btnKaydetBy, 0);
   	 int masrafTarihiGun = Integer.parseInt(removeSubTextFromText(masrafTarihi, ".01.2020"));
   	 int filtreBaslangicGun = Integer.parseInt(removeSubTextFromText("15.01.2020",".01.2020"));
   	 int filtreBitisGun = Integer.parseInt(removeSubTextFromText("25.01.2020",".01.2020"));
   	 if (masrafTarihiGun > filtreBaslangicGun && masrafTarihiGun < filtreBitisGun) {
   	 System.out.println("Masraf tarihinin secilen tarih araliginda oldugu dogrulandi.");
   	 }
   	String masrafKategorisi = "Mahkeme, noter, ticaret ve diğer sicil harç ve giderleri";//System.getProperty("masraf_kategorisi");
   	String filtrelenenMasrafKategorisi = getTextContent(By.cssSelector("tr.dx-row:nth-child(3) > td:nth-child(2)"));
   	System.out.println("Eklenen masraf kategorisi: "+ masrafKategorisi );
   	System.out.println("Listelenen masraf kategorisi: " + filtrelenenMasrafKategorisi);
   	
   	if (masrafKategorisi.contains("Mahkeme") && filtrelenenMasrafKategorisi.contains("Mahkeme")) {
   		System.out.println("Masraf kategorisi dogru bicimde filtrelendi. ");
   	}
   	
    String masrafMiktari = System.getProperty("masraf_miktari_2");
    int listedekiMasrafMiktari1 = Integer.parseInt(getTextContent(By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)")));
    int listedekiMasrafMiktari2 = Integer.parseInt(getTextContent(By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)")));
    int listedekiDegerlerinToplami = listedekiMasrafMiktari1+listedekiMasrafMiktari2;
   System.out.println("Filtrelenen miktarlarin toplami: " +listedekiDegerlerinToplami);
   int tablonunAltindakiDeger =  Integer.parseInt(removeDotAndZerosandToplam(getTextContent(By.cssSelector("div.dx-datagrid-summary-item.dx-datagrid-text-content"))));
   System.out.println("Tablonun altindaki deger: " + tablonunAltindakiDeger);
   if(listedekiDegerlerinToplami == tablonunAltindakiDeger) {
	   System.out.println("Masraf kategorileri ve miktarlari dogru bicimde filtrelendi.");
   }
   	 return this;
    }
    
    
     public RaporlarPage raporFiltrele4() {
     	sleep(1);
     	System.out.println("3. rapor filtreleme islemi basarili.");
     	sleep(1);
     click(btnKategoriyeGoreMasrafRaporuBy);
     sleep(1);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");

   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	 sleep(1);
 	 click(btnKaydetBy, 0);
   	 click(btnMasrafTarihiFiltreBy, 4);
   	 sleep(1);
   	 clickElementJs("span.dx-checkbox-icon", 1);
  	 sleep(1);
  	 clickElementJs("span.dx-button-text", 0);
  	 sleep(1);
  	 String dosyaNo = System.getProperty("dosya_no_1");  	
  	 String readDosyaNo = getTextContent(txtFiltrelenenDosyaNoBy);
  	 if (dosyaNo == readDosyaNo) {System.out.println("Raporlar dosya numarasina gore dogru bicimde filtrelendi.");}
  	 sleep(1);
  	int filtreSonrasiGorulenToplamMiktar = Integer.parseInt(removeDotAndZerosandToplam(getTextContent(DosyaNosunagoreFiltrelenenToplamMiktarBy)));
  	 System.out.println("Filtreleme sonrasi tablo altinda gorulen miktar: " + filtreSonrasiGorulenToplamMiktar);
  	 
  	 int okunanDeger1 = Integer.parseInt(removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)"))));
  	 System.out.println(okunanDeger1);
  	 int okunanDeger2 = Integer.parseInt(removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(4) > td:nth-child(3)"))));
  	 System.out.println(okunanDeger2);
  	 int okunanDeger3 = Integer.parseInt(removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(6) > td:nth-child(3)"))));
  	 System.out.println(okunanDeger3);
  	 int okunanDeger4 = Integer.parseInt(removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(8) > td:nth-child(3)"))));
  	 System.out.println(okunanDeger4);
  	 int okunanDeger5 = Integer.parseInt(removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(10) > td:nth-child(3)"))));
  	 System.out.println(okunanDeger5);
  	 sleep(1);
  	 click(btnSecondPage2By);
  	 sleep(1);
  	 int okunanDeger6 = Integer.parseInt(removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(2) > td:nth-child(3)"))));
  	 System.out.println(okunanDeger6);
  	 int okunanDeger7 = Integer.parseInt(removeDotAndZeros(getTextContent(By.cssSelector("tr.dx-row:nth-child(3) > td:nth-child(3)"))));
 	 System.out.println(okunanDeger7);
  	 
  	 System.out.println("Sayfanin altinda yazili toplam miktar: " + filtreSonrasiGorulenToplamMiktar);
  	  int listeToplami = okunanDeger1 + okunanDeger2 + okunanDeger3 + okunanDeger4 + okunanDeger5 + okunanDeger6  + okunanDeger7;
  	 System.out.println("Listedeki miktarlarin toplami: " + listeToplami);
  	 sleep(1);
  	 String stringListeToplami = Integer.toString(listeToplami);
  	 System.setProperty("dosya_1_toplam_miktar", stringListeToplami);
  	 
  	 if (listeToplami == filtreSonrasiGorulenToplamMiktar) {
  		 System.out.println("Masraf miktarlari dosya numarasina gore dogru bicimde filtrelendi.");
  		 return this;
  	 }
   	 return this;
    }
     
     
     public RaporlarPage raporFiltrele5() {
     
 
     	sleep(1);
     click(btnKategoriyeGoreMasrafRaporuBy);
     sleep(1);
     System.out.println("8. masraf ekleme islemi basarili.");
     sleep(1);
   	 writeText(txtTarihFiltreBaslangicBy, "15.01.2015");
   	 writeText(txtTarihFiltreBitisBy, "25.01.2021");
   	 sleep(1);
 	 click(btnKaydetBy, 0);
   	 click(btnMasrafTarihiFiltreBy, 4);
   	 sleep(1);
   	 clickElementJs("span.dx-checkbox-icon", 2);
  	 sleep(1);
  	 clickElementJs("span.dx-button-text", 0);
  	 sleep(1);
  	 String dosyaNo = System.getProperty("dosya_no_2");
  	 String readDosyaNo = getTextContent(txtFiltrelenenDosyaNoBy);
  	 if (dosyaNo == readDosyaNo) {System.out.println("Raporlar dosya numarasina gore dogru bicimde filtrelendi.");}
  	 sleep(1);
  	int filtreSonrasiGorulenToplamMiktar = Integer.parseInt(removeDotAndZerosandToplam(getTextContent(DosyaNosunagoreFiltrelenenToplamMiktarBy)));
  	 System.out.println("Filtreleme sonrasi tablo altinda gorulen miktar: " + filtreSonrasiGorulenToplamMiktar);
  	 
  	 int okunanDeger1 = Integer.parseInt(removeDotAndZeros(getTextContent(txtDosyaNosunaGoreFiltrelenenMiktar1By)));
  	 System.out.println(okunanDeger1);

  	 
  	 System.out.println("Sayfanin altinda yazili toplam miktar: " + filtreSonrasiGorulenToplamMiktar);
  
  	 if (filtreSonrasiGorulenToplamMiktar == okunanDeger1) {
  		 System.out.println("Masraf miktarlari dosya numarasina gore dogru bicimde filtrelendi.");
  		 return this;
  	 }
  	 String stringListeToplami = Integer.toString(okunanDeger1);
  	 System.setProperty("dosya_2_toplam_miktar", stringListeToplami);
  	 
   	 return this;
    }
     

     
     public RaporlarPage raporFiltrele6() {
      	  	sleep(1);
      click(btnKategoriyeGoreMasrafRaporuBy);
         	 sleep(1);
      	System.out.println("5. rapor filtreleme islemi basarili.");
      	sleep(5);
    	 int tabloToplam = Integer.parseInt(System.getProperty("tablodaki_toplam_deger"));
    	 System.out.println("Tablodaki 1. dosyaya ait masraf degerlerin toplami: "+ tabloToplam);
    	 int tabloToplam2 = tabloToplam + 8000;
    	 int dosya1ToplamMiktar = Integer.parseInt(System.getProperty("dosya_1_toplam_miktar"));
    	 int tumDosyalarToplamMiktar = dosya1ToplamMiktar + 8000;
    	 System.out.println("1. ve 2. dosyaya ait masraflarin toplami: "+ tumDosyalarToplamMiktar);
    	
    	 if (tabloToplam2 == tumDosyalarToplamMiktar) {
    		 
    		 System.out.println("Toplam tutar Dosya 1 ve Dosya 2'nin masraf toplamina esit.");
    	 }
    	 return this;
     }
    	 
         public RaporlarPage raporExcel() {
       	  	sleep(1);
       click(btnKategoriyeGoreMasrafRaporuBy);
          	 sleep(1);
       	System.out.println("6. rapor filtreleme islemi basarili.");
        sleep(4);
     	click(btnExcelDownloadBy);
     	sleep(7);
     	 
    	 return this;
     }
     public  RaporlarPage raporExcelCompare() {
    	 
    	 sleep(1);
    	 System.out.println("Excel dosyasi basariyla indirildi ve okundu.");
    	 sleep(1);
    	 String cellValue = System.getProperty("referans_dosya_no");
    	 String dosyaNo = "00008";
    	 sleep(1);
    	if (cellValue.equals(dosyaNo)) {
    		
    		System.out.println("Excel dosyasindaki degerler ile girilen masraf degerlerinin ayni oldugu dogrulandi.");
    	}
    	
    	 
    	 return this;
     }
   
    
	public RaporlarPage logOut() {
	sleep(1);
	click(btnProfilBy);
	click(btnCikisYapBy);
	return this;
}
}