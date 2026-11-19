package id.ac.univpancasila.perpustakaan.exception;
<<<<<<< HEAD
/**
* TODO: lengkapi mengikuti pola BukuTidakDitemukanException.
* Exception ini membawa idAnggota.
*/
public class AnggotaTidakDitemukanException extends PerpustakaanException {
private final String idAnggota;
public AnggotaTidakDitemukanException(String idAnggota) {
super("Anggota dengan ID " + idAnggota + " tidak ditemukan");
this.idAnggota = idAnggota;
}
public String getIdAnggota(){
return this.idAnggota;
}
=======

/**
 * TODO: lengkapi mengikuti pola BukuTidakDitemukanException.
 * Exception ini membawa idAnggota.
 */
public class AnggotaTidakDitemukanException extends PerpustakaanException {
    private final String idAnggota;

    public AnggotaTidakDitemukanException(String idAnggota) {
        super("Anggota dengan ID " + idAnggota + " tidak ditemukan");
        this.idAnggota = idAnggota;
    }

    public String getIdAnggota() {
        return this.idAnggota;
    }
>>>>>>> 6bd22f1be7faaa8ae91bbcf58c6e36d3f16f62de
}