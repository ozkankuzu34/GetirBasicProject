package com.kotlindersleri.getirbasic.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlindersleri.getirbasic.data.entity.Kampanyalar
import com.kotlindersleri.getirbasic.databinding.CardTasarimkampanyalarBinding

class KampanyalarAdapter(var mcontext:Context,var kampanyalarListesi:List<Kampanyalar>)
    :RecyclerView.Adapter<KampanyalarAdapter.CardTasarimkampanyalarTutucu>()
{
    inner class CardTasarimkampanyalarTutucu(var tasarim:CardTasarimkampanyalarBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardTasarimkampanyalarTutucu {
        val binding=CardTasarimkampanyalarBinding.inflate(LayoutInflater.from(mcontext),parent,false)
        return CardTasarimkampanyalarTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimkampanyalarTutucu, position: Int) {
        val kampanya=kampanyalarListesi.get(position)
        val t=holder.tasarim

        t.imageViewKampanya.setImageResource(mcontext.resources.getIdentifier(kampanya.resim,"drawable",mcontext.packageName))
    }

    override fun getItemCount(): Int {
        return kampanyalarListesi.size
    }
}