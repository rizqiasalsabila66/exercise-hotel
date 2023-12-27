public enum TipeKamar {
    RSB("Regular single bed"),
    RDB("Regular double bed"),
    RTB("Regular twin bed"),
    VSB("VIP single bed"),
    VDB("VIP double bed"),
    VTB("VIP twin bed");
    private String deskripsi;

    TipeKamar(String isi)//konstractor enum
    {
        this.deskripsi=isi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

}
