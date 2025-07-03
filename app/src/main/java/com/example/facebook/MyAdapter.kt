package com.example.facebook

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val data:ArrayList<MyDataClass>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val profilePicture = itemView.findViewById<CircleImageView>(R.id.ProfilePhotoOnStory)
        val storyPicture = itemView.findViewById<ImageView>(R.id.Story)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myItem = LayoutInflater.from(parent.context).inflate(R.layout.story,parent,false)
        return MyViewHolder(myItem)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val singleData = data[position]
        holder.storyPicture.setImageResource(singleData.story)
        holder.profilePicture.setImageResource(singleData.profilePic)
    }
}