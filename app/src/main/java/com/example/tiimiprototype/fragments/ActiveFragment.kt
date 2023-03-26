package com.example.tiimiprototype.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiimiprototype.JobProfileActivity
import com.example.tiimiprototype.R
import com.example.tiimiprototype.RecruitDetailsActivity
import com.google.android.material.card.MaterialCardView

class ActiveFragment : Fragment() {

    private lateinit var seniordesignerCard : MaterialCardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_active, container, false)

        seniordesignerCard = view.findViewById(R.id.card1)

        seniordesignerCard.setOnClickListener {
            val intent = Intent(activity, JobProfileActivity::class.java)
            context?.startActivity(intent)
        }

        return view
    }

}