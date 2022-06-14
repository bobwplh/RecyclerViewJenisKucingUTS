package com.bob.recyclerviewjeniskucinguts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val karakteropList = listOf<JenisKucing>(
            JenisKucing(
                R.drawable.logo,
                "Kucing",
                "kucing adalah salah satu hewan peliharaan terpopuler di dunia." +
                        " Kucing yang garis keturunannya tercatat secara resmi sebagai kucing trah atau galur murni (pure breed), " +
                        "seperti persia, siam, manx, dan sphinx. " +
                        "Kucing seperti ini biasanya dibiakkan di tempat pemeliharaan hewan resmi. " +
                        "Jumlah kucing ras hanyalah 1% dari seluruh kucing di dunia, " +
                        "sisanya adalah kucing dengan keturunan campuran seperti kucing liar atau kucing kampung."
            ),
            JenisKucing(
                R.drawable.persia,
                "Kucing Persia",
                "Kucing Persia adalah salah satu kucing rumahan paling populer di banyak negara di seluruh dunia. " +
                        "Mereka berasal dari Persia (Iran saat ini). " +
                        "Catatan pertama mengenai eksistensi kucing Persia berasal dari abad ke-17." +
                        "Pada tahun 2015, kucing Persia menjadi kucing peliharaan paling populer kedua di AS. " +
                        "Mereka berwajah datar dengan fitur wajah seperti boneka, " +
                        "telinga kecil, dan bulu tebal yang lembut nan fluffy. Kucing Persia membutuhkan perawatan khusus. " +
                        "Menyikat dan menyisir bulu serta menyeka kotoran di matanya adalah kebutuhan sehari-hari. " +
                        "Trah ini terkenal pemalas, pemalu terhadap orang asing, " +
                        "tetapi tenang dan penuh kasih sayang terhadap pemiliknya."
            ),
            JenisKucing(
                R.drawable.british_shorthair,
                "British Shorthair",
                "British Shorthair atau juga dikenal sebagai British Blue " +
                        "adalah salah satu kucing peliharaan yang paling lucu dan populer. " +
                        "Dengan tubuh chunky yang khas, bentuk wajah yang luas, dan mantel bulu yang lebat, " +
                        "British Shorthair juga menjadi inspirasi Cheshire Cat yang terkenal dari film Alice in Wonderland." +
                        "British Shorthair sangat santai dalam hal perilaku. " +
                        "Kekurangan utama dari jenis ini adalah kecenderungan mereka untuk menderita obesitas dan penyakit ginjal polikistik, " +
                        "serta ketidaksukaannya untuk digendong. " +
                        "Meski demikian, kucing menggemaskan ini bisa beradaptasi dengan baik " +
                        "terhadap kehidupan apartemen dan anak-anak karena temperamen mereka yang santai."
            ),
            JenisKucing(
                R.drawable.mainecoon,
                "Mainecoon",
                "Lihatlah Maine Maine yang gagah. " +
                        "Kucing raksasa ini adalah satwa asli Negara Bagian Maine, Amerika Serikat, " +
                        "dan merupakan salah satu ras alami tertua di Amerika Utara. Maine Coon sangat ramah " +
                        "dan bersahabat terlepas dari penampilan mereka yang gahar; " +
                        "karena itulah mereka dijuluki sebagai “raksasa yang lembut.”" +
                        "Kucing Maine Coon jantan dewasa dapat memiliki berat hingga 8,2 kilogram, " +
                        "sedangkan betina dapat mencapai berat hingga 5,4 kilogram. Sebagai pemburu yang luar biasa, " +
                        "mereka mudah dilatih dan sehat secara keseluruhan. " +
                        "Kucing ini sangat dihargai oleh para cat lovers di seluruh dunia. " +
                        "Mereka vokal, menyenangkan, dan bisa akur dengan hewan peliharaan rumah lainnya, " +
                        "termasuk anjing. Mereka tumbuh dewasa lebih lambat daripada ras lain dan tidak mencapai ukuran maksimal " +
                        "sebelum usia tiga tahun."
            ),
            JenisKucing(
                R.drawable.siam,
                "Kucing Siam",
                "Jika Anda sudah bertemu kucing Siam, besar kemungkinan Anda akan jatuh cinta pada mereka. " +
                        "Kucing ini sangat toleran, tenang, dan ramah. Mereka sangat memuja pemiliknya. Tidak mengherankan, " +
                        "penampilan khas mereka telah mengilhami penciptaan beberapa ras kucing baru, salah satunya adalah Ocicat." +
                        "Fakta Kucing Siam sangat cerdas dan bahkan bisa dilatih untuk bermain lempar tangkap. " +
                        "Bayi-bayi kucing ini sebenarnya lahir putih polos " +
                        "dan mereka mulai mengembangkan marking khasnya di kemudian hari. " +
                        "Fakta unik lainnya tentang kucing Siam adalah bahwa mereka merupakan pelompat yang luar biasa. " +
                        "Terakhir, mereka dikenal rewel luar biasa soal makanan."
            ),
            JenisKucing(
                R.drawable.kucingbengal,
                "Kucing Bengal",
                "Kucing Bengal barangkali adalah yang paling terkenal di antara semua ras kucing desainer dan eksotis. " +
                        "Mereka adalah kucing besar yang merupakan campuran antara kucing domestik dan kucing liar. " +
                        "Dengan demikian, mereka memiliki penampilan kucing liar yang dapat dikenali lewat tubuh ramping, " +
                        "perawakan elegan, dan pola bulu roset." +
                        "Kucing cantik ini suka memanjat dan melompat, mereka sangat aktif dan menyenangkan. " +
                        "Kucing Bengal membutuhkan interaksi sosial dengan pemilik mereka sesering mungkin " +
                        "dan mereka jarang merontokkan bulu. Mereka didamba oleh banyak pemilik kucing di seluruh dunia " +
                        "karena penampilan luar biasanya dan mereka bahkan telah mengilhami " +
                        "program pembiakan untuk jenis kucing baru yang dikenal sebagai Cheetoh."
            ),
            JenisKucing(
                R.drawable.kucing_bali,
                "Kucing Bali",
                "Kucing Bali sangat mirip dengan kucing Siam populer. " +
                        "Faktanya, trah ini dijuluki sebagai versi Siam berbulu panjang. " +
                        "Bertentangan dengan namanya, kucing Bali bukan asli Bali atau bagian Indonesia lainnya. " +
                        "Trah ini berasal dari AS di mana beberapa kucing Siam, yang membawa gen longhair resesif, " +
                        "dikembangbiakkan dalam upaya untuk menghasilkan versi longhair dari trah tersebut." +
                        "Kucing Bali sangat tepat untuk orang yang menderita alergi " +
                        "karena mereka memproduksi lebih sedikit alergen Fel d 1 dibandingkan kucing lain. " +
                        "Terlebih lagi, mereka sayang terhadap pemiliknya dan terkenal karena sangat cerdas. " +
                        "Terakhir, mereka juga cenderung cukup cerewet."
            ),
            JenisKucing(
                R.drawable.manx,
                "Manx",
                "Kucing Manx adalah hewan asli dari Isle of Man dan terkenal karena gen tak berekor mereka. " +
                        "Beberapa kucing Manx sama sekali tidak memiliki ekor, " +
                        "sedangkan yang lain dapat memiliki setengah panjang ekor kucing standar. " +
                        "Manx telah diakui oleh banyak registry kucing sejak akhir abad ke-19." +
                        "Trah ini ramah dan lengket pada tuannya, tetapi kepada orang asing mereka agak pemalu. " +
                        "Mereka dulu dibiakkan untuk tujuan berburu sebagai kucing pertanian, " +
                        "tetapi saat ini mereka juga beradaptasi dengan kehidupan rumahan. Di masa kini, " +
                        "Isle of Man menggunakan kucing Manx sebagai salah satu simbol nasional pulau itu."
            ),
            JenisKucing(
                R.drawable.munchkin,
                "Munchkin",
                "Munchkin yang terkenal sebenarnya adalah jenis kucing yang relatif baru. " +
                        "Secara resmi mereka diakui oleh TICA (The International Cat Association) pada tahun 1995. " +
                        "Munchkin pertama kali diperkenalkan pada tahun 1991. " +
                        "Kontroversi segera muncul mengenai berbagai risiko kesehatan yang mungkin rentan terhadap ras baru ini." +
                        "Saat ini, kucing Munchkin cukup populer karena penampilannya yang imut, mungil, dan compact. " +
                        "Terlebih lagi, mereka memulai program pemuliaan baru dengan breed eksperimental lainnya seperti Minskin, " +
                        "Bambino, Lambkin, dan lain sebagainya. Munchkin aktif dan menyenangkan, " +
                        "bertemperamen baik, dan berorientasi pada orang."
            ),
            JenisKucing(
                R.drawable.javanese,
                "Javanese",
                "Alias: Pendekar Bersenandung. CFA (Cat Fanciers Association)" +
                        "mengklasifikasikan kucing Javanese sebagai jenis kucing pameran. " +
                        "Mereka adalah kucing berbulu panjang dari keluarga tipe Oriental, " +
                        "tetapi bertentangan dengan namanya, kucing ini tidak berasal dari pulau Jawa. " +
                        "Kucing Jawa sebenarnya asli dari Amerika Utara." +
                        "Kucing pameran ini memiliki pola colorpoint dengan bulu halus. " +
                        "Mereka punya kecenderungan kuat untuk menjadi vokal. Sayangnya, " +
                        "mereka rentan terhadap sejumlah risiko kesehatan, di antaranya ketulian, " +
                        "masalah persendian, dan dislokasi pinggul. Kucing Jawa suka bermain-main, " +
                        "sangat terikat pada pemiliknya, dan tidak bisa ditinggalkan terlalu"
            ),
            JenisKucing(
                R.drawable.american_shorthair,
                "American Shorthair",
                "Alias: ksatria lautan.\n" +
                        "American Shorthair adalah salah satu trah kucing terpopuler di kalangan pemilik hewan peliharaan di seluruh Amerika Serikat. " +
                        "dijuluki “kucing pekerja,” mereka pada awalnya dibiakkan dengan tujuan untuk membasmi tikus dan hewan pengerat lainnya.\n" +
                        "American Shorthair terkenal karena mempunyai harapan hidup yang sangat panjang, " +
                        "antara 18-20 tahun. Bulu mereka mempunyai hampir 80 variasi warna. Meski berbulu lebat, " +
                        "mereka tidak merontokkan bulu sebanyak ras kucing populer lainnya. Terlebih lagi, mereka terkenal ramah, " +
                        "santai, dan toleran terhadap orang asing dan bahkan pada anak-anak yang aktif dan berisik."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.op_karakter)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = JenisKucingAdapter(this, karakteropList) {

            val intent = Intent(this, DetailJenisKucing::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
