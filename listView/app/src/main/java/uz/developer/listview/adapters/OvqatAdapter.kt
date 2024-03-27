package uz.developer.listview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import uz.developer.listview.R
import uz.developer.listview.models.OvqatData

class OvqatAdapter(var list: List<OvqatData>) : BaseAdapter() {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): OvqatData {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View{
        var itemView : View

        if (convertView == null){
            itemView = LayoutInflater.from(parent?.context).inflate(R.layout.costim_item2,parent,false)
        }
        else{
            itemView = convertView
        }

        itemView.findViewById<TextView>(R.id.text_name).text = list[position].nomi.toString()
        return itemView
    }
}