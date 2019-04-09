package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Staging - Johor : URL
Profile Staging - Perak : URL</p>
     */
    public static Object URL_Homepage
     
    /**
     * <p>Profile Staging - Johor : Tahun Kewangan
Profile Staging - Perak : Tahun Kewangan</p>
     */
    public static Object TahunKewangan
     
    /**
     * <p>Profile Staging - Johor : rekod id for Arahan Bayaran
Profile Staging - Perak : rekod id for Arahan Bayaran</p>
     */
    public static Object ArahanBayaranRekodID
     
    /**
     * <p>Profile Staging - Johor : baucar id for Proses Baucar Bayaran
Profile Staging - Perak : baucar id for Proses Baucar Bayaran</p>
     */
    public static Object Nombor_Baucar
     
    /**
     * <p>Profile Staging - Johor : rekod id for Pesanan Tempatan
Profile Staging - Perak : rekod id for Pesanan Tempatan</p>
     */
    public static Object PesananTempatanRekodID
     
    /**
     * <p>Profile Staging - Johor : Dokumen ID generated after lulus
Profile Staging - Perak : Dokumen ID generated after lulus</p>
     */
    public static Object PesananTempatanDokumenID
     
    /**
     * <p>Profile Staging - Johor : get the total amount in the record
Profile Staging - Perak : get the total amount in the record</p>
     */
    public static Object TotalAmaunPT
     
    /**
     * <p>Profile Staging - Johor : get no rujukan for inden kerja
Profile Staging - Perak : get no rujukan for inden kerja</p>
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
     
    /**
     * <p></p>
     */
    public static Object kod_pembekal_cek
     
    /**
     * <p></p>
     */
    public static Object kod_akaun_cek
     
    /**
     * <p></p>
     */
    public static Object kod_barang_cek
     
    /**
     * <p></p>
     */
    public static Object nama_pembekal
     
    /**
     * <p></p>
     */
    public static Object nama_pembekal_cek
     
    /**
     * <p></p>
     */
    public static Object kod_pembekal_pemfaktoran
     
    /**
     * <p></p>
     */
    public static Object nama_pembekal_pemfaktoran
     
    /**
     * <p></p>
     */
    public static Object PenyediaPTJ
     
    /**
     * <p></p>
     */
    public static Object PenyemakPTJ
     
    /**
     * <p></p>
     */
    public static Object PelulusPTJ
     
    /**
     * <p></p>
     */
    public static Object PengesahBN
     
    /**
     * <p>Profile Staging - Johor : Radio button value for peranan
Profile Staging - Perak : Radio button value for peranan</p>
     */
    public static Object RBPenyediaPTJ
     
    /**
     * <p>Profile Staging - Johor : Radio button value for peranan
Profile Staging - Perak : Radio button value for peranan</p>
     */
    public static Object RBPengesahBN
     
    /**
     * <p>Profile Staging - Johor : Radio button value for peranan
Profile Staging - Perak : Radio button value for peranan</p>
     */
    public static Object RBPelulusBN
     
    /**
     * <p>Profile Staging - Johor : Radio button value for peranan
Profile Staging - Perak : Radio button value for peranan</p>
     */
    public static Object RBPelulusPTJ
     
    /**
     * <p>Profile Staging - Johor : Radio button value for peranan
Profile Staging - Perak : Radio button value for peranan</p>
     */
    public static Object RBPenyemakPTJ
     
    /**
     * <p></p>
     */
    public static Object jumlah_baucar_bayaran
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
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
            kod_pembekal_cek = selectedVariables['kod_pembekal_cek']
            kod_akaun_cek = selectedVariables['kod_akaun_cek']
            kod_barang_cek = selectedVariables['kod_barang_cek']
            nama_pembekal = selectedVariables['nama_pembekal']
            nama_pembekal_cek = selectedVariables['nama_pembekal_cek']
            kod_pembekal_pemfaktoran = selectedVariables['kod_pembekal_pemfaktoran']
            nama_pembekal_pemfaktoran = selectedVariables['nama_pembekal_pemfaktoran']
            PenyediaPTJ = selectedVariables['PenyediaPTJ']
            PenyemakPTJ = selectedVariables['PenyemakPTJ']
            PelulusPTJ = selectedVariables['PelulusPTJ']
            PengesahBN = selectedVariables['PengesahBN']
            RBPenyediaPTJ = selectedVariables['RBPenyediaPTJ']
            RBPengesahBN = selectedVariables['RBPengesahBN']
            RBPelulusBN = selectedVariables['RBPelulusBN']
            RBPelulusPTJ = selectedVariables['RBPelulusPTJ']
            RBPenyemakPTJ = selectedVariables['RBPenyemakPTJ']
            jumlah_baucar_bayaran = selectedVariables['jumlah_baucar_bayaran']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
