import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\CONSUL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Perolehan\\005 Terimaan Barang Perkhidmatan\\003 Proses Kemasukan Inden Kerja - EFT\\20190311_171345\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

'Open browser and navigate to Homepage URL'
not_run: CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into ispek'
not_run: CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData(
        'ispekstestdata').getValue(2, 2))

'Change role to Penyedia PTJ'
not_run: CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyediaPTJ'()

'Click on Menu Sisi to display Menu selections'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

'Delay'
not_run: WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Select Perolehan Sub-menu'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_ClickonPerolehan'))

'Delay'
not_run: WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Click on Menu sisi Kemasukan Terimaan Barang atau perkhidmatan'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Kemasukan_Terimaan_Barang'))

not_run: assert true

'Carian page loaded successfully'
not_run: WebUI.delay(3)

'Click on button Rekod Baru '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/button_REKOD BARU'))

'Delay'
not_run: WebUI.delay(3)

'Click No Dokumen drop down list'
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/Drop_down_No_Dokumen'))

'Delay'
not_run: WebUI.delay(3)

'Set text RekodID based on the variable get from Pelulus page on Pesanan Tempatan  '
not_run: WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/input_No_Dokumen_value'), GlobalVariable.PesananTempatanDokumenID)

'Delay'
not_run: WebUI.delay(5)

'Select the No Dokumen displayed after the filter'
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/select_No_Dokumen'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/button_Cari'))

not_run: WebUI.delay(3)

'Click on OK to close the prompt box '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/OK_Rekod_Wujud'))

'Delay'
not_run: WebUI.delay(3)

'Click on drop down Jenis terimaan '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/Drop_down_Jenis_Terimaan'))

'Select value Terimaan Barang Penuh '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/select_TERIMAAN INDEN KERJA PENUH'))

'Set text Nota Penghantaran '
not_run: WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/input_No_Rujukan'), '123456789012345')

'Click on Date Picker to select tarikh terimaan '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/Date_Picker_Tarikh_No_Rujukan'))

'Click on Todays date '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/Date_Picker_TR_Today'))

'Delay'
not_run: WebUI.delay(3)

'Click on Date Picker to select tarikh terimaan '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/Date_Picker_Tarikh_Siap'))

'Click on Todays date '
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/Date_Picker_TS_Today'))

'Delay'
not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/input_Catatan'), 'Test Catatan 000')

'Click Simpan to save the record'
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/button_Simpan'))

'Delay'
not_run: WebUI.delay(3)

not_run: WebUI.waitForElementClickable(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/button_OK_rekod_berjaya_disimpan'), 
    60)

'Click OK to close the prompt box'
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/button_OK_rekod_berjaya_disimpan'))

'Click'
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/button_Sah_Simpan'))

'Click'
not_run: WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/button_Ya_Sah_Simpan'))

'Click'
String PTRekodberjayaID = WebUI.getText(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/rekod_berjaya_disah_simpan'))

'print PTRekodberjayaID'
println(PTRekodberjayaID)

'Take only the PTRekodID value from the get text'
String PTRekodID = PTRekodberjayaID[(47..61)]

'print the value'
println(PTRekodID)

'set global variable value of PesananTempatanRekodID with variable PTRekodID'
GlobalVariable.PesananTempatanRekodID = PTRekodID

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Perolehan/005 Kemasukan Terimaan/001 Kemasukan Inden Kerja/button_OK_close_rekod_berjaya'))

'Close browser'
WebUI.closeBrowser()

''', 'Test Cases/Perolehan/005 Terimaan Barang Perkhidmatan/003 Proses Kemasukan Inden Kerja - EFT', new TestCaseBinding('Test Cases/Perolehan/005 Terimaan Barang Perkhidmatan/003 Proses Kemasukan Inden Kerja - EFT',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
