package com.reports.testcases;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.reports.pages.BuiderElements;
import com.reports.pages.CustomReports;
import com.reports.pages.CustomReportsRunByUser;
import com.reports.pages.EditCustomReportRights;
import org.openqa.selenium.JavascriptExecutor;

public class CustomTestBuilder extends CustomReports
{
	int reportDate;
	public static WebDriver driver;
	EditCustomReportRights editCustReportRights;
	
	CustomReports customReports;
	static BuiderElements builderElements;
	
	CustomReportsRunByUser customReportsRunByUser;
	static String mainAddres;
	
	public CustomTestBuilder(WebDriver driver)
	{
		super(driver);
		editCustReportRights = new EditCustomReportRights(driver);
		builderElements = new BuiderElements(driver);
			
	}
	
	public void rightsConfig(String allowedReportDuration) throws InterruptedException
	{
		//Code For Switch Window
		
		
		String addrMain;
		addrMain = driver.getWindowHandle();
		
		builderElements.switchTabs(addrMain);
//		Set<String> allWindowAddress= driver.getWindowHandles();
//		
//		for(String childAddres: allWindowAddress)
//		{
//			if(!allWindowAddress.equals(childAddres))
//			{
//				driver.switchTo().window(childAddres);
//			}
//		}
		
		editCustReportRights.selectAllowedReportDuration(allowedReportDuration);
		editCustReportRights.selectAvailableUser("manish01");
		editCustReportRights.clickOnAddAvailUserBTN();
		
		editCustReportRights.clickOnSaveBTN();
		driver.close();
		
		driver.close();
		driver.switchTo().window(addrMain);
		//controle to main window
	}
	

	public void provideAccess() throws InterruptedException
	{
		clickOnDepartmentWiseAllocationReport(driver);
		rightsConfig("1");
		
		clickOnDoctorWisePatientCountReport(driver);
		rightsConfig("2");
		
		clickOnBillAdjustmentEntriesList(driver);
		rightsConfig("3");
		
		clickOnDoctorRevenueDetailedReport(driver);
		rightsConfig("4");
		
		clickOnBillAdjustmentEntriesList(driver);
		rightsConfig("5");
		
		clickOnDoctorRevenueDetailedReport(driver);
		rightsConfig("6");
		
		clickOnRadiologyTATReport(driver);
		rightsConfig("7");
		
		clickOnDepartmentwisePatientCount(driver);
		rightsConfig("8");
		
		clickOnConsumableItemsPriceReport(driver);
		rightsConfig("9");
		
		clickOnVisitStatusReportforHealthAuthority(driver);
		rightsConfig("10");
		
		clickOnSubmissionRejectionRateReport(driver);
		rightsConfig("11");
		
		clickOnSponsorWiseClaimSubmissionList(driver);
		rightsConfig("12");
		
		clickOnMedicalCheckupReport(driver);
		rightsConfig("1");
		
		clickOnRepeatingDiagnosisReport(driver);
		rightsConfig("2");
		
		clickOnAirmileReport(driver);
		rightsConfig("3");
		
		clickOnRevenueProgressReport(driver);
		rightsConfig("4");
		
		clickOnDetailedStockReport(driver);
		rightsConfig("5");
		
		clickOnPatientReferralReport(driver);
		rightsConfig("6");
		
		clickOnCashCreditSplitReport(driver);
		rightsConfig("7");
		
		clickOnInsuranceClaimBatchReport(driver);
		rightsConfig("8");
		
		clickOnStockRejectionReport(driver);
		rightsConfig("9");
		
		clickOnBifurcationReport(driver);
		rightsConfig("10");
		
		clickOnReconciliationReport(driver);
		rightsConfig("11");
		
		clickOnBillStatusReport(driver);
		rightsConfig("12");
		
		clickOnLaboratoryTATReport(driver);
		rightsConfig("1");
		
		clickOnLaboratoryTATReport(driver);
		rightsConfig("2");
		
		clickOnListofPlansReport(driver);
		rightsConfig("3");
		
		clickOnDenialAcceptanceReport( driver);
		rightsConfig("4");
		
		clickOnNationWiseRevenueReport(driver);
		rightsConfig("5");
		
		clickOnNationWiseRevenueReportDepartmentWise(driver);
		rightsConfig("6");
		
		clickOnBedOccupancyReport(driver);
		rightsConfig("7");
		
		clickOnDRGVarianceReport(driver);
		rightsConfig("8");
		
		clickOnDoctorPerformanceReport(driver);
		rightsConfig("9");
		
		clickOnTherapistReport(driver);
		rightsConfig("10");
		
		clickOnCustomerDueReport(driver);
		rightsConfig("12");
		
		clickOnRemittanceAdviceReport(driver);
		rightsConfig("1");
		
		clickOnPACSOrderStatisticsReport(driver);
		rightsConfig("2");
		
		clickOnResubmissionReport(driver);
		rightsConfig("3");
		
		clickOnTotalSalesReport(driver);
		rightsConfig("4");
		
		clickOnDischargeStatusReport(driver);
		rightsConfig("5");
		
		clickOnStockStatusReport(driver);
		rightsConfig("6");
		
		clickonPowerscribeReport(driver);
		rightsConfig("7");
		
		clickonAdvanceAndRefundReceipts(driver);
		rightsConfig("8");
		
		clickonDepositAndRefundReceipt(driver);
		rightsConfig("9");
		
		clickonPatientDueReport(driver);
		rightsConfig("10");
		
		clickonAppointmentTATReport(driver);
		rightsConfig("11");
		
		clickonPriorAuthReport(driver);
		rightsConfig("12");
		
		clickonRadiologyAlertCategoryReport(driver);
		rightsConfig("1");
		
//		clickonLabTatReport_fields(driver);
//		rightsConfig("2");
//		
//		clickonModifiedRevenueProgressReport(driver);
//		rightsConfig("3");
//		
//		clickonCollectionLogReportFinal(driver);
//		rightsConfig("5");
	}
	
	 //test1
	 public void navigateToCustomDashboard()
	 {
	  customReports = new CustomReports(driver);//Initializing the page elements
	  
	  ((JavascriptExecutor)driver).executeScript("scroll(50,500)");
	  customReports.clickOnCustomReportsDropdown();
	  customReports.clickOnReportListLink();
	  
	  customReportsRunByUser = new CustomReportsRunByUser(driver);
	  builderElements = new BuiderElements(driver);
	  
	 }

	 public String initializeElement() throws InterruptedException
	 {
	  customReportsRunByUser = new CustomReportsRunByUser(driver);//Initializing the element of the dashboard.
	  
	  mainAddres = driver.getWindowHandle();
	  
	  builderElements.switchTabs(mainAddres);
	  
	  return mainAddres;
	 }
	 
	 
	 /////////////////////All the Positive cases for custom reports starts/////////////////
	 
	 public static void getWindowHandle_SwitchTab() throws InterruptedException
	 {
	  mainAddres = driver.getWindowHandle();
	  builderElements.switchTabs(mainAddres); 
	 }
	 //test1
	 public String runCustomReportfor1Month_1st() throws InterruptedException
	 {
	  customReportsRunByUser = new CustomReportsRunByUser(driver);//initializing the webelement for buiderelements
	  customReportsRunByUser.clickOnDepartmentWiseAllocationReport();

	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  
	  return mainAddres;
	  
	 }
	 //test2
	 public String runCustomReportfor2Month_2nd() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnDoctorWisePatientCountReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test3
	 public String runCustomReportfor3Month_3th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnBillAdjustmentEntriesList();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 /////////////////////All the Positive cases for custom reports starts/////////////////
	 
	 //test4
	 public String runCustomReportsFor4Month_4th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnDoctorRevenueDetailedReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 
	 //test5
	 public String runCustomReportsFor5Month_5th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnRadiologyTATReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 
	 //test6
	 public String runCustomReportsFor6Month_6th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnDepartmentwisePatientCount();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 
	 //test7
	// public String runCustomReportsFor7Month_7th() throws InterruptedException
	// {
	//  customReportsRunByUser.clickOnConsumableItemsPriceReport();
	//  CustomTestBuilder.getWindowHandle_SwitchTab();
	//  return mainAddres;
	// }
	 
	 //test8
	 public String runCustomReportsFor7Month_7th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnVisitStatusReportforHealthAuthority();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test9
	 public String runCustomReportsFor8Month_8th() throws InterruptedException
	 { customReportsRunByUser.clickOnSubmissionRejectionRateReporty();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test10
	 public String runCustomReportsFor9Month_9th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnSponsorWiseClaimSubmissionList();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 
	 //test11
	 public String runCustomReportsFor10Month_10th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnMedicalCheckupReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 
	 //test12
	 public String runCustomReportsFor11Month_11th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnRepeatingDiagnosisReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }

	 //test13
	 public String runCustomReportsFor12Month_12th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnAirmileReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test14
	 public String runCustomReportsFor1Month_13th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnRevenueProgressReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test15
	 public String runCustomReportsFor2Month_14th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnPatientReferralReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test16
	 public String runCustomReportsFor3Month_15th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnCashCreditSplitReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 
	 //test17
	 public String runCustomReportsFor4Month_16th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnInsuranceClaimBatchReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test18
	 public String runCustomReportsFor5Month_17th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnStockRejectionReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test19
	 
	 public String runCustomReportsFor6Month_18th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnBillStatusReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test20
	 public String runCustomReportsFor7Month_19th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnLaboratoryTATReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test21
	 public String runCustomReportsFor8Month_20th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnInsuranceCompanywiseSalesReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test22
	 public String runCustomReportsFor9Month_21th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnListofPlansReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test23
	 public String runCustomReportsFor10Month_22th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnDenialAcceptanceReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test24
	 public String runCustomReportsFor11Month_23th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnNationWiseRevenueReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test25
	 public String runCustomReportsFor12Month_24th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnNationWiseRevenueReportDepartmentWise();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test26
	 public String runCustomReportsFor1Month_25th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnBedOccupancyReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test27
	 public String runCustomReportsFor2Month_26th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnDRGVarianceReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test28
	 public String runCustomReportsFor3Month_27th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnDoctorPerformanceReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 
	 //test29
	 public String runCustomReportsFor4Month_28th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnTherapistReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test30
	 public String runCustomReportsFor5Month_29th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnCustomerDueReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test31
	 public String runCustomReportsFor6Month_30th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnRemittanceAdviceReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test32
	 public String runCustomReportsFor7Month_31th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnResubmissionReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test33
	 public String runCustomReportsFor8Month_32th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnTotalSalesReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test34
	 public String runCustomReportsFor9Month_33th() throws InterruptedException
	 {
	  customReportsRunByUser.clickOnDischargeStatusReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test35
	 public String runCustomReportsFor10Month_34th() throws InterruptedException
	 {
	  customReportsRunByUser.clickonAdvanceAndRefundReceipts();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test36
	 public String runCustomReportsFor11Month_35th() throws InterruptedException
	 {
	  customReportsRunByUser.clickonDepositAndRefundReceipt();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test37
	 public String runCustomReportsFor12Month_36th() throws InterruptedException
	 {
	  customReportsRunByUser.clickonPatientDueReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test38
	 public String runCustomReportsFor1Month_37th() throws InterruptedException
	 {
	  customReportsRunByUser.clickonAppointmentTATReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test39
	 public String runCustomReportsFor2Month_38th() throws InterruptedException
	 {
	  customReportsRunByUser.clickonPriorAuthReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test40
	 public String runCustomReportsFor3Month_39th() throws InterruptedException
	 {
	  customReportsRunByUser.clickonRadiologyAlertCategoryReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	 //test41
	 public String runCustomReportsFor4Month_40th() throws InterruptedException
	 {
	  customReportsRunByUser.clickonCollectionLogReport();
	  CustomTestBuilder.getWindowHandle_SwitchTab();
	  return mainAddres;
	 }
	// //test42
	// public String runCustomReportsFor5Month_41th() throws InterruptedException
	// {
	//  customReportsRunByUser.clickonNewAppointmentTATReport();
	//  CustomTestBuilder.getWindowHandle_SwitchTab();
	//  return mainAddres;
	// }

}
