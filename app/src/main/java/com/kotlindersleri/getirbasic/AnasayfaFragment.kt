package com.kotlindersleri.getirbasic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.snackbar.Snackbar
import com.kotlindersleri.getirbasic.data.entity.Kategoriler
import com.kotlindersleri.getirbasic.databinding.FragmentAnasayfaBinding
import com.kotlindersleri.getirbasic.ui.adapter.KategorilerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel(R.drawable.kayanresim1))
        imageList.add(SlideModel(R.drawable.kayanresim2))
        imageList.add(SlideModel(R.drawable.kayanresim3))
        imageList.add(SlideModel(R.drawable.kayanresim4))
        imageList.add(SlideModel(R.drawable.kayanresim5))
        imageList.add(SlideModel(R.drawable.kayanresim6))
        imageList.add(SlideModel(R.drawable.kayanresim7))
        imageList.add(SlideModel(R.drawable.kayanresim8))
        imageList.add(SlideModel(R.drawable.kayanresim9))

        //val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageSlider=binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.startSliding(3000) // with new period

        binding.kategoriRv.layoutManager=StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val kategorilerListesi=ArrayList<Kategoriler>()
        val k1=Kategoriler(1,"Süper İkili","anasayfakategori1")
        val k2=Kategoriler(2,"İndirimler","anasayfakategori2")
        val k3=Kategoriler(3,"Kazandıranlar","anasayfakategori3")
        val k4=Kategoriler(4,"Su & İçecek","anasayfakategori4")
        val k5=Kategoriler(5,"Meyve & Sebze","anasayfakategori5")
        val k6=Kategoriler(6,"Şımart Kendini","anasayfakategori6")
        val k7=Kategoriler(7,"Süt Ürünleri","anasayfakategori7")
        val k8=Kategoriler(8,"Fırından","anasayfakategori8")
        val k9=Kategoriler(9,"Atıştırmalık","anasayfakategori9")
        val k10=Kategoriler(10,"Dondurma","anasayfakategori10")
        val k11=Kategoriler(11,"Temel Gıda","anasayfakategori11")
        val k12=Kategoriler(12,"Kahvaltılık","anasayfakategori12")
        val k13=Kategoriler(13,"Yiyecek","anasayfakategori13")
        val k14=Kategoriler(14,"Fit & Form","anasayfakategori14")
        val k15=Kategoriler(15,"Kişisel Bakım","anasayfakategori15")
        val k16=Kategoriler(16,"Ev Bakım","anasayfakategori16")
        val k17=Kategoriler(17,"Ev & Yaşam","anasayfakategori17")
        val k18=Kategoriler(18,"Evcil Hayvan","anasayfakategori18")
        val k19=Kategoriler(19,"Bebek","anasayfakategori19")
        val k20=Kategoriler(20,"Cinsel Sağlık","anasayfakategori20")

        kategorilerListesi.add(k1)
        kategorilerListesi.add(k2)
        kategorilerListesi.add(k3)
        kategorilerListesi.add(k4)
        kategorilerListesi.add(k5)
        kategorilerListesi.add(k6)
        kategorilerListesi.add(k7)
        kategorilerListesi.add(k8)
        kategorilerListesi.add(k9)
        kategorilerListesi.add(k10)
        kategorilerListesi.add(k11)
        kategorilerListesi.add(k12)
        kategorilerListesi.add(k13)
        kategorilerListesi.add(k14)
        kategorilerListesi.add(k15)
        kategorilerListesi.add(k16)
        kategorilerListesi.add(k17)
        kategorilerListesi.add(k18)
        kategorilerListesi.add(k19)
        kategorilerListesi.add(k20)

        val kategorilerAdapter=KategorilerAdapter(requireContext(),kategorilerListesi)
        binding.kategoriRv.adapter=kategorilerAdapter






        return (binding.root)
    }


}