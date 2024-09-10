package com.kotlindersleri.getirbasic.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlindersleri.getirbasic.data.entity.Urunler
import com.kotlindersleri.getirbasic.databinding.CardTasarimBinding

class UrunlerAdapter (var mContext:Context,var urunlerListesi:List<Urunler>)
    :RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>()
{

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun=urunlerListesi.get(position)
        val t=holder.tasarim

        t.imageViewUrun.setImageResource(mContext.resources.getIdentifier(urun.resim,"drawable",mContext.packageName))

        t.textViewFiyat.text="${urun.fiyat} ₺"
        t.textViewUrunAd.text="${urun.ad}"
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}