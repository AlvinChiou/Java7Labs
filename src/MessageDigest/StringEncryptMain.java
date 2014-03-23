package MessageDigest;

public class StringEncryptMain {
    public static void main(String[] args) {
        StringEncrypt se = new StringEncrypt();
        se.StringEncrypt("AlvinChiou"); //由此傳入須加密的資料，型態為字串。
        System.out.println("被加密後的資料為:"+se.getEncryptData());
        //直接將se.getEncryptData()傳回的資料寫入資料庫就實現資料庫密碼加密囉!!
    }
}
