package com.friska.mapssekolah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.friska.mapssekolah.adapter.AdapterSekolah
import com.friska.mapssekolah.model.ModelSekolah

class listsekolahactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listsekolahactivity)

        val listSekolah = listOf<ModelSekolah>(
            ModelSekolah(
                "Sma Negeri 1 Sumatra Barat",
                "Padang Panjang",
                "(0752)485544",
                R.drawable.sma1sumbar,
                "SMAN 1 Sumatera Barat adalah buah pemikiran dari Bapak Zainal Bakar " +
                        "semasa beliau menjabat sebagai Gubernur Sumatera Barat. Beliau prihatin dengan " +
                        "semakin minimnya putra Minangkabau yang berkecimpung di tingkat nasional. Berbeda " +
                        "auh dengan zaman revolusi dimana putra-putri Minangkabau selalu memegang peranan penting.",
                -0.4618716012922115,
                100.42711007872586
                ),
            ModelSekolah(
                "Sma Negeri 3 padang",
                "Padang",
                " 07517055655",
                R.drawable.sma3padang,
                "SMA Negeri 3 Padang didirikan tanggal 1 April 1977. Setelah tanah sekolah ini " +
                        "dibeli oleh pemerintah kodya Padang kepada sang pemilik tanah, dilakukan peletakkan " +
                        "batu pertama bangunan sekolah ini yang dibiayai dari dana Pelita Nasional tahun 1976/1977." +
                        "Penambahan sekolah ini karena kebutuhan peserta didik yang terus bertambah dan merupakan " +
                        "sekolah filial dari SMA N 2 Padang. Biaya awal bangunan sekolah ini disediakan pemerintah " +
                        "sebesar RP.86.387.091. Dengan demikian, ditetapkan kekuatan hukum pendirian sekolah ini " +
                        "melalui surat keputusan Menteri Pendidikan dan Kebudayaan Republik Indonesia tanggal 24 " +
                        "oktober 1977 Nomor 0469/0/1977.",
                -0.9193023774224114,
                100.36463500941407
            ),
            ModelSekolah(
                "Sma Negeri 3 Batusangkar",
                "Batusangkar",
                " 07517055655",
                R.drawable.sma3batusangkar,
                "Pada bulan Juli tahun 2014, kegiatan Proses Belajar Mengajar di pindahkan ke gedung " +
                        "defenitif SMAN 3 Batusangkar (di puncak Bukitgombak/lokasi sekarang). Sedangkan SMP 5 Batusangkar " +
                        "dipindahkan dari gedung eks SMEA Batusangkar ke gedung definitif (sekarang) yang sebelumnya ditempati " +
                        "SMA Negeri 3 Batusangkar. Dengan sudah berada di lokasi definitif (sekarang) pengembangan sarana, " +
                        "prasarana serta kualitas PBM secara bertahap dapat dikembangkan, sesuai dengan konsep awal SMA Unggulan " +
                        "Tanah Datar dengan sistem  Boarding School.",
                -0.4844028735492001,
                100.61500475174027
            ),
            ModelSekolah(
                "Sma Negeri 10 Padang",
                "Padang",
                " 07517055655",
                R.drawable.sma10padang,
                "SMA Negeri 10 Padang adalah sekolah dengan status alih fungsi dari beberapa " +
                        "jenis sekolah. Dimulai dari tahun 1958 awal berdirinya SGB, kemudian berganti nama " +
                        "menjadi SGA. Pada tahun 1960 dari SGA berubah nama menjadi SPG. Keberadaan SPG " +
                        "berlangsung sampai tahun 1991.",
                -0.6893116918921594,
                100.28801641338411
            ),
            ModelSekolah(
                "Sma Negeri 1 Bukittinggi",
                "Bukittinggi",
                " 07517063583",
                R.drawable.sma1bkt,
                "SMA Negeri 1 Bukittinggi berasal dari pecahan SMA Negeri ABC Bukittinggi yang " +
                        "didirikan di Birugo pada tahun 1856 bertepatan pada masa-masa awal Kebangkitan " +
                        "Nasional yang pada masa itu pendidikan adalah hal yang sangat dibutuhkan oleh " +
                        "masyarakat. Sekolah ini berdiri atas prakarsa dr. A. Roesma.",
                -0.302243632996151,
                100.37375361465276
            ),
            ModelSekolah(
                "Sma Negeri 2 Padang",
                "Padang",
                "0751-7051507",
                R.drawable.sma2padang,
                "SMA Negeri 2 Padang atau biasa di sebut SMANDOE adalah sekolah menengah atas " +
                        "negeri yang berada di Jalan Musi Nomor 2, Purus Atas, Padang, Sumatera Barat. SMA " +
                        "Negeri 2 padang merupakan salah satu sekolah favorit dan unggulan di Kota Padang " +
                        "khususnya dan di Sumatera Barat umumnya.",
                -0.904499572120617,
                100.34683852690867
            ),
            ModelSekolah(
                "Sma Negeri 1 Padang Panjang",
                "Padang Panjang",
                "07517063583",
                R.drawable.sma1pdngpnjng,
                "SMA Negeri 2 Padang Panjang merupakan SMA negeri kedua di kota Padang Panjang. Didirikan didasarkan atas permintaan dan kebutuhan masyarakat serta minat yang tinggi siswa tamatan SLTP untuk melanjutkan pendidikan ke jenjang sekolah menengah atas pada tahun 1996.",
                -0.4632643880029542,
                100.40610793639735
            ),
            ModelSekolah(
                "Sma Negeri 2 Padang Panjang",
                "Padang Panjang",
                "0752-484752",
                R.drawable.sma2padngpanjng,
                "SMA Negeri (SMAN) 1 Padang Panjang, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Provinsi Sumatera Barat, Indonesia. Sama dengan SMA pada umumnya di Indonesia, masa pendidikan sekolah di SMAN 1 Padang Panjang ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.",
                -0.46109895882823254,
                100.40307942475455
            ),
            ModelSekolah(
                "Sma Negeri 1 Pariamana",
                "Pariamana",
                " 07517055655",
                R.drawable.sma1pariaman,
                "SMA Negeri 1 Pariaman, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Provinsi Sumatera Barat, Indonesia. Sama dengan SMA pada umumnya di Indonesia, masa pendidikan sekolah di SMAN 1 Pariaman ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.",
                -0.6298768356051014,
                100.12857873639815
            ),
            ModelSekolah(
                "Sma Negeri 2 Payakumbuh",
                "Payakumbuh",
                " 07517055655",
                R.drawable.sma2payakumbuh,
                "SMA Negeri 1 Payakumbuh menduduki posisi ke-564 secara nasional dan ke-13 di Provinsi Sumatera Barat dalam daftar 1000 besar sekolah dengan nilai rata-rata TPS. Ujian Tulis Berbasis Komputer Seleksi Bersama Masuk Perguruan Tinggi Negeri (UTBK-SBMPTN) menurut Lembaga Tes Masuk Perguruan Tinggi tahun 2021.",
                -0.24055961114391997,
                100.65222380571045
            )

        )
        // panggil adapter
        val adapterSekolah = AdapterSekolah(listSekolah)
        //recycler view
        val rvSekolah = findViewById<RecyclerView>(R.id.rv_sekolah)
        rvSekolah.adapter = adapterSekolah
        // set layout untuk recycler view
        rvSekolah.apply {
            layoutManager = LinearLayoutManager(this@listsekolahactivity)
        }
        rvSekolah.setHasFixedSize(true)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}