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

WebUI.navigateToUrl('https://175.143.52.101:7011/1SPEKSv2/')

WebUI.setText(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS/input_LOG Masuk_textbox-text validatebox-text'), 
    '790214108888')

WebUI.setEncryptedText(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS/input_LOG Masuk_textbox-text validatebox-text_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS/input_LOG Masuk_button large bg-darkBlue fg-white'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/a_Housekeeping_layout-button-right'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/div_Akaun Belum Terima'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/a_Tanpa Bil'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/div_18LATR050300341'))

WebUI.doubleClick(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/div_18LATR050300341'))

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/span_Direct Print'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/a_Ok'))

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/span_Direct Print'))

WebUI.click(findTestObject('Object Repository/30JAN_Record_and_Play/Page_1SPEKS-Utama/span_Ok'))

