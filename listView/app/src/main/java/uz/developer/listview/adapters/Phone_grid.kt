package uz.developer.listview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import uz.developer.listview.R

class Phone_grid(var list: List<String>) : BaseAdapter() {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): String {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var itemView:View

       if (convertView == null){
           itemView = LayoutInflater.from(parent?.context).inflate(R.layout.grid_view_fond, parent, false)
       }
        else{
            itemView = convertView
       }
        itemView.findViewById<TextView>(R.id.text).text = list[position].toString()
        return itemView
    }
}