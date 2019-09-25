package id.co.silmiazdkiatul.athqia;

import java.util.ArrayList;

public class RasulData {
    public static String[][] data = new String[][]{
            {
                    "Nabi Nuh a.s",
                    "Rasul Ulul ‘Azmi Ke-1",
                    "https://upload.wikimedia.org/wikipedia/commons/c/c9/Nuh_%28Noah%291.png",
                    "Nabi Nuh a.s adalah nabi yang menempati urutan ke tiga dalam daftar nama 25 nabi. Beliau adalah keturunan yang kesepuluh dari Nabi Adam a.s. Nabi Nuh a.s. mempunyai ketabahan dan kesabaran dalam menyebarkan dan mensyiarkan ajaran Allah swt.",
                    "Najiyullah atau Habibullah",
                    "Dikabulkan do'a ketika beliau meminta diturunkan azab untuk kaumnya"
            },
            {
                    "Nabi Ibrahim a.s",
                    "Rasul Ulul ‘Azmi-2",
                    "https://upload.wikimedia.org/wikipedia/commons/3/33/Ibrahim_%28Abraham%291.png",
                    "Nabi Ibrahim a.s. ini adalah seorang putra dari Azar bin Nahur, beliau merupakan keturunan dari Nabi Nuh a.s. Ayahnya yang bernama Azar, adalah seorang pembuat patung berhala yang sering dijadikan sesembahan oleh masyarakat sekitar pada waktu itu.",
                    "Khalilullah",
                    "Tidak hangus dibakar api."
            },
            {
                    "Nabi Musa a.s",
                    "Rasul Ulul ‘Azmi Ke-3",
                    "https://upload.wikimedia.org/wikipedia/commons/9/97/Musa_%28Moses%291.png",
                    "Nabi Musa a.s., ini merupakan putra dari Imran, beliau adalah keturunan Bani Israil, yang dilahirkan di Mesir. Kelahiran beliau pada waktu itu adalah ketika Raja Fir’aun masih memegang kuasanya.",
                    "Kalimullah",
                    "Diturunkannya Kitab Taurat"
            },
            {
                    "Nabi Isa a.s",
                    "Rasul Ulul ‘Azmi Ke-4",
                    "https://upload.wikimedia.org/wikipedia/commons/b/bc/Isa_%28Jesus%291.png",
                    "Nabi Isa a.s. ini adalah putra Maryam. Dengan kuasa dan izin dari Allah swt., beliau dilahirkan tanpa perantara seorang ayah. Ibunda Maryam terkenal dengan perempuan yang taat beribadah, shaleh serta terpelihara dari perbuatan-perbuatan dosa.",
                    "Al-Masih",
                    "Diturunkannya Kitab Injil"
            },
            {
                    "Nabi Muhammad saw",
                    "Rasul Ulul ‘Azmi Ke-5",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3d/Muhammad2.png",
                    "Nabi Muhammad saw. adalah anak dari seorang ayah yang bernama Abdullah bin Abdul Muthallib dan ibu yang bernama Aminah binti Wahab. Bertepatan pada tanggal 12 Rabi’ul Awal pada tahun Gajah. Beliau berasal dari salah satu suku terkenal yang terkenal di kota Makkah , yakni suku Quraisy.",
                    "Rasulullah dan Al-Amin",
                    "Diturunkannya Al-Qur'an secara berangsur-angsur"
            }
    };
    public static ArrayList<Rasul> getListData(){
        Rasul rasul = null;
        ArrayList<Rasul> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            rasul = new Rasul();
            rasul.setName(data[i][0]);
            rasul.setRemarks(data[i][1]);
            rasul.setPhoto(data[i][2]);
            rasul.setDeskripsi(data[i][3]);
            rasul.setGelar(data[i][4]);
            rasul.setMukjizat(data[i][5]);

            list.add(rasul);
        }

        return list;
    }
}
