package com.example.tiimiprototype.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tiimiprototype.R
import com.example.tiimiprototype.RecruitDetailsActivity
import com.example.tiimiprototype.data.Recruit
import de.hdodenhof.circleimageview.CircleImageView

class RecruitDataAdapter(private val mList: List<Recruit>) : RecyclerView.Adapter<RecruitDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recruitment, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

//        // sets the image to the imageview from our itemHolder class
//        holder.image.setImageResource(ItemsViewModel.image_url)


        holder

        val url = ItemsViewModel.image_url
//        Glide.with(holder.itemView.context).load(url).into(holder.image);

        // sets the text to the textview from our itemHolder class
        holder.recruit_name.text = ItemsViewModel.name

        holder.card_holder.setOnClickListener{
            val intent = Intent(holder.itemView.context, RecruitDetailsActivity::class.java)
            intent.putExtra("recruit_name",ItemsViewModel.name)
            holder.itemView.context.startActivity(intent)
        }


    }


    inner class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val image: CircleImageView = itemView.findViewById(R.id.image)
        val recruit_name: TextView = itemView.findViewById(R.id.name)
        val job: TextView = itemView.findViewById(R.id.job)
        val team: TextView = itemView.findViewById(R.id.team)
        val date_posted : TextView = itemView.findViewById(R.id.date_posted)
        val card_holder : CardView = itemView.findViewById(R.id.card_holder)
        val colorview : View = itemView.findViewById(R.id.color_view)
    }

}