package Netmeds_Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Netmeds_PageClass.Netmeds_Page3;
import Netmeds_Testbase.Netmeds_Testbase;

public class Order_Medicine extends Netmeds_Testbase{
		//Object of Page Class
		Netmeds_Page3 netmeds_page3;
		public ExtentTest test;
		public ExtentReports extent;
		
		//Invoking Browser
		@BeforeClass
		public void launchWebsite() throws IOException {
			initialize();
			netmeds_page3 =  new Netmeds_Page3();
		}
		
		@BeforeTest
		public void x() {
			extent=new ExtentReports("C:\\Users\\gukaur\\.jenkins\\workspace\\Order_Medicine\\ExtentReport_OrderMedicine.html",true);	
		}

		@AfterTest
		public void y() {
			extent.endTest(test);
			extent.flush();
		}
		
	  @Test(priority=1)
	  public void Order_Medicine() {
		  test=extent.startTest("Verify whether User can click on Order Medicine Successfully");
		  test.log(LogStatus.INFO, "Netmeds Order Medicine is clickable.");
		  
		  netmeds_page3.Order_Medicine().click();
		  
		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/order-medicine";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "User can click on Order Medicine Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "User cannot click on Order Medicine Successfully");
			}
		  assertEquals(actual,expected);
	  }
	  
	  @Test(priority=2)
	  public void Upload_Now() {
		  test=extent.startTest("Verify whether Upload now section is visible Successfully");
		  test.log(LogStatus.INFO, "Upload Now is visible.");
		  
		  netmeds_page3.Upload_now().isDisplayed();

		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/order-medicine";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Upload now section is visible Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "Upload now section is not visible Successfully");
			}
		  assertEquals(actual,expected);
	  }
	  
	  @Test(priority=3)
	  public void Consult_Doctor() {
		  test=extent.startTest("Verify whether Consult Doctor section is visible Successfully");
		  test.log(LogStatus.INFO, "Consult Doctor section is visible.");
		  
		  netmeds_page3.Consult_Doctor().isDisplayed();

		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/order-medicine";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Consult Doctor section is visible Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "Consult Doctor section is not visible Successfully");
			}
		  assertEquals(actual,expected);
	  }
	  
	  @Test(priority=4)
	  public void Doc_consultation() {
		  test=extent.startTest("Verify whether Doctor Consultation pop-up is visible Successfully");
		  test.log(LogStatus.INFO, "Doctor Consultation pop-up is visible.");
		  
		  netmeds_page3.Consult_Doctor().click();

		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/order-medicine";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Doctor Consultation pop-up is visible Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "Doctor Consultation pop-up is not visible Successfully");
			}
		  assertEquals(actual,expected);
	  }
	  
	  @Test(priority=5, dependsOnMethods="Doc_consultation")
	  public void Start_Ordering() {
		  test=extent.startTest("Verify whether Start Ordering button is working Successfully");
		  test.log(LogStatus.INFO, "Doctor Consultation pop-up is visible.");
		  
		  netmeds_page3.Start_Ordering().click();

		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/prescriptions";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Start Ordering button is working Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "Start Ordering button is not working Successfully");
			}
		  assertEquals(actual,expected);
		  driver.navigate().back();
	  }
	  
	  @Test(priority=6)
	  public void Shop_by_Category() {
		  test=extent.startTest("Verify whether Shop By Category section is visible Successfully");
		  test.log(LogStatus.INFO, "Shop By Category section is visible.");
		  
		  netmeds_page3.Shop_by_Category().isDisplayed();

		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/order-medicine";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "Shop By Category section is visible Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "Shop By Category section is not visible Successfully");
			}
		  assertEquals(actual,expected);
	  }
	  
	  @Test(priority=7)
	  public void Petcare() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Petcare Successfully");
		  test.log(LogStatus.INFO, "Petcare is clickable.");
		  
		  Thread.sleep(2000);
		  netmeds_page3.Petcare().click();

		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/non-prescriptions/veterinary/petcare";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "User can click on Petcare Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "User cannot click on Petcare Successfully");
			}
		  assertEquals(actual,expected);
		  driver.navigate().back();
	  }
	  
	  @Test(priority=8)
	  public void Vitamins_Supplements() throws InterruptedException{
		  test=extent.startTest("Verify whether User can click on Vitamins & Supplements Successfully");
		  test.log(LogStatus.INFO, "Vitamins & Supplements is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Vitamins_Supplements().click();
		 
		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/non-prescriptions/fitness/vitamins-and-supplements";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "User can click on Vitamins & Supplements Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "User cannot click on Vitamins & Supplements Successfully");
			}
		  assertEquals(actual,expected);
		  driver.navigate().back();
	  }
	  
	  @Test(priority=9)
	  public void Orthopaedics() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Orthopaedics Successfully");
		  test.log(LogStatus.INFO, "Orthopaedics is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Orthopaedics().click();

		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/non-prescriptions/devices/orthopaedics";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "User can click on Orthopaedics Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "User cannot click on Orthopaedics Successfully");
			}
		  assertEquals(actual,expected);
		  driver.navigate().back();
	  }
	  
	  @Test(priority=10)
	  public void Measurements() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Measurements Successfully");
		  test.log(LogStatus.INFO, "Measurements is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Measurements().click();
	
		  String actual=driver.getCurrentUrl();
		  String expected="https://www.netmeds.com/non-prescriptions/devices/measurements";
		  if(actual.equals(expected)) {
				test.log(LogStatus.PASS, "User can click on Measurements Successfully");
			}
			else {
				test.log(LogStatus.FAIL, "User cannot click on Measurements Successfully");
			}
		  assertEquals(actual,expected);
		  driver.navigate().back();
	  }
	  
	  @Test(priority=11)
	  public void Dilutions() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Dilutions Successfully");
		  test.log(LogStatus.INFO, "Dilutions is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Dilutions().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/ayush/homeopathy/dilutions");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=12)
	  public void Health_Concerns() throws InterruptedException {
		  test=extent.startTest("Verify whether Health Concerns section is visible Successfully");
		  test.log(LogStatus.INFO, "Health Concerns section is visible.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Health_Concerns().isDisplayed();
		  Assert.assertEquals(netmeds_page3.Health_Concerns().isDisplayed(), true);
	  }
	  
	  @Test(priority=13)
	  public void Lung_Care() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Lung Care Successfully");
		  test.log(LogStatus.INFO, "Lung Care is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Lung_Care().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/lung-care");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=14)
	  public void Weight_Care() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Weight Care Successfully");
		  test.log(LogStatus.INFO, "Weight Care is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Weight_Care().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/weight-care");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=15)
	  public void Bone_JointPain() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Bone & Joint Pain Successfully");
		  test.log(LogStatus.INFO, "Bone & Joint pain is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Bone_JointPain().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/bone-and-joint-pain");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=16)
	  public void Cold_fever() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Cold and Fever Successfully");
		  test.log(LogStatus.INFO, "Cold and Fever is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Cold_fever().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/cold-and-fever");
		  driver.navigate().back();
	  }
	  
	  //Closing the browser
	  @AfterClass
	  public void terminate() {
		  close();
	  }
}
