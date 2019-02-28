import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Perolehan/Perolehan')

suiteProperties.put('name', 'Perolehan')

suiteProperties.put('description', 'Perolehan scenario')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Consultant_MSPHitect\\Katalon Studio\\TrainingonKatalon\\Reports\\Perolehan\\Perolehan\\20190228_160539\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Perolehan/Perolehan', suiteProperties, [new TestCaseBinding('Test Cases/Perolehan/001 Left Menu Selection/Select Menu Pesanan Tempatan', 'Test Cases/Perolehan/001 Left Menu Selection/Select Menu Pesanan Tempatan',  null), new TestCaseBinding('Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/001 Penyedia Rekod Baru', 'Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/001 Penyedia Rekod Baru',  null), new TestCaseBinding('Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/002 Senarai Semak', 'Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/002 Senarai Semak',  null), new TestCaseBinding('Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/003 Sah Simpan', 'Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/003 Sah Simpan',  null), new TestCaseBinding('Test Cases/Perolehan/003 Pengesahan Pesanan Tempatan/Pengesahan', 'Test Cases/Perolehan/003 Pengesahan Pesanan Tempatan/Pengesahan',  null), new TestCaseBinding('Test Cases/Perolehan/004 Pelulus Pesanan Tempatan/Pelulus', 'Test Cases/Perolehan/004 Pelulus Pesanan Tempatan/Pelulus',  null), new TestCaseBinding('Test Cases/Perolehan/005 Terimaan Barang Perkhidmatan/001 Proses Kemasukan Terimaan Barang', 'Test Cases/Perolehan/005 Terimaan Barang Perkhidmatan/001 Proses Kemasukan Terimaan Barang',  null), new TestCaseBinding('Test Cases/Perolehan/006 Arahan Bayaran/001 Arahan Bayaran', 'Test Cases/Perolehan/006 Arahan Bayaran/001 Arahan Bayaran',  null), new TestCaseBinding('Test Cases/Perolehan/006 Arahan Bayaran/002 Penyemak', 'Test Cases/Perolehan/006 Arahan Bayaran/002 Penyemak',  null), new TestCaseBinding('Test Cases/Perolehan/007 Proses Baucar Bayaran/001 Pelulus Proses Baucar Bayaran', 'Test Cases/Perolehan/007 Proses Baucar Bayaran/001 Pelulus Proses Baucar Bayaran',  null), new TestCaseBinding('Test Cases/Perolehan/008 Posting Bayaran/008 Posting Bayaran', 'Test Cases/Perolehan/008 Posting Bayaran/008 Posting Bayaran',  null), new TestCaseBinding('Test Cases/Perolehan/009 Penyedia Cetak Baucar Bayaran/001 Penyedia Cetak Baucar Bayaran', 'Test Cases/Perolehan/009 Penyedia Cetak Baucar Bayaran/001 Penyedia Cetak Baucar Bayaran',  null)])
