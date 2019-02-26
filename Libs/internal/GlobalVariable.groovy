package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Staging : username value</p>
     */
    public static Object username
     
    /**
     * <p>Profile Staging : password value</p>
     */
    public static Object password
     
    /**
     * <p>Profile Staging : URL</p>
     */
    public static Object URL_Homepage
     
    /**
     * <p>Profile Staging : Tahun Kewangan</p>
     */
    public static Object TahunKewangan
     
    /**
     * <p>Profile Staging : rekod id for Kemasukan Terimaan</p>
     */
    public static Object RekodID
     
    /**
     * <p>Profile Staging : rekod id for Arahan Bayaran</p>
     */
    public static Object ArahanBayaranRekodID
     
    /**
     * <p>Profile Staging : baucar id for Proses Baucar Bayaran</p>
     */
    public static Object Nombor_Baucar
     
    /**
     * <p>Profile Staging : rekod id for Pesanan Tempatan</p>
     */
    public static Object PesananTempatanRekodID
     
    /**
     * <p></p>
     */
    public static Object PesananTempatanDokumenID
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('Production', allVariables['default'] + [:])
        allVariables.put('Staging', allVariables['default'] + ['username' : '790214108888', 'password' : '8SQVv/p9jVScEs4/2CZsLw==', 'URL_Homepage' : 'https://175.143.52.101:7011/1SPEKSv2/', 'TahunKewangan' : '2019', 'RekodID' : '19DAPT030100098', 'ArahanBayaranRekodID' : '19DAAB030100044', 'Nombor_Baucar' : '19DABB0400082', 'PesananTempatanRekodID' : '19DAPT030100074', 'PesananTempatanDokumenID' : '19DAPT0300080'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        username = selectedVariables["username"]
        password = selectedVariables["password"]
        URL_Homepage = selectedVariables["URL_Homepage"]
        TahunKewangan = selectedVariables["TahunKewangan"]
        RekodID = selectedVariables["RekodID"]
        ArahanBayaranRekodID = selectedVariables["ArahanBayaranRekodID"]
        Nombor_Baucar = selectedVariables["Nombor_Baucar"]
        PesananTempatanRekodID = selectedVariables["PesananTempatanRekodID"]
        PesananTempatanDokumenID = selectedVariables["PesananTempatanDokumenID"]
        
    }
}
