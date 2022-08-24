package uz.exemple.less6_task4_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less6_task4_kotlin.adapter.Adapter

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        val arrayList = ArrayList<String>()
        for (i in 1..40) {
            arrayList.add("Profile $i")
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(arrayList)
    }
}