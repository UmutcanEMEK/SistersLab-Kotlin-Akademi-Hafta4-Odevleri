/*
ConstraintLayout kullanarak rehbere numara kaydetme ekranı tasarlanacak bir imageView ,
Kaydet butonu ,iki tane edittext alanı ad ve telefon numarası girilecek. Telefon numarası
alanına sadece numara girebilsin. EditTextler boş olduğunda uyarı versin boş alanları doldurun
şeklinde alanlar doldurulduktan sonra “Kaydet” butonuna basıldığında sonraki sayfaya yönlendirsin
ve numara başarılı bir şekilde kaydedildi texti görünsün
 */
package com.example.sisterslab_kotlin_akademi_hafta4_odevleri.Soru1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sisterslab_kotlin_akademi_hafta4_odevleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edtTxtName = binding.edtTxtName
        val edtTxtPhone = binding.edtTxtPhone

        binding.btnKaydet.setOnClickListener{
            if (edtTxtName.text.isEmpty() || edtTxtPhone.text.isEmpty()){
                Toast.makeText(this, "Lütfen boş alanları doldurun!", Toast.LENGTH_SHORT).show()
            }else{
                val yeniIntent = Intent(this@MainActivity, SonucEkrani::class.java)
                startActivity(yeniIntent)
                Toast.makeText(this, "Numara başarılı bir şekilde kaydedildi!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}