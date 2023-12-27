import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SilverCoastHotel {
    private static Kamar kamar;

    public static Kamar getKamar() {
        return kamar;
    }

    public static void setKamar(Kamar kamar) {
        SilverCoastHotel.kamar = kamar;
    }

    public static HashMap<String,String> listTamu(){
        HashMap<String, String> listTamu=new HashMap<>();
        listTamu.put(tamuA021().getNomorRegister(),String.format(tamuA021().getNamaDepan()+" "+tamuA021().getNamaBelakang()));
        listTamu.put(tamuA022().getNomorRegister(),String.format(tamuA022().getNamaDepan()+" "+tamuA022().getNamaBelakang()));
        listTamu.put(tamuA023().getNomorRegister(),String.format(tamuA023().getNamaDepan()+" "+tamuA023().getNamaBelakang()));
        listTamu.put(tamuA024().getNomorRegister(),String.format(tamuA024().getNamaDepan()+" "+tamuA024().getNamaBelakang()));
        listTamu.put(tamuA025().getNomorRegister(),String.format(tamuA025().getNamaDepan()+" "+tamuA025().getNamaBelakang()));
        listTamu.put(tamuA026().getNomorRegister(),String.format(tamuA026().getNamaDepan()+" "+tamuA026().getNamaBelakang()));
        return listTamu;
    }
    public static HashMap<Integer,Integer> listKamar(){
        HashMap<Integer,Integer> listKamar=new HashMap<>();
        listKamar.put(kamar301().getKodeKamar(), kamar301().getLantai());
        listKamar.put(kamar302().getKodeKamar(), kamar302().getLantai());
        listKamar.put(kamar303().getKodeKamar(), kamar303().getLantai());
        listKamar.put(kamar401().getKodeKamar(), kamar401().getLantai());
        listKamar.put(kamar402().getKodeKamar(), kamar402().getLantai());
        listKamar.put(kamar403().getKodeKamar(), kamar403().getLantai());
        return listKamar;
    }

    public static Tamu tamuA021(){
    Tamu tamuA021 = new Tamu();
    tamuA021.setNomorRegister("A021");
    tamuA021.setNamaDepan("Danny");
    tamuA021.setNamaBelakang("Tan");
    tamuA021.setNoIdentitas("312008923111990002");
    tamuA021.setJenisKelamin(JenisKelamin.L.getDeskripsi());
    tamuA021.setKotaLahir("Beijing");
    tamuA021.setTanggalLahir(LocalDate.of(1990,11,23));
    //tamuA021.setPesanKamar(historiReservasi301());
    return tamuA021;
    }

    public static Tamu tamuA022(){
        Tamu tamuA022 = new Tamu();
        tamuA022.setNomorRegister("A022");
        tamuA022.setNamaDepan("Dessy");
        tamuA022.setNamaBelakang("Wang");
        tamuA022.setNoIdentitas("312008661111990004");
        tamuA022.setJenisKelamin(JenisKelamin.P.getDeskripsi());
        tamuA022.setKotaLahir("Beijing");
        tamuA022.setTanggalLahir(LocalDate.of(1990,11,11));
        return tamuA022;
    }

    public static Tamu tamuA023(){
        Tamu tamuA023 = new Tamu();
        tamuA023.setNomorRegister("A023");
        tamuA023.setNamaDepan("Sunarti");
        tamuA023.setNamaBelakang("Wijaya");
        tamuA023.setNoIdentitas("312007023111990003");
        tamuA023.setJenisKelamin(JenisKelamin.P.getDeskripsi());
        tamuA023.setKotaLahir("Bandung");
        tamuA023.setTanggalLahir(LocalDate.of(1985,4,18));
        return tamuA023;
    }

    public static Tamu tamuA024(){
        Tamu tamuA024 = new Tamu();
        tamuA024.setNomorRegister("A024");
        tamuA024.setNamaDepan("Ardi");
        tamuA024.setNamaBelakang("Sanjaya");
        tamuA024.setNoIdentitas("312008901081990017");
        tamuA024.setJenisKelamin(JenisKelamin.L.getDeskripsi());
        tamuA024.setKotaLahir("Jakarta");
        tamuA024.setTanggalLahir(LocalDate.of(1985,8,1));
        return tamuA024;
    }

    public static Tamu tamuA025(){
        Tamu tamuA025 = new Tamu();
        tamuA025.setNomorRegister("A025");
        tamuA025.setNamaDepan("Muliawan");
        tamuA025.setNamaBelakang("Sanjaya");
        tamuA025.setNoIdentitas("312008566010200089");
        tamuA025.setJenisKelamin(JenisKelamin.L.getDeskripsi());
        tamuA025.setKotaLahir("Jakarta");
        tamuA025.setTanggalLahir(LocalDate.of(2000,10,10));
    return tamuA025;
    }

    public static Tamu tamuA026(){
        Tamu tamuA026 = new Tamu();
        tamuA026.setNomorRegister("A026");
        tamuA026.setNamaDepan("Tirta");
        tamuA026.setNamaBelakang("Raharja");
        tamuA026.setNoIdentitas("31200344014101988334");
        tamuA026.setJenisKelamin(JenisKelamin.L.getDeskripsi());
        tamuA026.setKotaLahir("Jakarta");
        tamuA026.setTanggalLahir(LocalDate.of(1988,10,14));
    return tamuA026;
    }

    public static Kamar kamar301(){
        Kamar kamar301 = new Kamar();
        kamar301.setKodeKamar(301);
        kamar301.setLantai(Lantai.TIGA.getDeskripsi());
        kamar301.setTipe(TipeKamar.RSB.getDeskripsi());
        kamar301.setHarga(new BigDecimal(800000));
    return kamar301;
    }

    public static Kamar kamar302(){
        Kamar kamar302 = new Kamar();
        kamar302.setKodeKamar(302);
        kamar302.setLantai(Lantai.TIGA.getDeskripsi());
        kamar302.setTipe(TipeKamar.RDB.getDeskripsi());
        kamar302.setHarga(new BigDecimal(1000000));
        return kamar302;
    }

    public static Kamar kamar303(){
        Kamar kamar303 = new Kamar();
        kamar303.setKodeKamar(303);
        kamar303.setLantai(Lantai.TIGA.getDeskripsi());
        kamar303.setTipe(TipeKamar.RTB.getDeskripsi());
        kamar303.setHarga(new BigDecimal(1200000));
        return kamar303;
    }

    public static Kamar kamar401(){
        Kamar kamar401 = new Kamar();
        kamar401.setKodeKamar(401);
        kamar401.setLantai(Lantai.EMPAT.getDeskripsi());
        kamar401.setTipe(TipeKamar.VSB.getDeskripsi());
        kamar401.setHarga(new BigDecimal(1000000));
        return kamar401;
    }

    public static Kamar kamar402(){
        Kamar kamar402 = new Kamar();
        kamar402.setKodeKamar(402);
        kamar402.setLantai(Lantai.EMPAT.getDeskripsi());
        kamar402.setTipe(TipeKamar.VDB.getDeskripsi());
        kamar402.setHarga(new BigDecimal(1200000));
        return kamar402;
    }

    public static Kamar kamar403(){
        Kamar kamar403 = new Kamar();
        kamar403.setKodeKamar(403);
        kamar403.setLantai(Lantai.EMPAT.getDeskripsi());
        kamar403.setTipe(TipeKamar.VTB.getDeskripsi());
        kamar403.setHarga(new BigDecimal(1400000));
        return kamar403;
    }

    public static List<Tamu> tamuMenginap301(){
        List<Tamu> tamuMenginap301 = new LinkedList<>();
        tamuMenginap301.add(tamuA021());
        tamuMenginap301.add(tamuA022());
        return tamuMenginap301;
    }

    public static List<Tamu> tamuMenginap302(){
        List<Tamu> tamuMenginap302 = new LinkedList<>();
        tamuMenginap302.add(tamuA024());
        tamuMenginap302.add(tamuA025());
        tamuMenginap302.add(tamuA023());
        return tamuMenginap302;
    }

    public static List<Tamu> tamuMenginap401(){
        List<Tamu> tamuMenginap401 = new LinkedList<>();
        tamuMenginap401.add(tamuA026());
        return tamuMenginap401;
    }

    public static PesanKamar historiReservasi301(){
        PesanKamar pesanKamar301 =new PesanKamar();
        pesanKamar301.setKamar(kamar301());
        pesanKamar301.setTanggalCheckIn(LocalDate.of(2018,4,12));
        pesanKamar301.setTanggalCheckOut(LocalDate.of(2018,4,14));
        pesanKamar301.setListTamu(tamuMenginap301());
        return pesanKamar301;
    }

    public static PesanKamar historiReservasi302() {
        PesanKamar pesanKamar302 = new PesanKamar();
        pesanKamar302.setKamar(kamar302());
        pesanKamar302.setTanggalCheckIn(LocalDate.of(2018, 5, 15));
        pesanKamar302.setTanggalCheckOut(LocalDate.of(2018, 5, 17));
        pesanKamar302.setListTamu(tamuMenginap302());
        return pesanKamar302;
    }

    public static PesanKamar historiReservasi401() {
        PesanKamar pesanKamar401 = new PesanKamar();
        pesanKamar401.setKamar(kamar401());
        pesanKamar401.setTanggalCheckIn(LocalDate.of(2018, 5, 15));
        pesanKamar401.setTanggalCheckOut(LocalDate.of(2018, 5, 18));
        pesanKamar401.setListTamu(tamuMenginap401());
        return pesanKamar401;
    }

    public static List<PesanKamar> listInfoHistoryReservasi(){
        List<PesanKamar> listInfoHistoriPesanKamar = new LinkedList<>();
        listInfoHistoriPesanKamar.add(historiReservasi301());
        listInfoHistoriPesanKamar.add(historiReservasi302());
        listInfoHistoriPesanKamar.add(historiReservasi401());
        return listInfoHistoriPesanKamar;
    }

    public static List<Kamar> listSemuaKamar(){
        List<Kamar> listSemuaKamar = new LinkedList<>();
        listSemuaKamar.add(kamar301());
        listSemuaKamar.add(kamar302());
        listSemuaKamar.add(kamar303());
        listSemuaKamar.add(kamar401());
        listSemuaKamar.add(kamar402());
        listSemuaKamar.add(kamar403());
        return listSemuaKamar;
    }



}
