package com.annisa.wisatamaps

import adapter.adapterWisata
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.ModelWisata


class ListActivity : AppCompatActivity() {

    private lateinit var RecyclerViewMenu: RecyclerView
    private lateinit var AdapterMenu: adapterWisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)

        val menuIcons = listOf(
            ModelWisata(
                R.drawable.pdg1,
                "Lembah Harau",
                "Payakumbuh, Sumatera Barat",
                "JLembah Harau adalah sebuah ngarai dekat Kota Payakumbuh di Kabupaten Limapuluh Koto, provinsi Sumatera Barat. Lembah Harau diapit dua bukit cadas terjal dengan ketinggian mencapai 150 meter berupa batu pasir yang terjal berwarna-warni, dengan ketinggian 100 sampai 500 meter.",
                -0.1089167031082464, 100.66419712946801,

            ),
            ModelWisata(
                R.drawable.pdg3,
                "Masjid Raya Sumbar",
                "Padang, Sumatera Barat",
                "Masjid Raya Sumatera Barat atau Masjid Raya Syekh Ahmad Khatib Al Minangkabawi terletak di Jalan Chatib Sulaiman, Kota Padang, Sumatera Barat. Pembangunannya diawali peletakan batu pertama pada 21 Desember 2007 dan dinyatakan tuntas pada 4 Januari 2019",
                -0.9239846032978624, 100.36243359479649,

            ),
            ModelWisata(
                R.drawable.pdg5,
                "Istano Pagaruyuang",
                "Kab.Tanah Datar, Sumatera Barat",
                "Istano Basa Pagaruyung yang lebih terkenal dengan nama Istana Besar Kerajaan Pagaruyung adalah museum berupa replika istana Kerajaan Pagaruyung terletak di Nagari Pagaruyung, Kecamatan Tanjung Emas, Kabupaten Tanah Datar, Sumatera Barat.",
                -0.47103891617002636, 100.62142635246667

                ),
            ModelWisata(
                R.drawable.pdg4,
                "Eropa Harau",
                "Payakumbuh, Sumatera Barat",
                "Lembah Harau adalah keajaiban alam di Sumatera Barat dengan kontur alam indah dan suasana yang sejuk.Kamu tak perlu lagi melancong pergi hingga keluar negeri karena Lembah Harau Dream Park memberikan pengalaman untuk merasakan suasana tiga tempat berbeda dalam satu tempat sekaligus, termasuk wisata Kampung Eropa Lembah Harau. .",
                -0.11293068890971, 100.66983143557053

            ),
            ModelWisata(
                R.drawable.boro,
                "Candi borobudur",
                "Magelang",
                "Dibangun dari abad ke-9, situs ini terkenal sebagai candi Buddha terbesar di dunia",
                -7.604879709882314, 110.2035859416411
            ),
            ModelWisata(
                R.drawable.labuan,
                "Labuan Bajo",
                "NTT",
                "Labuan Bajo merupakan salah satu kelurahan yang berada di Kecamatan Komodo, Kabupaten Manggarai Barat, Provinsi Nusa Tenggara Timur, Indonesia. Labuan Bajo juga merupakan pusat pemerintahan dari Kecamatan Komodo dan sekaligus merupakan ibu kota Kabupaten Manggarai Barat",
                -8.437930350601835, 119.86714452945427
            ),
            ModelWisata(
                R.drawable.danau,
                "Danau Toba",
                "Sumatera Utara",
                "Danau Toba adalah danau alami berukuran besar di Sumatera Utara, Indonesia yang terletak di kaldera gunung supervulkan. Danau ini memiliki panjang 100 kilometer, lebar 30 kilometer, dan kedalaman 508 meter. Danau ini terletak di tengah pulau Sumatra bagian utara dengan ketinggian permukaan sekitar 900 mete",
                2.8018526643909647, 98.77124925053705
            )

        )

        RecyclerViewMenu = findViewById(R.id.rvwisata)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        AdapterMenu = adapterWisata(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}