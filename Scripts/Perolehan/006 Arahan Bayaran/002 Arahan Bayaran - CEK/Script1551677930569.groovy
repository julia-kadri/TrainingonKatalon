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

'Open browser'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into the system'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 2), findTestData('ispekstestdata').getValue(
        2, 2))

'Delay'
WebUI.delay(3)

'change peranan to penyedia PTJ'
CustomKeywords.'reusablefunctions.reusablefunctions.PerananPenyediaPTJ'()

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

'Arahan Bayaran page loaded successfully'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_REKOD_BARU'))

'Delay'
WebUI.delay(3)

'Click Jenis Baucar Bayaran drop down'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Drop_Down_Jenis_Baucar_Bayaran'), FailureHandling.STOP_ON_FAILURE)

'Delay'
WebUI.delay(3)

'Select Kod Jenis Baucar Bayaran that is ARAHAN BAYARAN-PESANAN TEMPATAN'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Select_Kod_Jenis_Baucar_Bayaran'))

'Delay'
WebUI.delay(3)

'Click Nama Pembekal drop down'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Drop_Down_Nama_Pembekal'))

'Delay'
WebUI.delay(3)

'input nama pembekal - jamal chef catering to search for this pembekal record'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/input_name_nama_pembekal'), 'JAMAL CHEF CATERING')

'delay'
WebUI.delay(3)

'Select Nama Pembekal Jamal chef catering'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/select_Pembekal Jamal'))

'Delay'
WebUI.delay(5)

'click on drop down cara bayaran to select'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Drop_Down_Cara_Bayaran'))

'select cara bayaran as CEK'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Select_Cara_Bayaran - CEK'))

'click on drop down dengan pemfaktoran'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Drop_Down_Dengan_Pemfaktoran'))

'select dengan pemfaktoran as Ya'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Select_Ya_Dengan_Pemfaktoran'))

WebUI.delay(3)

'Get todays year, date and time'
mydate = new Date()

'Input Perihal'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/input_Perihal'), 'This is a test for Pesanan Tempatan Cara Bayaran CEK ' + mydate)

'Delay'
WebUI.delay(3)

'Click on 1st item from the list of records'
WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/Maklumat_Terimaan_Barang_line_1'))

'Delay'
WebUI.delay(3)

'int RN is created to generete random number'
int RN = ((Math.random() * 10000) as int)

'Print the RN value'
println(RN)

'Input No Invois with random number generated from RN'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/input_No_Invois'), 'INV0' + RN)

'Input Amaun'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/input_Amaun_Invois_RM'), GlobalVariable.TotalAmaunPT)

'Click on Date Picker to display calendar to choose date'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/a_Tarikh_Invois'), FailureHandling.STOP_ON_FAILURE)

'Delay'
WebUI.delay(2)

'Click Today'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/a_Today_Tarikh_Invois'), FailureHandling.STOP_ON_FAILURE)

'Click on Date Picker to display calendar to choose date'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/a_Tarikh Terima Oleh Kewangan'), FailureHandling.STOP_ON_FAILURE)

'Delay'
WebUI.delay(2)

'Click today'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/a_Today_Tarikh_Terima_Oleh_Kewangan'), FailureHandling.STOP_ON_FAILURE)

'Click on Save icon to save maklumat terima barang'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Save_Maklumat_Terima_Barang'))

'delay'
WebUI.delay(3)

'click on + icon to add information on Maklumat Penerima'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Tambah_Maklumat_Penerima'))

'click on drop down Penerima No K/P or Daftar'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Drop_Down_Penerima_No_Daftar'))

'delay'
WebUI.delay(3)

'enter pembekal with kod K0806SS29058'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/input_name_kod Pembekal'), 'K0806SS29058')

'delay'
WebUI.delay(3)

'select the pembekal as K0806SS29058'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/select_Maklumat_Penerima_Armada'))

'delay'
WebUI.delay(5)

'input total amaun'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/input_Penerima_Amaun'), GlobalVariable.TotalAmaunPT)

'save the information'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Save_Maklumat_Penerima'))

'delay'
WebUI.delay(3)

'Click on Simpan button to save the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Simpan'), FailureHandling.STOP_ON_FAILURE)

'Click Ya to confirm save'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Ya_Simpan'))

'Delay'
WebUI.delay(3)

'Click OK button to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_OK_Rekod_telah_simpan'))

'Click on Senarai Semak button to select list of senarai semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Senarai_Semak'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/Senarai_Semak_check_no_1'))

'Click on Simpan to save the Senarai Semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_senarai_Semak_simpan'))

'Delay'
WebUI.delay(3)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_OK_Rekod_telah_simpan'))

'Click X to close the popup window'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/Senarai_Semak_X_close'))

'Click Sah Simpan button to Sah Simpan the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Sah_Simpan'))

'Click Ya to confirm '
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_Ya_Simpan'))

'Delay'
WebUI.delay(3)

'Take screenshot of current display'
WebUI.takeScreenshot()

'Get text of Rekod ID from the alert popup'
String attribute = WebUI.getText(findTestObject('Perolehan/006 Arahan Bayaran/Get_Arahan_Bayaran_RekodID'))

'print the value'
println(attribute)

'create new variable to only take rekod id from the get text value'
String ArahanBayaranID = attribute[(46..60)]

'print the value'
println(ArahanBayaranID)

'set global variable value of RekodID with variable RekodNo'
GlobalVariable.ArahanBayaranRekodID = ArahanBayaranID

WebUI.delay(3)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/button_OK_Rekod_telah_simpan'))

'Close the browser'
WebUI.closeBrowser()

