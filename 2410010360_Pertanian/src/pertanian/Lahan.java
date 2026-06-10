
package pertanian;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lahan {
    //Variabel 
    private String idLahan, namaLahan, luasLahan, daerahLahan;

    // ArrayList penyimpanan data
    private ArrayList<String> dataIdLahan;
    private ArrayList<String> dataNamaLahan;
    private ArrayList<String> dataLuasLahan;
    private ArrayList<String> dataDaerahLahan;

    // Constructor
    public Lahan() {
        dataIdLahan = new ArrayList<>();
        dataNamaLahan = new ArrayList<>();
        dataLuasLahan = new ArrayList<>();
        dataDaerahLahan = new ArrayList<>();
    }

    // Constructor Parameter
    public Lahan(String id, String nama, String luas, String daerah) {
        this.idLahan = id;
        this.namaLahan = nama;
        this.luasLahan = luas;
        this.daerahLahan = daerah;
        this.dataIdLahan = new ArrayList<>();
        this.dataNamaLahan = new ArrayList<>();
        this.dataLuasLahan = new ArrayList<>();
        this.dataDaerahLahan = new ArrayList<>();
    }

    // Input Data
    public void inputIdLahan(String id) {
        dataIdLahan.add(id);
    }

    public void inputNamaLahan(String nama) {
        dataNamaLahan.add(nama);
    }

    public void inputLuasLahan(String luas) {
        dataLuasLahan.add(luas);
    }

    public void inputDaerahLahan(String daerah) {
        dataDaerahLahan.add(daerah);
    }

    // Menampilkan Data
    // ======================

    public ArrayList<String> listIdLahan() {
        return dataIdLahan;
    }

    public ArrayList<String> listNamaLahan() {
        return dataNamaLahan;
    }

    public ArrayList<String> listLuasLahan() {
        return dataLuasLahan;
    }

    public ArrayList<String> listDaerahLahan() {
        return dataDaerahLahan;
    }

    // Getter dan Setter
    // ======================

    public void setIdLahan(String idLahan) {
        this.idLahan = idLahan;
    }

    public String getIdLahan() {
        return this.idLahan;
    }

    public void setNamaLahan(String namaLahan) {
        this.namaLahan = namaLahan;
    }

    public String getNamaLahan() {
        return this.namaLahan;
    }

    public void setLuasLahan(String luasLahan) {
        this.luasLahan = luasLahan;
    }

    public String getLuasLahan() {
        return this.luasLahan;
    }

    public void setDaerahLahan(String daerahLahan) {
        this.daerahLahan = daerahLahan;
    }

    public String getDaerahLahan() {
        return this.daerahLahan;
    }

    // ======================
    // Materi Index
    // ======================

    public String getIdByIndex(int index) {
        return dataIdLahan.get(index);
    }

    public String getNamaByIndex(int index) {
        return dataNamaLahan.get(index);
    }

    public String getLuasByIndex(int index) {
        return dataLuasLahan.get(index);
    }

    public String getDaerahByIndex(int index) {
        return dataDaerahLahan.get(index);
    }

}