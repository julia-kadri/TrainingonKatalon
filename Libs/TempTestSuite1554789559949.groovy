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


suiteProperties.put('id', 'Test Suites/Perolehan/02 Pesanan Tempatan Cara Bayaran CEK Dengan Pemfaktoran')

suiteProperties.put('name', '02 Pesanan Tempatan Cara Bayaran CEK Dengan Pemfaktoran')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Consultant_MSPHitect\\Katalon Studio\\TrainingonKatalon\\Reports\\Perolehan\\02 Pesanan Tempatan Cara Bayaran CEK Dengan Pemfaktoran\\20190409_135919\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Perolehan/02 Pesanan Tempatan Cara Bayaran CEK Dengan Pemfaktoran', suiteProperties, [new TestCaseBinding('Test Cases/Perolehan/006 Arahan Bayaran/002 Arahan Bayaran - CEK', 'Test Cases/Perolehan/006 Arahan Bayaran/002 Arahan Bayaran - CEK',  null), new TestCaseBinding('Test Cases/Perolehan/006 Arahan Bayaran/009 Penyemak Pesanan Tempatan', 'Test Cases/Perolehan/006 Arahan Bayaran/009 Penyemak Pesanan Tempatan',  null), new TestCaseBinding('Test Cases/Perolehan/007 Proses Baucar Bayaran/002 Pelulus Proses Baucar Bayaran - CEK', 'Test Cases/Perolehan/007 Proses Baucar Bayaran/002 Pelulus Proses Baucar Bayaran - CEK',  null), new TestCaseBinding('Test Cases/Perolehan/008 Posting Bayaran/002 Posting Bayaran - CEK', 'Test Cases/Perolehan/008 Posting Bayaran/002 Posting Bayaran - CEK',  null), new TestCaseBinding('Test Cases/Perolehan/009 Penyedia Cetak Baucar Bayaran/001 Penyedia Cetak Baucar Bayaran', 'Test Cases/Perolehan/009 Penyedia Cetak Baucar Bayaran/001 Penyedia Cetak Baucar Bayaran',  null)])
