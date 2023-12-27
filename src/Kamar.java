import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Kamar {
    private int kodeKamar;
    private int lantai;
    private String tipe;
    private BigDecimal harga;

    public BigDecimal getHarga() {
        return harga;

    }

    public int getKodeKamar() {
        return kodeKamar;
    }

    public void setKodeKamar(int kodeKamar) {
        this.kodeKamar = kodeKamar;
    }

    public int getLantai() {
        return lantai;
    }

    public void setLantai(int lantai) {
        this.lantai = lantai;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public void cetakInfoKamarTamu(){
        System.out.println("Room Number: "+this.getKodeKamar());
        System.out.println("Floor: "+this.getLantai());
        System.out.println("Room Type: "+getTipe());
    }

    public void cetakInfoKmaarLengkap(){
        cetakInfoKamarTamu();
        Locale Indonesia = new Locale("id", "ID");
        String rupiah = NumberFormat.getCurrencyInstance(Indonesia).format(this.getHarga());
        System.out.println("Price: "+rupiah);
    }

}
