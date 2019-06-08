package com.example.iteradmin.learnfragment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.main)
        var i=0
        button.setOnClickListener {

            val fragmentManager =supportFragmentManager
            val fragmentTrasaction = fragmentManager.beginTransaction()


            val first=MyFragment()
            val secondFragment = SecondFragment()
if(i%2 ==0) {
    fragmentTrasaction.replace(R.id.frag_one, secondFragment)
    fragmentTrasaction.addToBackStack(null)
    fragmentTrasaction.commit()
}
            else
{
    fragmentTrasaction.replace(R.id.frag_one, first)
    fragmentTrasaction.addToBackStack(null)
    fragmentTrasaction.commit()
}
            i++
        }


    }
}
