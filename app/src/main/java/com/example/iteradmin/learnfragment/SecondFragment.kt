package com.example.iteradmin.learnfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.second_fragment,container,false)

        val txt = rootView.findViewById<TextView>(R.id.text)
        val btn = rootView.findViewById<Button>(R.id.Second)

        btn.setOnClickListener {
           // Toast.makeText(context,)
            txt.text = "a new text"
        }
        return rootView

    }
}