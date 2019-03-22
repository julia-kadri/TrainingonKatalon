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
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 4), findTestData('ispekstestdata').getValue(
        2, 4))

'Delay'
WebUI.delay(3)

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
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_PanelTitlePerolehan'))

'Delay'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Click on Menu sisi and select Arahan Bayaran'
WebUI.click(findTestObject('Perolehan/001 Left_Menu_Selection/div_Menu_ArahanBayaran'))

assert true

'Delay'
WebUI.delay(3)

'wait for the element to become clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_REKOD_BARU'), 180)

'Arahan Bayaran page loaded successfully'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_REKOD_BARU'))

'Delay'
WebUI.delay(3)

'Click Jenis Baucar Bayaran drop down'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Drop_Down_Jenis_Baucar_Bayaran'), FailureHandling.STOP_ON_FAILURE)

'Delay'
WebUI.delay(3)

'Select Kod Jenis Baucar Bayaran that is ARAHAN BAYARAN-PESANAN TEMPATAN'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Select_Kod_Jenis_Baucar_Bayaran'))

'Delay'
WebUI.delay(3)

'Click Nama Pembekal drop down'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Drop_Down_Nama_Pembekal'))

'Delay'
WebUI.delay(10)

WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/input_kod_pembekal'), GlobalVariable.kod_pembekal)

'Select Nama Pembekal AA DUA'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Select_Nama_Pembekal', [('text') : GlobalVariable.kod_pembekal]))

'Delay'
WebUI.delay(5)

'Get todays year, date and time'
mydate = new Date()

'Input Perihal'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/input_Perihal'), 'This is a test for Arahan Bayaran Julia ' + 
    mydate)

'Delay'
WebUI.delay(3)

'Click on 1st item from the list of records'
WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Maklumat_Terimaan_Barang_line_1'))

'Delay'
WebUI.delay(3)

'int RN is created to generete random number'
def RN = ((Math.random() * 10000) as int)

'Print the RN value'
println(RN)

'Input No Invois with random number generated from RN'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/input_No_Invois'), 'INV0' + RN)

'delay'
WebUI.delay(3)

'Input Amaun'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/input_Amaun_Invois_RM'), GlobalVariable.TotalAmaunPT)

'delay'
WebUI.delay(3)

'click on the label Tarikh Invois'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Label_Tarikh_Invois'))

'Click on Date Picker to display calendar to choose tarikh invois date'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/a_Tarikh_Invois'), FailureHandling.STOP_ON_FAILURE)

'Delay'
WebUI.delay(2)

'Click Today'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/a_Today_Tarikh_Invois'), FailureHandling.STOP_ON_FAILURE)

'Click on Date Picker to display calendar to choose tarikh terima oleh kewangan date'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/a_Tarikh Terima Oleh Kewangan'), FailureHandling.STOP_ON_FAILURE)

'Delay'
WebUI.delay(2)

'Click today'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/a_Today_Tarikh_Terima_Oleh_Kewangan'), FailureHandling.STOP_ON_FAILURE)

'Click on Save icon to save maklumat terima barang'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_Save_Maklumat_Terima_Barang'))

'Click on Simpan button to save the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_Simpan'))

'Click Ya to confirm save'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_Ya_Simpan'))

'Delay'
WebUI.delay(3)

'Click OK button to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_OK_Rekod_telah_simpan'))

'Click on Senarai Semak button to select list of senarai semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_Senarai_Semak'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Senarai_Semak_check_no_1'))

'Click on Simpan to save the Senarai Semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_senarai_Semak_simpan'))

'Delay'
WebUI.delay(3)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_OK_Rekod_telah_simpan'))

'Click X to close the popup window'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Senarai_Semak_X_close'))

'Click Sah Simpan button to Sah Simpan the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_Sah_Simpan'))

'Click Ya to confirm '
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_Ya_Simpan'))

'Delay'
WebUI.delay(3)

'Take screenshot of current display'
WebUI.takeScreenshot()

'Get text of Rekod ID from the alert popup'
String attribute = WebUI.getText(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Get_Arahan_Bayaran_RekodID'))

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
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_OK_Rekod_telah_simpan'))

'Close the browser'
WebUI.closeBrowser()

