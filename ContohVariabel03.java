public class ContohVariabel03 {
    public static void main(String[] args) {
        String Hobby = "Bermain Bulutangkis ";
        boolean Pandai = true;
        char jeniskelamin = 'L';
        byte _UmurSayaSekarang = 18;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println("hobby");
        System.out.println("apakah pandai?" + Pandai );
        System.out.println("jeniskelamin" + jeniskelamin);
        System.out.println("Umurku saat ini" + _UmurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}