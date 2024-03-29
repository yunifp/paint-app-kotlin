package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val erraser = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener {
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener {
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        blackBtn.setOnClickListener {
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        erraser.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}