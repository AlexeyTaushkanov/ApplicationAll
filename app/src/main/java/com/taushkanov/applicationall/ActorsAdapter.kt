package com.taushkanov.applicationall

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taushkanov.applicationall.models.Actor

class ActorsAdapter(
    context: Context,
    var actor: List<Actor>
    ): RecyclerView.Adapter<DataViewHolderActors>() {

    override fun getItemCount(): Int = actor.size

    fun getItem(position: Int) : Actor = actor[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolderActors {
        return DataViewHolderActors(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_actor,parent,false))
    }

    override fun onBindViewHolder(holder: DataViewHolderActors, position: Int) {
        holder.bind(getItem(position))
    }

}

class DataViewHolderActors(view: View): RecyclerView.ViewHolder(view) {
    private val photo: ImageView = view.findViewById(R.id.image)
    private val name: TextView = view.findViewById(R.id.name)

    fun bind(actor: Actor) {
        photo.setImageResource(actor.photo_actor)
        name.text = actor.name_actor
    }
}