package com.shuklz.viewpagertest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

const val ARG_OBJECT = "object"

class DemoFragment() : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView: View = inflater.inflate(
                R.layout.fragment_collection_object, container, false)
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val textView: TextView = rootView.findViewById(R.id.textField)
            textView.text = getInt(ARG_OBJECT).toString()
        }
        return rootView
    }
}