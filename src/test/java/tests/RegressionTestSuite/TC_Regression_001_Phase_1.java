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


		loginPage.goToUrl("https://test.gunce.com");
		loginPage.loginUser();	
		
		homePage.goToRaporlar();
		raporlarPage.raporExcel();
		readExcel.loadAndReadExcel();
		raporlarPage.raporExcelCompare();
		homePage.goToMasraflar();
		
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

