package com.example.uts_ppapb

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_ppapb.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            var name = intent.getStringExtra("EXTRA_NAME")
            txtName.text = name
            btnOut.setOnClickListener {
                var intentToThird = Intent(this@SecondActivity, ThirdActivity::class.java)
                startActivity(intentToThird)
            }
        }
    }
}