package com.r1moreira9.plication
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.r1moreira9.plication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    private val retrofitService: RetrofitLibrary by lazy {
        RetrofitLibrary.getInstance()
    }*/
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
   private val retrofit by lazy{

   }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

      setContentView(binding.root)
        with(binding){
            rvUsers
        }

    }
}

