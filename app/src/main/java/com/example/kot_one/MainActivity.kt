package com.example.kot_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kot_one.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnHello : Button
    private val listPerson : ArrayList<Person> = ArrayList<Person>()
    private lateinit var editName : EditText
    private lateinit var editAge  : EditText
    private lateinit var outText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.name)
        editAge = findViewById(R.id.age)
        outText = findViewById(R.id.out_text)

        btnHello = findViewById<Button>(R.id.hello_button)
        btnHello.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

       listPerson.add(
           Person(
               editName.text.toString(),
               editAge.text.toString().toInt()
           )
       )

       outText.setText( listPerson
           .filter { it.name.length > 0 && it.age > 0 }
           .joinToString(separator = "\n")
       )



    }


}