package com.saad.complexpreferenceexample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        save_button.setOnClickListener {
            saveObject()
        }

        get_button.setOnClickListener {
            getObject()
        }

    }

    fun saveObject(){
        val list:ArrayList<String> = ArrayList()

        list.add("one")
        list.add("two")
        list.add("three")
        list.add("four")
        list.add("five")

        val demoModel = DemoModel("username", "password", true, 1,list)

        val complexPreferences = ComplexPreferences.getComplexPreferences(this@MainActivity,"democomplex", Context.MODE_PRIVATE)

        complexPreferences.putObject("demomodelobject",demoModel)

        complexPreferences.commit()
    }

    fun getObject(){
        val complexPreferences = ComplexPreferences.getComplexPreferences(this, "democomplex", Context.MODE_PRIVATE)
        val demoModel = complexPreferences.getObject("demomodelobject", DemoModel::class.java)

        Toast.makeText(this@MainActivity,"${demoModel.username}",Toast.LENGTH_LONG).show()

    }
}
