package kr.co.wero.www.sksk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_createidpw.*
import kotlinx.android.synthetic.main.activity_find_account.*

class find_account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_account)


        btn_back.setOnClickListener {
            finish()
        }



    }
}