Otobüs Bilet Otomasyonu

Bu proje, otobüs koltuk rezervasyon ve yönetim sistemidir. Sistem, admin paneli ve kullanıcı arayüzü olmak üzere iki ana bileşenden oluşmaktadır.

## Özellikler

### Admin Paneli
- Sefer ekleme, düzenleme ve silme
- Yolcu bilgilerini düzenleme ve silme
- Sefer yönetimi
- Güvenli giriş sistemi

### Kullanıcı Arayüzü
- Otobüs koltuk rezervasyon sistemi
- Cinsiyet bazlı koltuk yerleşimi
- Sefer görüntüleme ve bilet alma
- Kullanıcı dostu arayüz

## Teknik Detaylar

### Kullanılan Teknolojiler
- Java SE 22
- Swing GUI Framework
- MariaDB Veritabanı
- JGoodies Forms (UI Bileşenleri)

### Proje Yapısı
```
src/
├── Admin/         # Admin paneli bileşenleri
├── Model/         # Veri modelleri
├── View/          # Kullanıcı arayüzü bileşenleri
└── Helper/        # Yardımcı sınıflar
```

## Kurulum

1. Java SE 22 JDK'yı yükleyin
2. MariaDB veritabanını kurun
3. Projeyi Eclipse IDE'de açın
4. Gerekli kütüphaneleri ekleyin:
   - com.jgoodies.common_1.8.1
   - com.jgoodies.forms_1.9.0
   - mariadb-java-client-3.5.1

## Çalıştırma

1. `src/View/GirisGUI.java` dosyasını çalıştırarak uygulamayı başlatın
2. Admin paneline erişmek için `src/Admin/MainAdminImplementation.java` dosyasını çalıştırın

## Veritabanı Yapılandırması

MariaDB veritabanı kullanılmaktadır. Veritabanı bağlantı ayarlarını `Helper/DatabaseConnection.java` dosyasından yapılandırabilirsiniz.

## Lisans

Bu proje özel kullanım için geliştirilmiştir. Tüm hakları saklıdır. 