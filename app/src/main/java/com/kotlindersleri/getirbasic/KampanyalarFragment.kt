package com.kotlindersleri.getirbasic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlindersleri.getirbasic.data.entity.Kampanyalar
import com.kotlindersleri.getirbasic.databinding.FragmentKampanyalarBinding
import com.kotlindersleri.getirbasic.ui.adapter.KampanyalarAdapter
import com.kotlindersleri.getirbasic.ui.adapter.UrunlerAdapter


class KampanyalarFragment : Fragment() {
private lateinit var binding: FragmentKampanyalarBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentKampanyalarBinding.inflate(inflater,container,false)

        binding.kampanyaRv.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val kampanyalarListesi=ArrayList<Kampanyalar>()

        val k1=Kampanyalar(1,"kayanresim1")
        val k2=Kampanyalar(1,"kayanresim2")
        val k3=Kampanyalar(1,"kayanresim3")
        val k4=Kampanyalar(1,"kayanresim4")
        val k5=Kampanyalar(1,"kayanresim5")
        val k6=Kampanyalar(1,"kayanresim6")
        val k7=Kampanyalar(1,"kayanresim7")
        val k8=Kampanyalar(1,"kayanresim8")
        val k9=Kampanyalar(1,"kayanresim9")

        kampanyalarListesi.add(k1)
        kampanyalarListesi.add(k2)
        kampanyalarListesi.add(k3)
        kampanyalarListesi.add(k4)
        kampanyalarListesi.add(k5)
        kampanyalarListesi.add(k6)
        kampanyalarListesi.add(k7)
        kampanyalarListesi.add(k8)
        kampanyalarListesi.add(k9)

        val kampanyalarAdapter= KampanyalarAdapter(requireContext(),kampanyalarListesi)
        binding.kampanyaRv.adapter=kampanyalarAdapter

        return binding.root
    }


}