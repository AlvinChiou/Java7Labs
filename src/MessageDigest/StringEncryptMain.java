package MessageDigest;
public class StringEncryptMain {
    public static void main(String[] args) {
        StringEncrypt se = new StringEncrypt();
        String PlainPassword = "AlvinChiou";//由此傳入須加密的資料，型態為字串。
        String DataBasePassword = ""; //由此傳入從資料庫取出被加密的密碼，型態為字串。
        se.StringEncrypt(PlainPassword);
        System.out.println("被加密後的資料為:" + se.getEncryptData());
        //直接將se.getEncryptData()傳回的資料寫入資料庫就實現資料庫密碼加密囉!!

        if (se.getEncryptData().equals(DataBasePassword)){
            System.out.println("密碼相符，允許登入");
        }else{
            System.out.println("密碼不符!");
        }

    }
}
