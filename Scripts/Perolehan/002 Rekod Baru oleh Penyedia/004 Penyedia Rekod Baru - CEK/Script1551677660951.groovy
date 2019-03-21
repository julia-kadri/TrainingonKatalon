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

'Click on Rekod Baru to create new record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_REKODBARU'))

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
String TahunKewangan = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/span_tahun_kewangan'))

'Verify the year is a match'
WebUI.verifyMatch(TahunKewangan, formattedYear, false)

assert true

'Get the date of Tarikh Semasa'
String TarikhSemasa = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/span_tarikhSemasa'))

'Verify the date is a match'
WebUI.verifyMatch(formattedDate, TarikhSemasa, false)

'Verify Jenis Urusniaga is visible'
WebUI.verifyElementVisible(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/label_Jenis Urusniaga'))

'Select from dropdown list of Jenis Urusniaga\r\n'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/a_Jenis Urusniaga _textbox-ico'))

'Delay'
WebUI.delay(2)

'select PESANAN TEMPATAN AUTO'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/div_Pesanan_Tempatan_Auto'))

'verify No.Dokumen label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/label_No. Dokumen'), 
    0)

'verify Tarikh Dokumen label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/label_Tarikh Dokumen'), 
    0)

'verify Pembekal label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/label_Pembekal'), 
    0)

'verify Cawangan Pembekal label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/label_Cawangan Pembekal'), 
    0)

'verify Sila Bekalkan Sebelum atau pada label is present'
WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/label_Sila Bekalkan Sebelum at'), 
    0)

'Click to select Pembekal drop-down'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/a_Pembekal _textbox-icon combo'))

WebUI.delay(3)

'set text value as JAMAL CHEF CATERING into Nama Pembekal to filter for this pembekal'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_kod_pembekal'), GlobalVariable.kod_pembekal_cek)

'delay'
WebUI.delay(3)

'Select Pembekal from the list'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Select_Pembekal', [('text') : GlobalVariable.kod_pembekal_cek]))

'delay'
WebUI.delay(3)

'Select date picker'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Date_Picker_Bekal_Kerja'))

'Delay'
WebUI.delay(1)

'Select for next month from date picker'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Date_Picker_Bekal_Kerja_Next_Month'))

'Delay'
WebUI.delay(1)

'Select date'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Date_Picker_Bekal_Kerja_Date'))

'Input Perihal details'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Text_box_Perihal'), 'This is a test for PT - Cek automation scripts - Julia ' + 
    mydate)

'delay'
WebUI.delay(3)

'Click button Tambah Caj Line'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_TambahCajLine'))

'delay'
WebUI.delay(3)

'Click Vot Dana drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_Vot_Dana'))

'delay'
WebUI.delay(3)

'set value Vot Dana B31 into the filter for KOD'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Input_Vot_Dana'), GlobalVariable.Vot_dana)

'Select Vot Dana B31'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Select_Vot_Dana', [('text') : GlobalVariable.Vot_dana]))

WebUI.delay(3)

'Click Program Aktiviti drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_Program_Aktiviti'))

WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_Kod_Program_Aktiviti'), 
    GlobalVariable.kod_program_aktiviti)

'Select Program Aktiviti 010080'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Select_Program', [('text') : GlobalVariable.kod_program_aktiviti]))

WebUI.delay(3)

'Click Kod Akaun drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_Kod_Akaun'))

'Delay'
WebUI.delay(3)

'Search for Kod Akaun B0221101'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_kod_akaun'), GlobalVariable.kod_akaun_cek)

'Delay'
WebUI.delay(3)

'Select Kod Akaun B0221101'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Select_Kod_Akaun', [('text') : GlobalVariable.kod_akaun_cek]))

'Click kod barang drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_Kod_Barang'))

WebUI.delay(3)

WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_kod_barang'), GlobalVariable.kod_barang_cek)

'Select kod barang 2110100000000000000 - MAKANAN DAN MINUMAN'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/SelectKod_Barang', [('text') : GlobalVariable.kod_barang_cek]))

'Click Kategori Pesanan drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_Kategori_Pesanan_Tempatan'))

'Select kategori pesanan Barang'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Select_Kategori_Pesanan_PERKHIDMATAN'))

'Input Kuantiti as 3'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_kuantiti'), '3')

'Click unit ukuran drop down value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_Unit_Ukuran'))

'Delay'
WebUI.delay(3)

'Select unit ukuran buah'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/select_unit_ukuran_buah'))

'Input Harga Seunit as 1.77'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_harga_seunit'), '1.77')

'Click on button Simpan to save the record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_simpan_caj_line'))

'Delay'
WebUI.delay(3)

'wait for the element becomes clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Peruntukan_cukup'), 
    3)

'Click OK on prompt Bajet Mencukupi'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Peruntukan_cukup'))

'Click on Simpan to Save the record. Rekod ID will be generated'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_Simpan_Rekod'))

'Delay'
WebUI.delay(3)

'wait for the element becomes clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 
    60)

'Click OK to close the prompt'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'))

'delay'
WebUI.delay(3)

'Get value of Jumlah Pesanan Tempatan'
String JumlahPesananTempatan = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Jumlah_pesanan_tempatan'))

'print Jumlah Pesanan Tempatan'
println(JumlahPesananTempatan)

'Tab Penghantaran Barang is displayed'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Tab_Penghantaran_Barang'))

'Tambah Maklumat Bekalan details is displayed'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_tambah_master_barang'))

'Input Yang Berkenaan value'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_untuk_perhatian'), 
    'Yang Berkenaan')

'Select Jabatan from the dropdown list'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_bekal_kepada_Jabatan'))

'Input 004000 to search'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_bekal_kepada_jabatan'), 
    GlobalVariable.kod_jabatan)

'Delay'
WebUI.delay(3)

'Select Jabatan 004000'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/select_jabatan', [('text') : GlobalVariable.kod_jabatan]))

WebUI.delay(3)

'Click to select drop down value '
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_master_PTJ'))

'Delay'
WebUI.delay(3)

WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_kod_PTJ'), GlobalVariable.kod_PTJ)

'Select 00400101 - Pejabat Kewangan & Perbendaharaan (Pegawai Kewangan Negeri)'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/select_master_PTJ', [('text') : GlobalVariable.kod_PTJ]))

'Delay'
WebUI.delay(3)

'check on Alamat Utama checkbox'
WebUI.check(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/checkbox_alamat_utama'))

'Click on button Tambah Senarai Barang'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_tambah_senarai_barang'))

'Delay'
WebUI.delay(3)

'Click on drop down to select a value'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_senarai_barang'))

'Delay'
WebUI.delay(3)

'Click on Senarai Barang item no 1'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Drop_down_Barang_1', [('text') : GlobalVariable.kod_barang_cek]))

'Input kuantiti as 3'
WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/input_Kuantiti_senarai_barang'), 
    '3')

'Click on save icon to save senarai barang'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_save_senarai_barang'))

'Click on save icon to save maklumat bekalan'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_simpan_maklumat_bekalan'))

'Go back to pesanan tempatan tab'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/Tab_Pesanan_Tempatan'))

'Click on button Simpan to save the record'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_Simpan_Rekod'))

'Delay'
WebUI.delay(3)

'wait for the element to become clickable'
WebUI.waitForElementClickable(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'), 
    60)

'take screenshot'
WebUI.takeScreenshot()

'Click OK to close the prompt'
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/001 Rekod Baru Pesanan Tempatan/button_OK_Rekod_Berjaya_disimpan'))

