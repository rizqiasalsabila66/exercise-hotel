import java.util.*;

public class Menu {
    public static void menuUtama(){
        System.out.println("Pilih nomor menu untuk masuk ke menunya:");
        System.out.println("1. All Guest Data\n2. All Room Data\n3. About this Hotel\n4. Exit Application");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try{
        switch (i) {
            case 1:
                menuTamu();
                break;
            case 2:
                menuKamar();
                break;
            case 3:
                System.out.println("Hotel ini bernama Silver Coast Hotel. Sudah didirikan sejak 12 December 1978 di Australia, Queensland, di kota \n" +
                        "Gold Coast.");
                break;
            case 4:
                break;
            default:
                System.out.println("Inputan salah. Coba lagi!");
        }
        }catch (Exception e){
            System.out.println("Inputan salah");
            menuUtama();
        }
    }

    public static void semuaDataTamu(){
        for(Map.Entry tamu : SilverCoastHotel.listTamu().entrySet()){
            System.out.println(tamu.getValue()+" dengan Nomor Register: "+tamu.getKey());
        }
    }
    public static void semuaDataKamar(){
        for(Map.Entry kamar : SilverCoastHotel.listKamar().entrySet()){
            System.out.println("Lantai: "+kamar.getValue()+" dengan Nomor Register: "+kamar.getKey());
        }
    }

    public static void menuTamu(){
        semuaDataTamu();
        System.out.println("\nPilih nomor menu untuk masuk ke mennunya:");
        System.out.println("1. Guest Information\n2. Back to Main Menu\n3. Exit Application");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try{
        switch (i){
            case 1:
                detailTamu();
                break;
            case 2:
                menuUtama();
                break;
            case 3:
                break;
            default:
                System.out.println("Inputan salah. Coba lagi!");

        }
        }catch (Exception e){
            System.out.println("Inputan salah");
            menuTamu();
        }
    }
    public static void menuKamar(){
        semuaDataKamar();
        System.out.println("\nPilih nomor menu untuk masuk ke mennunya:");
        System.out.println("1. Room Information\n2. Back to Main Menu\n3. Exit Application");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try{
        switch (i){
            case 1:
                detailKamar();
                break;
            case 2:
                menuUtama();
                break;
            case 3:
                break;
            default:
                System.out.println("Inputan salah. Coba lagi!");

        }
        }catch (Exception e){
            System.out.println("Inputan salah");
            menuKamar();
        }
    }
    public static void pilihMenuTamu(){
        System.out.println("\nPilih nomor menu untuk masuk ke mennunya:");
        System.out.println("1. Back to All Guest Data\n2. Back to Main Menu\n3. Exit Application");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try{
        switch (i){
            case 1:
                menuTamu();
                break;
            case 2:
                menuUtama();
                break;
            case 3:
                break;
            default:
                System.out.println("Inputan salah. Coba lagi!");

        }
        }catch (Exception e){
            System.out.println("Inputan salah");
            pilihMenuTamu();
        }
    }
    public static void pilihMenuKamar(){
        System.out.println("\nPilih nomor menu untuk masuk ke mennunya:");
        System.out.println("1. Back to All Room Data\n2. Back to Main Menu\n3. Exit Application");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try{
        switch (i){
            case 1:
                menuKamar();
                break;
            case 2:
                menuUtama();
                break;
            case 3:
                break;
            default:
                System.out.println("Inputan salah. Coba lagi!");

        }
        }catch (Exception e){
            System.out.println("Inputan salah");
            pilihMenuKamar();
        }
    }

    public static void detailTamu(){
        System.out.println("Masukan nomor Register yang anda ingin lihat informasinya:");
        Scanner scanner = new Scanner(System.in);
        String nomorRegister = scanner.nextLine();
            for (PesanKamar pesanKamar : SilverCoastHotel.listInfoHistoryReservasi()) {
                for (Tamu tamu : pesanKamar.getListTamu()) {
                    if (tamu.getNomorRegister().equals(nomorRegister)) {
                        tamu.cetakInfoTamu();
                        pesanKamar.cetakDurasidanBiaya(nomorRegister);
                        System.out.println();
                        System.out.println("Menginap di:");
                        pesanKamar.getKamar().cetakInfoKamarTamu();
                        System.out.println("\nAnggota keluarga");
                        pesanKamar.cetakAnggotaKeluarga(nomorRegister);
                        pilihMenuTamu();
                    }

                }
            }
    }

    public  static void detailKamar(){
        System.out.println("Masukan nomor Room yang anda ingin lihat informasinya:");
        Scanner scanner = new Scanner(System.in);
        int nomorKamar = scanner.nextInt();
        for(Kamar kamar : SilverCoastHotel.listSemuaKamar()) {
            if (kamar.getKodeKamar() == nomorKamar) {
                kamar.cetakInfoKmaarLengkap();
                System.out.println();
                System.out.println("Reservation History :");
                for (PesanKamar pesanKamar : SilverCoastHotel.listInfoHistoryReservasi()) {
                    pesanKamar.cetakHistoryKamar(nomorKamar);
                    pilihMenuKamar();
                }
            }
        }
    }

}
