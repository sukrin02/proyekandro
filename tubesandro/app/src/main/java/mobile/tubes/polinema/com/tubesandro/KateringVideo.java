package mobile.tubes.polinema.com.tubesandro;

import com.google.firebase.auth.FirebaseAuth;

public class KateringVideo {
    private String nama;
    private String durasi;
    private String videoRawId;
    FirebaseAuth firebaseAuth;

    // Array nama sinetron di kategori drama
    public static final KateringVideo[] drama = {

            new KateringVideo("Video Profile 1",
                    "4:12",
                    "sample_video_1"),
            new KateringVideo("Video Profile 2",
                    "3:22",
                    "sample_video_2"),


    };

    // Setiap data punya nama, deskripsi, dan gambar
    private KateringVideo(String nama, String durasi, String videoRawId) {
        this.nama = nama;
        this.durasi = durasi;
        this.videoRawId = videoRawId;
    }
    public String getNama() {
        return nama;
    }
    public String getDurasi() {
        return durasi;
    }
    public String getVideoRawId() {
        return videoRawId;
    }
    public String toString() {
        return this.nama;
    }

}
