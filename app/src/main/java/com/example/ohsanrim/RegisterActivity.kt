package com.example.ohsanrim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ohsanrim.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_register)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener{
            Log.i("register","회원가입 버튼 클릭 이벤트 실행!" )
            val idText = binding.idText.text
            val pwText = binding.pwText.text
            val rePwText = binding.rePwText.text
            val emailText = binding.emailText.text
            val phoneText = binding.phoneText.text

            if(blankCheck(idText.toString())){
                //아이디 중복성 체크
                Log.e("register Fail","ID 값이 공백입니다.  ")
                Log.e("register Fail","id Check: "+ idText)
            } else if(blankCheck(pwText.toString()) || blankCheck(rePwText.toString())) {
                Log.e("register Fail","비밀번호가 공백입니다. 다시한번 확인해주십시오.")
            } else if(!pwText.toString().equals(rePwText.toString())){
                //비밀번호 유효성 체크
                Log.e("register Fail","비밀번호가 일치하지 않습니다. 다시한번 확인해주십시오. ")
                Log.e("register Fail","pwText: "+pwText+" / rePwText: "+ rePwText)
            } else if(blankCheck(emailText.toString())){
                Log.e("register Fail","이메일 란이 공백입니다. 다시한번 확인해주십시오.")
            } else if(!emailText.contains('@')){
                //이메일 유효성 체크
                Log.e("register Fail","이메일 형식이 일치하지 않습니다. 다시한번 확인해주십시오. ")
                Log.e("register Fail","emailText: "+ emailText)
            } else if(blankCheck(phoneText.toString())){
                Log.e("register Fail","핸드폰 번호가 공백입니다. 다시한번 확인해주십시오.")
            } else if (true){
                //핸드폰 번호 유효성 체크
                Log.e("registered...","id Check: "+ idText)
            } else {
                Log.e("register success","회원가입 성공!")
            }
        }
    }

    fun blankCheck(value: String): Boolean {
        return value == "" || value == null
    }

}