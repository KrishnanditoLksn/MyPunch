package app.ditodev.mypunch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.ditodev.mypunch.R
import app.ditodev.mypunch.data.OnePunchCharacter

class OnePunchAdapter(private val listOnePunch: ArrayList<OnePunchCharacter>) :
    RecyclerView.Adapter<OnePunchAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val charImage: ImageView = view.findViewById(R.id.imageView)
        val charName: TextView = view.findViewById(R.id.textView3)
        val charDesc: TextView = view.findViewById(R.id.textView4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_anime_rows, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (name, description, image) = listOnePunch[position]
        holder.charName.text = name
        holder.charDesc.text = description
        holder.charImage.setImageResource(image)
    }

    override fun getItemCount() = listOnePunch.size


}