package com.example.mymaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymaps.model.UserMap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set layout manager on the recycler view
        val rvMaps = findViewById<RecyclerView>(R.id.rvMaps)
        rvMaps.layoutManager = LinearLayoutManager(this)

        // Set adapter on the recycler view
        rvMaps.adapter = MapsAdapter(this, emptyList<UserMap>())
    }
}