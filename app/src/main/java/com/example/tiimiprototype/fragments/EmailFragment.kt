package com.example.tiimiprototype.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiimiprototype.R
import com.example.tiimiprototype.RecruitDetailsActivity
import com.example.tiimiprototype.ReplyEmailActivity
import com.google.android.material.button.MaterialButton

class EmailFragment : Fragment() {

    private lateinit var replyBtn : MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_email, container, false)

        replyBtn = v.findViewById(R.id.reply)

        replyBtn.setOnClickListener {
            val intent = Intent(activity, ReplyEmailActivity::class.java)
            context?.startActivity(intent)
        }

        return v
    }

}