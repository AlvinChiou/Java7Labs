package MessageDigest;
public class StringEncryptMain {
    public static void main(String[] args) {
        StringEncrypt se = new StringEncrypt();
        String PlainPassword = "AlvinChiou";//�Ѧ��ǤJ���[�K����ơA���A���r��C
        String DataBasePassword = ""; //�Ѧ��ǤJ�q��Ʈw���X�Q�[�K���K�X�A���A���r��C
        se.StringEncrypt(PlainPassword);
        System.out.println("�Q�[�K�᪺��Ƭ�:" + se.getEncryptData());
        //�����Nse.getEncryptData()�Ǧ^����Ƽg�J��Ʈw�N��{��Ʈw�K�X�[�K�o!!

        if (se.getEncryptData().equals(DataBasePassword)){
            System.out.println("�K�X�۲šA���\�n�J");
        }else{
            System.out.println("�K�X����!");
        }

    }
}
