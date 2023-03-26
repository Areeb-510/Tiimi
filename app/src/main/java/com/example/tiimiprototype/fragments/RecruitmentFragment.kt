package com.example.tiimiprototype.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tiimiprototype.R
import com.example.tiimiprototype.adapters.RecruitDataAdapter
import com.example.tiimiprototype.data.Recruit

class RecruitmentFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_recruitment, container, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.my_recycler_view)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(activity)

        val data = ArrayList<Recruit>()

        data.add(
            Recruit(
                "Name",
                "img1",
                "SDE",
                "Technical team",
                "2 days ago"
        ))

        data.add(
            Recruit(
                "Name",
                "img2",
                "SDE",
                "Technical team",
                "2 days ago"
            ))
        data.add(
            Recruit(
                "Name",
                "img3",
                "SDE",
                "Technical team",
                "2 days ago"
            ))
        data.add(
            Recruit(
                "Name",
                "img4",
                "SDE",
                "Technical team",
                "2 days ago"
            ))
        data.add(
            Recruit(
                "Name",
                "img5",
                "SDE",
                "Technical team",
                "2 days ago"
            ))
        data.add(
            Recruit(
                "Name",
                "img6",
                "SDE",
                "Technical team",
                "2 days ago"
            ))
        data.add(
            Recruit(
                "Name",
                "img7",
                "SDE",
                "Technical team",
                "2 days ago"
            ))

        val adapter = RecruitDataAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        return view

    }

}