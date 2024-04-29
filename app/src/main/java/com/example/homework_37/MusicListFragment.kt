package com.example.homework_37

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_37.databinding.FragmentMusicListBinding

class MusicListFragment : Fragment() {

    private lateinit var binding: FragmentMusicListBinding
    private val musicList = arrayListOf(
        MusicModel("1", "Watch Me", "Silento", "4:54"),
        MusicModel("2", "Earned it ", "The Weekend", "3:54"),
        MusicModel("3", " The Hills", "The Weekend", "4:54"),
        MusicModel("4", "Watch Me", "Silento", "4:54"),
        MusicModel("5", "Writings on the Wall ", "Taylor Swift", "4:24"),
        MusicModel("6", "Someone you Loved", " Lewis Capaldi", "2:54"),
        MusicModel("7", "Get you the Moon", "Kina Snow", "3:40"),
        MusicModel("8", " Death bed", "Powfu", "3:26"),
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMusicListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val musicAdapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = musicAdapter
    }

    private fun onClick(position: Int) {
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("Key", position)
        startActivity(intent)
    }
}
