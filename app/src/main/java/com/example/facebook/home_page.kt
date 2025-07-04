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
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432", R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432", R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432", R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432", R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432", R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432", R.drawable.download
            )
        )
        dataSource.add(
            MyDataClass(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432", R.drawable.download
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
            "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432","Abir","1h","https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-6/495569661_1208612167331034_5227033109757802599_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=aa7b47&_nc_eui2=AeEtsO1cJwycbGnQCYycpfLbOIB-5lwwAwE4gH7mXDADAY7QS9-lt6y-a7o1z3GEyLXBUKumDnXregnY5xXvZSnt&_nc_ohc=XmL1deevpWgQ7kNvwFT6QU0&_nc_oc=Adl8_YEgqb24YEZzT-V7sj0ykoCKa3cII9eC8QVQOR3A0VjYIONkE30uovbnZtC90IY&_nc_zt=23&_nc_ht=scontent.frjh4-1.fna&_nc_gid=G1qJ7oAxW-JCAb4KAp9h_g&oh=00_AfMrvdXwAqglpaSr4qo_sXXGOzQTu60DTKgwLir3dZIC4w&oe=686DEE1D"
            )
        )

        dataSource2.add(
            MyDataClass2(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432","Abir","1h","https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-6/495569661_1208612167331034_5227033109757802599_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=aa7b47&_nc_eui2=AeEtsO1cJwycbGnQCYycpfLbOIB-5lwwAwE4gH7mXDADAY7QS9-lt6y-a7o1z3GEyLXBUKumDnXregnY5xXvZSnt&_nc_ohc=XmL1deevpWgQ7kNvwFT6QU0&_nc_oc=Adl8_YEgqb24YEZzT-V7sj0ykoCKa3cII9eC8QVQOR3A0VjYIONkE30uovbnZtC90IY&_nc_zt=23&_nc_ht=scontent.frjh4-1.fna&_nc_gid=G1qJ7oAxW-JCAb4KAp9h_g&oh=00_AfMrvdXwAqglpaSr4qo_sXXGOzQTu60DTKgwLir3dZIC4w&oe=686DEE1D"
            )
        )

        dataSource2.add(
            MyDataClass2(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432","Abir","1h","https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-6/495569661_1208612167331034_5227033109757802599_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=aa7b47&_nc_eui2=AeEtsO1cJwycbGnQCYycpfLbOIB-5lwwAwE4gH7mXDADAY7QS9-lt6y-a7o1z3GEyLXBUKumDnXregnY5xXvZSnt&_nc_ohc=XmL1deevpWgQ7kNvwFT6QU0&_nc_oc=Adl8_YEgqb24YEZzT-V7sj0ykoCKa3cII9eC8QVQOR3A0VjYIONkE30uovbnZtC90IY&_nc_zt=23&_nc_ht=scontent.frjh4-1.fna&_nc_gid=G1qJ7oAxW-JCAb4KAp9h_g&oh=00_AfMrvdXwAqglpaSr4qo_sXXGOzQTu60DTKgwLir3dZIC4w&oe=686DEE1D"
            )
        )

        dataSource2.add(
            MyDataClass2(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432","Abir","1h","https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-6/495569661_1208612167331034_5227033109757802599_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=aa7b47&_nc_eui2=AeEtsO1cJwycbGnQCYycpfLbOIB-5lwwAwE4gH7mXDADAY7QS9-lt6y-a7o1z3GEyLXBUKumDnXregnY5xXvZSnt&_nc_ohc=XmL1deevpWgQ7kNvwFT6QU0&_nc_oc=Adl8_YEgqb24YEZzT-V7sj0ykoCKa3cII9eC8QVQOR3A0VjYIONkE30uovbnZtC90IY&_nc_zt=23&_nc_ht=scontent.frjh4-1.fna&_nc_gid=G1qJ7oAxW-JCAb4KAp9h_g&oh=00_AfMrvdXwAqglpaSr4qo_sXXGOzQTu60DTKgwLir3dZIC4w&oe=686DEE1D"
            )
        )

        dataSource2.add(
            MyDataClass2(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432","Abir","1h","https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-6/495569661_1208612167331034_5227033109757802599_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=aa7b47&_nc_eui2=AeEtsO1cJwycbGnQCYycpfLbOIB-5lwwAwE4gH7mXDADAY7QS9-lt6y-a7o1z3GEyLXBUKumDnXregnY5xXvZSnt&_nc_ohc=XmL1deevpWgQ7kNvwFT6QU0&_nc_oc=Adl8_YEgqb24YEZzT-V7sj0ykoCKa3cII9eC8QVQOR3A0VjYIONkE30uovbnZtC90IY&_nc_zt=23&_nc_ht=scontent.frjh4-1.fna&_nc_gid=G1qJ7oAxW-JCAb4KAp9h_g&oh=00_AfMrvdXwAqglpaSr4qo_sXXGOzQTu60DTKgwLir3dZIC4w&oe=686DEE1D"
            )
        )

        dataSource2.add(
            MyDataClass2(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432","Abir","1h","https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-6/495569661_1208612167331034_5227033109757802599_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=aa7b47&_nc_eui2=AeEtsO1cJwycbGnQCYycpfLbOIB-5lwwAwE4gH7mXDADAY7QS9-lt6y-a7o1z3GEyLXBUKumDnXregnY5xXvZSnt&_nc_ohc=XmL1deevpWgQ7kNvwFT6QU0&_nc_oc=Adl8_YEgqb24YEZzT-V7sj0ykoCKa3cII9eC8QVQOR3A0VjYIONkE30uovbnZtC90IY&_nc_zt=23&_nc_ht=scontent.frjh4-1.fna&_nc_gid=G1qJ7oAxW-JCAb4KAp9h_g&oh=00_AfMrvdXwAqglpaSr4qo_sXXGOzQTu60DTKgwLir3dZIC4w&oe=686DEE1D"
            )
        )

        dataSource2.add(
            MyDataClass2(
                "https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-1/489956896_1028182725838949_5641147933943665117_n.jpg?stp=c0.0.720.720a_dst-jpg_s200x200_tt6&_nc_cat=110&ccb=1-7&_nc_sid=1d2534&_nc_eui2=AeF0bXfK0eATapntPzLfYMe2Rsy3SaJq4vtGzLdJomri-yUBLR_DK-_VlVZUbbs3R2_AEKYdhjeEjqEl-PoUzzJH&_nc_ohc=xdnWjGVKAekQ7kNvwGK3WEs&_nc_oc=Adntgm-Bu9a50DXsgQr6_6jrjqbiT_P4M-eSYlvOdbZ7m1iwmKEOakaEIEUbHPdIxqs&_nc_zt=24&_nc_ht=scontent.frjh4-1.fna&_nc_gid=UbgfNAIrbuGKJComqVRp3w&oh=00_AfNG2BPpa2finDyjowolQdBcdCMvFlxLGWNAmoJIKe3t4Q&oe=686E0432","Abir","1h","https://scontent.frjh4-1.fna.fbcdn.net/v/t39.30808-6/495569661_1208612167331034_5227033109757802599_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=aa7b47&_nc_eui2=AeEtsO1cJwycbGnQCYycpfLbOIB-5lwwAwE4gH7mXDADAY7QS9-lt6y-a7o1z3GEyLXBUKumDnXregnY5xXvZSnt&_nc_ohc=XmL1deevpWgQ7kNvwFT6QU0&_nc_oc=Adl8_YEgqb24YEZzT-V7sj0ykoCKa3cII9eC8QVQOR3A0VjYIONkE30uovbnZtC90IY&_nc_zt=23&_nc_ht=scontent.frjh4-1.fna&_nc_gid=G1qJ7oAxW-JCAb4KAp9h_g&oh=00_AfMrvdXwAqglpaSr4qo_sXXGOzQTu60DTKgwLir3dZIC4w&oe=686DEE1D"
            )
        )


    }
    private fun initRecyclerView2(){
        val recyclerView = findViewById<RecyclerView>(R.id.postRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter2(dataSource2)
    }
}