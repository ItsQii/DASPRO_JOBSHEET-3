public class ContohTipeData03 {
    public static void main(String[] args) {
        char golonganDarah = 'B';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 76.50F;
        double berat = 0.5467812345;
        long saldo = 1500000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t\t\t\t:" + (byte) golonganDarah);
        System.out.println("jarak\t\t\t\t\t: " + jarak);
        System.out.println("jumlah penduduk dalam satu dusun\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("suhu\t\t\t\t\t:" + suhu);
        System.out.println("Berat\t\t\t\t\t:" + (float) berat);
        System.out.println("Saldo\t\t\t\t\t:" + saldo);
        System.out.println("angkaDesimal\t\t\t\t:" + angkaDesimal);
    }
}