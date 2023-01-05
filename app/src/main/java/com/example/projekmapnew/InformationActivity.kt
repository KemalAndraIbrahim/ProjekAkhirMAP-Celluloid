package com.example.projekmapnew

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.projekmapnew.api.RetrofitHelper
import com.example.projekmapnew.api.TodoItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class InformationActivity : AppCompatActivity() {
    lateinit var HomeButtonplay : ImageButton
    lateinit var iccbuttonplay : ImageButton
    lateinit var labelHeader : TextView
    lateinit var listTodo : ListView

    val apiKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJnaWp3cGVka2xxbW1pZ2tmcW53Iiwicm9sZSI6ImFub24iLCJpYXQiOjE2NzAzOTQ1NjIsImV4cCI6MTk4NTk3MDU2Mn0.iWPcwj33Mj-LXB8YQbtFpyNTAnUr0OMtEGmAPSYKN_0"
    val token = "Bearer $apiKey"

    val Items = ArrayList<Model>()
    val todoApi = RetrofitHelper.getInstance().create(TodoItem::class.java)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        listTodo = findViewById(R.id.list_todo)
        val result = intent.getStringExtra("result")

        HomeButtonplay = findViewById(R.id.home1)
        iccbuttonplay = findViewById(R.id.play1)


        CoroutineScope(Dispatchers.Main).launch {
            val response = todoApi.get(token=token, apiKey=apiKey)

            response.body()?.forEach {
                Items.add(
                    Model(
                        Id=it.id,
                        Title=it.judul,
                        Description=it.sutradara
                    )
                )
            }

            setList(Items)
        }

        listTodo.setOnItemClickListener { adapterView, view, position, id ->
            val item = adapterView.getItemAtPosition(position) as Model
            val title = item.Title

            Toast.makeText(
                applicationContext,
                " $title",
                Toast.LENGTH_SHORT
            ).show()

            if (position == 0){

            val intent = Intent(this, DeskripsiActivity::class.java)
            startActivity(intent)}

            if (position == 1){

                val intent = Intent(this, DeskripsiActivity1::class.java)
                startActivity(intent)}

            if (position == 2){

                val intent = Intent(this, DeskripsiActivity2::class.java)
                startActivity(intent)}

            if (position == 3){

                val intent = Intent(this, DeskripsiActivity3::class.java)
                startActivity(intent)}
        }

        HomeButtonplay.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        iccbuttonplay.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }
    }

    fun setList(Items: ArrayList<Model>) {
        val adapter = TodoAdapter(this, R.layout.listpilem, Items)
        listTodo.adapter = adapter
    }
}