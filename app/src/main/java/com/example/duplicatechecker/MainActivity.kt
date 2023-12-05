package com.example.duplicatechecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        //查找 id为 btnPath的按钮
        var btnPath: Button = findViewById(R.id.btnPath);
        //设置按钮的点击事件
        btnPath.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View) {
                Toast.makeText(this@MainActivity, "ButtonClicked", Toast.LENGTH_SHORT).show()
            }
        });
    }
}