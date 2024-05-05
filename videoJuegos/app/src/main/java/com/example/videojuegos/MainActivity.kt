package com.example.videojuegos

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnFragment1: Button
    private lateinit var btnFragment2: Button
    private lateinit var fragment1: Fragment
    private lateinit var fragment2: Fragment
    private lateinit var btnFragment3: Button
    private lateinit var btnFragment4: Button
    private lateinit var fragment3: Fragment
    private lateinit var fragment4: Fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragment1 = findViewById(R.id.btn_fragment1)
        btnFragment2 = findViewById(R.id.btn_fragment2)
        btnFragment3 = findViewById(R.id.btn_fragment3)
        btnFragment4 = findViewById(R.id.btn_fragment4)

        btnFragment1.setOnClickListener(this)
        btnFragment2.setOnClickListener(this)
        btnFragment3.setOnClickListener(this)
        btnFragment4.setOnClickListener(this)

        // Inicializa los fragments
        fragment1 = ScrollingFragment()
        fragment2 = ItemFragment()
        fragment3 = BlankFragment()
        fragment4 = fragmentcoments()

        // Carga el primer fragmento por defecto
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment1)
            .commit()
    }

    override fun onClick(v: View) {
        var selectedFragment: Fragment? = null

        when (v.id) {
            R.id.btn_fragment1 -> selectedFragment = fragment1
            R.id.btn_fragment2 -> selectedFragment = fragment2
            R.id.btn_fragment3 -> selectedFragment = fragment3
            R.id.btn_fragment4 -> selectedFragment = fragment4

        }

        // Reemplaza el fragmento actual con el fragmento seleccionado
        selectedFragment?.let {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, it)
                .commit()
        }
    }
}
