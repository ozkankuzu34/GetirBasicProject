package com.kotlindersleri.getirbasic.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlindersleri.getirbasic.data.entity.Kategoriler
import com.kotlindersleri.getirbasic.databinding.CardTasarimkategorilerBinding


class KategorilerAdapter(var mContect:Context,var kategorilerListesi:List<Kategoriler>)
    :RecyclerView.Adapter<KategorilerAdapter.CardTasarimkategoriTutucu>()
    {
    inner class CardTasarimkategoriTutucu(var tasarim:CardTasarimkategorilerBinding):RecyclerView.ViewHolder(tasarim.root)

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): CardTasarimkategoriTutucu {
            val binding=CardTasarimkategorilerBinding.inflate(LayoutInflater.from(mContect),parent,false)
            return CardTasarimkategoriTutucu(binding)
        }

        override fun onBindViewHolder(holder: CardTasarimkategoriTutucu, position: Int) {
            val kategori=kategorilerListesi.get(position)
            val t=holder.tasarim

            t.imageViewKategori.setImageResource(mContect.resources.getIdentifier(kategori.resim,"drawable",mContect.packageName))
            t.textViewKategoriAd.text="${kategori.ad}"
        }

        override fun getItemCount(): Int {
            return kategorilerListesi.size
        }


    }