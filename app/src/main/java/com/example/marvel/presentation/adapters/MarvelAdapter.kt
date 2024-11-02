package com.example.marvel.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.databinding.ActivityTesteBinding
import com.example.marvel.domain.entities.MarvelCardEntity

class MarvelAdapter(private val data: List<MarvelCardEntity>) :
    RecyclerView.Adapter<MarvelAdapter.MarvelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarvelViewHolder {
        return MarvelViewHolder(
            ActivityTesteBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
        )
    }

    override fun onBindViewHolder(holder: MarvelViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MarvelViewHolder(
        private val binding: ActivityTesteBinding,
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MarvelCardEntity) {

//            Glide.with(context)
//                .load(item.image)
//                .timeout(60000)
//                .into(binding.imageView)


            binding.texte1.text = item.text
        }
    }
}