package com.example.homework_37

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework_37.databinding.ItemMusicBinding
import kotlin.reflect.KFunction1

class MusicAdapter(var musicList: ArrayList<MusicModel>, val onClick: KFunction1<Int, Unit>) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicList[position])
        holder.itemView.setOnClickListener {
            val musicName = musicList[position].nameMusic
            val intent = Intent(holder.itemView.context, SecondActivity::class.java)
            intent.putExtra("Key", musicName)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    inner class MusicViewHolder(private var binding: ItemMusicBinding) : ViewHolder(binding.root) {
        fun bind(item: MusicModel) {
            binding.tv1.text = item.number
            binding.tv2.text = item.nameMusic
            binding.tv3.text = item.authorMusic
            binding.tv4.text = item.musicLength
        }
    }
}
