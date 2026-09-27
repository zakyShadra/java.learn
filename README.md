# Kantin Kampus Mini

Praktikum PBO Pertemuan 3 (Class and Object) — D3 Teknik Informatika, Politeknik Negeri Bandung.

Program Java sederhana yang mencatat pesanan menu kantin, dipakai untuk membuktikan konsep *class, object, encapsulation, constructor, static, relationship,* dan *package*. Tanpa database/GUI/library eksternal.

## Struktur

```
src/          kode program (package model & app)
eksperimen/   percobaan sengaja-gagal (private vs public, constructor, static, dll)
scripts/      skrip untuk regenerate bukti eksperimen
bukti/        output program + error compiler (hasil dari scripts/jalankan_bukti.sh)
laporan/      laporan praktikum lengkap (.docx)
```

## Menjalankan program

```bash
javac -d out $(find src -name "*.java")
java -cp out id.ac.polban.pbo.kantin.app.Main
```

## Regenerate bukti eksperimen

```bash
./scripts/jalankan_bukti.sh
```

Output ditulis ke `bukti/`.

## Laporan lengkap

Penjelasan konsep, tabel hasil uji, dan analisis eksperimen ada di [`laporan/Laporan_Praktikum_Pertemuan3.docx`](laporan/Laporan_Praktikum_Pertemuan3.docx).
