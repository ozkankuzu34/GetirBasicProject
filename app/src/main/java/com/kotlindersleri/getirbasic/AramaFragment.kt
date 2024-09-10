package com.kotlindersleri.getirbasic

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlindersleri.getirbasic.data.entity.Urunler
import com.kotlindersleri.getirbasic.databinding.FragmentAramaBinding
import com.kotlindersleri.getirbasic.ui.adapter.UrunlerAdapter


class AramaFragment : Fragment() {
    private lateinit var binding: FragmentAramaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAramaBinding.inflate(inflater,container,false)

        binding.searchView.setOnQueryTextListener(object :OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }
        })

        binding.urunRv.layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val urunlerListesi=ArrayList<Urunler>()
        val u1=Urunler(1,"Ekmek","ekmek",12)
        val u2=Urunler(2,"İkram Fındıklı","ikramfindikli",13)
        val u3=Urunler(3,"Lay's Fırından","laysfirindan",35)
        val u4=Urunler(4,"Lay's Klasik","laysklasik",36)
        val u5=Urunler(5,"Luppo Karamelli","luppokaramelli",40)
        val u6=Urunler(6,"Peyman Çekirdek","peymancekirdek",26)
        val u7=Urunler(7,"Ülker Biskrem","ulkerbiskrem",15)

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)

        val urunlerAdapter=UrunlerAdapter(requireContext(),urunlerListesi)
        binding.urunRv.adapter=urunlerAdapter




        return (binding.root)
    }

    fun ara(aramaKelimesi:String){
        Log.e("Ürün Ara",aramaKelimesi)
    }


}