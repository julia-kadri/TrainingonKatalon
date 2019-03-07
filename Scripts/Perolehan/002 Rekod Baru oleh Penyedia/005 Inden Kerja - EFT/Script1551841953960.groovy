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

WebUI.callTestCase(findTestCase('Perolehan/001 Left Menu Selection/Select Menu Pesanan Tempatan'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/button_Rekod_Baru'))

WebUI.delay(3)

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Jenis_Urusniaga'))

WebUI.delay(2)

'Get todays year and date'
mydate = new Date()

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_INDEN KERJA AUTO'))

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Pembekal'))

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_nama_Pembekal'), 'GREEN MIRACLE ENTERPRISE')

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_Kod_Pembekal_Green_Miracle'))

/*
 * WebUI.verifyMatch(cawanganpembekal, 'NO. 144, JALAN PUTRA A/8, TAMAN KLEBANG PUTRA, 31200 CHEMOR, PERAK ', false)
 */
'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Date_Picker_Sila_Bekalkan'))

WebUI.delay(3)

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Date_Picker_Next_month'))

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Date_Picker_Select_date_26th'))

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_no_tanggungan'), '2')

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_amaun_tanggungan'), '2')

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_ringkasan_kerja'), 'ringkasan kerja untuk inden kerja')

'int RN is created to generete random number'
int RN = ((Math.random() * 100000) as int)

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_rujukan_fail'), 'IK00' + 
    RN)

'get Input Rujukan fail value'
GlobalVariable.IKno_rujukan = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_rujukan_fail'))

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_kerja_terperinci'), 'kerja terperinci ' + 
    mydate)

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_Perihal'), 'test here ' + 
    mydate)

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/tambah_maklumat_terperinci'))

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Vot_Dana'))

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_Vot_kod'), 'B31')

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_Vot_B31'))

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Program_Aktiviti'))

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_ProgramAktiviti_kod'), '160080')

'Click'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/select_ProgramAktiviti_010080'))

'Click Rekod Baru button'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/Drop_down_Kod_Akaun'))

'Click Rekod Baru button'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/005 Rekod Baru Inden Kerja/input_kod_Akaun_kod'), 'B0227102')

'Click'
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

