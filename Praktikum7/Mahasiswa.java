package Praktikum7;


public class Mahasiswa {
    // Atribute
    private String nama;
    private int nim;
    private Gender gender;
    private Jurusan jurusan;
    private String kelas;
    private Dosen dosen;


    public void infoMahasiswa(){
        System.out.println("Berikut Data Mahasiswa :");
        System.out.println("NAMA \t\t\t:"+getNama());
        System.out.println("JENIS KELAMIN \t:"+gender.getJenisKelamin());
        System.out.println("KELAS \t\t\t:"+getKelas());
        System.out.println("NIM \t\t\t:"+getNim());
        System.out.println("JURUSAN \t\t:"+jurusan.getJurusan());
        // Asosiasi/use a dari class Dosen
        System.out.println("MATA KULIAH \t:"+getDosen().getMengajar());
        System.out.println("\n===================================\n");

    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }
    public int getNim() {
        return nim;
    }

    // Constructor class Mahasiswa
    public Mahasiswa(String nama, String kelas, int nim, Gender gender){
        this.nama = nama;
        this.kelas =kelas;
        this.nim = nim;
        this.gender = gender;
        jurusan= new Jurusan("Teknik informatika");
    }

}