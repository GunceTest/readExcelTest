package tests.RegressionTestSuite;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import dbmodel.Provider;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.testng.annotations.Test;
import pages.*;
import utilities.RetryAnalyzer;
import utilities.TestBase;
import utilities.ReadExcel;

public class TC_Regression_001_Phase_1 extends TestBase {

	
	Provider provider;
	LoginPage loginPage;
	HomePage homePage;
	GorevlerPage gorevlerPage;
	TenMinutesMailPage tenMinutesMailPage;
	Names names;
	EkipArkadaslarimizPage ekipArkadaslarimizPage;
	DosyalarPage dosyalarPage;
	KontaklarimizPage kontaklarimizPage;
	MasraflarPage masraflarPage;
	RaporlarPage raporlarPage;
	utilities.ReadExcel readExcel;
	 @Test(retryAnalyzer=RetryAnalyzer.class)                                       //(priority = 0)
	public void TC_Regression_001_Phase_1() throws Throwable  {
		// ***************************************PAGE INSTANTIATIONS***************************************
		provider = new Provider();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		gorevlerPage = new GorevlerPage(driver);
		tenMinutesMailPage = new TenMinutesMailPage(driver);
		names = new Names(driver);
		ekipArkadaslarimizPage = new EkipArkadaslarimizPage(driver);
		dosyalarPage = new DosyalarPage(driver);
		kontaklarimizPage = new KontaklarimizPage(driver);
		masraflarPage = new MasraflarPage(driver);
		raporlarPage = new RaporlarPage(driver);
		readExcel = new utilities.ReadExcel(driver);
		// ******************************************PARAMETERS**************************************
		
		String tenMinutesMail = configurationGet.gettenMinutesMail();
		String baseURL = System.getProperty("site_url");
		String env = System.getProperty("env");

		
		// *************PAGE METHODS********************

//	homePage.getSetExample();
//	tenMinutesMailPage.getSetExample();
		
		names.getRandomName();
		names.getRandomLastName();
		String name = System.getProperty("random_name_1");
		String lastName = System.getProperty("random_last_name_1");
		String ekipArkadasiAdi = System.getProperty("random_name_2");
		String ekipArkadasiSoyadi = System.getProperty("random_last_name_2");
		
	
		
		
//		tenMinutesMailPage.goToUrl(tenMinutesMail)
//		.CreateTempMail();
//		String userEmail = System.getProperty("user_email");
//		loginPage.goToUrl(baseURL)
//		.hesapOlustur(name, lastName, userEmail);
//		tenMinutesMailPage.goToUrl(tenMinutesMail)
//		.activateMail();
//		loginPage.setPassword();		
		loginPage.goToUrl("https://test.gunce.com");
		loginPage.loginUser();	
		homePage.goToMasraflar();
		masraflarPage.failedTestMasraflariSil();
		homePage.goToEkipArkadaslarimiz();
		ekipArkadaslarimizPage.ekipArkadasiEkle(ekipArkadasiAdi, ekipArkadasiSoyadi);
		homePage.goToKontaklarimiz();
		kontaklarimizPage.kurumEkle();
		String kurumAdi = System.getProperty("kurum_adi");
		String adresAdi = System.getProperty("adres_adi");
		String adres = System.getProperty("adres");
		homePage.goToDosyalar();
		dosyalarPage.dosyaEkle(kurumAdi, ekipArkadasiAdi, adresAdi);
		homePage.goToMasraflar();
		masraflarPage.masrafEkle();
		homePage.goToRaporlar();
		raporlarPage.raporKarsilastir();
		homePage.goToMasraflar();
		masraflarPage.masrafEkle2();
		homePage.goToRaporlar();
		raporlarPage.raporKarsilastir2();
		homePage.goToMasraflar();
		masraflarPage.masrafEkle3();
		homePage.goToRaporlar();
		raporlarPage.raporKarsilastir3();
		homePage.goToMasraflar();
		masraflarPage.masrafEkle4();
		homePage.goToRaporlar();
		raporlarPage.raporKarsilastir4();
		homePage.goToMasraflar();
		masraflarPage.masrafEkle5();
		homePage.goToRaporlar();
		raporlarPage.raporKarsilastir5();
		homePage.goToMasraflar();
		masraflarPage.masrafEkle6();
		homePage.goToRaporlar();
		raporlarPage.raporKarsilastir6();
		homePage.goToMasraflar();
		masraflarPage.masrafEkle7();
		homePage.goToRaporlar();
		raporlarPage.raporKarsilastir7();
		homePage.goToRaporlar();
		raporlarPage.raporFiltrele();
		homePage.goToRaporlar();
		raporlarPage.raporFiltrele2();
		homePage.goToRaporlar();
		raporlarPage.raporFiltrele3();
		homePage.goToRaporlar();
		raporlarPage.raporFiltrele4();
		homePage.goToDosyalar();
		dosyalarPage.dosyaEkle2(kurumAdi, ekipArkadasiAdi, adresAdi);
		homePage.goToMasraflar();
		masraflarPage.masrafEkle8();
		homePage.goToRaporlar();
		raporlarPage.raporFiltrele5();
		homePage.goToRaporlar();
		raporlarPage.raporFiltrele6();
		homePage.goToRaporlar();
		raporlarPage.raporExcel();
		readExcel.loadAndReadExcel();
		raporlarPage.raporExcelCompare();
		homePage.goToMasraflar();
		masraflarPage.successfulTestMasraflariSil();
		//Runtime.getRuntime().exec("C:\\Users\\Gun\\Desktop\\DeleteExcelFile.exe");	
		//jenkins icin alttaki calistirilacak
		Runtime.getRuntime().exec("C:\\Users\\guncetest.otomasyon\\Desktop\\DeleteExcelFile.exe");
		raporlarPage.logOut();
		
		
		//tarih bilgisini getirir.. current date.
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  

	    System.out.println("------------------------------");
		System.out.println("T E S T   T A M A M L A N D I.");
		System.out.println("------------------------------");
	}
}

