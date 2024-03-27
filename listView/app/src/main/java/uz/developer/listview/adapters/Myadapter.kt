package uz.developer.listview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import uz.developer.listview.R
import uz.developer.listview.models.Programming

class Myadapter (var list: List<Programming>): BaseAdapter() {
    override fun getCount(): Int = list.size
    override fun getItem(position: Int): Programming {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView:View

        if (convertView==null){
            itemView = LayoutInflater.from(parent?.context).inflate(R.layout.costu_item,parent,false)
        }
        else{
            itemView = convertView
        }

        itemView.findViewById<TextView>(R.id.text).text = list[position].nameLanguage
        itemView.findViewById<ImageView>(R.id.imageView).setImageResource(list[position].image)
        return itemView
    }
}