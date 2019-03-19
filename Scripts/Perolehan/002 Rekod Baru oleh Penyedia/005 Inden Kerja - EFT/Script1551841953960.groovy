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

'Call test to open menu sisi and then select pesanan tempatan / inden kerja'
WebUI.callTestCase(findTestCase('Perolehan/001 Left Menu Selection/Select Menu Pesanan Tempatan'), [:], FailureHandling.STOP_ON_FAILURE)

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

'input nama pembekal green miracle enterprise from the drop down list'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_nama_Pembekal'), 'GREEN MIRACLE ENTERPRISE')

'select nama pembekal from the filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_Kod_Pembekal_Green_Miracle'))

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
GlobalVariable.IKno_rujukan = 'IK00' + RN

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
WebUI.delay(8)

'input vot dana kod value B31 to filter for this kod '
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_Vot_kod'), 'B31')

'select vot dana from filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_Vot_B31'))

'Click drop down program aktiviti'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Program_Aktiviti'))

'delay'
WebUI.delay(3)

'input program aktiviti kod value 160080 to filter for this kod'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_ProgramAktiviti_kod'), '160080')

'select program aktiviti kod from filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_ProgramAktiviti_010080'))

'click drop down kod akaun'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Kod_Akaun'))

'input kod akaun value B0227102 to filter for this kod'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_kod_Akaun_kod'), 'B0227102')

'select kod akaun from filter result'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_Kod_Akaun_Alat_tulis'))

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_kuantiti'), '7')

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_harga_seunit'), '1.58')

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_simpan_maklumat_terperinci'))

WebUI.delay(3)

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_peruntukan_mencukupi'))

WebUI.delay(3)

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Simpan'))

WebUI.delay(3)

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_rekod_berjaya_disimpan'))

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Senarai_Semak'))

WebUI.delay(3)

'Click'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/senarai_semak1'))

'Click'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/senarai_semak2'))

'Click'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/senarai_semak3'))

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_simpan_senarai_semak'))

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_maklumat_berjaya_disimpan'))

'Click X button on top left to close Senarai Semak screen'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_X_close_senarai_semak'))

'Get the Amaun'
String Total = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/0022 Sah_Simpan/TotalAmaunPT'))

'print Total'
println(Total)

'set global variable value of TotalAmaun with variable Total'
GlobalVariable.TotalAmaunPT = Total

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_sah_simpan'))

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Ya_Sah_Simpan'))

'Click'
String PTRekodberjayaID = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Rekod_berjaya_No_Rekod'))

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

WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_OK_berjaya_disah_simpan'))

WebUI.closeBrowser()

