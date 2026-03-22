package com.example.cis436_project3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// Main entry point of the app
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Load the main layout that contains the two fragments
        setContentView(R.layout.activity_main)
    }
}