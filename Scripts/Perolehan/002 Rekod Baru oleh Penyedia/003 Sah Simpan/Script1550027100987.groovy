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

WebUI.delay(5)

'Get the Amaun'
String Total = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/TotalAmaunPT'))

'print Total'
println(Total)

'set global variable value of TotalAmaun with variable Total'
GlobalVariable.TotalAmaunPT = Total

'delay'
WebUI.delay(3)

'Click on button Sah Simpan'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/button_Sah Simpan'))

'Click Ya to confirm Sah Simpan'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/button_Ya_Sah_Simpan'))

'delay'
WebUI.delay(3)

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/button_OK_Sah_Simpan'), 60)

'Take screenshot of the Rekod ID'
WebUI.takeScreenshot()

'Get the PTRekodberjayaID from popup message'
String PTRekodberjayaID = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/RekodBerjayadiSahSimpan'))

'print PTRekodberjayaID'
println(PTRekodberjayaID)

'Take only the PTRekodID value from the get text'
String PTRekodID = PTRekodberjayaID[(47..61)]

'print the value'
println(PTRekodID)

'set global variable value of PesananTempatanRekodID with variable PTRekodID'
GlobalVariable.PesananTempatanRekodID = PTRekodID

'delay'
WebUI.delay(3)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/button_OK_Sah_Simpan'))

WebUI.closeBrowser()

