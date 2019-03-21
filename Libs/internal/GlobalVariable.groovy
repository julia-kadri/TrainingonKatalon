package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


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
     * <p>Profile Staging : Dokumen ID generated after lulus</p>
     */
    public static Object PesananTempatanDokumenID
     
    /**
     * <p>Profile Staging : get the total amount in the record</p>
     */
    public static Object TotalAmaunPT
     
    /**
     * <p>Profile Staging : get no rujukan for inden kerja</p>
     */
    public static Object IKno_rujukan
     
    /**
     * <p></p>
     */
    public static Object URL_7011
     
    /**
     * <p></p>
     */
    public static Object Vot_dana
     
    /**
     * <p></p>
     */
    public static Object kod_pembekal
     
    /**
     * <p></p>
     */
    public static Object kod_program_aktiviti
     
    /**
     * <p></p>
     */
    public static Object kod_akaun
     
    /**
     * <p></p>
     */
    public static Object kod_barang
     
    /**
     * <p></p>
     */
    public static Object kod_jabatan
     
    /**
     * <p></p>
     */
    public static Object kod_PTJ
     

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
            URL_7011 = selectedVariables['URL_7011']
            Vot_dana = selectedVariables['Vot_dana']
            kod_pembekal = selectedVariables['kod_pembekal']
            kod_program_aktiviti = selectedVariables['kod_program_aktiviti']
            kod_akaun = selectedVariables['kod_akaun']
            kod_barang = selectedVariables['kod_barang']
            kod_jabatan = selectedVariables['kod_jabatan']
            kod_PTJ = selectedVariables['kod_PTJ']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
