package uz.developer.webview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var arrayList = ArrayList<FlagData>()
    private var count = 0 // Changed to start from 0
    lateinit var imageView: ImageView // Changed to lateinit
    lateinit var layout1: LinearLayout // Changed to lateinit
    lateinit var layout2: LinearLayout // Changed to lateinit
    lateinit var layout3: LinearLayout // Changed to lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views after setContentView
        imageView = findViewById(R.id.imageView)
        layout1 = findViewById(R.id.layout_1)
        layout2 = findViewById(R.id.layout_2)
        layout3 = findViewById(R.id.layout3)

        getCountry()
        setData(count)
    }

    private fun setData(c: Int) {
        imageView.setImageResource(arrayList[c].image!!)
        val randomCountry = randomCountry(arrayList[c].countryName!!)

        for (i in 0 until 8) {
            val button = Button(this)
            button.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1.0f
            )
            button.text = randomCountry[i]
            button.setOnClickListener(this) // Set click listener
            layout1.addView(button)
        }

        for (i in 8 until 16) { // Fixed the loop range
            val button = Button(this)
            button.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1.0f
            )
            button.text = randomCountry[i]
            button.setOnClickListener(this) // Set click listener
            layout2.addView(button)
        }
    }

    private fun randomCountry(str: String): List<String> {
        val stringList = str.toList().toMutableList() // Changed to simpler conversion
        val a = "ABSDFHIJKLGMNOPQRSTUVWZC"
        val b = 16 - stringList.size

        stringList.addAll(a.substring(0, b).toList())
        stringList.shuffle()

        return stringList.map { it.toString() } // Convert back to list of strings
    }

    private fun getCountry() {
        arrayList.add(FlagData(R.drawable.uzb, "Uzbekistan"))
        //arrayList.add(FlagData(R.drawable.england, "England"))
        arrayList.add(FlagData(R.drawable.usa, "USA"))
      //  arrayList.add(FlagData(R.drawable.brasil, "Brasil"))
    }


    override fun onClick(v: View?) {
        val btn = v as Button
        btn.visibility = View.INVISIBLE
        val button = Button(this)
        button.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT,
            1.0f
        )
        button.text = btn.text.toString()
        layout3.addView(button)

        val child = layout3.childCount
        val stringBuilder = StringBuilder()

        if (child == arrayList[count].countryName?.length) {
            for (i in 0 until child) {
                val button1 = layout3.getChildAt(i) as Button
                stringBuilder.append(button1.text.toString())
            }

            val enteredText = stringBuilder.toString().toUpperCase() // Convert to uppercase
            val correctCountryName = arrayList[count].countryName?.toUpperCase() // Convert to uppercase

            if (enteredText == correctCountryName) {
                count++
                if(count == arrayList.size){
                    Toast.makeText(this, "Game over", Toast.LENGTH_SHORT).show()
                    layout1.removeAllViews()
                    layout2.removeAllViews()
                    layout3.removeAllViews()
                    setData(count)
                }
                else{
                    layout1.removeAllViews()
                    layout2.removeAllViews()
                    layout3.removeAllViews()
                    Toast.makeText(this, "Seccess", Toast.LENGTH_SHORT).show()
                    setData(count)
                }
            } else {
                layout1.removeAllViews()
                layout2.removeAllViews()
                layout3.removeAllViews()
                setData(count)
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
