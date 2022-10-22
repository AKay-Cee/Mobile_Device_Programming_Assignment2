package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val list=ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add("Hamburger")
        list.add("Pizza")
        list.add("Mexican");
        list.add("American")
        list.add("Chinese")

        var decideButton = findViewById<Button>(R.id.decideButton)
        var view=findViewById<TextView>(R.id.textView)
        val addFood=findViewById<Button>(R.id.addFoodButton)
        val inputFood=findViewById<EditText>(R.id.editText)
        decideButton.setOnClickListener {
            val ran = Random.nextInt(list.size)
            view.setText(list[ran])

        }

        addFood.setOnClickListener {
            var input= inputFood.text.toString()
            list.add(input)
            inputFood.text.clear()
            inputFood.clearFocus()
        }
    }
}