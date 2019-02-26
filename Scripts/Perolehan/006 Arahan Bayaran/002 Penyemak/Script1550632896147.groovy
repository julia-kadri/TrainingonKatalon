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

CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData('ispekstestdata').getValue(
        2, 2))

CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyemakPTJ'()

WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/Dashboard_Senarai_Semak'))

WebUI.delay(3)

WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/input_TABLE_NAME_noRekod'), GlobalVariable.ArahanBayaranRekodID)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/select_noRekod', [('text') : GlobalVariable.ArahanBayaranRekodID]))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/button_Senarai_Semak'))

WebUI.delay(3)

WebUI.verifyElementChecked(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/Check_Senarai_Semak_Item'), 3)

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/button_X_Close_Senarai_Semak'))

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/button_Semak'))

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/button_Ya_Semak'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Penyemak/button_OK_berjaya_disemak'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

