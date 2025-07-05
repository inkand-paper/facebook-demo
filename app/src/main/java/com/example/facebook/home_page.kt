package com.example.facebook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class home_page : AppCompatActivity() {
    private lateinit var dataSource: ArrayList<MyDataClass>
    private lateinit var dataSource2: ArrayList<MyDataClass2>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        loadData()
        initRecyclerView()
        loadData2()
        initRecyclerView2()

    }

    private fun loadData() {
        dataSource = arrayListOf()
        dataSource.add(
            MyDataClass(
                R.drawable.robot, R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot, R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot, R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot, R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot, R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot, R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot, R.drawable.download
            )
        )

    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.storyRecyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = MyAdapter(dataSource)
    }

    private fun loadData2() {
        dataSource2 = arrayListOf()
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir", "1h", R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir", "1h", R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir", "1h", R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir", "1h", R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir","1h",R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir","1h",R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir","1h",R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir","1h",R.drawable.postpic
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot, "Tahsin Abir","1h",R.drawable.postpic
            )
        )


    }

    private fun initRecyclerView2() {
        val recyclerView = findViewById<RecyclerView>(R.id.postRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter2(dataSource2)
    }
}