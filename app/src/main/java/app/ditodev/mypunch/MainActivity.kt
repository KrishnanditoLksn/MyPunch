package app.ditodev.mypunch

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import app.ditodev.mypunch.activity.OnePunchLists
import app.ditodev.mypunch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.rgb(16, 27, 131)))
        supportActionBar!!.setTitle(R.string.app_name)

        binding.ivbList.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id != null) {
            when (p0.id) {
                R.id.ivb_list -> {
                    startActivity(Intent(this@MainActivity, OnePunchLists::class.java))
                }
            }
        }
    }
}