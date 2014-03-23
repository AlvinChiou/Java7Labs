package MessageDigest;
import java.security.*;
class StringEncrypt {
    private String str;
    private String EncryptStr;
    public String StringEncrypt(String str) {
        this.str = str;
        MessageDigest sha = null;
        try {
            //�p�G�n���MD5��SHA-256�Ъ����N�H�U"SHA-1"�����Y�i
            sha = MessageDigest.getInstance("SHA-1");
            sha.update(str.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return byte2hex(sha.digest());
    }
    private String byte2hex(byte[] b) {
        String hs="";
        String stmp="";
        for (int i = 0; i < b.length; i++) {
            stmp = (java.lang.Integer.toHexString(b[i] & 0XFF));
            if (stmp.length()==1){
                hs = hs +"0"+ stmp;
            }else {
                hs += stmp;
            }
        }
        return EncryptStr = hs.toUpperCase();
    }
    public String getEncryptData(){
        return EncryptStr;
    }
}
