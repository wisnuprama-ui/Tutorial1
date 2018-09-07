public class Mahasiswa {
  private String nama;
  private String npm;

  Mahasiswa(String nama, String npm) {
    this.nama = nama;
    this.npm = npm;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNpm(String npm) {
    this.npm = npm;
  }

  public String getNama() {
    return this.nama;
  }

  public String getNpm() {
    return this.npm;
  }
}
