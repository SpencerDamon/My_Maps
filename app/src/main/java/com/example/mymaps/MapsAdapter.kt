package com.example.mymaps

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymaps.model.UserMap

class MapsAdapter(val context: Context, val userMaps: List<UserMap>) : RecyclerView.Adapter<MapsAdapter.ViewHolder>() {


    // Create the ViewHolders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(
            android.R.layout.simple_list_item_1,
            parent,
            false
        )
        return ViewHolder(view)
    }

    // Bind the views to the ViewHolders
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userMap = userMaps[position]
        val textViewTitle = holder.itemView.findViewById<TextView>(android.R.id.text1)
        textViewTitle.text = userMap.title
    }

    // Get the size of our dataset
    override fun getItemCount() = userMaps.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
