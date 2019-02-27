import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
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


RunConfiguration.setExecutionSettingFile('C:\\Users\\CONSUL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Perolehan\\002 Rekod Baru oleh Penyedia\\001 Penyedia Rekod Baru\\20190226_112704\\execution.properties')

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

'Click on Rekod Baru to create new record'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_REKODBARU'))

'Delay'
not_run: WebUI.delay(3)

'Get todays year and date'
not_run: mydate = new Date()

'Get todays date with format dd/MM/yyyy'
not_run: String formattedDate = mydate.format('dd/MM/yyyy')

'Get year with format yyyy'
not_run: String formattedYear = mydate.format('yyyy')

'print date in dd/mm/yyyy format'
not_run: println(formattedDate)

'print year in yyyy format'
not_run: println(formattedYear)

'Get the year of Tahun Kewangan'
not_run: String TahunKewangan = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/span_tahun_kewangan'))

'Verify the year is a match'
not_run: WebUI.verifyMatch(TahunKewangan, formattedYear, false)

not_run: assert true

'Get the date of Tarikh Semasa'
not_run: String TarikhSemasa = WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/span_tarikhSemasa'))

'Verify the date is a match'
not_run: WebUI.verifyMatch(formattedDate, TarikhSemasa, false)

'Verify Jenis Urusniaga is visible'
not_run: WebUI.verifyElementVisible(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Jenis Urusniaga'))

'Select from dropdown list of Jenis Urusniaga\\r\\n'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/a_Jenis Urusniaga _textbox-ico'))

'Delay'
not_run: WebUI.delay(2)

'select PESANAN TEMPATAN AUTO'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/div_Pesanan_Tempatan_Auto'))

'verify No.Dokumen label is present'
not_run: WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_No. Dokumen'), 0)

'verify Tarikh Dokumen label is present'
not_run: WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Tarikh Dokumen'), 0)

'verify Pembekal label is present'
not_run: WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Pembekal'), 0)

'verify Cawangan Pembekal label is present'
not_run: WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Cawangan Pembekal'), 0)

'verify Sila Bekalkan Sebelum atau pada label is present'
not_run: WebUI.verifyElementPresent(findTestObject('Perolehan/002 Penyedia_RekodBaru/label_Sila Bekalkan Sebelum at'), 0)

'Click to select Pembekal drop-down'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/a_Pembekal _textbox-icon combo'))

'Select Pembekal from the list'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Pembekal_AA_DUA'))

'Verify that No Akaun Pembekal is populated'
not_run: WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_No.Akaun Pembekal _textb'), FailureHandling.STOP_ON_FAILURE)

'Verify that Cawangan Pembekal is populated'
not_run: WebUI.getText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_Cawangan Pembekal _textb'), FailureHandling.STOP_ON_FAILURE)

'Select date picker'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Date_Picker_Bekal_Kerja'))

'Delay'
not_run: WebUI.delay(1)

'Select for next month from date picker'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Date_Picker_Bekal_Kerja_Next_Month'))

'Delay'
not_run: WebUI.delay(1)

'Select date'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Date_Picker_Bekal_Kerja_Date'))

'Input Perihal details'
not_run: WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/Text_box_Perihal'), 'This is a test for automation scripts - Julia ' + 
    mydate)

not_run: WebUI.delay(3)

'Click button Tambah Caj Line'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_TambahCajLine'))

'Click Vot Dana drop down to select a value'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Vot_Dana'))

'Delay'
not_run: WebUI.delay(3)

'Input B31 to filter specific value'
not_run: WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_Vot_kod'), 'B31')

not_run: WebUI.delay(3)

'Select Vot Dana B31'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Vot_Dana_B31'))

not_run: WebUI.delay(3)

'Click Program Aktiviti drop down to select a value'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Program_Aktiviti'))

'Delay'
not_run: WebUI.delay(3)

'Select Program Aktiviti 010080'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Program_010080'))

not_run: WebUI.delay(3)

'Click Kod Akaun drop down to select a value'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Kod_Akaun'))

'Delay'
not_run: WebUI.delay(3)

'Search for Kod Akaun B0221101'
not_run: WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_kod_akaun'), 'B0221101')

'Delay'
not_run: WebUI.delay(3)

'Select Kod Akaun B0221101'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Kod_Akaun_B0221101'))

'Click kod barang drop down to select a value'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Kod_Barang'))

not_run: WebUI.delay(3)

'Select kod barang 2110100000000000000 - MAKANAN DAN MINUMAN'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/SelectKod_Barang'))

'Click Kategori Pesanan drop down to select a value'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Kategori_Pesanan_Tempatan'))

'Select kategori pesanan Barang'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Select_Kategori_Pesanan_BARANG'))

'Input Kuantiti as 5'
not_run: WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_kuantiti'), '5')

'Click unit ukuran drop down value'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_Unit_Ukuran'))

'Delay'
not_run: WebUI.delay(3)

'Select unit ukuran buah'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/select_unit_ukuran_buah'))

'Input Harga Seunit as 1'
not_run: WebUI.setText(findTestObject('Perolehan/002 Penyedia_RekodBaru/input_harga_seunit'), '1.25')

'Click on button Simpan to save the record'
not_run: WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_simpan_caj_line'))

'Delay'
WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Perolehan/002 Penyedia_RekodBaru/button_OK_Peruntukan_cukup'), 3)

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

'Click to select drop down value '
WebUI.click(findTestObject('Perolehan/002 Penyedia_RekodBaru/Drop_down_master_PTJ'))

'Delay'
WebUI.delay(3)

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

''', 'Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/001 Penyedia Rekod Baru', new TestCaseBinding('Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/001 Penyedia Rekod Baru',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
