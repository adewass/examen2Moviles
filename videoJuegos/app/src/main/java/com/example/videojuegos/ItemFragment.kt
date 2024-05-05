package com.example.videojuegos

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.videojuegos.placeholder.PlaceholderContent

/**
 * A fragment representing a list of Items.
 */
// ItemFragment.kt
// ItemFragment.kt
class ItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.list)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MyItemRecyclerViewAdapter(createItemList())
        return view
    }

    private fun createItemList(): List<PlaceholderContent.PlaceholderItem> {
        val itemList = mutableListOf<PlaceholderContent.PlaceholderItem>()
        // Agrega  juegos a la lista
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Call of duty",
                "FPS",
                "1",
                R.drawable.mw  // Aquí se establece la imagen del juego
            )
        )
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Battefield",
                "FPS",
                "2",
                R.drawable.battle  // Aquí se establece la imagen del juego
            )
        )
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Elden Ring",
                "RPG",
                "3",
                R.drawable.ring  // Aquí se establece la imagen del juego
            )
        )
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Baldur's Gate 3",
                "RPG",
                "4",
                R.drawable.bald  // Aquí se establece la imagen del juego
            )
        )
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Outlast",
                "Terror",
                "5",
                R.drawable.outlas  // Aquí se establece la imagen del juego
            )
        )
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Devour",
                "Terror",
                "6",
                R.drawable.dev  // Aquí se establece la imagen del juego
            )
        )
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Stardew valley",
                "Indi",
                "7",
                R.drawable.star  // Aquí se establece la imagen del juego
            )
        )
        itemList.add(
            PlaceholderContent.PlaceholderItem(
                "Gris",
                "Indi",
                "8",
                R.drawable.gris  // Aquí se establece la imagen del juego
            )
        )
        // Agrega más juegos según  necesario
        return itemList
    }
}

