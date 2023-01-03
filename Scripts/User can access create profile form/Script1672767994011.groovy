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

WebUI.callTestCase(findTestCase('User can access aplication successfully'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('On Boarding/android.widget.Button - CREATE A PROFILE'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.TextView - Create Profile'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.EditText - First Name'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.EditText - Last Name'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.EditText - Username'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.EditText - Country'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.EditText - Password'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.EditText - Confirm Password'), 0)

Mobile.verifyElementExist(findTestObject('Create Profile/android.widget.Button - Create Profile'), 0)

