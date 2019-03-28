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

'Call test to open menu sisi and then select pesanan tempatan / inden kerja'
WebUI.callTestCase(findTestCase('Perolehan/001 Left Menu Selection/Select Menu Pesanan Tempatan'), [:], FailureHandling.STOP_ON_FAILURE)

'declare object to find as an element'
WebElement rekodbaru = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Rekod_Baru'), 
    300)

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(rekodbaru))

WebUI.delay(5)

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Rekod_Baru'))

'delay'
WebUI.delay(3)

'Click on drop down Jenis Urusniaga'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Jenis_Urusniaga'))

'delay'
WebUI.delay(2)

'Get todays year and date'
mydate = new Date()

'Select inden kerja auto from the drop down list'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_INDEN KERJA AUTO'))

'click on drop down nama pembekal'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Pembekal'))

'input nama pembekal green miracle enterprise in the filter textbox'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_nama_Pembekal'), GlobalVariable.kod_pembekal)

'select nama pembekal from the filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_nama_pembekal', [('text') : GlobalVariable.kod_pembekal]))

'click on the calendar date picker for sila bekalkan'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Date_Picker_Sila_Bekalkan'))

'delay'
WebUI.delay(3)

'click next month from the calendar picker'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Date_Picker_Next_month'))

'select date 26th of the month'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Date_Picker_Select_date_26th'))

'input no tanggungan'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_no_tanggungan'), '2')

'input amaun tanggungan'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_amaun_tanggungan'), '100')

'input ringkasan kerja'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_ringkasan_kerja'), 'ringkasan kerja untuk inden kerja')

'int RN is created to generete random number'
def RN = ((Math.random() * 100000) as int)

'input rujukan fail as random number that starts with IK00 + RN number'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_rujukan_fail'), 'IK00' + 
    RN)

'get Input Rujukan fail value'
GlobalVariable.IKno_rujukan = ('IK00' + RN)

'print the value into console for display'
println(GlobalVariable.IKno_rujukan)

'input kerja terperinci with current date and time stamp'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_kerja_terperinci'), 'kerja terperinci ' + 
    mydate)

'input perihal test with current date and time stamp'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_Perihal'), 'test inden kerja cara bayaran EFT ' + 
    mydate)

'Click on button add to add maklumat terperinci details'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/tambah_maklumat_terperinci'))

'delay'
WebUI.delay(3)

'click on drop down vot dana'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Vot_Dana'))

'delay'
WebUI.delay(3)

'input vot dana kod value B31 to filter for this kod '
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_Vot_kod'), GlobalVariable.Vot_dana)

'select vot dana from filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_Vot_dana', [('text') : GlobalVariable.Vot_dana]))

'Click drop down program aktiviti'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Program_Aktiviti'))

'delay'
WebUI.delay(3)

'input program aktiviti kod value 160080 to filter for this kod'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_ProgramAktiviti_kod'), GlobalVariable.kod_program_aktiviti)

'select program aktiviti kod from filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_ProgramAktiviti', [('text') : GlobalVariable.kod_program_aktiviti]))

'click drop down kod akaun'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Kod_Akaun'))

'input kod akaun value B0227102 to filter for this kod'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_kod_Akaun_kod'), 'B0227102')

'select kod akaun from filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_Kod_Akaun_Alat_tulis', [('text') : GlobalVariable.kod_akaun]))

'input kuantiti as 7'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_kuantiti'), '7')

'input harga seunit as 1.58'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_harga_seunit'), '1.58')

'Click on icon simpan maklumat terperinci button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_simpan_maklumat_terperinci'))

'delay'
WebUI.delay(3)

'Click on OK button to close the popup message budget is sufficient '
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_peruntukan_mencukupi'))

'delay'
WebUI.delay(3)

'Click on Simpan button to save the record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Simpan'))

'delay'
WebUI.delay(3)

'Click on OK button to close the popup message record is saved successfully'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_rekod_berjaya_disimpan'))

'Click Senarai semak button to open senarai semak checkbox list'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Senarai_Semak'))

'delay'
WebUI.delay(3)

'Check on senarai semak item'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/senarai_semak1'))

'Check on senarai semak item'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/senarai_semak2'))

'Check on senarai semak item'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/senarai_semak3'))

'Click simpan senarai semak button to save senarai semak info'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_simpan_senarai_semak'))

'Click on OK button to close the popup message recors is saved successfully'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_maklumat_berjaya_disimpan'))

'Click X button on top left to close Senarai Semak screen'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_X_close_senarai_semak'))

'Get the total Amaun'
String Total = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/TotalAmaunPT'))

'print Total'
println(Total)

'set global variable value of TotalAmaun with variable Total'
GlobalVariable.TotalAmaunPT = Total

'Click sah simpam button to confirm save record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_sah_simpan'))

'Click Ya button to confirm action'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Ya_Sah_Simpan'))

'get value of record id '
def PTRekodberjayaID = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Rekod_berjaya_No_Rekod'))

'print PTRekodberjayaID'
println(PTRekodberjayaID)

'Take only the PTRekodID value from the get text'
def PTRekodID = PTRekodberjayaID[(47..61)]

'print the value'
println(PTRekodID)

'set global variable value of PesananTempatanRekodID with variable PTRekodID'
GlobalVariable.PesananTempatanRekodID = PTRekodID

'delay'
WebUI.delay(3)

'take screenshot of the popup message with record id for reference'
WebUI.takeScreenshot()

'declare object to find as an element'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_berjaya_disah_simpan'), 
    300)

'click on the element using javascript'
WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

'click OK button to close the popup message'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_berjaya_disah_simpan'))

'close browser'
WebUI.closeBrowser()

