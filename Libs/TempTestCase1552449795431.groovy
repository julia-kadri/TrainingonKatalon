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


RunConfiguration.setExecutionSettingFile('C:\\Users\\CONSUL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Perolehan\\006 Arahan Bayaran\\003 Arahan Bayaran Inden Kerja - EFT\\20190313_120315\\execution.properties')

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

'Open browser'
not_run: CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into the system'
not_run: CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData(
        'ispekstestdata').getValue(2, 2))

'Delay'
not_run: WebUI.delay(3)

not_run: CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyediaPTJ'()

'Click on Menu Sisi to display Menu selections'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/a_ExpandMenuonLeft'))

'Delay'
not_run: WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Select Perolehan Sub-menu'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PanelTitlePerolehan'))

'Delay'
not_run: WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Click on Menu sisi and select Arahan Bayaran'
not_run: WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Menu_ArahanBayaran'))

not_run: assert true

'Delay'
not_run: WebUI.delay(3)

'Arahan Bayaran page loaded successfully'
not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_REKOD_BARU'))

'Delay'
not_run: WebUI.delay(3)

'Click Jenis Baucar Bayaran drop down'
not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Drop_Down_Jenis_Baucar_Bayaran'), 
    FailureHandling.STOP_ON_FAILURE)

'Delay'
not_run: WebUI.delay(3)

'Select Kod Jenis Baucar Bayaran that is ARAHAN BAYARAN-PESANAN TEMPATAN'
not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/select_AB0303_Inden_Kerja'))

'Delay'
not_run: WebUI.delay(3)

'Click Nama Pembekal drop down'
not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Drop_Down_Nama_Pembekal'))

'Delay'
not_run: WebUI.delay(3)

'Select Nama Pembekal AA DUA'
not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/select_G0804CM29379'))

'Delay'
not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Drop_Down_Jenis_Pemfaktoran'))

not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Dengan_Pemfaktoran_Ya'))

'Get todays year, date and time'
not_run: mydate = new Date()

'Input Perihal'
not_run: WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/input_Perihal'), 'This is a test for Arahan Bayaran Julia ' + 
    mydate)

'Delay'
not_run: WebUI.delay(3)

'Click on 1st item from the list of records'
not_run: WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/List_maklumat_terimaan_barang'))

'Delay'
not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Date_Picker_TI'))

not_run: WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Date_picker_TI_Today'))

'int RN is created to generete random number'
not_run: int RN = ((Math.random() * 10000) as int)

'Print the RN value'
not_run: println(RN)

'Input No Invois with random number generated from RN'
not_run: WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/input_No_Invois'), 'INV0' + RN)

not_run: WebUI.delay(5)

'Input Amaun'
not_run: WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/input_Amaun_Invois'), GlobalVariable.TotalAmaunPT)

'Delay'
not_run: WebUI.delay(2)

'Click on Date Picker to display calendar to choose date'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Date_Picker_TTK'), FailureHandling.STOP_ON_FAILURE)

'Click today'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Date_Picker_TTK_Today'), FailureHandling.STOP_ON_FAILURE)

'Click on Save icon to save maklumat terima barang'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_save_maklumat_terimaan_barang'))

WebUI.delay(3)

'click on + icon to add information on Maklumat Penerima'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_tambah_maklumat_penerima'))

'click on drop down Penerima No K/P or Daftar'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Penerima_Drop_Down_No_KPNo_Daftar_Syarikat'))

'delay'
WebUI.delay(3)

'select the pembekal as K0806SS29058'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Penerima_select_M0808SM29376'))

'delay'
WebUI.delay(5)

'input total amaun'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Penerima_input_amaun'), GlobalVariable.TotalAmaunPT)

'save the information'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Penerima_button_save'))

'Click on Simpan button to save the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_Simpan'))

'Click Ya to confirm save'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_Ya_Simpan'))

'Delay'
WebUI.delay(3)

'Click OK button to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_OK_rekod_disimpan'))

'Click on Senarai Semak button to select list of senarai semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_Senarai Semak'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Senarai_semak_1'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Senarai_Semak_2'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Senarai_semak_3'))

'Click on Simpan to save the Senarai Semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_Simpan_Senarai_Semak'))

'Delay'
WebUI.delay(3)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_OK_maklumat_Senarai_Semak_disimpan'))

'Click X to close the popup window'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_X_close_senarai_semak'))

'Click Sah Simpan button to Sah Simpan the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_Sah Simpan'))

'Click Ya to confirm '
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_Ya_Sah_Simpan'))

'Delay'
WebUI.delay(3)

'Take screenshot of current display'
WebUI.takeScreenshot()

'Get text of Rekod ID from the alert popup'
String attribute = WebUI.getText(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/Rekod Telah Berjaya Disah Simpan'))

'print the value'
println(attribute)

'create new variable to only take rekod id from the get text value'
String ArahanBayaranID = attribute[(46..60)]

'print the value'
println(ArahanBayaranID)

'set global variable value of RekodID with variable RekodNo'
GlobalVariable.ArahanBayaranRekodID = ArahanBayaranID

'delay'
WebUI.delay(3)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Inden Kerja - EFT/button_OK_rekod_berjaya_sah_simpan'))

'Close the browser'
WebUI.closeBrowser()

''', 'Test Cases/Perolehan/006 Arahan Bayaran/003 Arahan Bayaran Inden Kerja - EFT', new TestCaseBinding('Test Cases/Perolehan/006 Arahan Bayaran/003 Arahan Bayaran Inden Kerja - EFT',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
