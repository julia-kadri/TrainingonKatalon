package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile 7010 : username value
Profile Staging : username value</p>
     */
    public static Object username
     
    /**
     * <p>Profile 7010 : password value
Profile Staging : password value</p>
     */
    public static Object password
     
    /**
     * <p>Profile 7010 : URL
Profile Staging : URL</p>
     */
    public static Object URL_Homepage
     
    /**
     * <p>Profile 7010 : Tahun Kewangan
Profile Staging : Tahun Kewangan</p>
     */
    public static Object TahunKewangan
     
    /**
     * <p>Profile 7010 : rekod id for Arahan Bayaran
Profile Staging : rekod id for Arahan Bayaran</p>
     */
    public static Object ArahanBayaranRekodID
     
    /**
     * <p>Profile 7010 : baucar id for Proses Baucar Bayaran
Profile Staging : baucar id for Proses Baucar Bayaran</p>
     */
    public static Object Nombor_Baucar
     
    /**
     * <p>Profile 7010 : rekod id for Pesanan Tempatan
Profile Staging : rekod id for Pesanan Tempatan</p>
     */
    public static Object PesananTempatanRekodID
     
    /**
     * <p>Profile 7010 : Dokumen ID generated after lulus
Profile Staging : Dokumen ID generated after lulus</p>
     */
    public static Object PesananTempatanDokumenID
     
    /**
     * <p>Profile 7010 : get the total amount in the record
Profile Staging : get the total amount in the record</p>
     */
    public static Object TotalAmaunPT
     
    /**
     * <p>Profile 7010 : get no rujukan for inden kerja
Profile Staging : get no rujukan for inden kerja</p>
     */
    public static Object IKno_rujukan
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            username = selectedVariables['username']
            password = selectedVariables['password']
            URL_Homepage = selectedVariables['URL_Homepage']
            TahunKewangan = selectedVariables['TahunKewangan']
            ArahanBayaranRekodID = selectedVariables['ArahanBayaranRekodID']
            Nombor_Baucar = selectedVariables['Nombor_Baucar']
            PesananTempatanRekodID = selectedVariables['PesananTempatanRekodID']
            PesananTempatanDokumenID = selectedVariables['PesananTempatanDokumenID']
            TotalAmaunPT = selectedVariables['TotalAmaunPT']
            IKno_rujukan = selectedVariables['IKno_rujukan']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
