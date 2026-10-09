# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Saka Laksmana Harimurti |
| **NPM** | 4525210067 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | [05] - [Polimorfisme] |
| **Tanggal** | [Kamis 1 Oktober 2026] |

---

## 1. Implementasi Java

### 1.1. File: `BangunDatar.java`, `Lingkaran.java`, `Persegi.java`, `Segitiga.java`, `Trapesium.java`
**Penjelasan Kode:**
> `BangunDatar` berfungsi sebagai super-class polimorfik yang menyediakan deklarasi method `hitungLuas()` dan `hitungKeliling()`. Setiap kelas turunan mengimplementasikan rumus geometri masing-masing secara spesifik melalui *dynamic method dispatch* (pengikatan dinamis saat *runtime*).

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
![SS Before BangunDatar.java]

![alt text](img/image.png)

![alt text](img/image-1.png)

![alt text](img/image-2.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After BangunDatar.java]

![alt text](img/image-3.png)

![alt text](img/image-4.png)

![alt text](img/image-5.png)

![alt text](img/image-6.png)

![alt text](img/image-7.png)

### 1.2. File: `AntiPattern.java` & `AntiPatternRefaktor.java`
**Penjelasan Kode:**
> Membandingkan kode yang melanggar prinsip OOP (pemakaian pengondisian `if-else` / `switch-case` berantai bertipe `instanceof` untuk mengecek tipe objek) dengan versi yang telah direfaktor ke bentuk polimorfik murni, sehingga mematuhi *Open/Closed Principle* (OCP).

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
![SS Before AntiPattern]

![alt text](img/image-8.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After AntiPatternRefaktor]

![alt text](img/image-9.png)

![alt text](img/image-10.png)

### 1.3. File: `Main.java`
**Penjelasan Kode:**
> Menyimpan berbagai variasi objek bangun datar ke dalam sebuah array/koleksi bertipe heterogen `BangunDatar[]`, lalu melakukan iterasi satu kali untuk mengeksekusi perhitungan luas dan keliling tanpa perlu mengetahui tipe konkretnya secara manual.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Kesalahan kompilasi)*:
![SS Before Main.java]![alt text](img/image-11.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After Main.java]![alt text](img/image-12.png)

### Output
**Output Program:**
![Output Java]![alt text](img/image-13.png)

---

## 2. Implementasi PHP

### 2.1. File: `BangunDatar.php`
**Penjelasan Kode:**
> Mendefinisikan hierarki polimorfisme bangun datar di PHP. Kelas dasar `BangunDatar` mewariskan kontrak method ke kelas anak (`Persegi`, `Lingkaran`, dll.) yang mengkalkulasikan luas dan keliling berdasarkan parameter geometrisnya.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
![SS Before BangunDatar.php]![alt text](img/image-14.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After BangunDatar.php]![alt text](img/image-15.png)

### 2.2. File: `notifikasi.php` & `main.php`
**Penjelasan Kode:**
> Menunjukkan contoh polimorfisme pengiriman notifikasi (Email, SMS, Push Notification) serta eksekusi array polimorfis pada `main.php`.

**Bukti Eksekusi (Screenshot):**
* **Before** *(Kondisi awal / Galat logika)*:
![SS Before main.php]

![alt text](img/image-16.png)

![alt text](img/image-17.png)

* **After** *(Kondisi akhir / Eksekusi berhasil)*:
![SS After main.php]

![alt text](img/image-18.png)

![alt text](img/image-19.png)

### Output
**Output Program:**
![Output PHP]![alt text](img/image-20.png)

---

## 3. Kesimpulan
> Polimorfisme memungkinkan pemanggilan metode umum pada antarmuka/kelas induk di mana perilaku yang dieksekusi ditentukan oleh objek konkret saat *runtime*. Pendekatan ini mengeliminasi pemeriksaan tipe manual (*anti-pattern*) dan membuat sistem jauh lebih modular dan mudah diperluas (*extensible*).