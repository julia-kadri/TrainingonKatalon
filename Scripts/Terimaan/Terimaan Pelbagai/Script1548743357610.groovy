import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://analytics.katalon.com/team/11445/project/14359')

WebUI.setText(findTestObject('Object Repository/30JAN_Record_and_Play/Katalon_Analytics/input_Log In_username'), 'julia_kadri@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/30JAN_Record_and_Play/Katalon_Analytics/input_Log In_password'), 
    'QZnHAMqfV2b6gs9nEggHmQ==')

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Katalon_Analytics/button_Log In'))

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Katalon_Analytics/a_12'))

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Katalon_Analytics/button_Terimaan_btn btn-link'))

WebUI.setText(findTestObject('Object Repository/30JAN_Record_and_Play/Katalon_Analytics/input_This Execution will be deleted permanently.Please type the Execution ID () to confirm._form-control'), 
    '1')

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Katalon_Analytics/button_Delete'))

WebUI.closeBrowser()

