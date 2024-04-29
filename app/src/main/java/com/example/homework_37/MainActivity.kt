package com.example.homework_37

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.music_container,MusicFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_list_container,MusicListFragment()).commit()
    }
}