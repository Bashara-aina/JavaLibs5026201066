import javax.swing.JOptionPane;

public class JavaLibs5026201066 {
    public static void main (String[] args) {
        String tokofavorit = JOptionPane.showInputDialog("Halo, boleh tau toko yang kamu kunjungi ketika masih kecil?");
        String nama = JOptionPane.showInputDialog("Halo, boleh tau namamu?");
        int tahunLahir = Integer.parseInt(JOptionPane.showInputDialog("Kamu lahir tahun berapa?"));
        int umurMasihKecil = 2021 - tahunLahir - 10;
        String lokasiRumah = JOptionPane.showInputDialog("Rumah kamu sekitar mana pas masih kecil?");
        String barangNgidam = JOptionPane.showInputDialog("Sebutkan 1 barang yang kamu pengenin dari dulu");
        int diskon = Integer.parseInt(JOptionPane.showInputDialog("Pilih angka antara 5 hingga 95"));
        int hargaAsli = Integer.parseInt(JOptionPane.showInputDialog("Berapa pengeluaranmu untuk jajan?"));
        int hargaDiskon = hargaAsli * (100 - diskon) / 100;
        String daging = JOptionPane.showInputDialog("Apa daging wagyu favoritmu?");
        double desimal = Double.parseDouble(JOptionPane.showInputDialog("Pilih satu bilangan desimal antara 1 sampai 5"));

        JOptionPane.showMessageDialog(null, "Halo! " + nama + " sekarang aku mau membawa kamu ke dunia " +
                "masa lalu ketika kamu masih kecil!" + "\ndi umur " + umurMasihKecil + "  tahun. Kamu sering banget ke toko " + tokofavorit + "."
                +"lokasi toko ini gajauh dari rumah kamu, makanya kamu" + " dulu sering ke sini." + "\nToko ini ada di " + lokasiRumah
                + ". Dulu kamu sering banget nih beli " + barangNgidam + " haha.. karena saking seringnya kami tuh suka ngasih kamu diskon sebesar "
                + diskon + "%" + " yang harga aslinya RP" + hargaAsli + " jadi cuma segini Rp" + hargaDiskon + "." + "\nKarena kamu sudah balik ke toko ini"
                + " kami mau memberikan daging wagyu " + daging + "dengan grade " + desimal + ".");

        System.out.println("Halo! " + nama + " sekarang aku mau membawa kamu ke dunia " +
                "masa lalu ketika kamu masih kecil!" + "\ndi umur " + umurMasihKecil + "  tahun. Kamu sering banget ke toko " + tokofavorit + "."
                +"lokasi toko ini gajauh dari rumah kamu, makanya kamu" + " dulu sering ke sini." + "\nToko ini ada di " + lokasiRumah
                + ". Dulu kamu sering banget nih beli " + barangNgidam + " haha.. karena saking seringnya kami tuh suka ngasih kamu diskon sebesar "
                + diskon + "%" + " yang harga aslinya RP" + hargaAsli + " jadi cuma segini Rp" + hargaDiskon + "." + "\nKarena kamu sudah balik ke toko ini"
                + " kami mau memberikan daging wagyu " + daging + " dengan grade " + desimal + ".");
    }
}