package com.bardizba.rockbandcatalog.Model;

import android.util.Log;

import com.bardizba.rockbandcatalog.R;

import org.json.JSONArray;
import org.json.JSONException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class allBand {
    private ArrayList<Band> bands;



    private String[][] genre = {
            {
                    "Funk Rock",
                    "Alternatif Rock",
                    "Funk Metal",
            },
            {
                    "Alternatif rock",
                    "grunge",
            },
            {
                    "Rock blues",
                    "Blues rock",
                    "Rock n Roll",
            },
            {
                    "Hard rock",
                    "blues rock",
                    "folk rock"
            },
            {
                    "Rock",
            },
            {
                    "Rock",
                    "Pop",
                    "Psychedelia",
            },
            {
                    "Hard rock",
                    "Heavy Metal",
            },
            {
                    "Hard Rock",
                    "Heavy Metal",
                    "Progressive Rock",
            },
            {
                    "Heavy metal",
                    "Progressive metal",
                    "Hard Rock"
            },
            {
                    "Alternatif rock",
                    "Nu metal",
                    "Alternative metal"
            },
    };

    private String[] label = {
            "Capitol EMI Warner Bros.",
            "Sub Pop DGC",
            "Rolling Stones",
            "Swan Song",
            "EMI",
            "Capitol",
            "Black Frog",
            "EMI",
            "Capitol",
            "Warner Bros.",
    };

    private String[] city_nick = {
            "LA",
            "Aberdeen",
            "London",
            "London",
            "London",
            "Liverpool",
            "LA",
            "Hertford",
            "Huntington Beach",
            "Agoura Hills",
    };

    private String[] city_full = {
            "🇺🇸 Los Angeles, California, US",
            "🇺🇸 Aberdeen, Washington, US",
            "🇬🇧 London, United Kingdom",
            "🇬🇧 London, United Kingdom",
            "🇬🇧 London, United Kingdom",
            "🇬🇧 Liverpool, United Kingdom",
            "🇺🇸 Los Angeles, California, US",
            "🇬🇧 Hertford, Hertfordshire, United Kingdom",
            "🇺🇸 Huntington Beach, California, US",
            "🇺🇸 Agoura Hills, California, US",
    };

    private String[][] spotify = {
            {
                "https://open.spotify.com/track/48UPSzbZjgc449aqz8bxox?si=8bWmk4qpSp-cNUg9H1pgnQ",
                "https://open.spotify.com/track/1G391cbiT3v3Cywg8T7DM1?si=iDAk70jHRCSss0WZ8VMZYw",
                "https://open.spotify.com/track/3d9DChrdc6BOeFsbrZ3Is0?si=vgwe_noxTay13f47p1kRyg"
            },
            {
                    "https://open.spotify.com/track/1f3yAtsJtY87CTmM8RLnxf?si=Od8RXybnTdij7HJWqYhF4w",
                    "https://open.spotify.com/track/0MKGH8UMfCnq5w7nG06oM5?si=mkqaPWISTDecPKkv51PD6A",
                    "https://open.spotify.com/track/0eeEzvw5Etwv6tyz2PyE6L?si=5BoIS5_GQ3eGfmT5vlqLTg",
            },
            {
                    "https://open.spotify.com/track/2PzU4IB8Dr6mxV3lHuaG34?si=Y3Oz0edHTtafsel0pagSLQ",
                    "https://open.spotify.com/track/63T7DJ1AFDD6Bn8VzG6JE8?si=SRY7YMp1RP6r8Rg2Q5uSqQ",
                    "https://open.spotify.com/track/61UuPxxYUvacEH6SHIK3sU?si=RGAthpS7RvWHAzKYvbM74w",
                    "https://open.spotify.com/track/55LRDFmsuazr533WrtHHW9?si=8lE1YApRQbOYAL8L-G-7wA",
                    "spotify:track:2tiT6VFvne2Px8aV62sYBF",
            },
            {
                    "https://open.spotify.com/track/2tiT6VFvne2Px8aV62sYBF?si=w28s-durTviwhLId2YbxEQ",
                    "https://open.spotify.com/track/0hCB0YR03f6AmQaHbwWDe8?si=PAo2k6TMQCC__N3CDWp_mg",
                    "https://open.spotify.com/track/3qT4bUD1MaWpGrTwcvguhb?si=rkNOmANCQ2eHbn6SsS7A2g",
                    "https://open.spotify.com/track/3MODES4TNtygekLl146Dxd?si=sqn6uBoAQ0mjylxKKuPk9g",
            },
            {
                    "https://open.spotify.com/track/3z8h0TU7ReDPLIbEnYhWZb?si=fw4sAGUdQXmNmmdruLfrJw",
                    "https://open.spotify.com/track/07g3QpOdaG7kMQUqreh6vn?si=_mpUdkq4TPipKio2eXGqNQ",
                    "https://open.spotify.com/track/4pbJqGIASGPr0ZpGpnWkDn?si=uxjO82_7Sf-gwqD870Ut_w",
                    "https://open.spotify.com/track/7iAqvWLgZzXvH38lA06QZg?si=ipCn5C96RXGqk19609RoOg",
                    "https://open.spotify.com/track/1lCRw5FEZ1gPDNPzy1K4zW?si=DGkQKqnHReORbXUoH5PGKg",
            },
            {
                    "https://open.spotify.com/track/3BQHpFgAp4l80e1XslIjNI?si=eqiYf_L_R1OkGHuyDXB23g",
                    "https://open.spotify.com/track/7iN1s7xHE4ifF5povM6A48?si=cT38EYtrQiWGt0-ZpvZCGw",
                    "https://open.spotify.com/track/4pbG9SUmWIvsROVLF0zF9s?si=ZmwXDfonTueEsMNpbu_ljA",
                    "https://open.spotify.com/track/48JM82SHQTBYkhEYhMaOaa?si=m2K6OZIRQwyvabcgLKKrsw",
                    "https://open.spotify.com/track/7DD7eSuYSC5xk2ArU62esN?si=OLZzITEpTv2zj1wUDV9dOg",
                    "https://open.spotify.com/track/0hKRSZhUGEhKU6aNSPBACZ?si=nf0bNHHwTemtrUYlOYZZ_w",
                    "https://open.spotify.com/track/5ZBeML7Lf3FMEVviTyvi8l?si=usbnLHiZQEm5IigI5Z18KQ",
            },
            {
                    "https://open.spotify.com/track/4Qvl8lDGiRb0RHu5uiDhlg?si=OzCPT8goTky5i_dtXf0tDA",
                    "https://open.spotify.com/track/3YRCqOhFifThpSRFJ1VWFM?si=lTfNuwy7QL2M6hf2Sq1t-Q",
                    "https://open.spotify.com/track/0bVtevEgtDIeRjCJbK3Lmv?si=OwdhgFDzQkGuUE1vCwG6Yw",
                    "https://open.spotify.com/track/3YBZIN3rekqsKxbJc9FZko?si=N4Nfk8hxTuCn7hUH-nThTA",
            },
            {
                    "https://open.spotify.com/track/7uRcUUmZpU4YVZFNVZnyXd?si=Kx8b4XgrQdq4b_jjtf9jLA",
                    "https://open.spotify.com/track/2GgxS8bUT5G25QJTsfSv0R?si=y6blh4r4TIG5wpIVLZ82SA",
                    "https://open.spotify.com/track/3uMmllZo1AfoEnVT4ENCD3?si=5E8Ka7lbT2KUNopnyZg-oQ",
            },
            {
                    "https://open.spotify.com/track/2FML7gk7ac6quGFIjvkDb3?si=cm-BCbY9RMimNYLskzOD8Q",
                    "https://open.spotify.com/track/5anCkDvJ17aznvK5TED5uo?si=DK9EzzUsSjegbRHSSTXxZQ",
                    "https://open.spotify.com/track/1vl4jCsTEs8basRO7pKQ7f?si=w4bUYh5mRD2TpOaRh2QM-g",
                    "https://open.spotify.com/track/3sHH7lklbfpcraDDvYnjo7?si=wbbaIAdBRJyJkB70NmS3tg",
                    "https://open.spotify.com/track/7zAt4tdL44D3VuzsvM0N8n?si=fxlQ2u4vTQ6JPAnlk4kYKg",
                    "https://open.spotify.com/track/4DNgNHrnHA1KibPnmtE1WI?si=rNBkgbY9QlusFTSFaA0WAg",
            },
            {
                    "https://open.spotify.com/track/2nLtzopw4rPReszdYBJU6h?si=frFd8ScqSjKeAXY5jkdxoQ",
                    "https://open.spotify.com/track/3dxiWIBVJRlqh9xk144rf4?si=tjcCICtBRv6borpS7SVIvQ",
                    "https://open.spotify.com/track/1EU3VuKGZOvd1HTkxLPUXK?si=x6H69MIERN-PVV11-ed4Rw",
                    "https://open.spotify.com/track/18lR4BzEs7e3qzc0KVkTpU?si=kYPhbSMZRG2lMSpQegEfaw",
                    "https://open.spotify.com/track/7nAfXgeHfDO50upcOjJOaq?si=ZdbSgVJuTzGR5lS4ezTeJg",
            },
    };

    private String[][] best_songs = {
            {
                    "Californication",
                    "Scar Tissue",
                    "Under The Bridge",
            },
            {
                    "Smells Like Teen Spirit",
                    "Come As You Are",
                    "In Bloom dan Breed.",
            },
            {
                    "(I Can't Get No) Satisfaction",
                    "Paint It Black",
                    "Brown Sugar",
                    "Jumpin' Jack Flash",
                    "Sympathy of the Devil dan lain-lain.",
            },
            {
                    "Kashmir",
                    "Whole Lotta Love",
                    "Black Dog",
                    "Ramble On",
            },
            {
                    "Bohemian Rhapsody",
                    "Love of My Life",
                    "We Will Rock You",
                    "I Want to Break Free",
                    "We are the Champions",
            },
            {
                    "Yesterday",
                    "Let It Be",
                    "I Want to Hold Your Hands",
                    "She Loves You",
                    "Help",
                    "A Day in the Life",
                    "Twist and Shout",
            },
            {
                    "Sweet Child O'Mine",
                    "November Rain",
                    "Welcome to the Jungle",
                    "Paradise City",
            },
            {
                    "Soldier of fortune",
                    "Burn",
                    "Highway Star",
            },
            {
                    "Dear God",
                    "Hail to the king",
                    "So far away",
                    "Bat Country",
                    "Afterlife",
                    "Nightmare",
            },
            {
                    "Numb",
                    "Breaking the habit",
                    "No body Listening",
                    "What I've Done",
                    "Talking To Myself",
            },
    };

    private String[] article = {
        "Red Hot Chili Peppers adalah band rock punk Amerika yang dibentuk di Los Angeles pada " +
                "tahun 1983. Gaya musik kelompok ini terutama terdiri dari rock dengan penekanan " +
                "pada funk, serta elemen dari genre lain seperti punk rock dan psychedelic rock" +
                ".\n\nSaat dimainkan live, musik mereka menggabungkan unsur band jam karena " +
                "sifat improvisasi dari banyak penampilan mereka. Saat ini, band ini terdiri dari" +
                " anggota pendiri vokalis / rhythm gitaris Anthony Kiedis dan bassist Flea, " +
                "drummer lama Chad Smith, dan mantan gitaris tur Josh Klinghoffer.\n\nRed Hot " +
                "Chili Peppers adalah salah satu band terlaris sepanjang masa dengan lebih dari " +
                "80 juta rekaman terjual di seluruh dunia, telah dinominasikan untuk enam belas " +
                "Grammy Awards, di antaranya mereka telah memenangkan enam, dan merupakan band " +
                "paling sukses dalam sejarah radio rock alternatif, Saat ini memegang rekor untuk" +
                " single nomor satu terbanyak (13), minggu kumulatif paling banyak di nomor satu " +
                "(85) dan lagu paling top sepuluh (25) di chart Billboard Alternative Songs. Pada" +
                " tahun 2012, mereka dilantik menjadi Rock and Roll Hall of Fame.",

            "Nirvana adalah band rock Amerika yang dibentuk oleh penyanyi dan gitaris Kurt Cobain" +
                    " dan bassist Krist Novoselic di Aberdeen, Washington, pada tahun 1987. " +
                    "Nirvana berhasil melewati suksesi drumer, Dave Grohl yang terpanjang yang " +
                    "bergabung pada tahun 1990.\n\nMeskipun hanya merilis tiga lagu Album " +
                    "studio full-length dalam karir tujuh tahun mereka, Nirvana telah dianggap " +
                    "sebagai salah satu band alternatif yang paling berpengaruh dan penting dalam" +
                    " sejarah.\n\nMeskipun band ini bubar pada tahun 1994 setelah kematian " +
                    "Cobain, musik mereka mempertahankan pengikut populer dan terus mempengaruhi " +
                    "budaya rock and roll modern.",

            "Rolling Stones adalah band rock Inggris yang dibentuk di London, Inggris pada tahun " +
                    "1962. Rangkaian stabil pertama terdiri dari Brian Jones (gitar, harmonika), " +
                    "Mick Jagger (vokalis), Keith Richards (gitar, vokal pendukung), Bill Wyman " +
                    "(bass), Charlie Watts (drum), dan Ian Stewart (piano). Stewart telah dihapus" +
                    " dari line-up resmi pada tahun 1963 namun berlanjut sebagai anggota tur " +
                    "sampai kematiannya pada tahun 1985.\n\nJones meninggalkan band ini kurang " +
                    "dari sebulan sebelum kematiannya pada tahun 1969, setelah digantikan oleh " +
                    "Mick Taylor, yang tinggal sampai 1974 Setelah Taylor meninggalkan band, " +
                    "Ronnie Wood menggantikannya pada tahun 1975 dan pernah bermain gitar bersama" +
                    " Richards sejak saat itu. Setelah keberangkatan Wyman pada tahun 1993, " +
                    "Darryl Jones bergabung sebagai bassis tur mereka. Tur keyboardis untuk band " +
                    "ini adalah Nicky Hopkins (1967-1982), Ian McLagan (1978-1981), Billy Preston" +
                    " (sampai pertengahan 1970an) dan Chuck Leavell (1982-sekarang).\n\nBand " +
                    "ini pertama kali dipimpin oleh Brian Jones, namun setelah berkembang menjadi" +
                    " penulis lagu band ini, Jagger dan Richards mengambil alih kepemimpinan " +
                    "sementara Jones menangani masalah hukum dan pribadi.",

            "Led Zeppelin adalah band rock Inggris yang dibentuk di London pada tahun 1968. " +
                    "Kelompok ini terdiri dari gitaris Jimmy Page, penyanyi Robert Plant, bassist" +
                    " dan keyboardist John Paul Jones, dan drummer John Bonham.\n\nBand yang " +
                    "Rock, suara gitar-driven telah menyebabkan mereka untuk dikutip sebagai " +
                    "salah satu nenek moyang Hard Rock, Gaya mereka menarik dari beragam " +
                    "pengaruh, termasuk blues, psychedelia, dan musik rakyat.",

            "Queen adalah band rock Inggris yang terbentuk di London pada tahun 1970. Serial " +
                    "klasik mereka adalah Freddie Mercury (vokal, piano), Brian May (gitar utama," +
                    " vokal), Roger Taylor (drum, vokal), dan John Deacon (bass gitar)" +
                    ".\n\nKarya-karya paling awal dari Queen dipengaruhi oleh rock progresif, " +
                    "hard rock dan heavy metal, namun band ini secara bertahap memberanikan diri " +
                    "untuk melakukan karya yang lebih konvensional dan radio-friendly dengan " +
                    "menggabungkan gaya lebih lanjut, seperti rock arena dan rock pop ke dalam " +
                    "musik mereka.",

            "The Beatles adalah band rock Inggris yang dibentuk di Liverpool pada tahun 1960. " +
                    "Dengan anggota John Lennon, Paul McCartney, George Harrison dan Ringo Starr," +
                    " mereka secara luas dianggap sebagai band musik terdepan dan paling " +
                    "berpengaruh.\n\nBerakar pada skiffle, beat and 1950s rock and roll, the " +
                    "Beatles kemudian bereksperimen dengan beberapa gaya musik, mulai dari balada" +
                    " pop dan musik india hingga psychedelia dan hard rock, yang sering " +
                    "menggabungkan unsur klasik dan teknik perekaman yang tidak biasa dengan cara" +
                    " yang inovatif.\n\nPada tahun 1963 popularitas mereka yang luar biasa " +
                    "pertama kali muncul sebagai \\\"Beatlemania\\\"; Sebagai musik kelompok " +
                    "tumbuh dalam kecanggihan, yang dipimpin oleh penulis lagu utama Lennon dan " +
                    "McCartney, band ini merupakan bagian integral dari evolusi musik pop ke " +
                    "dalam bentuk seni dan perkembangan budaya tandingan tahun 1960an.",

            "Guns N 'Roses, yang sering disingkat GNR, adalah band hard rock Amerika dari Los " +
                    "Angeles, California, dibentuk pada tahun 1985.\n\nSerial ini, ketika " +
                    "pertama kali masuk ke Geffen Records pada tahun 1986, terdiri dari vokalis " +
                    "Axl Rose, gitaris utama Slash, gitaris ritme Izzy Stradlin, bassis Duff " +
                    "McKagan, dan drummer Steven Adler.\n\nGuns N 'Roses telah merilis enam " +
                    "album studio, mengumpulkan penjualan lebih dari 100 juta rekaman di seluruh " +
                    "dunia, termasuk 45 juta di Amerika Serikat, menjadikan mereka artis terlaris" +
                    " ke-41 sepanjang masa.",

            "Deep Purple adalah band rock Inggris yang dibentuk di Hertford pada tahun 1968. Band" +
                    " ini dianggap sebagai salah satu pelopor heavy metal dan hard rock modern, " +
                    "meskipun pendekatan musik mereka berubah selama bertahun-tahun.\nAwalnya " +
                    "dibentuk sebagai band rock progresif, band ini beralih ke suara yang lebih " +
                    "berat pada tahun 1970. Deep Purple, bersama dengan Led Zeppelin dan Black " +
                    "Sabbath, telah disebut sebagai \\\"trinitas hard rock Inggris dan pada awal " +
                    "hingga pertengahan tujuh puluhan\\\".\n\nMereka terdaftar dalam Guinness " +
                    "Book of World Records 1975 sebagai \\\"band paling keras dunia\\\" untuk " +
                    "sebuah konser di Teater Pelangi London tahun 1972, dan telah menjual lebih " +
                    "dari 100 juta album di seluruh dunia.",

            "Avenged Sevenfold (sering juga ditulis A7X) adalah grup musik Heavy Metal Amerika " +
                    "Serikat yang dibentuk pada tahun 1999. Grup musik ini berasal dari " +
                    "Huntington Beach, California. Anggota Avenged Sevenfold pada saat ini " +
                    "terdiri dari M. Shadows, Synyster Gates, Zacky Vengeance, Johnny Christ, dan" +
                    " Brooks Wackerman.\n\nBand ini dikenal dengan genre Metalcore pada debut " +
                    "mereka Sounding the Seventh Trumpet, yang mengandung banyak vokal scream. " +
                    "Band ini mengubah gaya mereka di album ketiga mereka, City of Evil, yang " +
                    "menampilkan vokal melodis dan power ballad. Band ini terus mengeksplorasi " +
                    "suara baru dengan mengeluarkan yang berjudul Avenged Sevenfold dan menikmati" +
                    " kesuksesan sebelum drummer mereka, James \\\"The Rev\\\" Owen Sullivan, " +
                    "meninggal karena penyakit jantung karena dampak gabungan dari obat dan " +
                    "alkohol di tubuhnya pada tahun 2009. Meskipun drummer sudah meninggal, band " +
                    "ini melanjutkan dengan bantuan mantan drummer Dream Theater Mike Portnoy " +
                    "untuk merilis dan melakukan tur dalam mendukung Nightmare, album kelima " +
                    "mereka pada tahun 2010 yang menjadi album top di Billboard 200.Akhir - akhir" +
                    " ini, album keenam mereka, Hail to the King menjadi album nomor satu di " +
                    "berbagai negara, seperti Amerika Serikat, Finlandia, Brazil, dan Irlandia.",

            "Linkin Park adalah band rock Amerika dari Agoura Hills, California. Dibentuk pada " +
                    "tahun 1996, band ini naik ke ketenaran internasional dengan debut album " +
                    "mereka Hybrid Theory (2000), yang mendapat sertifikasi Diamond oleh RIAA " +
                    "pada tahun 2005 dan multi-Platinum di beberapa negara lainnya.\n\nAlbum " +
                    "studio berikut mereka adalah Meteora melanjutkan kesuksesan band ini, berada" +
                    " di puncak chart album Billboard 200 pada tahun 2003, dan diikuti oleh tur " +
                    "dan karya amal yang ekstensif."
    };

    private String[] name = {
            "Red Hot Chili Peppers",
            "Nirvana",
            "The Rolling Stones",
            "Led Zeppelin",
            "Queen",
            "The Beatles",
            "Guns N 'Roses",
            "Deep Purple",
            "Avenged Sevenfold",
            "Linkin Park",
    };

    private int[] imgPhotos = {
            R.drawable.rhcp,
            R.drawable.nirvana,
            R.drawable.trs,
            R.drawable.led_zeppelin,
            R.drawable.queen,
            R.drawable.thebeatles,
            R.drawable.gnr,
            R.drawable.dp,
            R.drawable.a7x,
            R.drawable.lp
    };

    public allBand() {
        this.bands = new ArrayList<Band>();
        for (int i = 0; i < name.length ; i++) {
            ArrayList<Song> songs = new ArrayList<Song>();

            for (int j = 0; j < best_songs[i].length; j++) {
                songs.add(new Song(best_songs[i][j],spotify[i][j]));
            }
            Band band = new Band();
            band.setName(name[i]);
            band.setArticle(article[i]);
            band.setBest_songs(songs);
            band.setGenre(genre[i]);
            band.setCity_full(city_full[i]);
            band.setCity_nick(city_nick[i]);
            band.setLabel(label[i]);
            band.setImgPhoto(imgPhotos[i]);
            this.bands.add(band);
        }

    }

    public ArrayList<Band> getBands() {
        return bands;
    }

    public void setBands(ArrayList<Band> bands) {
        this.bands = bands;
    }
}
