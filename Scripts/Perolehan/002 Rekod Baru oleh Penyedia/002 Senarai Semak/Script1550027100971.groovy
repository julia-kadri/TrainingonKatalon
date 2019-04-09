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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.delay(5)

'Click on button Senarai Semak'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/button_Senarai Semak'))

WebUI.delay(3)

'Check on item from senarai semak list'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/Senarai_semak_IC'))

'Check on item from senarai semak list'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/Senarai_semak_Pesanan_Tempatan'))

'Check on item from senarai semak list'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/Senarai_semak_Perihal_Perolehan'))

'Click on Simpan to save Senarai Semak'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/button_simpan_senarai_semak'))

'put a wait to get the element becomes clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/button_OK_Senarai_Semak_berjaya_disimpan'), 
    60)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/button_OK_Senarai_Semak_berjaya_disimpan'))

'Click X button on top right to close the window'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/0021 Senarai Semak/Senarai_semak_close_X'))

'Click on button Simpan to save Senarai Semak update'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_Simpan_Rekod'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 60)

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'),
	300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'),
	300)

'Click OK button to close the prompt box'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'))

