# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Saka Laksmana Harimurti |
| **NPM** | 4525210067 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | [06] - [ Abstract Class, Interface, dan Enum ] |
| **Tanggal** | [Kamis 8 Oktober 2026] |

---

## 1. Implementasi Java

### 1.1. File: `Kendaraan.java`, `Movable.java`, `Fuelable.java`
**Penjelasan Kode:**
> `Kendaraan` dirancang sebagai *abstract class* yang mendefinisikan atribut umum dan metode abstrak yang wajib dioverride. `Movable` dan `Fuelable` adalah antarmuka (*interface*) yang menetapkan kontrak kemampuan berpindah (`bergerak()`) dan pengisian bahan bakar (`isiBahanBakar()`).

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
![SS Before Kendaraan/Interfaces]

![alt text](img/image.png)

![alt text](img/image-1.png)

![alt text](img/image-2.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After Kendaraan/Interfaces]

![alt text](img/image-6.png)

![alt text](img/image-7.png)

![alt text](img/image-8.png)

### 1.2. File: `TipeBahanBakar.java`, `Mobil.java`, `Sepeda.java`
**Penjelasan Kode:**
> `TipeBahanBakar` adalah tipe `enum` untuk membatasi opsi bahan bakar (misal: BENSIN, DIESEL, LISTRIK). Kelas `Mobil` mewarisi `Kendaraan` serta mengimplementasikan `Movable` dan `Fuelable`. Sementara itu, `Sepeda` hanya mewarisi `Kendaraan` dan `Movable` karena tidak menggunakan bahan bakar minyak.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
![SS Before Mobil/Sepeda/Enum]

![alt text](img/image-3.png)

![alt text](img/image-4.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After Mobil/Sepeda/Enum]

![alt text](img/image-9.png)

![alt text](img/image-10.png)

![alt text](img/image-11.png)

### 1.3. File: `Main.java`
**Penjelasan Kode:**
> Menguji pembuatan objek `Mobil` dan `Sepeda`, memastikan abstraksi bekerja (mencegah instansiasi langsung dari abstract class `Kendaraan`), serta menjalankan method-method interface dan pencetakan nilai `enum`.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
![SS Before Main.java]![alt text](img/image-5.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After Main.java]![alt text](img/image-12.png)

### Output
**Output Program:**
![Output Java]![alt text](img/image-13.png)

---

## 2. Implementasi PHP

### 2.1. File: `abstraksi.php`
**Penjelasan Kode:**
> Mengimplementasikan kata kunci `abstract class`, `interface`, serta fitur native `enum` di PHP 8.1+. Kelas turunan mengonfirmasi kontrak antarmuka yang dideklarasikan dengan tipe data kembalian yang ketat.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
![SS Before abstraksi.php]![alt text](img/image-14.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After abstraksi.php]![alt text](img/image-15.png)

### 2.2. File: `main.php`
**Penjelasan Kode:**
> Titik masuk pengujian script PHP untuk menguji fungsionalitas abstract class dan implementasi interface pada objek konkret kendaraan.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
![SS Before main.php]![alt text](img/image-17.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After main.php]![alt text](img/image-16.png)

### Output
**Output Program:**
![Output PHP]![alt text](img/image-18.png)

---

## 3. Kesimpulan
> *Abstract Class* digunakan untuk mendefinisikan cetak biru dasar yang sebagian implementasinya dibagi ke kelas anak, sedangkan *Interface* mendefinisikan kontrak perilaku murni yang dapat diimplementasikan oleh kelas apa pun tanpa memandang silsilah pewarisan (*multiple interface implementation*). Tipe *Enum* melengkapi rancangan dengan menyediakan nilai konstan berjenis diskrit yang aman (*type-safe*).