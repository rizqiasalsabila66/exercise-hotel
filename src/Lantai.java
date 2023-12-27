public enum Lantai {
    SATU (1),
    DUA (2),
    TIGA(3),
    EMPAT(4);

    private int deskripsi;

    Lantai(int isi)
    {
        this.deskripsi=isi;
    }

    public int getDeskripsi() {
        return deskripsi;
    }

}
