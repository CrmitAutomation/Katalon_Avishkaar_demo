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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.ss.usermodel.CellType as CellType
import java.io.File as File
import java.io.FileInputStream as FileInputStream
import java.io.FileOutputStream as FileOutputStream
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Home Page')

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Home_Page/Timesheet'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_List_View/New_Button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Date_Range_Popup_Page/Date'), Date_Range)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Date_Range_Popup_Page/Ok_Button'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/COE_Project'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Upload_Proof_Button'))

String filePath = 'C:\\Users\\lakshmanan.harikrish\\Desktop\\Aviskaar Home Page.png'

StringSelection ss = new StringSelection(filePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

WebUI.delay(2)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Date'), Monday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Category'))

WebUI.delay(3)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Description'), 
    Monday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Monday/Monday_Add'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Date'), 
    Tuesday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Description'), 
    Tuesday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Add'))

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Date'), 
    Wednesday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Description'), 
    Wednesday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Other_Project'))

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Date'), 
    Thursday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Description'), 
    Thursday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Thursday/Thursday_Add'))

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Date'), Friday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Friday/Friday_Description'), 
    Friday_Description)

WebUI.takeFullPageScreenshotAsCheckpoint('Timesheet Details Page')

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Submit_Button'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_Buttons/Proceed'))

WebUI.delay(2)

// Perform Timesheet-related actions
WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Home_Page/Timesheet'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_List_View/List_View_Drop_Down_Button'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_List_View/My_Timesheet_List_View'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_List_View/Timesheet_Link'))

WebUI.verifyElementText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet_Details_Entry_Page/Timesheet_List_View/Timesheet_Status'), 
    'Submitted')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Submitted Timesheet Page')

System.out.println('Timesheet is submitted Successfully.')

