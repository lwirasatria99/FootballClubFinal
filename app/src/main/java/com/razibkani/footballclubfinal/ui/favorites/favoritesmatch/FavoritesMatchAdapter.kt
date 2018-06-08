package com.razibkani.footballclubfinal.ui.favorites.favoritesmatch

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.razibkani.footballclubfinal.R
import com.razibkani.footballclubfinal.data.model.FavoriteEvent
import com.razibkani.footballclubfinal.utils.OnItemClickListener
import com.razibkani.footballclubfinal.utils.inflate
import javax.inject.Inject

class FavoritesMatchAdapter @Inject constructor() : RecyclerView.Adapter<FavoritesMatchViewHolder>() {

    private var footballEvents: List<FavoriteEvent> = ArrayList()
    lateinit var onItemClickListener: OnItemClickListener<FavoriteEvent>

    fun updateData(newFootballEvents: List<FavoriteEvent>) {
        footballEvents = newFootballEvents
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritesMatchViewHolder {
        val view = parent.inflate(R.layout.item_fav_match)
        return FavoritesMatchViewHolder(view)
    }

    override fun getItemCount(): Int {
        return footballEvents.size
    }

    override fun onBindViewHolder(holder: FavoritesMatchViewHolder, position: Int) {
        holder.bind(footballEvents[position], onItemClickListener)
    }
}