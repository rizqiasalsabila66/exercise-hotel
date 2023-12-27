import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tamu extends Orang{
    private String nomorRegister;

    public String getNomorRegister() {
        return nomorRegister;
    }

    public void setNomorRegister(String nomorRegister) {
        this.nomorRegister = nomorRegister;
    }

    public void cetakInfoTamu(){
        Locale Indonesia = new Locale("id", "ID");
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd MMMM yyyy", Indonesia);
        System.out.println("First Name:"+this.getNamaDepan());
        System.out.println("Last Name:"+this.getNamaBelakang());
        System.out.println("Gender: "+this.getJenisKelamin());
        System.out.println("Birth Information: "+getKotaLahir()+", "+
                formatTanggal.format(this.getTanggalLahir())+" ("+this.hitungUmur()+" tahun)");
        System.out.println("ID Card: "+this.getNoIdentitas());

    }

}
