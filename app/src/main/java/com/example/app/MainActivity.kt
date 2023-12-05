package com.example.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val continueButton = findViewById<Button>(R.id.continueButton)

        continueButton.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("id", "one")
            startActivity(intent)
        }

        val addButton = findViewById<Button>(R.id.addButton)

        addButton.setOnClickListener{
            val intent = Intent(this, Activity3::class.java)
            intent.putExtra("id", "two")
            startActivity(intent)
        }
    }

}

