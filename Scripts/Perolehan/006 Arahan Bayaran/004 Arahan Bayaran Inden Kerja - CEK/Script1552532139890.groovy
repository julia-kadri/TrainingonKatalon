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

'Open browser'
CustomKeywords.'reusablefunctions.reusablefunctions.openbrowser'()

'Login into the system'
CustomKeywords.'reusablefunctions.reusablefunctions.Login'(findTestData('ispekstestdata').getValue(1, 4), findTestData('ispekstestdata').getValue(
        2, 4))

'Delay'
WebUI.delay(3)

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
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/button_REKOD_BARU'))

'Delay'
WebUI.delay(3)

'Click Jenis Baucar Bayaran drop down'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Drop_Down_Jenis_Baucar_Bayaran'), FailureHandling.STOP_ON_FAILURE)

'Delay'
WebUI.delay(3)

'Select Kod Jenis Baucar Bayaran that is ARAHAN BAYARAN-PESANAN TEMPATAN'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/select_AB0303_Inden_Kerja'))

'Delay'
WebUI.delay(3)

'Click Nama Pembekal drop down'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Drop_Down_Nama_Pembekal'))

'Delay'
WebUI.delay(3)

'Search for Nama Pembekal JULIA COMPETENCY TRAINING'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/input_kod_pembekal'), GlobalVariable.nama_pembekal_cek)

WebUI.delay(3)

'select nama pembekal from the filter result'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/select_nama_pembekal', [('text') : GlobalVariable.nama_pembekal_cek]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/001 Pesanan Tempatan/Drop_Down_Cara_Bayaran'))

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/Select_CEK'))

'Delay'
WebUI.delay(3)

'Get todays year, date and time'
mydate = new Date()

'Input Perihal'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/input_Perihal'), 'This is a test for Arahan Bayaran Julia ' + 
    mydate)

'Delay'
WebUI.delay(3)

'Click on 1st item from the list of records'
WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/List_maklumat_terimaan_barang'))

'Delay'
WebUI.delay(3)

'int RN is created to generete random number'
def RN = ((Math.random() * 10000) as int)

'Print the RN value'
println(RN)

'Input No Invois with random number generated from RN'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/input_No_Invois'), 'INV0' + RN)

WebUI.delay(3)

'Input Amaun'
WebUI.setText(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/input_Amaun_Invois'), GlobalVariable.TotalAmaunPT)

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/Label_Tarikh_Invois'))

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/Date_Picker_TI'))

WebUI.delay(3)

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Date_picker_TI_Today'))

'Click on Date Picker to display calendar to choose date'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Date_Picker_TTK'), FailureHandling.STOP_ON_FAILURE)

'Click today'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Date_Picker_TTK_Today'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Click on Save icon to save maklumat terima barang'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_save_maklumat_terimaan_barang'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/Maklumat_penerima', [('text') : GlobalVariable.nama_pembekal_cek]))

WebUI.delay(0)

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/maklumat_penerima_drop_down_no_akaun'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/maklumat_penerima_no_akaun'))

WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/003 Inden Kerja - CEK/Maklumat_penerima_save'))

WebUI.delay(3)

'Click on Simpan button to save the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_Simpan'))

'Click Ya to confirm save'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_Ya_Simpan'))

'Delay'
WebUI.delay(3)

'Click OK button to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_OK_rekod_disimpan'))

'Click on Senarai Semak button to select list of senarai semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_Senarai Semak'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Senarai_semak_1'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Senarai_Semak_2'))

'Check on the first item from senarai semak '
WebUI.check(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Senarai_semak_3'))

'Click on Simpan to save the Senarai Semak'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_Simpan_Senarai_Semak'))

'Delay'
WebUI.delay(3)

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_OK_maklumat_Senarai_Semak_disimpan'))

'Click X to close the popup window'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_X_close_senarai_semak'))

'Click Sah Simpan button to Sah Simpan the record'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_Sah Simpan'))

'Click Ya to confirm '
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_Ya_Sah_Simpan'))

'Delay'
WebUI.delay(3)

'Take screenshot of current display'
WebUI.takeScreenshot()

'Get text of Rekod ID from the alert popup'
String attribute = WebUI.getText(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/Rekod Telah Berjaya Disah Simpan'))

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

'wait for the element to be clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 
    300)

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_OK_rekod_berjaya_sah_simpan'), 
    300)

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

'Click OK to close the prompt box'
WebUI.click(findTestObject('Perolehan/006 Arahan Bayaran/002 Inden Kerja - EFT/button_OK_rekod_berjaya_sah_simpan'))

'Close the browser'
WebUI.closeBrowser()

