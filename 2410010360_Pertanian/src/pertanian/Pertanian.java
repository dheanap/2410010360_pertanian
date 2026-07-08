/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertanian;
import java.util.ArrayList;
import form.frameUtama;
/**
 *
 * @author ASUS
 */
public class Pertanian {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Object Lahan
        Lahan lahan = new Lahan();
        // Input Data Lahan
        lahan.inputIdLahan("L001");
        lahan.inputNamaLahan("Lahan Padi");
        lahan.inputLuasLahan("2.5");
        lahan.inputDaerahLahan("Banjarmasin");
        lahan.inputIdLahan("L002");
        lahan.inputNamaLahan("Lahan Jagung");
        lahan.inputLuasLahan("1.5");
        lahan.inputDaerahLahan("Banjarbaru");
        // Menampilkan Data Lahan
        System.out.println("DATA LAHAN");
        for (int i = 0; i < lahan.listIdLahan().size(); i++) {
            System.out.println("ID      : "
                    + lahan.listIdLahan().get(i));
            System.out.println("Nama    : "
                    + lahan.listNamaLahan().get(i));
            System.out.println("Luas    : "
                    + lahan.listLuasLahan().get(i));
            System.out.println("Daerah  : "
                    + lahan.listDaerahLahan().get(i));
            System.out.println("---------------------");
        }
        // Index
        System.out.println("\nDATA BERDASARKAN INDEX");
        System.out.println("ID Index 0 : "
                + lahan.getIdByIndex(0));
        System.out.println("Nama Index 0 : "
                + lahan.getNamaByIndex(0));
        System.out.println("Luas Index 0 : "
                + lahan.getLuasByIndex(0));
        System.out.println("Daerah Index 0 : "
                + lahan.getDaerahByIndex(0));
        // Object Laporan Panen
        LaporanPanen panen = new LaporanPanen();
        panen.setIdPanen(1);
        panen.setJumlahPanen(500);
        panen.setHarga(7000);
        // Input luas lahan ke objek panen
        // Karena LaporanPanen extends Lahan, panen punya data luas
        // sendiri yang terpisah dari objek "lahan" di atas.
        // Panen ini berasal dari Lahan Padi (index 0), luas 2.5 Ha
        panen.inputLuasLahan(lahan.getLuasByIndex(0));
        // ArrayList Panen
        panen.inputIdPanen("P001");
        panen.inputJumlahPanen("500");
        panen.inputHarga("7000");
        panen.inputIdPanen("P002");
        panen.inputJumlahPanen("600");
        panen.inputHarga("7500");
        
        System.out.println("\nDATA PANEN");
        for (int i = 0; i < panen.listIdPanen().size(); i++) {
            System.out.println(
                    "ID Panen     : "
                    + panen.listIdPanen().get(i));
            System.out.println(
                    "Jumlah Panen : "
                    + panen.listJumlahPanen().get(i));
            System.out.println(
                    "Harga        : "
                    + panen.listHarga().get(i));
            System.out.println("--------------------");
        }
        System.out.println("\nLAPORAN PANEN");
        
        System.out.println(
                "Jumlah Panen : "
                + panen.getJumlahPanen()
                + " Kg");
        System.out.println(
                "Harga / Kg : Rp."
                + panen.getHarga());
        System.out.println(
                "Pendapatan : Rp."
                + panen.hitungPendapatan());
        System.out.println(
                "Produktivitas : "
                + panen.hitungProduktivitas(0)
                + " Kg/Ha");
        System.out.println(
                "Status : "
                + panen.statusPanen());
        new frameUtama().setVisible(true);
    }
}