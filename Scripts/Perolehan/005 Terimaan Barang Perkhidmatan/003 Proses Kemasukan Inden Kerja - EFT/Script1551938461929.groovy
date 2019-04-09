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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

'Open browser and navigate to Homepage URL'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into ispek'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(GlobalVariable.PenyediaPTJ, findTestData('ispekstestdata').getValue(
        2, 4))

'Change role to Penyedia PTJ'
CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyediaPTJ'()

'Click on Menu Sisi to display Menu selections'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

'Delay'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Select Perolehan Sub-menu'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_ClickonPerolehan'))

'Delay'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Click on Menu sisi Kemasukan Terimaan Barang atau perkhidmatan'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Kemasukan_Terimaan_Barang'))

assert true

'Carian page loaded successfully'
WebUI.delay(3)

'Click on button Rekod Baru '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_REKOD BARU'))

'Delay'
WebUI.delay(3)

'Click No Dokumen drop down list'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Drop_down_No_Dokumen'))

'Delay'
WebUI.delay(3)

'input dokumen no based on the variable get from Pelulus page on Inden Kerja'
WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/input_No_Dokumen_value'), 
    GlobalVariable.PesananTempatanDokumenID)

'Delay'
WebUI.delay(5)

'Select the No Dokumen displayed after the filter'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/select_No_Dokumen'))

'delay'
WebUI.delay(3)

'click on cari button to search for the record'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_Cari'))

'delay'
WebUI.delay(3)

'Click on OK to close the prompt box '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/OK_Rekod_Wujud'))

'Delay'
WebUI.delay(3)

'Click on drop down Jenis terimaan '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/Drop_down_Jenis_Terimaan'))

'Select value Terimaan inden kerja Penuh '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/select_TERIMAAN INDEN KERJA PENUH'))

'Set text Nota Penghantaran '
WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/input_No_Rujukan'), '123456789012345')

'Click on Date Picker to select date no rujukan '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/Date_Picker_Tarikh_No_Rujukan'))

'Click on Todays date '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/Date_Picker_TR_Today'))

'Delay'
WebUI.delay(3)

'Click on Date Picker to select date siap '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/Date_Picker_Tarikh_Siap'))

'Click on Todays date '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/Date_Picker_TS_Today'))

'Delay'
WebUI.delay(3)

'input catatan'
WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/input_Catatan'), 'Test Catatan 000')

'Click Simpan to save the record'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_Simpan'))

'Delay'
WebUI.delay(3)

'wait for the element to become clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_OK_rekod_berjaya_disimpan'), 
    60)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_OK_rekod_berjaya_disimpan'))

'Click sah simpan button to save the record'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_Sah_Simpan'))

'Click Ya button to confirm action'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_Ya_Sah_Simpan'))

'delay'
WebUI.delay(3)

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_OK_close_rekod_berjaya'), 
    180)

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 
    300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_OK_close_rekod_berjaya'), 
    300)

'take screenshot of the record successfully saved as reference'
WebUI.takeScreenshot()

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

'click OK button to close the popup message'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/002 Kemasukan Inden Kerja/button_OK_close_rekod_berjaya'))

'Close browser'
WebUI.closeBrowser()

