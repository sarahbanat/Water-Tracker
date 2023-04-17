package com.example.myappmixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val log : TextView = findViewById(R.id.Log)


        log.setOnClickListener{
            var dialog_var = CustomDialogFragment()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }
    }
    fun receiveFeedback(feedback: String){
        val log : TextView = findViewById(R.id.Log)
        log.text = feedback;
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> Toast.makeText(this, "no reminder ", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "reminder once a day", Toast.LENGTH_SHORT).show()
            R.id.subitem1 -> Toast.makeText(this, "reminder interval every 2 hours set", Toast.LENGTH_SHORT).show()
            R.id.subitem2 -> Toast.makeText(this, "reminder interval every 1 hour set", Toast.LENGTH_SHORT).show()
        }
        return true;
    }


}



