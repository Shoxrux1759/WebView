package uz.developer.retrofit.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import uz.developer.retrofit.R
import uz.developer.retrofit.models.UserItem

class MyAdapter(private var con : Context, private var list: List<UserItem>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    inner class ViewHolder(v: View):RecyclerView.ViewHolder(v){

        var image: CircleImageView = v.findViewById<CircleImageView>(R.id.image)
        var text = v.findViewById<TextView>(R.id.text)!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(con).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(con).load(list[position].avatar_url).into(holder.image)
        holder.text.text = list[position].login
    }
}