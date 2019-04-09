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

'open browser and enter ispek URL'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

CustomKeywords.'reusablefunctions.reusablefunctions.Login'(GlobalVariable.PenyemakPTJ, findTestData('ispekstestdata').getValue(
        2, 5))

'Click on icon Tukar Peranan'
WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

'Click Radio Button Penyedia PTJ'
WebUI.click(findTestObject('Perolehan/TukarPeranan/input_TukarPeranan', [('value') : GlobalVariable.RBPenyemakPTJ]))

'Click Ya to confirm change of role'
WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

WebUI.delay(20)

'Verify Peranan is now Penyemak PTJ'
WebUI.verifyTextPresent('Peranan : [Penyemak] Peringkat : [PTJ]', false)

WebUI.delay(5)

'Click on Menu Sisi to display Menu selections'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

'Delay'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Select Perolehan Sub-menu'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PanelTitlePerolehan'))

'Delay'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Click on Menu sisi and select Arahan Bayaran'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Menu_ArahanBayaran'))

assert true

'Delay'
WebUI.delay(3)

'input arahan bayaran rekod id to filter for the specific record'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/input_TABLE_NAME_noRekod'), GlobalVariable.ArahanBayaranRekodID)

'delay'
WebUI.delay(3)

'double click on the filter result - there is only one result after filter'
WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/select_noRekod', [('text') : GlobalVariable.ArahanBayaranRekodID]))

'delay'
WebUI.delay(5)

'get jumlah arahan bayaran'
def jumlah = WebUI.getText(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/jumlah_PT'))

'verify jumlah during semak is matching with jumlah during creation'
WebUI.verifyMatch(jumlah, GlobalVariable.jumlah_baucar_bayaran, false)

'click on senarai semak button'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/button_Senarai_Semak'))

'delay'
WebUI.delay(3)

'verify element checked during semak is same as during create rekod baru'
WebUI.verifyElementChecked(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Senarai_semak_1'), 3)

'verify element checked during semak is same as during create rekod baru'
WebUI.verifyElementChecked(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Senarai_Semak_2'), 3)

'verify element checked during semak is same as during create rekod baru'
WebUI.verifyElementChecked(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Senarai_semak_3'), 3)

'close senarai semak window'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/button_X_Close_Senarai_Semak'))

'click on semak button'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/button_Semak'))

'click Ya to confirm semak record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/button_Ya_Semak'))

'delay'
WebUI.delay(3)

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 
    300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/button_OK_berjaya_disemak'), 
    300)

'take screenshot'
WebUI.takeScreenshot()

'delay'
WebUI.delay(3)

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/004 Penyemak/button_OK_berjaya_disemak'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

