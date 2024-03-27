package uz.developer.retrofit_test.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import uz.developer.retrofit_test.R
import uz.developer.retrofit_test.models.Answer
import uz.developer.retrofit_test.models.diagnos_tur

class diagnosticAdapter(var list: List<Answer>) : BaseAdapter() {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Answer {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView : View

        if (convertView == null){
            itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item_one, parent, false)
        }
        else{
            itemView = convertView
        }

        itemView.findViewById<TextView>(R.id.info).text = list[position].diagnos_turi.toString()
        return itemView
    }
}