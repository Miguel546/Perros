package com.android.perros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.perros.adapter.PerrosAdapter
import com.android.perros.beans.Perro
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    private var perrosAdapter: PerrosAdapter? = null
    private lateinit var perrosRecyclerView: RecyclerView
    val json = "[{\"idSplaft\":2,\"codeTI\":2,\"description\":\"Chihuahua\",\"state\":1},{\"idSplaft\":3,\"codeTI\":3,\"description\":\"Bulldog\",\"state\":1},{\"idSplaft\":5,\"codeTI\":5,\"description\":\"Caniche\",\"state\":1},{\"idSplaft\":6,\"codeTI\":6,\"description\":\"Yorkshire\",\"state\":1},{\"idSplaft\":7,\"codeTI\":7,\"description\":\"Labrador\",\"state\":1},{\"idSplaft\":8,\"codeTI\":8,\"description\":\"Boxer\",\"state\":1},{\"idSplaft\":9,\"codeTI\":9,\"description\":\"Husky\",\"state\":1},{\"idSplaft\":11,\"codeTI\":11,\"description\":\"Pitbull\",\"state\":1},{\"idSplaft\":13,\"codeTI\":13,\"description\":\"San Bernardo\",\"state\":1},{\"idSplaft\":14,\"codeTI\":14,\"description\":\"Otros\",\"state\":1}]"
    val gson = Gson()
    val itemType = object : TypeToken<List<Perro>>() {}.type
    val itemList = gson.fromJson<List<Perro>>(json, itemType)
    override fun onCreate(savedInstanceState: Bundle?) {
        //HolaComentario
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        perrosRecyclerView = findViewById(R.id.perrosRecyclerView)
        perrosAdapter =
            PerrosAdapter(
                itemList
            )
        perrosRecyclerView?.adapter = perrosAdapter
        perrosRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}