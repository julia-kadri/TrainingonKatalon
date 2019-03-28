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
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 4), findTestData('ispekstestdata').getValue(
        2, 4))

'Click on icon Tukar Peranan'
WebUI.click(findTestObject('Perolehan/TukarPeranan/IconTukarPeranan'))

'Click Radio Button Penyedia PTJ'
WebUI.click(findTestObject('Perolehan/TukarPeranan/input_TukarPeranan', [('value') : '255']))

'Click Ya to confirm change of role'
WebUI.click(findTestObject('Perolehan/TukarPeranan/button_Ya'))

WebUI.delay(20)

'Verify Peranan is now Penyedia PTJ'
WebUI.verifyTextPresent('Peranan : [Penyedia] Peringkat : [PTJ]', false)

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
WebUI.delay(5)

'Click on button Rekod Baru '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_REKOD BARU'))

'Delay'
WebUI.delay(3)

'Click No Dokumen drop down list'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Drop_down_No_Dokumen'))

'Delay'
WebUI.delay(3)

'input dokumen no based on the variable get from Pelulus page on Pesanan Tempatan  '
WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/input_No_Dokumen_value'), 
    GlobalVariable.PesananTempatanDokumenID)

'Delay'
WebUI.delay(5)

'Select the No Dokumen displayed after the filter'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/select_No_Dokumen'))

'delay'
WebUI.delay(3)

'click on cari button to find the record'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_Cari'))

'delay'
WebUI.delay(3)

'Click on OK to close the prompt box '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/OK_Rekod_Wujud'))

'Delay'
WebUI.delay(3)

'Click on drop down Jenis terimaan '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Drop_down_Jenis_Terimaan'))

'Select value Terimaan Barang Penuh '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/select_TERIMAAN_BARANG_PENUH'))

'Set text Nota Penghantaran '
WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/input_No_nota_penghantaran'), 
    'Test Nota No 123')

'Click on Date Picker to select tarikh terimaan '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Date_Picker_Tarikh_Terimaan'))

'Click on Todays date '
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Select_Today'))

'Delay'
WebUI.delay(3)

'Double click on the field to make it editable'
WebUI.doubleClick(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Perihal_Barang - CEK', 
        [('text') : GlobalVariable.kod_barang_cek]))

'Input value for Dihantar using spinner - click until 3 times'
for (def index : (1..3)) {
    WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Spinner_up_Dihantar'))
}

'Input value for Diterima using spinner - click until 3 times'
for (def index : (1..3)) {
    WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/Spinner_up_Diterima'))
}

'Click Simpan to save the record'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_Simpan'))

'Delay'
WebUI.delay(3)

'wait for the element to become clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_OK_Rekod_disimpan'), 
    60)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_OK_Rekod_disimpan'))

'Click on Sah Simpan button'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_Sah_Simpan'))

'Click Ya to confirm Sah Simpan'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_Ya_Sah_Simpan'))

'Delay'
WebUI.delay(8)

'wait for the element to become clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_OK_Rekod_disimpan'), 
    180)

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'),
	300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_OK_Rekod_disimpan'),
	300)


'Take screenshot of the rekod ID'
WebUI.takeScreenshot()


'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

WebUI.delay(5)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Pesanan Tempatan/button_OK_Rekod_disimpan'))

'Close browser'
WebUI.closeBrowser()

