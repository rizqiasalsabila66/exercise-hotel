import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class PesanKamar {
    private LocalDate tanggalCheckIn;
    private LocalDate tanggalCheckOut;
    private List<Tamu> listTamu;
    private Kamar kamar;

    public LocalDate getTanggalCheckIn() {
        return tanggalCheckIn;
    }

    public void setTanggalCheckIn(LocalDate tanggalCheckIn) {
        this.tanggalCheckIn = tanggalCheckIn;
    }

    public LocalDate getTanggalCheckOut() {
        return tanggalCheckOut;
    }

    public void setTanggalCheckOut(LocalDate tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
    }

    public long durasiMenginap() {
        long rangeHari = ChronoUnit.DAYS.between(getTanggalCheckIn(), getTanggalCheckOut());
        return rangeHari;
    }

    public String biayaMenginap() {
        Locale Indonesia = new Locale("id", "ID");
        BigDecimal biayaMenginap = kamar.getHarga().multiply(BigDecimal.valueOf(durasiMenginap()));
        String rupiah = NumberFormat.getCurrencyInstance(Indonesia).format(biayaMenginap);
        return rupiah;
    }

    public List<Tamu> getListTamu() {
        return listTamu;
    }

    public void setListTamu(List<Tamu> listTamu) {
        this.listTamu = listTamu;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public void cetakHistoryKamar(int nomorKamar) {
        Locale Indonesia = new Locale("id", "ID");
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd MMMM yyyy", Indonesia);
        if (getKamar().getKodeKamar() == nomorKamar) {
            for (Tamu tamu : listTamu) {
                System.out.println(formatTanggal.format(getTanggalCheckIn()) + "-" +
                        formatTanggal.format(getTanggalCheckOut()) + "(" + tamu.getNamaDepan() + " " + tamu.getNamaBelakang() + "," + tamu.getNomorRegister() + ")");
            }
        }
    }

    public void cetakAnggotaKeluarga(String nomorRegristasi) {
            for (Tamu tamu : listTamu) {
                if (!tamu.getNomorRegister().equals(nomorRegristasi)) {
                    System.out.println(tamu.getNamaDepan() + " " + tamu.getNamaBelakang());
                }
            }
        }

    public void cetakDurasidanBiaya(String nomorRegistrasi) {
        System.out.println("Menginap selama: " + durasiMenginap()+" hari");
        System.out.println("Biaya penginapan: " + biayaMenginap());
    }

}


