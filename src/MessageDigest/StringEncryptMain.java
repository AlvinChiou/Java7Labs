package MessageDigest;

public class StringEncryptMain {
    public static void main(String[] args) {
        StringEncrypt se = new StringEncrypt();
        se.StringEncrypt("AlvinChiou"); //�Ѧ��ǤJ���[�K����ơA���A���r��C
        System.out.println("�Q�[�K�᪺��Ƭ�:"+se.getEncryptData());
        //�����Nse.getEncryptData()�Ǧ^����Ƽg�J��Ʈw�N��{��Ʈw�K�X�[�K�o!!
    }
}
