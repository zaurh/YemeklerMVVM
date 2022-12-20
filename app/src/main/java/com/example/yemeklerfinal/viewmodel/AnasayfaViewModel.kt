package com.example.yemeklerfinal.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yemeklerfinal.entity.Yemekler
import com.example.yemeklerfinal.repo.YemeklerDaoRepository

class AnasayfaViewModel: ViewModel() {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    var yrepo = YemeklerDaoRepository()

    init {
        yemekleriYukle()
        yemeklerListesi = yrepo.yemekleriGetir()
    }

    fun yemekleriYukle(){
        yrepo.tumYemekleriAl()
    }
}