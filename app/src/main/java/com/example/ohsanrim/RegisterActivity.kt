package com.example.ohsanrim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

      //  val rePwText = findViewById <EditText> (R.id.rePwText)
      //  println("idText: "+idText+" / pwText: "+pwText+" / rePwText: "+rePwText)


    }

    fun register_click(view: View){
//
//        val idText = findViewById <EditText> (R.id.idText)
//        val pwText = findViewById <EditText> (R.id.pwText)
//


        //val idText = f
        val pwText = EditText(findViewById(R.id.pwText))
        val rePwText = findViewById <EditText> (R.id.rePwText)
        Log.i("register","idText: "+idText+" / pwText: "+pwText+" / rePwText: "+rePwText )
    }
}