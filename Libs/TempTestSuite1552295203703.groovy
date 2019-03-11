import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Perolehan/Inden Kerja Cara Bayaran EFT')

suiteProperties.put('name', 'Inden Kerja Cara Bayaran EFT')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Consultant_MSPHitect\\Katalon Studio\\TrainingonKatalon\\Reports\\Perolehan\\Inden Kerja Cara Bayaran EFT\\20190311_170643\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Perolehan/Inden Kerja Cara Bayaran EFT', suiteProperties, [new TestCaseBinding('Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/005 Inden Kerja - EFT', 'Test Cases/Perolehan/002 Rekod Baru oleh Penyedia/005 Inden Kerja - EFT',  null), new TestCaseBinding('Test Cases/Perolehan/003 Pengesahan Pesanan Tempatan/Pengesahan', 'Test Cases/Perolehan/003 Pengesahan Pesanan Tempatan/Pengesahan',  null), new TestCaseBinding('Test Cases/Perolehan/004 Pelulus Pesanan Tempatan/Pelulus', 'Test Cases/Perolehan/004 Pelulus Pesanan Tempatan/Pelulus',  null), new TestCaseBinding('Test Cases/Perolehan/005 Terimaan Barang Perkhidmatan/003 Proses Kemasukan Inden Kerja - EFT', 'Test Cases/Perolehan/005 Terimaan Barang Perkhidmatan/003 Proses Kemasukan Inden Kerja - EFT',  null)])