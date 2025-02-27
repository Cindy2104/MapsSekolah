package com.friska.mapssekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.friska.mapssekolah.databinding.ActivityDetailSekolahMapsBinding

class DetailSekolahMapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityDetailSekolahMapsBinding

    private lateinit var tvNamaSekolah: TextView
    private lateinit var imgSekolah: ImageView
    private lateinit var tvDeskripsiSekolah: TextView
    private lateinit var btnLokasi: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailSekolahMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvNamaSekolah = findViewById(R.id.tvNamaSekolah)
        imgSekolah = findViewById(R.id.imgSekolah)
        tvDeskripsiSekolah = findViewById(R.id.tvDeskripsiSekolah)
        btnLokasi = findViewById(R.id.btnLokasi)


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        //mengambil data dari intent
        val namaSekolah = intent.getStringExtra("namaSekolah")
        val gambarSekolah = intent.getIntExtra("gambarSekolah",0)
        val deskripsiSekolah = intent.getStringExtra("deskripsiSekolah")
        val latSekolah = intent.getDoubleExtra("latSekolah", 0.0)
        val longSekolah = intent.getDoubleExtra("longSekolah",0.0)

        tvNamaSekolah.text = namaSekolah
        imgSekolah.setImageResource(gambarSekolah)
        tvDeskripsiSekolah.text = deskripsiSekolah

        //event click button Map Sekolah
        btnLokasi.setOnClickListener {
            val intentMapSekolah = Intent(this,MapsSekolahActivity::class.java)
            //kirim lat dan long
            intentMapSekolah.putExtra("latSekolah",latSekolah)
            intentMapSekolah.putExtra("longSekolah",longSekolah)
            intentMapSekolah.putExtra("namaSekolah",namaSekolah)
            startActivity(intentMapSekolah)
        }

        // Add a marker in Sydney and move the camera
        val koordinatSekolah = LatLng(-latSekolah, longSekolah)
        mMap.addMarker(MarkerOptions().position(koordinatSekolah).title(namaSekolah))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(koordinatSekolah,14F))

    }


}