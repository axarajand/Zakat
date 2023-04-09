import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<PGKA> zakatList = new ArrayList<PGKA>();   

        System.out.print("Masukan Jumlah Nama yang Akan Melakukan Zakat : ");
        int jumlahInput = input.nextInt();

        for(int i=1; i<=jumlahInput; i++) {
            System.out.println(i + ")");
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Jenis Zakat : ");
            String jenis_zakat = input.nextLine();
            String zakat = "";
            if(jenis_zakat.toLowerCase().equals("beras")) {
                zakat += "Beras 2.5 Kg";
            }else if(jenis_zakat.toLowerCase().equals("uang")) {
                zakat += "35000";
            }
            System.out.print("Sedekah : ");
            String sedekah = input.nextLine();

            zakatList.add(new PGKA(nama, jenis_zakat, zakat, sedekah.toString()));
        }

        System.out.println("==================");
        System.out.println("Rekap Zakat");
        System.out.println("==================");

        
        int i = 1;
        int jumlah_beras = 0;
        int jumlah_uang_zakat = 0;
        int jumlah_uang_sedekah = 0;
        for(PGKA zPgka:zakatList) {
            if(zPgka.jenis_zakat.toLowerCase().equals("beras")) {
                jumlah_beras++;
            }else if(zPgka.jenis_zakat.toLowerCase().equals("uang")) {
                jumlah_uang_zakat++;
            }
            jumlah_uang_sedekah = jumlah_uang_sedekah + Integer.parseInt(zPgka.sedekah);
            i++;
        }

        System.out.println("Jumlah Warga Yang Membayar Zakat : " + zakatList.size() + " Orang");
        System.out.println("Jumlah Beras Yang Terkumpul : " + jumlah_beras * 2.5 + " Kg");
        System.out.println("Jumlah Uang Zakat : " + jumlah_uang_zakat * 35000);
        System.out.println("Jumlah Uang Sedekah : " + jumlah_uang_sedekah);
    }
}
