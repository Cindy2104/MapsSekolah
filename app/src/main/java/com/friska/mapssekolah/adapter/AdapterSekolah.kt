package com.friska.mapssekolah.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.friska.mapssekolah.DetailSekolahMapsActivity
import com.friska.mapssekolah.R
import com.friska.mapssekolah.model.ModelSekolah

class AdapterSekolah(
    val listitemSekolah: List<ModelSekolah>
) : RecyclerView.Adapter<AdapterSekolah.MyViewHolder>() {

    // ViewHolder class untuk menampung view item list
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgSekolah: ImageView = itemView.findViewById(R.id.imgsekolah)
        val tvNamaTempatSekolah: TextView = itemView.findViewById(R.id.tvNamasekolah)
        val tvAlamat: TextView = itemView.findViewById(R.id.tvAlamat)
        val tvNoTelp: TextView = itemView.findViewById(R.id.tvNoTelp)
        val cardSekolah: CardView = itemView.findViewById(R.id.cardsekolah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_sekolah, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = listitemSekolah[position]
        holder.imgSekolah.setImageResource(currentItem.gambarSekolah)
        holder.tvNamaTempatSekolah.text = currentItem.namaSekolah
        holder.tvAlamat.text = currentItem.alamatSekolah
        holder.tvNoTelp.text = currentItem.notelp // Set data nomor telepon

        // Event click pada card view
        holder.cardSekolah.setOnClickListener {
            val intentDetailSekolah = Intent(holder.itemView.context, DetailSekolahMapsActivity::class.java)
            // Kirim data list item sekolah ke DetailSekolahMapsActivity
            intentDetailSekolah.putExtra("namaSekolah", currentItem.namaSekolah)
            intentDetailSekolah.putExtra("gambarSekolah", currentItem.gambarSekolah)
            intentDetailSekolah.putExtra("deskripsiSekolah", currentItem.deskripsiSekolah)
            intentDetailSekolah.putExtra("latSekolah", currentItem.latSekolah)
            intentDetailSekolah.putExtra("longSekolah", currentItem.longSekolah)
            intentDetailSekolah.putExtra("noTelp", currentItem.notelp) // Kirim nomor telepon ke activity detail

            // Menjalankan intent startActivity
            holder.itemView.context.startActivity(intentDetailSekolah)
        }
    }

    override fun getItemCount(): Int {
        return listitemSekolah.size
    }
}
