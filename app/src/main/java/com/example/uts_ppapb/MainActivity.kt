package com.example.uts_ppapb

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_ppapb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            btnSubmit.setOnClickListener{
                var name = etName.text.toString()
                if (name == ""){
                    Toast.makeText(this@MainActivity, "Enter your name first", Toast.LENGTH_SHORT).show()
                } else{
                    val intentToSecond = Intent(this@MainActivity, SecondActivity::class.java)
                    intentToSecond.putExtra("EXTRA_NAME", name)
                    startActivity(intentToSecond)
                }

            }
        }

    }
}