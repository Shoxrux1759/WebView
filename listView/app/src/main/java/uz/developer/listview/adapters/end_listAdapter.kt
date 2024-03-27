package uz.developer.listview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import uz.developer.listview.R
import uz.developer.listview.models.addPhone_catalog

class end_listAdapter(var list: List<addPhone_catalog>) : BaseAdapter(){
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): addPhone_catalog {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView:View

        if (convertView == null){
            itemView =  LayoutInflater.from(parent?.context).inflate(R.layout.universal_list, parent, false)
        }
        else{
            itemView = convertView
        }

        itemView.findViewById<TextView>(R.id.uni_list).text = list[position].name.toString()

        return itemView
    }
}