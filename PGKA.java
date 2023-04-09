public class PGKA {

    String nama, jenis_zakat, zakat, sedekah;

    public PGKA(String nama, String jenis_zakat, String zakat, String sedekah) {
        this.nama = nama;
        this.jenis_zakat = jenis_zakat;
        this.zakat = zakat;
        this.sedekah = sedekah;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisZakat() {
        return this.jenis_zakat;
    }

    public String getZakat() {
        return this.zakat;
    }

    public String getSedekah() {
        return this.sedekah;
    }
}