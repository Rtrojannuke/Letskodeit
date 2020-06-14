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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
Webdriver driver = new Webdriver()

WebUI.navigateToUrl('https://www.letskodeit.com/')

WebUI.click(findTestObject('Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/svg'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_LoginSign up'))

WebUI.setText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Log In_signUpDialogemailInputinput'), 
    'arimiyahmubarak@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Email_signUpDialogpasswordInputinput'), 
    'qgpnFY8vhIdZvr6yD5z5YVz74X3dCVBn')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Sign Up'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Email_signUpDialogpasswordInputinput'), 
    'oz3pb9YjxpdtzhYoy7Vm6uSK7FKVIcPa651B8PnSJmc=')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Sign Up_memberLoginDialogemailInputinput'), 
    'arimiyahmubarak@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Email_memberLoginDialogpasswordInputinput'), 
    'Bf0aZw4r7hgIqe1Ruyh6YQL1s9bMv97PrVTWiePrlbhFyJqwgjaz+wE6ceo5hhzU')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/div_Forgot password'))

WebUI.setText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Please enter your email address_reque_450aa2'), 
    'arimiyahmubarak@yahoo.com')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Reset Password'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Reset Password'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Reset Password'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/div_Reset Password_requestResetPasswordDial_606c48'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_LoginSign up'))

WebUI.setText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Log In_signUpDialogemailInputinput'), 
    'arimiyahmubarak@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/label_Password_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Email_signUpDialogpasswordInputinput'), 
    'keLT38RL6S2MPh37Bo1lsQ==')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Sign Up'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Email_signUpDialogpasswordInputinput'), 
    'EjO7nSUzSTt4bzcy4VFxL91YTcsvscBx')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Sign Up_memberLoginDialogemailInputinput'), 
    'arimiyahmubarak@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/div_EmailPassword'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/input_Email_memberLoginDialogpasswordInputinput'), 
    'keLT38RL6S2MPh37Bo1lsQ==')

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Lets Kode It  Selenium Webdriver Tutor_4d974f/p_Practice'))

WebUI.click(findTestObject('Object Repository/Page_Practice  Lets Kode It/legend_Radio Button Example'))

WebUI.click(findTestObject('Object Repository/Page_Practice  Lets Kode It/label_BMW'))

WebUI.click(findTestObject('Object Repository/Page_Practice  Lets Kode It/label_Benz'))

