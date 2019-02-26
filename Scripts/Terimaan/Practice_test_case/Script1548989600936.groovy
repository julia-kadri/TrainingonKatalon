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

'Open URL'
WebUI.navigateToUrl(GlobalVariable.URL_Homepage)

CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData('ispekstestdata').getValue(
        2, 2))

CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyemakPTJ'()

WebUI.check(findTestObject('RecordandPlay/check_box_Senarai_semak', [('name') : 'pkid', ('value') : '505']))

WebUI.check(findTestObject('RecordandPlay/check_box_Senarai_semak', [('name') : 'pkid', ('value') : '1629']))

WebUI.delay(5)

println(GlobalVariable.ArahanBayaranRekodID)

WebUI.doubleClick(findTestObject('RecordandPlay/Dashboard_Senarai_Tugas', [('text') : '19DAAB030100031']))

attribute = WebUI.getAttribute(findTestObject('RecordandPlay/get_attribute_rekodID'), 'text')

println(attribute)

