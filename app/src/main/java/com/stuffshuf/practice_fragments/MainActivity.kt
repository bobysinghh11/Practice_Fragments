package com.stuffshuf.practice_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnfruite.setOnClickListener {

            val frag1=FruitsFragment()
            supportFragmentManager.beginTransaction().replace(R.id.container, frag1).commit()


        }
        btnvegetables.setOnClickListener {

            val frag=VegetablesFragment()
            supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()

        }
    }
}
