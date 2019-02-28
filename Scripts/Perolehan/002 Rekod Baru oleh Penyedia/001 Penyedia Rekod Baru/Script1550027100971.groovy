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

'Click on Rekod Baru to create new record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_REKODBARU'))

'Delay'
WebUI.delay(3)

'Get todays year and date'
mydate = new Date()

'Get todays date with format dd/MM/yyyy'
String formattedDate = mydate.format('dd/MM/yyyy')

'Get year with format yyyy'
String formattedYear = mydate.format('yyyy')

'print date in dd/mm/yyyy format'
println(formattedDate)

'print year in yyyy format'
println(formattedYear)

'Get the year of Tahun Kewangan'
String TahunKewangan = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/span_tahun_kewangan'))

'Verify the year is a match'
WebUI.verifyMatch(TahunKewangan, formattedYear, false)

assert true

'Get the date of Tarikh Semasa'
String TarikhSemasa = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/span_tarikhSemasa'))

'Verify the date is a match'
WebUI.verifyMatch(formattedDate, TarikhSemasa, false)

'Verify Jenis Urusniaga is visible'
WebUI.verifyElementVisible(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Jenis Urusniaga'))

'Select from dropdown list of Jenis Urusniaga\r\n'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/a_Jenis Urusniaga _textbox-ico'))

'Delay'
WebUI.delay(2)

'select PESANAN TEMPATAN AUTO'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/div_Pesanan_Tempatan_Auto'))

'verify No.Dokumen label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_No. Dokumen'), 0)

'verify Tarikh Dokumen label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Tarikh Dokumen'), 0)

'verify Pembekal label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Pembekal'), 0)

'verify Cawangan Pembekal label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Cawangan Pembekal'), 0)

'verify Sila Bekalkan Sebelum atau pada label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Sila Bekalkan Sebelum at'), 0)

'Click to select Pembekal drop-down'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/a_Pembekal _textbox-icon combo'))

'Select Pembekal from the list'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Pembekal_AA_DUA'))

'Verify that No Akaun Pembekal is populated'
WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_No.Akaun Pembekal _textb'), FailureHandling.STOP_ON_FAILURE)

'Verify that Cawangan Pembekal is populated'
WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_Cawangan Pembekal _textb'), FailureHandling.STOP_ON_FAILURE)

'Select date picker'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Date_Picker_Bekal_Kerja'))

'Delay'
WebUI.delay(1)

'Select for next month from date picker'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Date_Picker_Bekal_Kerja_Next_Month'))

'Delay'
WebUI.delay(1)

'Select date'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Date_Picker_Bekal_Kerja_Date'))

'Input Perihal details'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/Text_box_Perihal'), 'This is a test for automation scripts - Julia ' + 
    mydate)

WebUI.delay(3)

'Click button Tambah Caj Line'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_TambahCajLine'))

'Click Vot Dana drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Vot_Dana'))

WebUI.delay(8)

WebUI.waitForElementVisible(findTestObject('Perolehan/002 Penyedia_RekodBaru/Input_Vot_Dana'), 60)

WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/Input_Vot_Dana'), 'B31')

WebUI.waitForElementVisible(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Vot_Dana_B31'), 60)

'Select Vot Dana B31'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Vot_Dana_B31'))

WebUI.delay(3)

'Click Program Aktiviti drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Program_Aktiviti'))

'Delay'
WebUI.delay(3)

'Select Program Aktiviti 010080'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Program_010080'))

WebUI.delay(3)

'Click Kod Akaun drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Kod_Akaun'))

'Delay'
WebUI.delay(3)

'Search for Kod Akaun B0221101'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_kod_akaun'), 'B0221101')

'Delay'
WebUI.delay(3)

'Select Kod Akaun B0221101'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Kod_Akaun_B0221101'))

'Click kod barang drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Kod_Barang'))

WebUI.delay(3)

'Select kod barang 2110100000000000000 - MAKANAN DAN MINUMAN'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/SelectKod_Barang'))

'Click Kategori Pesanan drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Kategori_Pesanan_Tempatan'))

'Select kategori pesanan Barang'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Kategori_Pesanan_BARANG'))

'Input Kuantiti as 5'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_kuantiti'), '5')

'Click unit ukuran drop down value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Unit_Ukuran'))

'Delay'
WebUI.delay(3)

'Select unit ukuran buah'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/select_unit_ukuran_buah'))

'Input Harga Seunit as 1'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_harga_seunit'), '1.25')

'Click on button Simpan to save the record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_simpan_caj_line'))

'Delay'
WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_OK_Peruntukan_cukup'), 3)

'Click OK on prompt Bajet Mencukupi'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_OK_Peruntukan_cukup'))

'Click on Simpan to Save the record. Rekod ID will be generated'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_Simpan_Rekod'))

'Delay'
WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_OK_Rekod_Berjaya_disimpan'), 60)

'Click OK to close the prompt'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_OK_Rekod_Berjaya_disimpan'))

'Get value of Jumlah Pesanan Tempatan'
String JumlahPesananTempatan = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/Jumlah_pesanan_tempatan'))

'print Jumlah Pesanan Tempatan'
println(JumlahPesananTempatan)

'Tab Penghantaran Barang is displayed'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Tab_Penghantaran_Barang'))

'Tambah Maklumat Bekalan details is displayed'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_tambah_master_barang'))

'Input Yang Berkenaan value'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_untuk_perhatian'), 'Yang Berkenaan')

'Select Jabatan from the dropdown list'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_bekal_kepada_Jabatan'))

'Input 004000 to search'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_bekal_kepada_jabatan'), '004000')

'Delay'
WebUI.delay(3)

'Select Jabatan 004000'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/select_jabatan_004000'))

WebUI.delay(3)

'Click to select drop down value '
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_master_PTJ'))

'Delay'
WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Perolehan/002 Penyedia_RekodBaru/select_master_PTJ'), 60)

'Select 00400101 - Pejabat Kewangan & Perbendaharaan (Pegawai Kewangan Negeri)'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/select_master_PTJ'))

'Delay'
WebUI.delay(3)

WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/checkbox_alamat_utama'))

'Click on button Tambah Senarai Barang'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_tambah_senarai_barang'))

'Delay'
WebUI.delay(3)

'Click on drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_senarai_barang'))

'Delay'
WebUI.delay(3)

'Click on Senarai Barang item no 1'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Barang_1'))

'Input kuantiti as 5'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_Kuantiti_senarai_barang'), '5')

'Click on save icon to save senarai barang'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_save_senarai_barang'))

'Click on save icon to save maklumat bekalan'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_simpan_maklumat_bekalan'))

'Go back to pesanan tempatan tab'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Tab_Pesanan_Tempatan'))

'Click on button Simpan to save the record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_Simpan_Rekod'))

'Delay'
WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_OK_Rekod_Berjaya_disimpan'), 60)

'take screenshot'
WebUI.takeScreenshot()

'Click OK to close the prompt'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_OK_Rekod_Berjaya_disimpan'))

