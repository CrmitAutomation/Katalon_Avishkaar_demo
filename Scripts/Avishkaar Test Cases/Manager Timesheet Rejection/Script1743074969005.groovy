import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Home_Page/Timesheet_Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_List_View_Page/List_View_Button'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_List_View_Page/Pending_for_Approval_List_View'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Timesheet_Link'))

WebUI.delay(2)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Related_Tab'))

WebUI.scrollToElement(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Approval_History_Section'), 
    1)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Reject_Button'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Reject_Comments'), Rejection_Comments)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Popup_Screen'))

WebUI.enhancedClick(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Final_Reject_Button'))

WebUI.verifyElementText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Approval_Record_Page/Approval_Status'), 
    'Rejected')

System.Out.println('Timesheet record is rejected successfully')

