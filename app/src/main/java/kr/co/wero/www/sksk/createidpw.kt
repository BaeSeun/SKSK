package kr.co.wero.www.sksk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_createidpw.*
import kotlinx.android.synthetic.main.activity_login.*

class createidpw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createidpw)

        back.setOnClickListener {
            finish()
        }


    }
}