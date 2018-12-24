package mobile.tubes.polinema.com.tubesandro;

public class Resep {
    private String nama_meme;
    private String detail_meme;
    private String rating_meme;
    private int gambar_meme;

    public static final Resep[] resepmeme = {
            new Resep("Rendang", "Hidangan khas lebaran di Indonesia yang banyak dicari adalah rendang daging dan opor ayam. Keduanya adalah pasangan tepat untuk ketupat atau lontong yang pas disantap sebelum sholat Idul Fitri dan sesudahnya.", "Bahan : \n " +
                    "½ kg daging sapi cicang \n" +
                    "2 sachet santan instan cair ukuran 130 ml \n " +
                    "larutkan dengan air 2 gelas \n" +
                    " 1 batang serai geprek\n" +
                    " 3 lembar daun jeruk", R.drawable.rendang ),
            new Resep("Gulai Kambing", "Terdapat cukup banyak daging yang sebenarnya dapat diolah menjadi aneka masakan lezat, salah satunya adalah kambing. Olahan masakan daging kambing ini pun memiliki banyak ragam, salah satunya adalah gulai.","Bahan : \n" +
                    "1 butir bawang Bombay yang telah diiris tipis, \n " +
                    "2 lembar daun salam \n" +
                    " 2 lembar daun jeruk, \n " +
                    "1 batang serai geprek \n " +
                    "2 butir cengkeh, \n " +
                    "3 cm kayu manis \n " +
                    "Air bersih secukupnya \n " +
                    "500ml santan kental \n " +
                    "Penyedap rasa \n  " +
                    "Minyak secukupnya", R.drawable.gulai ),
            new Resep("Soto Ayam Lamongan", "Soto Ayam Lamongan merupakan masakan nusantara yang sangat terkenal di seluruh pelosok negeri ini. Dengan rasa yang enak dan lezat tak heran jika soto Lamongan disukai banyak masyarakat.","Bahan :\n " +
                    "11 kg ayam\n" +
                    "2 ½ ltr air\n" +
                    "7 siung bawang putih\n" +
                    "13 siung bawang merah\n" +
                    "2 cm jahe\n" +
                    "2 cm kunyit (bakar)\n" +
                    "3 btr kemiri (sangrai)\n" +
                    "1 cm lengkuas (geprek)\n" +
                    "4 lbr daun salam \n" +
                    "2 btg sereh (geprek)\n" +
                    "3 lbr daun jeruk\n" +
                    "1 sdt garam", R.drawable.sotolamongan ),
            new Resep("Ayam Betutu Bali", "Ayam adalah bahan makanan yang bisa diolah dengan berbagai cara. Menu ayam betutu khas Bali juga bisa dimasak dengan berbagai cara. Salah satunya adalah dimasak dalam bentuk kuah. Bumbu-bumbunya terasa dalam kuahnya yang segar dan lezat.\n","Bahan : \n 1 ekor ayam kampung\n" +
                    "1 buah jeruk nipis, ambil airnya\n" +
                    "Garam secukupnya\n" +
                    "Minyak kelapa\n" +
                    "4 batang serai yang dikeprek\n" +
                    "2½ – 5 gelas air\n" +
                    "1 sdt ketumbar sangrai dan terasi bakar\n" +
                    "½ sendok teh merica hitam sangrai\n" +
                    "4 butir kemiri sangrai\n" +
                    "2 ruas jari jahe\n" +
                    "2 ruas jari kencur\n" +
                    "2 ruas jari kunyit bakar\n" +
                    "2 ruas jari lengkuas\n" +
                    "6 cabai rawit hijau", R.drawable.ayambetutu ),
            new Resep("Gudeg Jogjakarta", "Gudeg atau olahan masakan nangka muda yang merupakan ciri khas kuliner yogyakarta memag sangat spesial, kini makanan ini sudah terkenal keberbagai daerah indonesia, bahkan orang luar negeri pun sudah mengenal makanan yang sangat enak dan lezat ini.","Bahan : \n 1 kg nangka muda, potong kecil\n" +
                    "5 butir telur, yang sudah matang direbus\n" +
                    "100 grm gula merah, sisir halus\n" +
                    "1 ½ lter santan kelapa kental\n" +
                    "1 lter air buah kelapa, murni\n" +
                    "3 lembar daun salam, agak muda\n" +
                    "5 cm lengkuas utuh\n" +
                    "Daun jati secukupnya, untuk alas dan campuran rebusan" , R.drawable.gudeg ),
            new Resep("Rujak Cingur", "Makanan yang satu ini konon katanya berasal dari kota Surabaya kota pahlawan di Jawa Timur. Makanan yang satu ini banyak di kita temukan di kota pahlawan ini namun saat ini makanan yang satu ini sudah merambah ke pelosok hingga kota di seluruh Indonesia.","Bahan : \n 300 gram cingur\n" +
                    "60 gram kangkung rebus\n" +
                    "60 gram tempe goreng\n" +
                    "60 gram taoge yang sudah matang\n" +
                    "60 gram tahu goreng\n" +
                    "100 gram kacang panjang\n" +
                    "1 buah mentimun\n" +
                    "60 gram buah mangga\n" +
                    "60 gram buah bengkoang", R.drawable.rujakcingur ),
            new Resep("Rawon", "Rawon adalah salah satu resep masakan sup asli nusantara yang unik dengan warna yang hitam atau black soup. Berbeda dengan resep masakan sup daging atau soto sapi lainnya yang berwarna coklat atau kuning tua, resep yang ini memang berwarna hitam manis.","Bahan : \n " +
                    "Bahan utama adalah daging sapi yang sudah dipotong kotak dan dicuci bersih kurang lebih sebanyak 1000 gram. \n" +
                    "Batang sereh kurang lebih sebanyak 2 pcs. Cuci bersih lalu memarkan sebelum dipakai.\n" +
                    "Daun jeruk yang sudah dicuci bersih kurang lebih sebanyak 10 pcs.\n" +
                    "Garam dapur, Garam secukupnya sesuai selera.\n" +
                    "Minyak goreng secukupnya untuk menumis bumbu rawon", R.drawable.rawon ),

    };
    public Resep(String nama, String detail, String rating,int gambar){
        this.nama_meme = nama;
        this.detail_meme = detail;
        this.rating_meme = rating;
        this.gambar_meme = gambar;
    }

    public String getDetail_meme() {
        return detail_meme;
    }

    public String getNama_meme() {
        return nama_meme;
    }

    public String getRating_meme() {
        return rating_meme;
    }

    public int getGambar_meme() { return gambar_meme; }

    @Override
    public String toString() {
        return this.nama_meme;
    }
}
