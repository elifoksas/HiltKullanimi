package com.elifoksas.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adres: Adres) {

    fun basvuruYap(){
        Log.e("Sonuç","İnternet Başvurusu ${adres.adresBilgisi} adresine yapıldı")
    }
}