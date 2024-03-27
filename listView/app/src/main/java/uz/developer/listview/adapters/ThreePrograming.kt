package uz.developer.listview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import uz.developer.listview.R
import uz.developer.listview.models.GridModel

class ThreePrograming (var list: List<GridModel>): BaseAdapter() {
    override fun getCount(): Int  = list.size
    override fun getItem(position: Int): GridModel {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView : View
        if (convertView == null){
            itemView = LayoutInflater.from(parent?.context).inflate(R.layout.grid_item,parent,false)
        }
        else{
            itemView = convertView
        }

            itemView.findViewById<ImageView>(R.id.grid_image).setImageResource(list[position].image)
            itemView.findViewById<TextView>(R.id.grid_text).text = list[position].name

            return itemView
    }
}