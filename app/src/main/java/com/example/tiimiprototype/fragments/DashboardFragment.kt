package com.example.tiimiprototype.fragments

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tiimiprototype.ProfileActivity
import com.example.tiimiprototype.R
import com.google.android.material.tabs.TabLayout
import org.eazegraph.lib.charts.PieChart
import org.eazegraph.lib.models.PieModel


class DashboardFragment : Fragment() {

    private lateinit var chart: PieChart
    private val i1 = 16.7f
    private val i2 = 8.3f
    private val i3 = 8.3f
    private val i4 = 8.3f
    private val i5 = 58.3f

    private lateinit var tabLayout: TabLayout

    private lateinit var viewmore : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.notification) {
            // Handle menu item 1 click
            return true
        } else if (id == R.id.profile) {
            // Handle menu item 2 click
            val intent = Intent(activity, ProfileActivity::class.java)
            startActivity(intent)
            return true
        }

        return super.onOptionsItemSelected(item)

    }

    private fun addToPieChart() {
        chart.addPieSlice(PieModel("Integer 1", i1, Color.parseColor("#96a5be")))
        chart.addPieSlice(PieModel("Integer 2", i2, Color.parseColor("#fed931")))
        chart.addPieSlice(PieModel("Integer 3", i3, Color.parseColor("#f4a13c")))
        chart.addPieSlice(PieModel("Integer 4", i4, Color.parseColor("#aed585")))
        chart.addPieSlice(PieModel("Integer 5", i5, Color.parseColor("#346866")))
        chart.startAnimation()
        chart.isClickable = false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        tabLayout = view.findViewById(R.id.tb)


        viewmore = view.findViewById(R.id.view_more)

        chart = view.findViewById(R.id.pie_chart)



        addToPieChart()

        return view


    }



}