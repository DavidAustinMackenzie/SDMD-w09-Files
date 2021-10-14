package au.edu.swin.sdmd.w09_files

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wordList = findViewById<RecyclerView>(R.id.wordList)

        wordList.adapter = MyWordAdaptor()
        wordList.layoutManager = LinearLayoutManager(this)
    }
}

