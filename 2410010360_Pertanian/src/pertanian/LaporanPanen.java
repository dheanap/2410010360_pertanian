/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertanian;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class LaporanPanen extends Lahan {
    private int idPanen, jumlahPanen, harga;
    
    // ArrayList
    private ArrayList<String> dataIdPanen;
    private ArrayList<String> dataJumlahPanen;
    private ArrayList<String> dataHarga;

    // Constructor
    public LaporanPanen() {
        this.dataIdPanen = new ArrayList<>();
        this.dataJumlahPanen = new ArrayList<>();
        this.dataHarga = new ArrayList<>();
    }

    public LaporanPanen(int idPanen, int jumlahPanen, int harga) {
        this.idPanen = idPanen;
        this.jumlahPanen = jumlahPanen;
        this.harga = harga;

        this.dataIdPanen = new ArrayList<>();
        this.dataJumlahPanen = new ArrayList<>();
        this.dataHarga = new ArrayList<>();
    }

    // Input Data
    public void inputIdPanen(String id) {
        dataIdPanen.add(id);
    }

    public void inputJumlahPanen(String jumlah) {
        dataJumlahPanen.add(jumlah);
    }

    public void inputHarga(String harga) {
        dataHarga.add(harga);
    }

    // Menampilkan Data
    public ArrayList<String> listIdPanen() {
        return dataIdPanen;
    }

    public ArrayList<String> listJumlahPanen() {
        return dataJumlahPanen;
    }

    public ArrayList<String> listHarga() {
        return dataHarga;
    }

    //Index
    public String getIdPanenByIndex(int index) {
        return dataIdPanen.get(index);
    }

    public String getJumlahPanenByIndex(int index) {
        return dataJumlahPanen.get(index);
    }

    public String getHargaByIndex(int index) {
        return dataHarga.get(index);
    }

    public void setIdPanen(int idPanen) {
        this.idPanen = idPanen;
    }

    public void setJumlahPanen(int jumlahPanen) {
        this.jumlahPanen = jumlahPanen;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getIdPanen() {
        return idPanen;
    }

    public int getJumlahPanen() {
        return jumlahPanen;
    }

    public int getHarga() {
        return harga;
    }

    public int hitungPendapatan() {
        return jumlahPanen * harga;
    }
    
    // Hitung Produktivitas Panen
    public double hitungProduktivitas(int indexLahan) {
        double luas = Double.parseDouble(getLuasByIndex(indexLahan));
        return jumlahPanen / luas;
    }       

    public String statusPanen() {
        if (jumlahPanen >= 1000) {
            return "Panen Sangat Baik";
        } else if (jumlahPanen >= 700) {
            return "Panen Baik";
        } else if (jumlahPanen >= 500) {
            return "Panen Cukup";
        } else if (jumlahPanen >= 300) {
            return "Panen Kurang";
        } else {
            return "Panen Gagal";
        }
    }
}